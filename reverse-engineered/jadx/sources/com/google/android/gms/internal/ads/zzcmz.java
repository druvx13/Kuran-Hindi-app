package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmz implements zzegz<zzcmw> {
    private final zzehm<zzcmv> zzgdx;

    private zzcmz(zzehm<zzcmv> zzehmVar) {
        this.zzgdx = zzehmVar;
    }

    public static zzcmz zzag(zzehm<zzcmv> zzehmVar) {
        return new zzcmz(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcmw(this.zzgdx.get());
    }
}
