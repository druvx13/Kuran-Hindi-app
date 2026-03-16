package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcns implements zzcnj<zzblx> {
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzbmt zzgeq;
    private final zzdnx<zzdgo, zzaxr> zzger;
    private final Context zzvf;

    public zzcns(zzbmt zzbmtVar, Context context, Executor executor, zzcey zzceyVar, zzdhe zzdheVar, zzdnx<zzdgo, zzaxr> zzdnxVar) {
        this.zzvf = context;
        this.zzgeq = zzbmtVar;
        this.zzfhi = executor;
        this.zzfud = zzceyVar;
        this.zzfll = zzdheVar;
        this.zzger = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzdkw == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzblx> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        return zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, zzdhaVar, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcnv
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcns zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzget.zzb(this.zzfvc, this.zzfjm, obj);
            }
        }, this.zzfhi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzbek zzbekVar) {
        zzbekVar.zzabd();
        zzbfe zzzf = zzbekVar.zzzf();
        if (this.zzfll.zzguv == null || zzzf == null) {
            return;
        }
        zzzf.zzb(this.zzfll.zzguv);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzb(zzdha zzdhaVar, zzdgo zzdgoVar, Object obj) throws Exception {
        zzum zzb = zzdhh.zzb(this.zzvf, zzdgoVar.zzgtt);
        final zzbek zzc = this.zzfud.zzc(zzb);
        zzc.zzax(zzdgoVar.zzdov);
        zzbmt zzbmtVar = this.zzgeq;
        zzboi zzboiVar = new zzboi(zzdhaVar, zzdgoVar, null);
        zzcfp zzcfpVar = new zzcfp(this.zzvf, zzc.getView(), this.zzger.apply(zzdgoVar));
        zzc.getClass();
        final zzblw zza = zzbmtVar.zza(zzboiVar, new zzbma(zzcfpVar, zzc, zzcnu.zzp(zzc), zzdhh.zze(zzb)));
        zza.zzaez().zzb(zzc, false);
        zza.zzaek().zza(new zzbrp(zzc) { // from class: com.google.android.gms.internal.ads.zzcnx
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbrp
            public final void onAdImpression() {
                zzbek zzbekVar = this.zzelg;
                if (zzbekVar.zzabj() != null) {
                    zzbekVar.zzabj().zzaav();
                }
            }
        }, zzbab.zzdzw);
        zza.zzaez();
        zzdri<?> zza2 = zzcfa.zza(zzc, zzdgoVar.zzgtr.zzdku, zzdgoVar.zzgtr.zzdkw);
        if (zzdgoVar.zzdpp) {
            zzc.getClass();
            zza2.addListener(zzcnw.zzh(zzc), this.zzfhi);
        }
        zza2.addListener(new Runnable(this, zzc) { // from class: com.google.android.gms.internal.ads.zzcnz
            private final zzbek zzfvt;
            private final zzcns zzget;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzget = this;
                this.zzfvt = zzc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzget.zzo(this.zzfvt);
            }
        }, this.zzfhi);
        return zzdqw.zzb(zza2, new zzdnx(zza) { // from class: com.google.android.gms.internal.ads.zzcny
            private final zzblw zzgeu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgeu = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj2) {
                return this.zzgeu.zzafj();
            }
        }, zzbab.zzdzw);
    }
}
