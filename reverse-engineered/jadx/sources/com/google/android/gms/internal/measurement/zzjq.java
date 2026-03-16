package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjq implements zzjn {
    private static final zzcl<Boolean> zza = new zzcr(zzcm.zza("com.google.android.gms.measurement")).zza("measurement.service.disable_install_state_reporting", true);

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzjn
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }
}
