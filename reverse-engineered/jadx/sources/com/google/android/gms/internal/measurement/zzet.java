package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
final class zzet {
    private static final zzes<?> zza = new zzeu();
    private static final zzes<?> zzb = zzc();

    private static zzes<?> zzc() {
        try {
            return (zzes) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzes<?> zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzes<?> zzb() {
        zzes<?> zzesVar = zzb;
        if (zzesVar != null) {
            return zzesVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
