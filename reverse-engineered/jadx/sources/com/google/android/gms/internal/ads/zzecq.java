package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public enum zzecq {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeaq.class, zzeaq.class, zzeaq.zzhtf),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzhzc;
    private final Class<?> zzhzd;
    private final Object zzhze;

    zzecq(Class cls, Class cls2, Object obj) {
        this.zzhzc = cls;
        this.zzhzd = cls2;
        this.zzhze = obj;
    }

    public final Class<?> zzbfq() {
        return this.zzhzd;
    }
}
