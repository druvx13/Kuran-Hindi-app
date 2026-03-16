package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcov implements zzcnj<zzbws> {
    private final zzazz zzbml;
    private final Executor zzfhi;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzbxr zzgfa;
    private final Context zzvf;

    public zzcov(Context context, zzazz zzazzVar, zzdhe zzdheVar, Executor executor, zzbxr zzbxrVar, zzcey zzceyVar) {
        this.zzvf = context;
        this.zzfll = zzdheVar;
        this.zzgfa = zzbxrVar;
        this.zzfhi = executor;
        this.zzbml = zzazzVar;
        this.zzfud = zzceyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return (zzdgoVar.zzgtr == null || zzdgoVar.zzgtr.zzdkw == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzbws> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        final zzcfo zzcfoVar = new zzcfo();
        zzdri<zzbws> zzb = zzdqw.zzb(zzdqw.zzag(null), new zzdqj(this, zzdgoVar, zzcfoVar, zzdhaVar) { // from class: com.google.android.gms.internal.ads.zzcou
            private final zzcov zzgfn;
            private final zzdgo zzgfo;
            private final zzcfo zzgfp;
            private final zzdha zzgfq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfn = this;
                this.zzgfo = zzdgoVar;
                this.zzgfp = zzcfoVar;
                this.zzgfq = zzdhaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgfn.zza(this.zzgfo, this.zzgfp, this.zzgfq, obj);
            }
        }, this.zzfhi);
        zzcfoVar.getClass();
        zzb.addListener(zzcox.zza(zzcfoVar), this.zzfhi);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(final zzdgo zzdgoVar, zzcfo zzcfoVar, zzdha zzdhaVar, Object obj) throws Exception {
        zzdri<?> zza;
        final zzbek zza2 = this.zzfud.zza(this.zzfll.zzbmp, zzdgoVar.zzejq);
        zza2.zzax(zzdgoVar.zzdov);
        zzcfoVar.zzc(this.zzvf, zza2.getView());
        zzbaj zzbajVar = new zzbaj();
        final zzbwu zza3 = this.zzgfa.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzbwx(new zzcpb(this.zzvf, this.zzbml, zzbajVar, zzdgoVar, zza2), zza2));
        zzbajVar.set(zza3);
        zza3.zzaek().zza(new zzbrp(zza2) { // from class: com.google.android.gms.internal.ads.zzcow
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
        return zzdqw.zzb(zza, new zzdnx(this, zza2, zzdgoVar, zza3) { // from class: com.google.android.gms.internal.ads.zzcoz
            private final zzdgo zzfjm;
            private final zzbek zzfvt;
            private final zzcov zzgfn;
            private final zzbwu zzgfs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfn = this;
                this.zzfvt = zza2;
                this.zzfjm = zzdgoVar;
                this.zzgfs = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj2) {
                zzbek zzbekVar = this.zzfvt;
                zzdgo zzdgoVar2 = this.zzfjm;
                zzbwu zzbwuVar = this.zzgfs;
                if (zzdgoVar2.zzdpp) {
                    zzbekVar.zzabw();
                }
                zzbekVar.zzabd();
                if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcld)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzq.zzky();
                    zzaxf.zza(zzbekVar);
                }
                return zzbwuVar.zzafo();
            }
        }, this.zzfhi);
    }
}
