package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcph implements zzcnm<zzbws, zzanv, zzcot> {
    private final zzbxr zzgfa;
    private final Context zzvf;

    public zzcph(Context context, zzbxr zzbxrVar) {
        this.zzvf = context;
        this.zzgfa = zzbxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk {
        try {
            zzcnlVar.zzdgp.zzdp(zzdgoVar.zzdhp);
            zzcnlVar.zzdgp.zza(zzdgoVar.zzelw, zzdgoVar.zzgtu.toString(), zzdhaVar.zzgur.zzfll.zzguw, ObjectWrapper.wrap(this.zzvf), new zzcpj(this, zzcnlVar), zzcnlVar.zzgel);
        } catch (RemoteException e) {
            throw new zzdhk(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzbws zzb(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzcpd zzcpdVar = new zzcpd(zzdgoVar, zzcnlVar.zzdgp, false);
        zzbwu zza = this.zzgfa.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzbwx(zzcpdVar));
        zzcpdVar.zza(zza.zzaek());
        zzcnlVar.zzgel.zzb(zza.zzaen());
        return zza.zzafo();
    }
}
