package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqq implements zzcnm<zzcel, zzdhq, zzcot> {
    private final Executor zzfhi;
    private final zzceo zzggx;
    private final Context zzvf;

    public zzcqq(Context context, Executor executor, zzceo zzceoVar) {
        this.zzvf = context;
        this.zzfhi = executor;
        this.zzggx = zzceoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk {
        try {
            zzdhe zzdheVar = zzdhaVar.zzgur.zzfll;
            if (zzdheVar.zzgvd.zzguh == zzdgw.zzgul) {
                zzcnlVar.zzdgp.zzc(this.zzvf, zzdheVar.zzguw, zzdgoVar.zzgtu.toString(), zzcnlVar.zzgel);
            } else {
                zzcnlVar.zzdgp.zzb(this.zzvf, zzdheVar.zzguw, zzdgoVar.zzgtu.toString(), zzcnlVar.zzgel);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcnlVar.zzflf);
            zzawr.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzcel zzb(zzdha zzdhaVar, zzdgo zzdgoVar, final zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzcen zza = this.zzggx.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzcem(new zzbxz(zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcqt
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
                    ((zzdhq) zzcnlVar2.zzdgp).zzcf(context);
                } catch (zzdhk e) {
                    throw new zzbxy(e.getCause());
                }
            }
        }));
        zza.zzaeh().zza((zzbrr) new zzbkc(zzcnlVar.zzdgp), this.zzfhi);
        zzcnlVar.zzgel.zzb(zza.zzafy());
        return zza.zzafw();
    }
}
