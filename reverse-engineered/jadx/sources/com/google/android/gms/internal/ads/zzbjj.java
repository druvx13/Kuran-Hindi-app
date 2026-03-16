package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbjj implements zzegz<zzbaa> {
    private final zzehm<String> zzffz;

    public zzbjj(zzehm<String> zzehmVar) {
        this.zzffz = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbaa) zzehf.zza(new zzbaa(this.zzffz.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
