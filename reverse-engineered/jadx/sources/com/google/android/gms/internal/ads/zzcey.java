package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcey {
    private final zzazz zzbmo;
    private final zzbes zzbnm;
    private final zzst zzeht;
    private final zzdt zzejl;
    private final com.google.android.gms.ads.internal.zza zzejn;
    private final zzrv zzejp;
    private final zzdhe zzfll;
    private final zzbte zzfxb;
    private final Context zzvf;

    public zzcey(zzbes zzbesVar, Context context, zzdhe zzdheVar, zzdt zzdtVar, zzazz zzazzVar, com.google.android.gms.ads.internal.zza zzaVar, zzst zzstVar, zzbte zzbteVar, zzbwr zzbwrVar) {
        this.zzbnm = zzbesVar;
        this.zzvf = context;
        this.zzfll = zzdheVar;
        this.zzejl = zzdtVar;
        this.zzbmo = zzazzVar;
        this.zzejn = zzaVar;
        this.zzeht = zzstVar;
        this.zzfxb = zzbteVar;
        this.zzejp = zzbwrVar;
    }

    public final zzbek zzc(zzum zzumVar) throws zzbew {
        return zza(zzumVar, false);
    }

    public final zzbek zza(zzum zzumVar, boolean z) throws zzbew {
        return zzbes.zza(this.zzvf, zzbfz.zzb(zzumVar), zzumVar.zzacf, false, false, this.zzejl, this.zzbmo, null, new zzcfb(this), this.zzejn, this.zzeht, this.zzejp, z);
    }
}
