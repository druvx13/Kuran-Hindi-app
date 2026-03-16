package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyu implements zzegz<zzbnx<zzblx>> {
    private final zzehm<zzbte> zzfmi;
    private final zzehm<zzbgy> zzfpu;
    private final zzehm<zzbqj.zza> zzfpv;
    private final zzehm<zzbuj> zzfpw;
    private final zzehm<zzbyl> zzfpx;

    public zzbyu(zzehm<zzbgy> zzehmVar, zzehm<zzbqj.zza> zzehmVar2, zzehm<zzbuj> zzehmVar3, zzehm<zzbyl> zzehmVar4, zzehm<zzbte> zzehmVar5) {
        this.zzfpu = zzehmVar;
        this.zzfpv = zzehmVar2;
        this.zzfpw = zzehmVar3;
        this.zzfpx = zzehmVar4;
        this.zzfmi = zzehmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbnx) zzehf.zza(this.zzfpu.get().zzadc().zzc(this.zzfpv.get().zzair()).zzc(this.zzfpw.get()).zzb(this.zzfpx.get()).zza(new zzcsm(null)).zza(new zzbnp(this.zzfmi.get())).zzb(new zzbls(null)).zzafg().zzaff(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
