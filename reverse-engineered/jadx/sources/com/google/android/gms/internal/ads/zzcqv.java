package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqv implements zzcnm<zzcel, zzanv, zzcot> {
    private final zzceo zzggx;
    private final Context zzvf;

    public zzcqv(Context context, zzceo zzceoVar) {
        this.zzvf = context;
        this.zzggx = zzceoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk {
        try {
            zzcnlVar.zzdgp.zzdp(zzdgoVar.zzdhp);
            if (zzdhaVar.zzgur.zzfll.zzgvd.zzguh == zzdgw.zzgul) {
                zzcnlVar.zzdgp.zzb(zzdgoVar.zzelw, zzdgoVar.zzgtu.toString(), zzdhaVar.zzgur.zzfll.zzguw, ObjectWrapper.wrap(this.zzvf), new zzcqx(this, zzcnlVar), zzcnlVar.zzgel);
            } else {
                zzcnlVar.zzdgp.zza(zzdgoVar.zzelw, zzdgoVar.zzgtu.toString(), zzdhaVar.zzgur.zzfll.zzguw, ObjectWrapper.wrap(this.zzvf), new zzcqx(this, zzcnlVar), zzcnlVar.zzgel);
            }
        } catch (RemoteException e) {
            zzawr.zza("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzcel zzb(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzcpd zzcpdVar = new zzcpd(zzdgoVar, zzcnlVar.zzdgp, true);
        zzcen zza = this.zzggx.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzcem(zzcpdVar));
        zzcpdVar.zza(zza.zzaek());
        zzcnlVar.zzgel.zzb(zza.zzafz());
        return zza.zzafw();
    }
}
