package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhh implements zzegz<zzbjv> {
    private final zzbhb zzeni;
    private final zzehm<zzbgy> zzenk;

    public zzbhh(zzbhb zzbhbVar, zzehm<zzbgy> zzehmVar) {
        this.zzeni = zzbhbVar;
        this.zzenk = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbjv) zzehf.zza(this.zzenk.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
