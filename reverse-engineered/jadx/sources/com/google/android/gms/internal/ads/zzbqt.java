package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqt implements zzegz<zzaun> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdgo> zzfia;
    private final zzbqu zzfnc;
    private final zzehm<zzazz> zzfnd;
    private final zzehm<zzaup> zzfne;

    private zzbqt(zzbqu zzbquVar, zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzaup> zzehmVar4) {
        this.zzfnc = zzbquVar;
        this.zzenp = zzehmVar;
        this.zzfnd = zzehmVar2;
        this.zzfia = zzehmVar3;
        this.zzfne = zzehmVar4;
    }

    public static zzbqt zza(zzbqu zzbquVar, zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzaup> zzehmVar4) {
        return new zzbqt(zzbquVar, zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        Context context = this.zzenp.get();
        zzazz zzazzVar = this.zzfnd.get();
        zzdgo zzdgoVar = this.zzfia.get();
        zzaup zzaupVar = this.zzfne.get();
        if (zzdgoVar.zzgtv != null) {
            return new zzaue(context, zzazzVar, zzdgoVar.zzgtv, zzdgoVar.zzgtr.zzdku, zzaupVar);
        }
        return null;
    }
}
