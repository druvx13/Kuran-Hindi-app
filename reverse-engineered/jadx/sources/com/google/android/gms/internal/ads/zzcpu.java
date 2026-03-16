package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcpu implements zzcnm<zzbzm, zzanv, zzcot> {
    private final zzbyp zzgfy;
    private zzame zzggf;
    private final Context zzvf;

    public zzcpu(Context context, zzbyp zzbypVar) {
        this.zzvf = context;
        this.zzgfy = zzbypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk {
        try {
            zzcnlVar.zzdgp.zzdp(zzdgoVar.zzdhp);
            zzcnlVar.zzdgp.zza(zzdgoVar.zzelw, zzdgoVar.zzgtu.toString(), zzdhaVar.zzgur.zzfll.zzguw, ObjectWrapper.wrap(this.zzvf), new zzcpw(this, zzcnlVar), zzcnlVar.zzgel);
        } catch (RemoteException e) {
            throw new zzdhk(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzbzm zzb(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzanv, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        if (!zzdhaVar.zzgur.zzfll.zzguy.contains(Integer.toString(6))) {
            throw new zzcqm("Unified must be used for RTB.", 1);
        }
        zzbzx zzb = zzbzx.zzb(this.zzggf);
        if (!zzdhaVar.zzgur.zzfll.zzguy.contains(Integer.toString(zzb.zzakw()))) {
            throw new zzcqm("No corresponding native ad listener", 0);
        }
        zzbzy zza = this.zzgfy.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzcaj(zzb), new zzcbm(null, null, this.zzggf));
        zzcnlVar.zzgel.zzb(zza.zzaen());
        return zza.zzaeo();
    }
}
