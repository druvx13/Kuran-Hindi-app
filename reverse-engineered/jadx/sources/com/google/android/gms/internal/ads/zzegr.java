package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzegr {
    public abstract void zzig(String str);

    public static zzegr zzn(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzego(cls.getSimpleName());
        }
        return new zzegq(cls.getSimpleName());
    }
}
