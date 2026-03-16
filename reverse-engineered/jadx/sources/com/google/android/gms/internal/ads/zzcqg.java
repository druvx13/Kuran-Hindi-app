package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqg extends zzcqd<zzcel> {
    private final zzbuj zzewc;
    private final zzbgy zzggh;
    private final zzbqj.zza zzggi;

    public zzcqg(zzbgy zzbgyVar, zzbqj.zza zzaVar, zzbuj zzbujVar) {
        this.zzggh = zzbgyVar;
        this.zzggi = zzaVar;
        this.zzewc = zzbujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqd
    protected final zzdri<zzcel> zza(zzdhe zzdheVar, Bundle bundle) {
        return this.zzggh.zzadh().zze(this.zzggi.zza(zzdheVar).zzf(bundle).zzair()).zze(this.zzewc).zzafu().zzaed().zzaii();
    }
}
