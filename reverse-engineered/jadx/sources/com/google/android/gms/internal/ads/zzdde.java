package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdde implements zzdqx<zzblr> {
    private final /* synthetic */ zzctz zzgkk;
    private final /* synthetic */ zzddd zzgqg;
    private final /* synthetic */ zzdcz zzgqh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdde(zzdcz zzdczVar, zzctz zzctzVar, zzddd zzdddVar) {
        this.zzgqh = zzdczVar;
        this.zzgkk = zzctzVar;
        this.zzgqg = zzdddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzdeu zzdeuVar;
        zzddn zzddnVar;
        zzblk zzb;
        synchronized (this.zzgqh) {
            zzdcz.zza(this.zzgqh, (zzdri) null);
            zzdeuVar = this.zzgqh.zzgqe;
            zzbll zzbllVar = (zzbll) zzdeuVar.zzarj();
            if (zzbllVar != null) {
                zzbllVar.zzaee().onAdFailedToLoad(zzcjk.zzd(th));
            } else {
                zzddnVar = this.zzgqh.zzgqd;
                zzddnVar.onAdFailedToLoad(zzcjk.zzd(th));
                zzb = this.zzgqh.zzb(this.zzgqg);
                zzb.zzaes().zzaed().zzaij().zzaja();
            }
            zzdhn.zzc(th, "AppOpenAdLoader.onFailure");
            this.zzgkk.zzapn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzblr zzblrVar) {
        zzblr zzblrVar2 = zzblrVar;
        synchronized (this.zzgqh) {
            zzdcz.zza(this.zzgqh, (zzdri) null);
            this.zzgkk.onSuccess(zzblrVar2);
        }
    }
}
