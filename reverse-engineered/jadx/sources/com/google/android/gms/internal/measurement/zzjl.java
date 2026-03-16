package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjl implements zzjm {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Boolean> zzb;

    @Override // com.google.android.gms.internal.measurement.zzjm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzjm
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjm
    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.service.configurable_service_limits", false);
        zzb = zzcrVar.zza("measurement.client.configurable_service_limits", false);
    }
}
