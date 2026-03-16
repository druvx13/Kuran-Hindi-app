package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcsl implements com.google.android.gms.ads.internal.zze {
    private final /* synthetic */ zzdgo zzggq;
    private final /* synthetic */ zzdha zzghe;
    private final /* synthetic */ zzbaj zzgih;
    private final /* synthetic */ zzcsr zzgii;
    private final /* synthetic */ zzcsj zzgij;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsl(zzcsj zzcsjVar, zzbaj zzbajVar, zzdha zzdhaVar, zzdgo zzdgoVar, zzcsr zzcsrVar) {
        this.zzgij = zzcsjVar;
        this.zzgih = zzbajVar;
        this.zzghe = zzdhaVar;
        this.zzggq = zzdgoVar;
        this.zzgii = zzcsrVar;
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjy() {
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjz() {
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzh(View view) {
        zzcsk zzcskVar;
        zzbaj zzbajVar = this.zzgih;
        zzcskVar = this.zzgij.zzgig;
        zzbajVar.set(zzcskVar.zza(this.zzghe, this.zzggq, view, this.zzgii));
    }
}
