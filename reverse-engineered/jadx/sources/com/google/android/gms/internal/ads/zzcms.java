package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcms implements zzegz<zzcmt> {
    private final zzehm<zzcmy> zzgdg;

    private zzcms(zzehm<zzcmy> zzehmVar) {
        this.zzgdg = zzehmVar;
    }

    public static zzcms zzaf(zzehm<zzcmy> zzehmVar) {
        return new zzcms(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcmt(this.zzgdg.get());
    }
}
