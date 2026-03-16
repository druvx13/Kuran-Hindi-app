package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsa implements zzcnj<zzblx> {
    private final zzdku zzflm;
    private final zzbmt zzgeq;
    private final zzdrh zzghr;
    private final Context zzghw;
    private final zzaas zzghx;

    public zzcsa(Context context, zzbmt zzbmtVar, zzdku zzdkuVar, zzdrh zzdrhVar, zzaas zzaasVar) {
        this.zzghw = context;
        this.zzgeq = zzbmtVar;
        this.zzflm = zzdkuVar;
        this.zzghr = zzdrhVar;
        this.zzghx = zzaasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (this.zzghx == null || zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzdkw == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzblx> zzb(zzdha zzdhaVar, zzdgo zzdgoVar) {
        zzblw zza = this.zzgeq.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzcsf(this, new View(this.zzghw), null, zzcsd.zzgib, zzdgoVar.zzgtt.get(0)));
        final zzaap zzaapVar = new zzaap(zza.zzafl(), zzdgoVar.zzgtr.zzdku, zzdgoVar.zzgtr.zzdkw);
        return this.zzflm.zzu(zzdkr.CUSTOM_RENDER_SYN).zza(new zzdke(this, zzaapVar) { // from class: com.google.android.gms.internal.ads.zzcsc
            private final zzcsa zzghz;
            private final zzaap zzgia;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghz = this;
                this.zzgia = zzaapVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdke
            public final void run() {
                this.zzghz.zza(this.zzgia);
            }
        }, this.zzghr).zzw(zzdkr.CUSTOM_RENDER_ACK).zze(zzdqw.zzag(zza.zzafj())).zzaud();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaap zzaapVar) throws Exception {
        this.zzghx.zza(zzaapVar);
    }
}
