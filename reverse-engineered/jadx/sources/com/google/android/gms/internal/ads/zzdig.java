package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdig implements zzegz<zzdic> {
    private final zzehm<zzdia> zzfhn;
    private final zzdie zzgvr;
    private final zzehm<String> zzgvt;

    private zzdig(zzdie zzdieVar, zzehm<zzdia> zzehmVar, zzehm<String> zzehmVar2) {
        this.zzgvr = zzdieVar;
        this.zzfhn = zzehmVar;
        this.zzgvt = zzehmVar2;
    }

    public static zzdig zza(zzdie zzdieVar, zzehm<zzdia> zzehmVar, zzehm<String> zzehmVar2) {
        return new zzdig(zzdieVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzdic) zzehf.zza(this.zzfhn.get().zzgt(this.zzgvt.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
