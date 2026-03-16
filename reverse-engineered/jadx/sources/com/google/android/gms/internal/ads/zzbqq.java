package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqq implements zzegz<zzdhe> {
    private final zzbqj zzfmy;

    private zzbqq(zzbqj zzbqjVar) {
        this.zzfmy = zzbqjVar;
    }

    public static zzbqq zzm(zzbqj zzbqjVar) {
        return new zzbqq(zzbqjVar);
    }

    public static zzdhe zzn(zzbqj zzbqjVar) {
        return (zzdhe) zzehf.zza(zzbqjVar.zzain(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzn(this.zzfmy);
    }
}
