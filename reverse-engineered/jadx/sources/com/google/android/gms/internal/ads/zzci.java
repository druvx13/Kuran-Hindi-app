package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public enum zzci implements zzecf {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    
    private static final zzeci<zzci> zzeh = new zzeci<zzci>() { // from class: com.google.android.gms.internal.ads.zzch
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzecf
    public final int zzw() {
        return this.value;
    }

    public static zzci zzl(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PARTNER_SIGNALS;
                }
                return UNITY_SIGNALS;
            }
            return AFMA_SIGNALS;
        }
        return UNKNOWN_PROTO;
    }

    public static zzech zzx() {
        return zzcj.zzej;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzci(int i) {
        this.value = i;
    }
}
