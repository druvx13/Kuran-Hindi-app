package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zznj implements zznk {
    private static final zzcl<Boolean> zza = new zzcr(zzcm.zza("com.google.android.gms.measurement")).zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }
}
