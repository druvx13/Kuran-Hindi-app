package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzboj implements zzdqx<zzbns> {
    private final /* synthetic */ zzdqx zzfld;
    private final /* synthetic */ zzbod zzfle;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboj(zzbod zzbodVar, zzdqx zzdqxVar) {
        this.zzfle = zzbodVar;
        this.zzfld = zzdqxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        this.zzfle.zzaic();
        this.zzfld.zzb(th);
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzbns zzbnsVar) {
        this.zzfle.zzaic();
        this.zzfld.onSuccess(zzbnsVar);
    }
}
