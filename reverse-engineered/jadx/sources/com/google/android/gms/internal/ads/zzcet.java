package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcet implements zzegz<zzcnj<zzcel>> {
    private final zzehm<zzcru<zzcel, zzdhq, zzcos>> zzfho;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzcru<zzcel, zzdhq, zzcot>> zzfwy;

    public zzcet(zzehm<zzcru<zzcel, zzdhq, zzcos>> zzehmVar, zzehm<zzcru<zzcel, zzdhq, zzcot>> zzehmVar2, zzehm<zzdhe> zzehmVar3) {
        this.zzfho = zzehmVar;
        this.zzfwy = zzehmVar2;
        this.zzfjq = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        zzcru<zzcel, zzdhq, zzcos> zzcruVar;
        zzehm<zzcru<zzcel, zzdhq, zzcos>> zzehmVar = this.zzfho;
        zzehm<zzcru<zzcel, zzdhq, zzcot>> zzehmVar2 = this.zzfwy;
        if (zzceq.zzfwx[this.zzfjq.get().zzgvd.zzguh - 1] == 1) {
            zzcruVar = zzehmVar.get();
        } else {
            zzcruVar = zzehmVar2.get();
        }
        return (zzcnj) zzehf.zza(zzcruVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
