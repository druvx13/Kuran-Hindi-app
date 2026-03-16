package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdf implements zzdj {
    private static zzdf zzve;
    private final Context zzvf;
    private final zzdnc zzvg;
    private final zzdnj zzvh;
    private final zzej zzvi;
    private final zzdlk zzvj;
    private final Executor zzvk;
    private final zzgb zzvl;
    private volatile long zzvm = 0;
    private final Object zzvn = new Object();
    private volatile boolean zzvo;

    public static synchronized zzdf zza(String str, Context context, boolean z) {
        zzdf zzdfVar;
        synchronized (zzdf.class) {
            if (zzve == null) {
                zzdlo zzaue = zzdlo.zzauh().zzgy(str).zzbq(z).zzaue();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                zzdf zza = zza(context, zzdlk.zza(context, newCachedThreadPool), zzaue, newCachedThreadPool);
                zzve = zza;
                zza.zzbr();
                zzve.zzbu();
            }
            zzdfVar = zzve;
        }
        return zzdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zza(int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdf zza(Context context, zzdlk zzdlkVar, zzdlo zzdloVar) {
        return zza(context, zzdlkVar, zzdloVar, Executors.newCachedThreadPool());
    }

    private static zzdf zza(Context context, zzdlk zzdlkVar, zzdlo zzdloVar, Executor executor) {
        zzdma zzdmaVar = new zzdma(context, executor, zzdlkVar, zzdloVar);
        zzem zzemVar = new zzem(context);
        zzej zzejVar = new zzej(zzdloVar, zzdmaVar, new zzev(context, zzemVar), zzemVar);
        zzgb zzauw = new zzdmq(context, zzdlkVar).zzauw();
        return new zzdf(context, zzdlkVar, new zzdnc(context, zzauw), new zzdnj(context, zzejVar, zzdlkVar), zzejVar, executor, zzauw);
    }

    private zzdf(Context context, zzdlk zzdlkVar, zzdnc zzdncVar, zzdnj zzdnjVar, zzej zzejVar, Executor executor, zzgb zzgbVar) {
        this.zzvf = context;
        this.zzvj = zzdlkVar;
        this.zzvg = zzdncVar;
        this.zzvh = zzdnjVar;
        this.zzvi = zzejVar;
        this.zzvk = executor;
        this.zzvl = zzgbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzbr() {
        long currentTimeMillis = System.currentTimeMillis();
        zzdmz zzeb = this.zzvg.zzeb(zzdnh.zzhdc);
        if (zzeb != null && !zzeb.zza()) {
            this.zzvh.zzb(zzeb);
        } else {
            this.zzvj.zzg(4013, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbs() {
        this.zzvk.execute(new zzdi(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbt() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        zzdmz zzeb = this.zzvg.zzeb(zzdnh.zzhdc);
        if (zzeb != null) {
            String zzdh = zzeb.zzava().zzdh();
            str2 = zzeb.zzava().zzdi();
            str = zzdh;
        } else {
            str = null;
            str2 = null;
        }
        try {
            zzdng zza = zzdlw.zza(this.zzvf, 1, this.zzvl, str, str2, "1", this.zzvj);
            if (zza.zzhdb != null && zza.zzhdb.length != 0) {
                zzgd zza2 = zzgd.zza(zzeaq.zzu(zza.zzhdb), zzebq.zzbed());
                boolean z = false;
                if (!zza2.zzdd().zzdh().isEmpty()) {
                    if (!zza2.zzdd().zzdi().isEmpty()) {
                        if (zza2.zzdf().toByteArray().length != 0) {
                            zzdmz zzeb2 = this.zzvg.zzeb(zzdnh.zzhdc);
                            if (zzeb2 != null) {
                                zzgh zzava = zzeb2.zzava();
                                if (zzava != null) {
                                    if (zza2.zzdd().zzdh().equals(zzava.zzdh())) {
                                        if (!zza2.zzdd().zzdi().equals(zzava.zzdi())) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                }
                if (!z) {
                    this.zzvj.zzg(5010, System.currentTimeMillis() - currentTimeMillis);
                    return;
                } else if (!this.zzvg.zza(zza2, null)) {
                    this.zzvj.zzg(4009, System.currentTimeMillis() - currentTimeMillis);
                    return;
                } else {
                    this.zzvh.zzb(this.zzvg.zzeb(zzdnh.zzhdc));
                    this.zzvm = System.currentTimeMillis() / 1000;
                    return;
                }
            }
            this.zzvj.zzg(5009, System.currentTimeMillis() - currentTimeMillis);
        } catch (zzeco e) {
            this.zzvj.zza(4002, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zza(MotionEvent motionEvent) {
        zzdlq zzavk = this.zzvh.zzavk();
        if (zzavk != null) {
            try {
                zzavk.zza(null, motionEvent);
            } catch (zzdnk e) {
                this.zzvj.zza(e.zzavm(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, String str, View view, Activity activity) {
        zzbu();
        zzdlq zzavk = this.zzvh.zzavk();
        if (zzavk != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza = zzavk.zza(context, null, str, view, activity);
            this.zzvj.zza(5000, System.currentTimeMillis() - currentTimeMillis, zza, null);
            return zza;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final void zzb(View view) {
        this.zzvi.zzc(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zza(Context context, View view, Activity activity) {
        zzbu();
        zzdlq zzavk = this.zzvh.zzavk();
        if (zzavk != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb = zzavk.zzb(context, null, view, activity);
            this.zzvj.zza(5002, System.currentTimeMillis() - currentTimeMillis, zzb, null);
            return zzb;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final String zzb(Context context) {
        zzbu();
        zzdlq zzavk = this.zzvh.zzavk();
        if (zzavk != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzu = zzavk.zzu(context, null);
            this.zzvj.zza(5001, System.currentTimeMillis() - currentTimeMillis, zzu, null);
            return zzu;
        }
        return "";
    }

    private final void zzbu() {
        if (this.zzvo) {
            return;
        }
        synchronized (this.zzvn) {
            if (!this.zzvo) {
                if ((System.currentTimeMillis() / 1000) - this.zzvm < 3600) {
                    return;
                }
                zzdmz zzavl = this.zzvh.zzavl();
                if (zzavl == null || zzavl.zzfg(3600L)) {
                    zzbs();
                }
            }
        }
    }
}
