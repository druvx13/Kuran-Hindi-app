package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zziy implements zziv {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Boolean> zzb;

    @Override // com.google.android.gms.internal.measurement.zziv
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.androidId.delete_feature", true);
        zzb = zzcrVar.zza("measurement.log_androidId_enabled", false);
    }
}
