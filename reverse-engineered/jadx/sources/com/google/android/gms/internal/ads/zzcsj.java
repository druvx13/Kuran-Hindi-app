package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsj<AdT> implements zzcnj<AdT> {
    private final zzdku zzflm;
    private final zzdrh zzghr;
    private final zzaas zzghx;
    private final zzcsk<AdT> zzgig;

    public zzcsj(zzdku zzdkuVar, zzdrh zzdrhVar, zzaas zzaasVar, zzcsk<AdT> zzcskVar) {
        this.zzflm = zzdkuVar;
        this.zzghr = zzdrhVar;
        this.zzghx = zzaasVar;
        this.zzgig = zzcskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (this.zzghx == null || zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzdkw == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<AdT> zzb(zzdha zzdhaVar, zzdgo zzdgoVar) {
        zzbaj zzbajVar = new zzbaj();
        zzcsr zzcsrVar = new zzcsr();
        zzcsrVar.zza(new zzcsl(this, zzbajVar, zzdhaVar, zzdgoVar, zzcsrVar));
        final zzaap zzaapVar = new zzaap(zzcsrVar, zzdgoVar.zzgtr.zzdku, zzdgoVar.zzgtr.zzdkw);
        return this.zzflm.zzu(zzdkr.CUSTOM_RENDER_SYN).zza(new zzdke(this, zzaapVar) { // from class: com.google.android.gms.internal.ads.zzcsi
            private final zzaap zzgia;
            private final zzcsj zzgif;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgif = this;
                this.zzgia = zzaapVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdke
            public final void run() {
                this.zzgif.zzb(this.zzgia);
            }
        }, this.zzghr).zzw(zzdkr.CUSTOM_RENDER_ACK).zze(zzbajVar).zzaud();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzaap zzaapVar) throws Exception {
        this.zzghx.zza(zzaapVar);
    }
}
