package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdjr implements zzegz<zzdrh> {
    public static zzdjr zzatp() {
        zzdjr zzdjrVar;
        zzdjrVar = zzdju.zzgyu;
        return zzdjrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        zzdrh zzdrhVar;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcrx)).booleanValue()) {
            zzdrhVar = zzbab.zzdzt;
        } else {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcrw)).booleanValue()) {
                zzdrhVar = zzbab.zzdzr;
            } else {
                zzdrhVar = zzbab.zzdzv;
            }
        }
        return (zzdrh) zzehf.zza(zzdrhVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
