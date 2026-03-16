package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzedj {
    private static final zzedh zziaa = zzbgd();
    private static final zzedh zziab = new zzedk();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzedh zzbgb() {
        return zziaa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzedh zzbgc() {
        return zziab;
    }

    private static zzedh zzbgd() {
        try {
            return (zzedh) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
