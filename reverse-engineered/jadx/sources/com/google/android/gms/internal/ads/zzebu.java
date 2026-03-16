package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzebu {
    private static final zzebs<?> zzhux = new zzebr();
    private static final zzebs<?> zzhuy = zzbeg();

    private static zzebs<?> zzbeg() {
        try {
            return (zzebs) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzebs<?> zzbeh() {
        return zzhux;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzebs<?> zzbei() {
        zzebs<?> zzebsVar = zzhuy;
        if (zzebsVar != null) {
            return zzebsVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
