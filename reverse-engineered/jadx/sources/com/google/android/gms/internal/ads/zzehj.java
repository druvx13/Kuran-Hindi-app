package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzehj<T> implements zzehm<T> {
    private static final Object zzije = new Object();
    private volatile Object zzdyi = zzije;
    private volatile zzehm<T> zzijf;

    private zzehj(zzehm<T> zzehmVar) {
        this.zzijf = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final T get() {
        T t = (T) this.zzdyi;
        if (t == zzije) {
            zzehm<T> zzehmVar = this.zzijf;
            if (zzehmVar == null) {
                return (T) this.zzdyi;
            }
            T t2 = zzehmVar.get();
            this.zzdyi = t2;
            this.zzijf = null;
            return t2;
        }
        return t;
    }

    public static <P extends zzehm<T>, T> zzehm<T> zzar(P p) {
        return ((p instanceof zzehj) || (p instanceof zzeha)) ? p : new zzehj((zzehm) zzehf.checkNotNull(p));
    }
}
