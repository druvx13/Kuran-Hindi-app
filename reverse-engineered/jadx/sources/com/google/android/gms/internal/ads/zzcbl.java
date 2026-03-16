package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbl implements zzegz<zzcbi> {
    private final zzehm<zzcab> zzeyi;
    private final zzehm<zzbzx> zzfqt;

    public zzcbl(zzehm<zzbzx> zzehmVar, zzehm<zzcab> zzehmVar2) {
        this.zzfqt = zzehmVar;
        this.zzeyi = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcbi(this.zzfqt.get(), this.zzeyi.get());
    }
}
