package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbcp implements zznu {
    private boolean isOpen;
    private Uri uri;
    private InputStream zzeff;
    private final zznu zzefg;
    private final zzoi<zznu> zzefh;
    private final zzbcs zzefi;
    private final Context zzvf;

    public zzbcp(Context context, zznu zznuVar, zzoi<zznu> zzoiVar, zzbcs zzbcsVar) {
        this.zzvf = context;
        this.zzefg = zznuVar;
        this.zzefh = zzoiVar;
        this.zzefi = zzbcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void close() throws IOException {
        if (!this.isOpen) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.isOpen = false;
        this.uri = null;
        InputStream inputStream = this.zzeff;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzeff = null;
        } else {
            this.zzefg.close();
        }
        zzoi<zznu> zzoiVar = this.zzefh;
        if (zzoiVar != null) {
            zzoiVar.zze(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final long zza(zznv zznvVar) throws IOException {
        Long l;
        zznv zznvVar2 = zznvVar;
        if (this.isOpen) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.isOpen = true;
        this.uri = zznvVar2.uri;
        zzoi<zznu> zzoiVar = this.zzefh;
        if (zzoiVar != null) {
            zzoiVar.zza(this, zznvVar2);
        }
        zzsf zzd = zzsf.zzd(zznvVar2.uri);
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcpx)).booleanValue()) {
            zzse zzseVar = null;
            if (zzd != null) {
                zzd.zzbss = zznvVar2.position;
                zzseVar = com.google.android.gms.ads.internal.zzq.zzlc().zza(zzd);
            }
            if (zzseVar != null && zzseVar.zzmv()) {
                this.zzeff = zzseVar.zzmw();
                return -1L;
            }
        } else if (zzd != null) {
            zzd.zzbss = zznvVar2.position;
            if (zzd.zzbsr) {
                l = (Long) zzvj.zzpv().zzd(zzzz.zzcpz);
            } else {
                l = (Long) zzvj.zzpv().zzd(zzzz.zzcpy);
            }
            long longValue = l.longValue();
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
            com.google.android.gms.ads.internal.zzq.zzlq();
            Future<InputStream> zza = zzsu.zza(this.zzvf, zzd);
            try {
                try {
                    this.zzeff = zza.get(longValue, TimeUnit.MILLISECONDS);
                    long elapsedRealtime2 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
                    this.zzefi.zzb(true, elapsedRealtime2);
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime2);
                    sb.append("ms");
                    zzawr.zzeg(sb.toString());
                    return -1L;
                } catch (InterruptedException unused) {
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
                    this.zzefi.zzb(false, elapsedRealtime3);
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache connection took ");
                    sb2.append(elapsedRealtime3);
                    sb2.append("ms");
                    zzawr.zzeg(sb2.toString());
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(true);
                    long elapsedRealtime4 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
                    this.zzefi.zzb(false, elapsedRealtime4);
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("Cache connection took ");
                    sb3.append(elapsedRealtime4);
                    sb3.append("ms");
                    zzawr.zzeg(sb3.toString());
                }
            } catch (Throwable th) {
                long elapsedRealtime5 = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - elapsedRealtime;
                this.zzefi.zzb(false, elapsedRealtime5);
                StringBuilder sb4 = new StringBuilder(44);
                sb4.append("Cache connection took ");
                sb4.append(elapsedRealtime5);
                sb4.append("ms");
                zzawr.zzeg(sb4.toString());
                throw th;
            }
        }
        if (zzd != null) {
            zznvVar2 = new zznv(Uri.parse(zzd.url), zznvVar2.zzbfm, zznvVar2.zzbfn, zznvVar2.position, zznvVar2.zzce, zznvVar2.zzcc, zznvVar2.flags);
        }
        return this.zzefg.zza(zznvVar2);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (!this.isOpen) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzeff;
        if (inputStream != null) {
            read = inputStream.read(bArr, i, i2);
        } else {
            read = this.zzefg.read(bArr, i, i2);
        }
        zzoi<zznu> zzoiVar = this.zzefh;
        if (zzoiVar != null) {
            zzoiVar.zzc(this, read);
        }
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final Uri getUri() {
        return this.uri;
    }
}
