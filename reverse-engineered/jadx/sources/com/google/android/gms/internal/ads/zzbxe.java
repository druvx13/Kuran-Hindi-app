package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxe implements zzegz<zzbvt<zzagk>> {
    private final zzehm<zzcej> zzfip;
    private final zzbwx zzfpa;

    public zzbxe(zzbwx zzbwxVar, zzehm<zzcej> zzehmVar) {
        this.zzfpa = zzbwxVar;
        this.zzfip = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
