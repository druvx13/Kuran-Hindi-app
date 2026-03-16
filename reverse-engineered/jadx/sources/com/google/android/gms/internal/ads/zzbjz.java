package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbjz implements zzegz<zzbjw> {
    private final zzehm<zzawt> zzeqm;

    private zzbjz(zzehm<zzawt> zzehmVar) {
        this.zzeqm = zzehmVar;
    }

    public static zzbjz zza(zzehm<zzawt> zzehmVar) {
        return new zzbjz(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbjw(this.zzeqm.get());
    }
}
