package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public enum zzgb implements zzecf {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    
    private static final zzeci<zzgb> zzeh = new zzeci<zzgb>() { // from class: com.google.android.gms.internal.ads.zzge
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzecf
    public final int zzw() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzgb(int i) {
        this.value = i;
    }
}
