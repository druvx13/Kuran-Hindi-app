package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczf implements zzegz<zzczg> {
    private final zzehm<String> zzfyk;

    private zzczf(zzehm<String> zzehmVar) {
        this.zzfyk = zzehmVar;
    }

    public static zzczf zzao(zzehm<String> zzehmVar) {
        return new zzczf(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzczg(this.zzfyk.get());
    }
}
