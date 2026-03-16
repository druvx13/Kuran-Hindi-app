package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public enum zztp implements zzecf {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final zzeci<zztp> zzeh = new zzeci<zztp>() { // from class: com.google.android.gms.internal.ads.zzto
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzecf
    public final int zzw() {
        return this.value;
    }

    public static zztp zzca(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 1000) {
                    return null;
                }
                return ENUM_UNKNOWN;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    public static zzech zzx() {
        return zztq.zzej;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zztp(int i) {
        this.value = i;
    }
}
