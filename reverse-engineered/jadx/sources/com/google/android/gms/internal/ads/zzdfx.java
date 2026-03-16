package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdfx implements zzdqx<zzcel> {
    private final /* synthetic */ zzctz zzgkk;
    private final /* synthetic */ zzdga zzgsv;
    private final /* synthetic */ zzdfw zzgsw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdfx(zzdfw zzdfwVar, zzctz zzctzVar, zzdga zzdgaVar) {
        this.zzgsw = zzdfwVar;
        this.zzgkk = zzctzVar;
        this.zzgsv = zzdgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzdeu zzdeuVar;
        zzdez zzdezVar;
        zzcer zze;
        synchronized (this.zzgsw) {
            zzdeuVar = this.zzgsw.zzgqe;
            zzceo zzceoVar = (zzceo) zzdeuVar.zzarj();
            if (zzceoVar != null) {
                zzceoVar.zzaee().onAdFailedToLoad(zzcjk.zzd(th));
            } else {
                zzdezVar = this.zzgsw.zzgst;
                zzdezVar.onAdFailedToLoad(zzcjk.zzd(th));
                zze = this.zzgsw.zze(this.zzgsv);
                zze.zzafu().zzaed().zzaij().zzaja();
            }
            zzdhn.zzc(th, "RewardedAdLoader.onFailure");
            this.zzgkk.zzapn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzcel zzcelVar) {
        zzdez zzdezVar;
        zzcel zzcelVar2 = zzcelVar;
        synchronized (this.zzgsw) {
            this.zzgkk.onSuccess(zzcelVar2);
            zzdezVar = this.zzgsw.zzgst;
            zzdezVar.onAdMetadataChanged();
        }
    }
}
