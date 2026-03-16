package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbea extends zzbdl implements zzbdc {
    private String zzebv;
    private boolean zzehc;
    private zzbcu zzehl;
    private Exception zzehm;
    private boolean zzehn;

    public zzbea(zzbbx zzbbxVar, zzbby zzbbyVar) {
        super(zzbbxVar);
        zzbcu zzbcuVar = new zzbcu(zzbbxVar.getContext(), zzbbyVar);
        this.zzehl = zzbcuVar;
        zzbcuVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zzdj(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zzn(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zzb(final boolean z, final long j) {
        final zzbbx zzbbxVar = this.zzego.get();
        if (zzbbxVar != null) {
            zzbab.zzdzv.execute(new Runnable(zzbbxVar, z, j) { // from class: com.google.android.gms.internal.ads.zzbdz
                private final boolean zzecc;
                private final long zzefe;
                private final zzbbx zzehk;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzehk = zzbbxVar;
                    this.zzecc = z;
                    this.zzefe = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzehk.zza(this.zzecc, this.zzefe);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zza(String str, Exception exc) {
        String str2 = (String) zzvj.zzpv().zzd(zzzz.zzcjf);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.zzehm = exc;
        zzawr.zzd("Precache error", exc);
        zzfo(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void zzdf(int i) {
        this.zzehl.zzaak().zzdm(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void zzde(int i) {
        this.zzehl.zzaak().zzdl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void zzdg(int i) {
        this.zzehl.zzaak().zzdg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void zzdh(int i) {
        this.zzehl.zzaak().zzdh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdl, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzbcu zzbcuVar = this.zzehl;
        if (zzbcuVar != null) {
            zzbcuVar.zza((zzbdc) null);
            this.zzehl.release();
        }
        super.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbdl
    public final String zzfm(String str) {
        String valueOf = String.valueOf(super.zzfm(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final boolean zzfl(String str) {
        return zze(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final boolean zze(String str, String[] strArr) {
        String str2;
        long j;
        long j2;
        long j3;
        String str3;
        long j4;
        long j5;
        this.zzebv = str;
        String zzfm = zzfm(str);
        String str4 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try {
                    uriArr[i] = Uri.parse(strArr[i]);
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str);
                    sb.append(" Exception: ");
                    sb.append(message);
                    zzawr.zzfc(sb.toString());
                    release();
                    zza(str, zzfm, str4, zzb(str4, e));
                    return false;
                }
            }
            this.zzehl.zza(uriArr, this.zzdym);
            zzbbx zzbbxVar = this.zzego.get();
            if (zzbbxVar != null) {
                zzbbxVar.zza(zzfm, this);
            }
            Clock zzld = com.google.android.gms.ads.internal.zzq.zzld();
            long currentTimeMillis = zzld.currentTimeMillis();
            long longValue = ((Long) zzvj.zzpv().zzd(zzzz.zzcjl)).longValue();
            long longValue2 = ((Long) zzvj.zzpv().zzd(zzzz.zzcjk)).longValue() * 1000;
            long intValue = ((Integer) zzvj.zzpv().zzd(zzzz.zzcjj)).intValue();
            long j6 = -1;
            while (true) {
                try {
                    synchronized (this) {
                        try {
                            if (zzld.currentTimeMillis() - currentTimeMillis > longValue2) {
                                long j7 = longValue2;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(j7);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            } else if (this.zzehc) {
                                if (this.zzehm != null) {
                                    throw this.zzehm;
                                }
                                throw new IOException("Abort requested before buffering finished. ");
                            } else if (!this.zzehn) {
                                zzgt zzaah = this.zzehl.zzaah();
                                if (zzaah == null) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                str2 = str4;
                                try {
                                    long duration = zzaah.getDuration();
                                    if (duration > 0) {
                                        long bufferedPosition = zzaah.getBufferedPosition();
                                        if (bufferedPosition != j6) {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            zza(str, zzfm, bufferedPosition, duration, bufferedPosition > 0, zzbcu.zzaai(), zzbcu.zzaaj());
                                            j5 = bufferedPosition;
                                        } else {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            j5 = j6;
                                        }
                                        if (bufferedPosition >= duration) {
                                            zzb(str, zzfm, duration);
                                        } else if (this.zzehl.getBytesTransferred() < j || bufferedPosition <= 0) {
                                            j3 = j4;
                                            str3 = j5;
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j3 = longValue;
                                        str3 = j6;
                                    }
                                    try {
                                        try {
                                            wait(j3);
                                        } catch (Throwable th) {
                                            th = th;
                                            str4 = str3;
                                            throw th;
                                        }
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    longValue = j3;
                    str4 = str2;
                    intValue = j;
                    longValue2 = j2;
                    j6 = str3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void abort() {
        zzfo(null);
    }

    private final void zzfo(String str) {
        synchronized (this) {
            this.zzehc = true;
            notify();
            release();
        }
        String str2 = this.zzebv;
        if (str2 != null) {
            String zzfm = zzfm(str2);
            Exception exc = this.zzehm;
            if (exc != null) {
                zza(this.zzebv, zzfm, "badUrl", zzb(str, exc));
            } else {
                zza(this.zzebv, zzfm, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbcu zzaan() {
        synchronized (this) {
            this.zzehn = true;
            notify();
        }
        this.zzehl.zza((zzbdc) null);
        zzbcu zzbcuVar = this.zzehl;
        this.zzehl = null;
        return zzbcuVar;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
