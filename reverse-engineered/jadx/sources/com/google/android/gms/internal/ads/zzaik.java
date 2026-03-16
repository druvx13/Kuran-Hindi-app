package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaik extends zzbgl {
    private final /* synthetic */ zzaie zzdbw;

    private zzaik(zzaie zzaieVar) {
        this.zzdbw = zzaieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zza(zzbgo zzbgoVar) {
        if (zzaie.zza(this.zzdbw) != null) {
            zzaie.zza(this.zzdbw).zzsv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzb(zzbgo zzbgoVar) {
        this.zzdbw.zzg(zzbgoVar.uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final boolean zzc(zzbgo zzbgoVar) {
        return this.zzdbw.zzg(zzbgoVar.uri);
    }
}
