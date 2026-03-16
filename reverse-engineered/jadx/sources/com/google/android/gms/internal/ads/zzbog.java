package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbog implements zzdqx<zzbny> {
    private final /* synthetic */ zzdqx zzfld;
    private final /* synthetic */ zzbod zzfle;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbog(zzbod zzbodVar, zzdqx zzdqxVar) {
        this.zzfle = zzbodVar;
        this.zzfld = zzdqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        this.zzfld.zzb(th);
        this.zzfle.zzaic();
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzbny zzbnyVar) {
        this.zzfle.zza(zzbnyVar.zzfkv, this.zzfld);
    }
}
