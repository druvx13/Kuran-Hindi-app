package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqe extends zzcqd<zzbws> {
    private final zzbuj zzewc;
    private final zzcsm zzfcf;
    private final zzbgy zzggh;
    private final zzbqj.zza zzggi;

    public zzcqe(zzbgy zzbgyVar, zzbqj.zza zzaVar, zzcsm zzcsmVar, zzbuj zzbujVar) {
        this.zzggh = zzbgyVar;
        this.zzggi = zzaVar;
        this.zzfcf = zzcsmVar;
        this.zzewc = zzbujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqd
    protected final zzdri<zzbws> zza(zzdhe zzdheVar, Bundle bundle) {
        return this.zzggh.zzadf().zzd(this.zzggi.zza(zzdheVar).zzf(bundle).zzair()).zzd(this.zzewc).zzb(this.zzfcf).zzafm().zzaed().zzaii();
    }
}
