package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zznc implements zzmz {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Boolean> zzb;
    private static final zzcl<Boolean> zzc;

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final boolean zzb() {
        return zzb.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmz
    public final boolean zzc() {
        return zzc.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.service.sessions.remove_disabled_session_number", true);
        zzb = zzcrVar.zza("measurement.service.sessions.session_number_enabled", true);
        zzc = zzcrVar.zza("measurement.service.sessions.session_number_backfill_enabled", true);
    }
}
