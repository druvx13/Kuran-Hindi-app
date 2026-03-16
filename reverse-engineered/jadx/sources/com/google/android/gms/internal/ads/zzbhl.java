package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhl implements zzegz<zzdhp<zzcdt>> {
    private final zzehm<zzced> zzenl;
    private final zzehm<zzdrh> zzenm;

    public zzbhl(zzehm<zzced> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        this.zzenl = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzdhp) zzehf.zza(new zzdhp(this.zzenl.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
