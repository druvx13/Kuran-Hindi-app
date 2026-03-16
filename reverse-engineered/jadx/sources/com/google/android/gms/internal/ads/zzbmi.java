package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmi implements zzegz<zzbvt<zzbsm>> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zzdgo> zzfia;
    private final zzbma zzfjo;
    private final zzehm<zzdhe> zzfjq;

    public zzbmi(zzbma zzbmaVar, zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzdhe> zzehmVar4) {
        this.zzfjo = zzbmaVar;
        this.zzenp = zzehmVar;
        this.zzffv = zzehmVar2;
        this.zzfia = zzehmVar3;
        this.zzfjq = zzehmVar4;
    }

    public static zzbvt<zzbsm> zza(zzbma zzbmaVar, final Context context, final zzazz zzazzVar, final zzdgo zzdgoVar, final zzdhe zzdheVar) {
        return (zzbvt) zzehf.zza(new zzbvt(new zzbsm(context, zzazzVar, zzdgoVar, zzdheVar) { // from class: com.google.android.gms.internal.ads.zzbmd
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

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfjo, this.zzenp.get(), this.zzffv.get(), this.zzfia.get(), this.zzfjq.get());
    }
}
