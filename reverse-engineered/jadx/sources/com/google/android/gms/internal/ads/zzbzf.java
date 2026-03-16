package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzf implements zzegz<zzcab> {
    private final zzehm<zzcaa> zzeyz;
    private final zzbza zzfqw;

    public zzbzf(zzbza zzbzaVar, zzehm<zzcaa> zzehmVar) {
        this.zzfqw = zzbzaVar;
        this.zzeyz = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcab) zzehf.zza(this.zzeyz.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
