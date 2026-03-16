package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcof implements zzcnm<zzblx, zzanv, zzcot> {
    private View view;
    private final zzbmt zzgeq;
    private final Context zzvf;

    public zzcof(Context context, zzbmt zzbmtVar) {
        this.zzvf = context;
        this.zzgeq = zzbmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk {
        try {
            zzcnlVar.zzdgp.zzdp(zzdgoVar.zzdhp);
            zzcnlVar.zzdgp.zza(zzdgoVar.zzelw, zzdgoVar.zzgtu.toString(), zzdhaVar.zzgur.zzfll.zzguw, ObjectWrapper.wrap(this.zzvf), new zzcog(this, zzcnlVar), zzcnlVar.zzgel, zzdhaVar.zzgur.zzfll.zzbmp);
        } catch (RemoteException e) {
            throw new zzdhk(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzblx zzb(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzblw zza = this.zzgeq.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzbma(this.view, null, new zzbnt(zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcoe
            private final zzcnl zzgex;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgex = zzcnlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbnt
            public final zzxl getVideoController() {
                return zzcof.zza(this.zzgex);
            }
        }, zzdgoVar.zzgtt.get(0)));
        zza.zzafk().zzu(this.view);
        zzcnlVar.zzgel.zzb(zza.zzaen());
        return zza.zzafj();
    }

    public static final /* synthetic */ zzxl zza(zzcnl zzcnlVar) throws zzdhk {
        try {
            return ((zzanv) zzcnlVar.zzdgp).getVideoController();
        } catch (RemoteException e) {
            throw new zzdhk(e);
        }
    }
}
