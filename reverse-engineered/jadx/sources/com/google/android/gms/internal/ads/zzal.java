package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzal implements zza {
    private final Map<String, zzan> zzbx;
    private long zzby;
    private final zzap zzbz;
    private final int zzca;

    public zzal(File file, int i) {
        this.zzbx = new LinkedHashMap(16, 0.75f, true);
        this.zzby = 0L;
        this.zzbz = new zzao(this, file);
        this.zzca = 20971520;
    }

    private zzal(zzap zzapVar, int i) {
        this.zzbx = new LinkedHashMap(16, 0.75f, true);
        this.zzby = 0L;
        this.zzbz = zzapVar;
        this.zzca = 5242880;
    }

    public zzal(zzap zzapVar) {
        this(zzapVar, 5242880);
    }

    @Override // com.google.android.gms.internal.ads.zza
    public final synchronized zzd zza(String str) {
        zzan zzanVar = this.zzbx.get(str);
        if (zzanVar == null) {
            return null;
        }
        File zze = zze(str);
        try {
            zzaq zzaqVar = new zzaq(new BufferedInputStream(zza(zze)), zze.length());
            try {
                zzan zzc = zzan.zzc(zzaqVar);
                if (!TextUtils.equals(str, zzc.zzcc)) {
                    zzag.d("%s: key=%s, found=%s", zze.getAbsolutePath(), str, zzc.zzcc);
                    removeEntry(str);
                    return null;
                }
                byte[] zza = zza(zzaqVar, zzaqVar.zzp());
                zzd zzdVar = new zzd();
                zzdVar.data = zza;
                zzdVar.zzg = zzanVar.zzg;
                zzdVar.zzh = zzanVar.zzh;
                zzdVar.zzi = zzanVar.zzi;
                zzdVar.zzj = zzanVar.zzj;
                zzdVar.zzk = zzanVar.zzk;
                List<zzk> list = zzanVar.zzm;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzk zzkVar : list) {
                    treeMap.put(zzkVar.getName(), zzkVar.getValue());
                }
                zzdVar.zzl = treeMap;
                zzdVar.zzm = Collections.unmodifiableList(zzanVar.zzm);
                return zzdVar;
            } finally {
                zzaqVar.close();
            }
        } catch (IOException e) {
            zzag.d("%s: %s", zze.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zza
    public final synchronized void initialize() {
        File zzo = this.zzbz.zzo();
        if (!zzo.exists()) {
            if (!zzo.mkdirs()) {
                zzag.e("Unable to create cache dir %s", zzo.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = zzo.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                long length = file.length();
                zzaq zzaqVar = new zzaq(new BufferedInputStream(zza(file)), length);
                try {
                    zzan zzc = zzan.zzc(zzaqVar);
                    zzc.zzcb = length;
                    zza(zzc.zzcc, zzc);
                    zzaqVar.close();
                } catch (Throwable th) {
                    zzaqVar.close();
                    throw th;
                    break;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zza
    public final synchronized void zza(String str, zzd zzdVar) {
        long j;
        if (this.zzby + zzdVar.data.length <= this.zzca || zzdVar.data.length <= this.zzca * 0.9f) {
            File zze = zze(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zze));
                zzan zzanVar = new zzan(str, zzdVar);
                if (!zzanVar.zza(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    zzag.d("Failed to write header for %s", zze.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(zzdVar.data);
                bufferedOutputStream.close();
                zzanVar.zzcb = zze.length();
                zza(str, zzanVar);
                if (this.zzby >= this.zzca) {
                    if (zzag.DEBUG) {
                        zzag.v("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.zzby;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, zzan>> it = this.zzbx.entrySet().iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j = j2;
                            break;
                        }
                        zzan value = it.next().getValue();
                        if (zze(value.zzcc).delete()) {
                            j = j2;
                            this.zzby -= value.zzcb;
                        } else {
                            j = j2;
                            zzag.d("Could not delete cache entry for key=%s, filename=%s", value.zzcc, zzd(value.zzcc));
                        }
                        it.remove();
                        i++;
                        if (((float) this.zzby) < this.zzca * 0.9f) {
                            break;
                        }
                        j2 = j;
                    }
                    if (zzag.DEBUG) {
                        zzag.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.zzby - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
            } catch (IOException unused) {
                if (zze.delete()) {
                    return;
                }
                zzag.d("Could not clean up file %s", zze.getAbsolutePath());
            }
        }
    }

    private final synchronized void remove(String str) {
        boolean delete = zze(str).delete();
        removeEntry(str);
        if (!delete) {
            zzag.d("Could not delete cache entry for key=%s, filename=%s", str, zzd(str));
        }
    }

    private static String zzd(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File zze(String str) {
        return new File(this.zzbz.zzo(), zzd(str));
    }

    private final void zza(String str, zzan zzanVar) {
        if (!this.zzbx.containsKey(str)) {
            this.zzby += zzanVar.zzcb;
        } else {
            this.zzby += zzanVar.zzcb - this.zzbx.get(str).zzcb;
        }
        this.zzbx.put(str, zzanVar);
    }

    private final void removeEntry(String str) {
        zzan remove = this.zzbx.remove(str);
        if (remove != null) {
            this.zzby -= remove.zzcb;
        }
    }

    private static byte[] zza(zzaq zzaqVar, long j) throws IOException {
        long zzp = zzaqVar.zzp();
        if (j >= 0 && j <= zzp) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zzp);
        throw new IOException(sb.toString());
    }

    private static InputStream zza(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(InputStream inputStream) throws IOException {
        return (zza(inputStream) << 24) | zza(inputStream) | 0 | (zza(inputStream) << 8) | (zza(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzc(InputStream inputStream) throws IOException {
        return (zza(inputStream) & 255) | 0 | ((zza(inputStream) & 255) << 8) | ((zza(inputStream) & 255) << 16) | ((zza(inputStream) & 255) << 24) | ((zza(inputStream) & 255) << 32) | ((zza(inputStream) & 255) << 40) | ((zza(inputStream) & 255) << 48) | ((255 & zza(inputStream)) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zza(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzaq zzaqVar) throws IOException {
        return new String(zza(zzaqVar, zzc(zzaqVar)), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<zzk> zzb(zzaq zzaqVar) throws IOException {
        int zzb = zzb((InputStream) zzaqVar);
        if (zzb < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(zzb);
            throw new IOException(sb.toString());
        }
        List<zzk> emptyList = zzb == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i = 0; i < zzb; i++) {
            emptyList.add(new zzk(zza(zzaqVar).intern(), zza(zzaqVar).intern()));
        }
        return emptyList;
    }
}
