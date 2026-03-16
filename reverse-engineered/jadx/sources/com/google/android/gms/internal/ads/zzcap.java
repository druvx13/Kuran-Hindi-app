package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcap implements zzegz<zzbzx> {
    private final zzcaj zzfsy;

    private zzcap(zzcaj zzcajVar) {
        this.zzfsy = zzcajVar;
    }

    public static zzcap zzb(zzcaj zzcajVar) {
        return new zzcap(zzcajVar);
    }

    public static zzbzx zzc(zzcaj zzcajVar) {
        return (zzbzx) zzehf.zza(zzcajVar.zzalu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzc(this.zzfsy);
    }
}
