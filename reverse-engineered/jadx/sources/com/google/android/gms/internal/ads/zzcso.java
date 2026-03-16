package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcso implements zzegz<zzcsm> {
    private final zzcsm zzgim;

    private zzcso(zzcsm zzcsmVar) {
        this.zzgim = zzcsmVar;
    }

    public static zzcso zzc(zzcsm zzcsmVar) {
        return new zzcso(zzcsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        zzcsm zzcsmVar = this.zzgim;
        if (zzcsmVar != null) {
            return (zzcsm) zzehf.zza(zzcsmVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
