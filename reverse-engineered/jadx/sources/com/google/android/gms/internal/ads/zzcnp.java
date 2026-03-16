package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcnp implements zzcnj<zzblr> {
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzbll zzgeo;
    private final Context zzvf;

    public zzcnp(zzbll zzbllVar, Context context, Executor executor, zzcey zzceyVar, zzdhe zzdheVar) {
        this.zzvf = context;
        this.zzgeo = zzbllVar;
        this.zzfhi = executor;
        this.zzfud = zzceyVar;
        this.zzfll = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzdkw == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzblr> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        return zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, zzdhaVar, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcno
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcnp zzgen;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgen = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgen.zza(this.zzfvc, this.zzfjm, obj);
            }
        }, this.zzfhi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdha zzdhaVar, zzdgo zzdgoVar, Object obj) throws Exception {
        zzum zzb = zzdhh.zzb(this.zzvf, zzdgoVar.zzgtt);
        final zzbek zzc = this.zzfud.zzc(zzb);
        final zzblf zza = this.zzgeo.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzble(zzc.getView(), zzc, zzdhh.zze(zzb), zzdgoVar.zzfil, zzdgoVar.zzfim, zzdgoVar.zzfin));
        zza.zzaez().zzb(zzc, false);
        zza.zzaek().zza(new zzbrp(zzc) { // from class: com.google.android.gms.internal.ads.zzcnr
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
        return zzdqw.zzb(zzcfa.zza(zzc, zzdgoVar.zzgtr.zzdku, zzdgoVar.zzgtr.zzdkw), new zzdnx(zza) { // from class: com.google.android.gms.internal.ads.zzcnq
            private final zzblf zzgep;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgep = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj2) {
                return this.zzgep.zzaey();
            }
        }, zzbab.zzdzw);
    }
}
