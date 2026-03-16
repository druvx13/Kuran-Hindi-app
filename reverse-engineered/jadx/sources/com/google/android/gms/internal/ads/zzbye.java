package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbye implements zzegz<zzbyf> {
    private final zzehm<zzbrr> zzfpg;

    private zzbye(zzehm<zzbrr> zzehmVar) {
        this.zzfpg = zzehmVar;
    }

    public static zzbye zzx(zzehm<zzbrr> zzehmVar) {
        return new zzbye(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbyf(this.zzfpg.get());
    }
}
