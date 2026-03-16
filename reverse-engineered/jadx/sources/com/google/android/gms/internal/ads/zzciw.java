package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzciw implements zzegz<zzcix> {
    private final zzehm<zzbgy> zzenk;
    private final zzehm<zzcil> zzfyg;

    private zzciw(zzehm<zzcil> zzehmVar, zzehm<zzbgy> zzehmVar2) {
        this.zzfyg = zzehmVar;
        this.zzenk = zzehmVar2;
    }

    public static zzciw zzah(zzehm<zzcil> zzehmVar, zzehm<zzbgy> zzehmVar2) {
        return new zzciw(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcix(this.zzfyg.get(), this.zzenk.get());
    }
}
