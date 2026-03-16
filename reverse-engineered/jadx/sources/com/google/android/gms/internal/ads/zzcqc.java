package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqc extends zzcqd<zzblx> {
    private final zzbyl zzepw;
    private final zzbuj zzewc;
    private final zzcsm zzfcf;
    private final ViewGroup zzfiv;
    private final zzbte zzfkn;
    private final zzbgy zzggh;
    private final zzbqj.zza zzggi;

    public zzcqc(zzbgy zzbgyVar, zzbqj.zza zzaVar, zzcsm zzcsmVar, zzbuj zzbujVar, zzbyl zzbylVar, zzbte zzbteVar, ViewGroup viewGroup) {
        this.zzggh = zzbgyVar;
        this.zzggi = zzaVar;
        this.zzfcf = zzcsmVar;
        this.zzewc = zzbujVar;
        this.zzepw = zzbylVar;
        this.zzfkn = zzbteVar;
        this.zzfiv = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzcqd
    protected final zzdri<zzblx> zza(zzdhe zzdheVar, Bundle bundle) {
        return this.zzggh.zzadc().zzc(this.zzggi.zza(zzdheVar).zzf(bundle).zzair()).zzc(this.zzewc).zza(this.zzfcf).zzb(this.zzepw).zza(new zzbnp(this.zzfkn)).zzb(new zzbls(this.zzfiv)).zzafg().zzaed().zzaii();
    }
}
