package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzckh implements zzdqx<zzdha> {
    private final /* synthetic */ zzcke zzgbi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckh(zzcke zzckeVar) {
        this.zzgbi = zzckeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzdha zzdhaVar) {
        zzbth zzbthVar;
        zzbthVar = this.zzgbi.zzgbd;
        zzbthVar.zzb(zzdhaVar);
    }
}
