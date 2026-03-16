package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbol implements zzegz<zzdgo> {
    private final zzboi zzflg;

    private zzbol(zzboi zzboiVar) {
        this.zzflg = zzboiVar;
    }

    public static zzbol zzc(zzboi zzboiVar) {
        return new zzbol(zzboiVar);
    }

    public static zzdgo zzd(zzboi zzboiVar) {
        return (zzdgo) zzehf.zza(zzboiVar.zzaif(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzd(this.zzflg);
    }
}
