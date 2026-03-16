package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchw implements zzegz<zzchx> {
    private final zzehm<zzcie> zzeoi;

    private zzchw(zzehm<zzcie> zzehmVar) {
        this.zzeoi = zzehmVar;
    }

    public static zzchw zzab(zzehm<zzcie> zzehmVar) {
        return new zzchw(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzchx(this.zzeoi.get());
    }
}
