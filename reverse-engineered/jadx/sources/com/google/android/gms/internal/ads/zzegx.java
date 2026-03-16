package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzegx<T> implements zzegz<T> {
    private zzehm<T> zzijd;

    @Override // com.google.android.gms.internal.ads.zzehm
    public final T get() {
        zzehm<T> zzehmVar = this.zzijd;
        if (zzehmVar == null) {
            throw new IllegalStateException();
        }
        return zzehmVar.get();
    }

    public static <T> void zzbe(zzehm<T> zzehmVar, zzehm<T> zzehmVar2) {
        zzehf.checkNotNull(zzehmVar2);
        zzegx zzegxVar = (zzegx) zzehmVar;
        if (zzegxVar.zzijd != null) {
            throw new IllegalStateException();
        }
        zzegxVar.zzijd = zzehmVar2;
    }
}
