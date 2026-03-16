package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmh implements zzegz<zzdgn> {
    private final zzbma zzfjo;

    public zzbmh(zzbma zzbmaVar) {
        this.zzfjo = zzbmaVar;
    }

    public static zzdgn zzc(zzbma zzbmaVar) {
        return (zzdgn) zzehf.zza(zzbmaVar.zzahn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzc(this.zzfjo);
    }
}
