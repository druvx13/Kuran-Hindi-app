package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbna implements zzegz<Boolean> {
    private final zzehm<zzdhe> zzfjq;

    public zzbna(zzehm<zzdhe> zzehmVar) {
        this.zzfjq = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        boolean booleanValue;
        if (this.zzfjq.get().zzarx() != null) {
            booleanValue = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcmc)).booleanValue();
        } else {
            booleanValue = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcrs)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
