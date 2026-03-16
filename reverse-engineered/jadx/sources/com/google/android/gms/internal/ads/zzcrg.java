package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcrg implements zzbxz {
    private final zzazz zzbml;
    private final zzdgo zzfkd;
    private final zzdhe zzfll;
    private final zzcey zzfud;
    private final zzdri<zzcen> zzgft;
    private final zzbek zzghd;
    private final Context zzvf;

    private zzcrg(Context context, zzcey zzceyVar, zzdhe zzdheVar, zzazz zzazzVar, zzdgo zzdgoVar, zzdri<zzcen> zzdriVar, zzbek zzbekVar) {
        this.zzvf = context;
        this.zzfud = zzceyVar;
        this.zzfll = zzdheVar;
        this.zzbml = zzazzVar;
        this.zzfkd = zzdgoVar;
        this.zzgft = zzdriVar;
        this.zzghd = zzbekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxz
    public final void zza(boolean z, Context context) {
        zzbek zzbekVar;
        zzbek zzbekVar2;
        zzcen zzcenVar = (zzcen) zzdqw.zzb(this.zzgft);
        try {
            zzdgo zzdgoVar = this.zzfkd;
            if (!this.zzghd.zzaby()) {
                zzbekVar2 = this.zzghd;
            } else {
                if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzclh)).booleanValue()) {
                    zzbekVar2 = this.zzghd;
                } else {
                    final zzbek zzc = this.zzfud.zzc(this.zzfll.zzbmp);
                    zzagl.zza(zzc, zzcenVar.zzafx());
                    final zzcfo zzcfoVar = new zzcfo();
                    zzcfoVar.zzc(this.zzvf, zzc.getView());
                    zzcenVar.zzaez().zzb(zzc, true);
                    zzc.zzabj().zza(new zzbfv(zzcfoVar, zzc) { // from class: com.google.android.gms.internal.ads.zzcrj
                        private final zzbek zzfvt;
                        private final zzcfo zzgfr;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgfr = zzcfoVar;
                            this.zzfvt = zzc;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbfv
                        public final void zzak(boolean z2) {
                            zzcfo zzcfoVar2 = this.zzgfr;
                            zzbek zzbekVar3 = this.zzfvt;
                            zzcfoVar2.zzamy();
                            zzbekVar3.zzabd();
                            zzbekVar3.zzabj().zzaav();
                        }
                    });
                    zzbfw zzabj = zzc.zzabj();
                    zzc.getClass();
                    zzabj.zza(zzcri.zzq(zzc));
                    zzc.zzb(zzdgoVar.zzgtr.zzdku, zzdgoVar.zzgtr.zzdkw, null);
                    zzbekVar = zzc;
                    zzbekVar.zzba(true);
                    com.google.android.gms.ads.internal.zzq.zzkw();
                    com.google.android.gms.ads.internal.zzg zzgVar = new com.google.android.gms.ads.internal.zzg(false, zzaxa.zzbb(this.zzvf), false, 0.0f, -1, z, this.zzfkd.zzfin, this.zzfkd.zzbmh);
                    com.google.android.gms.ads.internal.zzq.zzkv();
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zzub) null, zzcenVar.zzafq(), (com.google.android.gms.ads.internal.overlay.zzt) null, zzbekVar, this.zzfkd.zzgty, this.zzbml, this.zzfkd.zzdny, zzgVar, this.zzfkd.zzgtr.zzdku, this.zzfkd.zzgtr.zzdkw), true);
                }
            }
            zzbekVar = zzbekVar2;
            zzbekVar.zzba(true);
            com.google.android.gms.ads.internal.zzq.zzkw();
            com.google.android.gms.ads.internal.zzg zzgVar2 = new com.google.android.gms.ads.internal.zzg(false, zzaxa.zzbb(this.zzvf), false, 0.0f, -1, z, this.zzfkd.zzfin, this.zzfkd.zzbmh);
            com.google.android.gms.ads.internal.zzq.zzkv();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zzub) null, zzcenVar.zzafq(), (com.google.android.gms.ads.internal.overlay.zzt) null, zzbekVar, this.zzfkd.zzgty, this.zzbml, this.zzfkd.zzdny, zzgVar2, this.zzfkd.zzgtr.zzdku, this.zzfkd.zzgtr.zzdkw), true);
        } catch (zzbew e) {
            zzazw.zzc("", e);
        }
    }
}
