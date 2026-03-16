package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxb implements zzegz<zzbvt<zzbsm>> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zzdgo> zzfia;
    private final zzehm<zzdhe> zzfjq;
    private final zzbwx zzfpa;

    private zzbxb(zzbwx zzbwxVar, zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzdhe> zzehmVar4) {
        this.zzfpa = zzbwxVar;
        this.zzenp = zzehmVar;
        this.zzffv = zzehmVar2;
        this.zzfia = zzehmVar3;
        this.zzfjq = zzehmVar4;
    }

    public static zzbxb zza(zzbwx zzbwxVar, zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzdhe> zzehmVar4) {
        return new zzbxb(zzbwxVar, zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        final Context context = this.zzenp.get();
        final zzazz zzazzVar = this.zzffv.get();
        final zzdgo zzdgoVar = this.zzfia.get();
        final zzdhe zzdheVar = this.zzfjq.get();
        return (zzbvt) zzehf.zza(new zzbvt(new zzbsm(context, zzazzVar, zzdgoVar, zzdheVar) { // from class: com.google.android.gms.internal.ads.zzbww
            private final Context zzcit;
            private final zzazz zzfjl;
            private final zzdgo zzfjm;
            private final zzdhe zzfjn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
                this.zzfjl = zzazzVar;
                this.zzfjm = zzdgoVar;
                this.zzfjn = zzdheVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbsm
            public final void onAdLoaded() {
                com.google.android.gms.ads.internal.zzq.zzlg().zzb(this.zzcit, this.zzfjl.zzbnd, this.zzfjm.zzgtw.toString(), this.zzfjn.zzgux);
            }
        }, zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
