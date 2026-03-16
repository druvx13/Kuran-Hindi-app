package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcra implements zzcnj<zzcel> {
    private final zzazz zzbml;
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzceo zzggx;
    private final Context zzvf;

    public zzcra(Context context, zzazz zzazzVar, zzdhe zzdheVar, Executor executor, zzceo zzceoVar, zzcey zzceyVar) {
        this.zzvf = context;
        this.zzfll = zzdheVar;
        this.zzggx = zzceoVar;
        this.zzfhi = executor;
        this.zzbml = zzazzVar;
        this.zzfud = zzceyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzdkw == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzcel> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        final zzcfo zzcfoVar = new zzcfo();
        zzdri<zzcel> zzb = zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, zzdgoVar, zzcfoVar, zzdhaVar) { // from class: com.google.android.gms.internal.ads.zzcrd
            private final zzdgo zzgfo;
            private final zzcfo zzgfp;
            private final zzdha zzgfq;
            private final zzcra zzghb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghb = this;
                this.zzgfo = zzdgoVar;
                this.zzgfp = zzcfoVar;
                this.zzgfq = zzdhaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzghb.zzb(this.zzgfo, this.zzgfp, this.zzgfq, obj);
            }
        }, this.zzfhi);
        zzcfoVar.getClass();
        zzb.addListener(zzcrc.zza(zzcfoVar), this.zzfhi);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzb(final zzdgo zzdgoVar, zzcfo zzcfoVar, zzdha zzdhaVar, Object obj) throws Exception {
        zzdri<?> zza;
        final zzbek zza2 = this.zzfud.zza(this.zzfll.zzbmp, zzdgoVar.zzejq);
        zza2.zzax(zzdgoVar.zzdov);
        zzcfoVar.zzc(this.zzvf, zza2.getView());
        zzbaj zzbajVar = new zzbaj();
        final zzcen zza3 = this.zzggx.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzcem(new zzcrg(this.zzvf, this.zzfud, this.zzfll, this.zzbml, zzdgoVar, zzbajVar, zza2), zza2));
        zzbajVar.set(zza3);
        zzagl.zza(zza2, zza3.zzafx());
        zza3.zzaek().zza(new zzbrp(zza2) { // from class: com.google.android.gms.internal.ads.zzcrf
            private final zzbek zzelg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelg = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzbrp
            public final void onAdImpression() {
                zzbek zzbekVar = this.zzelg;
                if (zzbekVar.zzabj() != null) {
                    zzbekVar.zzabj().zzaav();
                }
            }
        }, zzbab.zzdzw);
        zza3.zzaez().zzb(zza2, true);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcte)).booleanValue() && zzdgoVar.zzejq) {
            zza = zzdqw.zzag(null);
        } else {
            zza3.zzaez();
            zza = zzcfa.zza(zza2, zzdgoVar.zzgtr.zzdku, zzdgoVar.zzgtr.zzdkw);
        }
        return zzdqw.zzb(zza, new zzdnx(this, zza2, zzdgoVar, zza3) { // from class: com.google.android.gms.internal.ads.zzcre
            private final zzdgo zzfjm;
            private final zzbek zzfvt;
            private final zzcra zzghb;
            private final zzcen zzghc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghb = this;
                this.zzfvt = zza2;
                this.zzfjm = zzdgoVar;
                this.zzghc = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj2) {
                zzbek zzbekVar = this.zzfvt;
                zzdgo zzdgoVar2 = this.zzfjm;
                zzcen zzcenVar = this.zzghc;
                if (zzdgoVar2.zzdpp) {
                    zzbekVar.zzabw();
                }
                zzbekVar.zzabd();
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcld)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzq.zzky();
                    zzaxf.zza(zzbekVar);
                }
                return zzcenVar.zzafw();
            }
        }, this.zzfhi);
    }
}
