package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvl implements zzegz<zzcvm> {
    private final zzehm<zzdhe> zzfjq;

    private zzcvl(zzehm<zzdhe> zzehmVar) {
        this.zzfjq = zzehmVar;
    }

    public static zzcvl zzaj(zzehm<zzdhe> zzehmVar) {
        return new zzcvl(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcvm(this.zzfjq.get());
    }
}
