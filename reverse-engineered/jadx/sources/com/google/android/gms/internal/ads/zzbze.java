package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbze implements zzegz<zzcaf> {
    private final zzbza zzfqw;
    private final zzehm<zzbyx> zzfqx;

    public zzbze(zzbza zzbzaVar, zzehm<zzbyx> zzehmVar) {
        this.zzfqw = zzbzaVar;
        this.zzfqx = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcaf) zzehf.zza(this.zzfqx.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
