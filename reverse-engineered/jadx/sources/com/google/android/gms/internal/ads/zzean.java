package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzean {
    private static final Class<?> zzhsx = zzhp("libcore.io.Memory");
    private static final boolean zzhsy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbcl() {
        return (zzhsx == null || zzhsy) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzbcm() {
        return zzhsx;
    }

    private static <T> Class<T> zzhp(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        zzhsy = zzhp("org.robolectric.Robolectric") != null;
    }
}
