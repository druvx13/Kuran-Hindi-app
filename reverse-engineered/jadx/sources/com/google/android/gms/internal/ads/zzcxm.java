package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.location.Location;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxm implements zzdak<zzcxj> {
    private ApplicationInfo applicationInfo;
    private zzawt zzduw;
    private ScheduledExecutorService zzfky;
    zzdhe zzfll;
    private zzalc zzgmy;

    public zzcxm(zzalc zzalcVar, ScheduledExecutorService scheduledExecutorService, zzawt zzawtVar, ApplicationInfo applicationInfo, zzdhe zzdheVar) {
        this.zzgmy = zzalcVar;
        this.zzfky = scheduledExecutorService;
        this.zzduw = zzawtVar;
        this.applicationInfo = applicationInfo;
        this.zzfll = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcxj> zzaqa() {
        zzdri zzb;
        if (!zzabc.zzcvm.get().booleanValue()) {
            zzb = zzdqw.zzag(null);
        } else if (!this.zzduw.zzwu()) {
            zzb = zzdqw.zzag(null);
        } else {
            zzb = zzdqw.zzb(zzdqw.zza(this.zzgmy.zza(this.applicationInfo), ((Long) zzvj.zzpv().zzd(zzzz.zzcpg)).longValue(), TimeUnit.MILLISECONDS, this.zzfky), Throwable.class, zzcxn.zzbly, zzbab.zzdzw);
        }
        return zzdqw.zzb(zzdqw.zzb(zzb, new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzcxo
            private final zzcxm zzgmz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmz = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                Location location = (Location) obj;
                return location != null ? location : this.zzgmz.zzfll.zzguw.zzmp;
            }
        }, this.zzfky), zzcxl.zzdsc, zzbab.zzdzr);
    }
}
