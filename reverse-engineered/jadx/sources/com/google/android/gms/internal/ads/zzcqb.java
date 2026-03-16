package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqb extends zzcqd<zzbny> {
    private final zzbyl zzepw;
    private final zzbuj zzewc;
    private final zzbgy zzggh;
    private final zzbqj.zza zzggi;

    public zzcqb(zzbgy zzbgyVar, zzbyl zzbylVar, zzbqj.zza zzaVar, zzbuj zzbujVar) {
        this.zzggh = zzbgyVar;
        this.zzepw = zzbylVar;
        this.zzggi = zzaVar;
        this.zzewc = zzbujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqd
    protected final zzdri<zzbny> zza(zzdhe zzdheVar, Bundle bundle) {
        return this.zzggh.zzadg().zza(this.zzggi.zza(zzdheVar).zzf(bundle).zzair()).zza(this.zzewc).zza(this.zzepw).zzaef().zzaed().zzaii();
    }
}
