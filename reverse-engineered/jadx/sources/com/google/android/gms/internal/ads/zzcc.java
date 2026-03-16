package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public enum zzcc implements zzecf {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4);
    
    private static final zzeci<zzcc> zzeh = new zzeci<zzcc>() { // from class: com.google.android.gms.internal.ads.zzcb
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzecf
    public final int zzw() {
        return this.value;
    }

    public static zzcc zzj(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return DG;
                    }
                    return UNENCRYPTED;
                }
                return TINK_HYBRID;
            }
            return BITSLICER;
        }
        return UNKNOWN_ENCRYPTION_METHOD;
    }

    public static zzech zzx() {
        return zzce.zzej;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzcc(int i) {
        this.value = i;
    }
}
