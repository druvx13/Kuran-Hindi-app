package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcpc implements zzcnm<zzbws, zzdhq, zzcot> {
    private final zzazz zzbml;
    private final Executor zzfhi;
    private final zzbxr zzgfa;
    private final Context zzvf;

    public zzcpc(Context context, zzazz zzazzVar, zzbxr zzbxrVar, Executor executor) {
        this.zzvf = context;
        this.zzbml = zzazzVar;
        this.zzgfa = zzbxrVar;
        this.zzfhi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk {
        if (this.zzbml.zzdzo < 4100000) {
            zzcnlVar.zzdgp.zza(this.zzvf, zzdhaVar.zzgur.zzfll.zzguw, zzdgoVar.zzgtu.toString(), zzcnlVar.zzgel);
        } else {
            zzcnlVar.zzdgp.zza(this.zzvf, zzdhaVar.zzgur.zzfll.zzguw, zzdgoVar.zzgtu.toString(), zzayu.zza(zzdgoVar.zzgtr), zzcnlVar.zzgel);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzbws zzb(zzdha zzdhaVar, zzdgo zzdgoVar, final zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzbwu zza = this.zzgfa.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzbwx(new zzbxz(zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcpf
            private final zzcnl zzgex;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgex = zzcnlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxz
            public final void zza(boolean z, Context context) {
                zzcnl zzcnlVar2 = this.zzgex;
                try {
                    ((zzdhq) zzcnlVar2.zzdgp).setImmersiveMode(z);
                    ((zzdhq) zzcnlVar2.zzdgp).showInterstitial();
                } catch (zzdhk e) {
                    zzawr.zzfb("Cannot show interstitial.");
                    throw new zzbxy(e.getCause());
                }
            }
        }));
        zza.zzaeh().zza((zzbrr) new zzbkc(zzcnlVar.zzdgp), this.zzfhi);
        zzcnlVar.zzgel.zzb(zza.zzaem());
        return zza.zzafo();
    }
}
