package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbon implements zzegz<zzdha> {
    private final zzboi zzflg;

    private zzbon(zzboi zzboiVar) {
        this.zzflg = zzboiVar;
    }

    public static zzbon zze(zzboi zzboiVar) {
        return new zzbon(zzboiVar);
    }

    public static zzdha zzf(zzboi zzboiVar) {
        return (zzdha) zzehf.zza(zzboiVar.zzaie(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzf(this.zzflg);
    }
}
