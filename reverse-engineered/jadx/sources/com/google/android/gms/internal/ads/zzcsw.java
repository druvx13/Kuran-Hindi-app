package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsw implements zzegz<zzcsx> {
    private final zzehm<zzcfz> zzghp;

    private zzcsw(zzehm<zzcfz> zzehmVar) {
        this.zzghp = zzehmVar;
    }

    public static zzcsw zzai(zzehm<zzcfz> zzehmVar) {
        return new zzcsw(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcsx(this.zzghp.get());
    }
}
