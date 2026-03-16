package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbv;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzeo {
    private static final String TAG = zzeo.class.getSimpleName();
    protected Context zzvf;
    private zzem zzya;
    private ExecutorService zzyj;
    private DexClassLoader zzyk;
    private zzdv zzyl;
    private byte[] zzym;
    private boolean zzyp;
    private zzdh zzys;
    private Map<Pair<String, String>, zzfx> zzyv;
    private volatile AdvertisingIdClient zzyn = null;
    private volatile boolean zzwb = false;
    private Future zzyo = null;
    private volatile zzbv.zza zzyq = null;
    private Future zzyr = null;
    private boolean zzyt = false;
    private boolean zzyu = false;
    private boolean zzyw = false;

    public static zzeo zza(Context context, String str, String str2, boolean z) {
        zzdv zzdvVar;
        zzeo zzeoVar = new zzeo(context);
        try {
            zzeoVar.zzyj = Executors.newCachedThreadPool(new zzen());
            zzeoVar.zzwb = z;
            if (z) {
                zzeoVar.zzyo = zzeoVar.zzyj.submit(new zzeq(zzeoVar));
            }
            zzeoVar.zzyj.execute(new zzes(zzeoVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzeoVar.zzyt = googleApiAvailabilityLight.getApkVersion(zzeoVar.zzvf) > 0;
                zzeoVar.zzyu = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzeoVar.zzvf) == 0;
            } catch (Throwable unused) {
            }
            zzeoVar.zza(0, true);
            if (zzet.isMainThread() && ((Boolean) zzvj.zzpv().zzd(zzzz.zzcob)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzdvVar = new zzdv(null);
            zzeoVar.zzyl = zzdvVar;
        } catch (zzeh unused2) {
        }
        try {
            zzeoVar.zzym = zzdvVar.zzan(str);
            try {
                try {
                    try {
                        try {
                            File cacheDir = zzeoVar.zzvf.getCacheDir();
                            if (cacheDir == null && (cacheDir = zzeoVar.zzvf.getDir("dex", 0)) == null) {
                                throw new zzeh();
                            }
                            File file = new File(String.format("%s/%s.jar", cacheDir, "1582435991586"));
                            if (!file.exists()) {
                                byte[] zza = zzeoVar.zzyl.zza(zzeoVar.zzym, str2);
                                file.createNewFile();
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                fileOutputStream.write(zza, 0, zza.length);
                                fileOutputStream.close();
                            }
                            zzeoVar.zzb(cacheDir, "1582435991586");
                            try {
                                zzeoVar.zzyk = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzeoVar.zzvf.getClassLoader());
                                zzb(file);
                                zzeoVar.zza(cacheDir, "1582435991586");
                                zzao(String.format("%s/%s.dex", cacheDir, "1582435991586"));
                                zzeoVar.zzys = new zzdh(zzeoVar);
                                zzeoVar.zzyw = true;
                                return zzeoVar;
                            } catch (Throwable th) {
                                zzb(file);
                                zzeoVar.zza(cacheDir, "1582435991586");
                                zzao(String.format("%s/%s.dex", cacheDir, "1582435991586"));
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            throw new zzeh(e);
                        }
                    } catch (IOException e2) {
                        throw new zzeh(e2);
                    }
                } catch (zzdy e3) {
                    throw new zzeh(e3);
                }
            } catch (NullPointerException e4) {
                throw new zzeh(e4);
            }
        } catch (zzdy e5) {
            throw new zzeh(e5);
        }
    }

    public final Context getContext() {
        return this.zzvf;
    }

    public final boolean isInitialized() {
        return this.zzyw;
    }

    public final ExecutorService zzch() {
        return this.zzyj;
    }

    public final DexClassLoader zzci() {
        return this.zzyk;
    }

    public final zzdv zzcj() {
        return this.zzyl;
    }

    public final byte[] zzck() {
        return this.zzym;
    }

    public final boolean zzcl() {
        return this.zzyt;
    }

    public final zzdh zzcm() {
        return this.zzys;
    }

    public final boolean zzcn() {
        return this.zzyu;
    }

    public final boolean zzcg() {
        return this.zzya.zzcg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzem zzco() {
        return this.zzya;
    }

    public final zzbv.zza zzcp() {
        return this.zzyq;
    }

    public final Future zzcq() {
        return this.zzyr;
    }

    private zzeo(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.zzyp = z;
        this.zzvf = z ? applicationContext : context;
        this.zzyv = new HashMap();
        if (this.zzya == null) {
            this.zzya = new zzem(this.zzvf);
        }
    }

    private final void zza(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    zzb(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                zzbv.zzc.zza zzc = zzbv.zzc.zzbf().zzd(zzeaq.zzu(Build.VERSION.SDK.getBytes())).zzc(zzeaq.zzu(str.getBytes()));
                byte[] bytes = this.zzyl.zzb(this.zzym, bArr).getBytes();
                zzc.zza(zzeaq.zzu(bytes)).zzb(zzeaq.zzu(zzcn.zzb(bytes)));
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] byteArray = ((zzbv.zzc) ((zzecd) zzc.zzbet())).toByteArray();
                    fileOutputStream.write(byteArray, 0, byteArray.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    zzb(file3);
                } catch (zzdy | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    zzb(file3);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    zzb(file3);
                    throw th;
                }
            } catch (zzdy | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzdy | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void zzao(String str) {
        zzb(new File(str));
    }

    private static void zzb(File file) {
        if (!file.exists()) {
            Log.d(TAG, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        } else {
            file.delete();
        }
    }

    private final boolean zzb(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                zzb(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    Log.d(TAG, "Cannot read the cache data.");
                    zzb(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return false;
                }
                zzbv.zzc zzb = zzbv.zzc.zzb(bArr, zzebq.zzbed());
                if (str.equals(new String(zzb.zzbd().toByteArray())) && Arrays.equals(zzb.zzbc().toByteArray(), zzcn.zzb(zzb.zzbb().toByteArray())) && Arrays.equals(zzb.zzbe().toByteArray(), Build.VERSION.SDK.getBytes())) {
                    byte[] zza = this.zzyl.zza(this.zzym, new String(zzb.zzbb().toByteArray()));
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.write(zza, 0, zza.length);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        return true;
                    } catch (zzdy | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                }
                zzb(file2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused9) {
                }
                return false;
            } catch (zzdy | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzdy | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzyv.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzyv.put(new Pair<>(str, str2), new zzfx(this, str, str2, clsArr));
        return true;
    }

    public final Method zza(String str, String str2) {
        zzfx zzfxVar = this.zzyv.get(new Pair(str, str2));
        if (zzfxVar == null) {
            return null;
        }
        return zzfxVar.zzdc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcr() {
        try {
            if (this.zzyn == null && this.zzyp) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzvf);
                advertisingIdClient.start();
                this.zzyn = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzyn = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, boolean z) {
        if (this.zzyu) {
            Future<?> submit = this.zzyj.submit(new zzep(this, i, z));
            if (i == 0) {
                this.zzyr = submit;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbv.zza zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return zzcs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(int i, zzbv.zza zzaVar) {
        if (i < 4) {
            return zzaVar == null || !zzaVar.zzak() || zzaVar.zzag().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzaVar.zzap() || !zzaVar.zzaq().zzbh() || zzaVar.zzaq().zzbi() == -2;
        }
        return false;
    }

    private final zzbv.zza zzcs() {
        try {
            return zzdlu.zzj(this.zzvf, this.zzvf.getPackageName(), Integer.toString(this.zzvf.getPackageManager().getPackageInfo(this.zzvf.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final AdvertisingIdClient zzct() {
        if (this.zzwb) {
            if (this.zzyn != null) {
                return this.zzyn;
            }
            Future future = this.zzyo;
            if (future != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    this.zzyo = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.zzyo.cancel(true);
                }
            }
            return this.zzyn;
        }
        return null;
    }

    public final int zzbv() {
        if (this.zzys != null) {
            return zzdh.zzbv();
        }
        return Integer.MIN_VALUE;
    }
}
