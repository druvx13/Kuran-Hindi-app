package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhm implements zzegz<zzazz> {
    private final zzbhb zzeni;

    public zzbhm(zzbhb zzbhbVar) {
        this.zzeni = zzbhbVar;
    }

    public static zzazz zzb(zzbhb zzbhbVar) {
        return (zzazz) zzehf.zza(zzbhbVar.zzadn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzeni);
    }
}
