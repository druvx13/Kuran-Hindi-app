package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcrk implements zzcnm<zzcel, zzdhq, zzcos> {
    private final Executor zzfhi;
    private final zzceo zzggx;
    private final Context zzvf;

    public zzcrk(Context context, Executor executor, zzceo zzceoVar) {
        this.zzvf = context;
        this.zzfhi = executor;
        this.zzggx = zzceoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcos> zzcnlVar) throws zzdhk {
        if (!zzcnlVar.zzdgp.isInitialized()) {
            zzcnlVar.zzgel.zza(new zzcrm(this, zzdhaVar, zzdgoVar, zzcnlVar));
            zzcnlVar.zzdgp.zza(this.zzvf, zzdhaVar.zzgur.zzfll.zzguw, (String) null, zzcnlVar.zzgel, zzdgoVar.zzgtu.toString());
            return;
        }
        zzc(zzdhaVar, zzdgoVar, zzcnlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcos> zzcnlVar) {
        try {
            zzcnlVar.zzdgp.zza(zzdhaVar.zzgur.zzfll.zzguw, zzdgoVar.zzgtu.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcnlVar.zzflf);
            zzawr.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzcel zzb(zzdha zzdhaVar, zzdgo zzdgoVar, final zzcnl<zzdhq, zzcos> zzcnlVar) throws zzdhk, zzcqm {
        zzcen zza = this.zzggx.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzcem(new zzbxz(zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcrn
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
                    ((zzdhq) zzcnlVar2.zzdgp).showVideo();
                } catch (zzdhk e) {
                    zzawr.zzd("Cannot show rewarded video.", e);
                    throw new zzbxy(e.getCause());
                }
            }
        }));
        zza.zzaeh().zza((zzbrr) new zzbkc(zzcnlVar.zzdgp), this.zzfhi);
        zzbrx zzaei = zza.zzaei();
        zzbqw zzaej = zza.zzaej();
        zzcnlVar.zzgel.zza(new zzcro(this, zza.zzafp(), zzaej, zzaei, zza.zzafx()));
        return zza.zzafw();
    }
}
