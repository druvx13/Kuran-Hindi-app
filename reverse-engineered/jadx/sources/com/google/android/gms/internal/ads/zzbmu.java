package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmu implements zzegz<zzcnj<zzblx>> {
    private final zzehm<zzcru<zzblx, zzdhq, zzcot>> zzeua;
    private final zzehm<Boolean> zzfbw;
    private final zzehm<zzcqc> zzfby;

    public zzbmu(zzehm<Boolean> zzehmVar, zzehm<zzcqc> zzehmVar2, zzehm<zzcru<zzblx, zzdhq, zzcot>> zzehmVar3) {
        this.zzfbw = zzehmVar;
        this.zzfby = zzehmVar2;
        this.zzeua = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        boolean booleanValue = this.zzfbw.get().booleanValue();
        zzcqc zzcqcVar = this.zzfby.get();
        zzcru<zzblx, zzdhq, zzcot> zzcruVar = this.zzeua.get();
        if (!booleanValue) {
            zzcqcVar = zzcruVar;
        }
        return (zzcnj) zzehf.zza(zzcqcVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
