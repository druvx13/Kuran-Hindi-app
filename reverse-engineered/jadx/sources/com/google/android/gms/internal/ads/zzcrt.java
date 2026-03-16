package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcrt implements zzegz<zzcrq> {
    private final zzehm<zzcsx> zzghp;

    private zzcrt(zzehm<zzcsx> zzehmVar) {
        this.zzghp = zzehmVar;
    }

    public static zzcrt zzah(zzehm<zzcsx> zzehmVar) {
        return new zzcrt(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcrq(this.zzghp.get());
    }
}
