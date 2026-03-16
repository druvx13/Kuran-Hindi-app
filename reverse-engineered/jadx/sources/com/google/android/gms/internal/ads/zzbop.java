package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbop implements zzegz<zzbom> {
    private final zzehm<zzbrx> zzewo;

    private zzbop(zzehm<zzbrx> zzehmVar) {
        this.zzewo = zzehmVar;
    }

    public static zzbop zze(zzehm<zzbrx> zzehmVar) {
        return new zzbop(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbom(this.zzewo.get());
    }
}
