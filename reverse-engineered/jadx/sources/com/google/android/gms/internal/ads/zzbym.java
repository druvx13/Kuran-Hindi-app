package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbym implements zzegz<zzcae> {
    private final zzbyl zzfpr;

    private zzbym(zzbyl zzbylVar) {
        this.zzfpr = zzbylVar;
    }

    public static zzbym zzc(zzbyl zzbylVar) {
        return new zzbym(zzbylVar);
    }

    public static zzcae zzd(zzbyl zzbylVar) {
        return (zzcae) zzehf.zza(zzbylVar.zzakd(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzd(this.zzfpr);
    }
}
