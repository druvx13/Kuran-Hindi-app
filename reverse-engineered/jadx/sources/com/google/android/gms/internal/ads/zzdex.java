package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdex implements zzegz<zzdeu<zzceo, zzcel>> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdih> zzepo;
    private final zzehm<zzdiz> zzepp;

    public zzdex(zzehm<Context> zzehmVar, zzehm<zzdih> zzehmVar2, zzehm<zzdiz> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzepo = zzehmVar2;
        this.zzepp = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        Object zzdemVar;
        Context context = this.zzenp.get();
        zzdih zzdihVar = this.zzepo.get();
        zzdiz zzdizVar = this.zzepp.get();
        if (((Integer) zzvj.zzpv().zzd(zzzz.zzctg)).intValue() > 0) {
            zzdjc zza = zzdizVar.zza(zzdiu.Rewarded, context, zzdihVar, new zzdec(new zzddt()));
            zzdemVar = new zzddy(new zzdel(new zzdem()), new zzded(zza.zzgrx, zzbab.zzdzr), zza.zzgxy, zzbab.zzdzr);
        } else {
            zzdemVar = new zzdem();
        }
        return (zzdeu) zzehf.zza(zzdemVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
