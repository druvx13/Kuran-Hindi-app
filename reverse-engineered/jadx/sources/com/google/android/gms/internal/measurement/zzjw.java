package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjw implements zzjt {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Long> zzb;
    private static final zzcl<Boolean> zzc;
    private static final zzcl<Boolean> zzd;
    private static final zzcl<Boolean> zze;
    private static final zzcl<Boolean> zzf;
    private static final zzcl<Boolean> zzg;

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zzc() {
        return zzc.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zzd() {
        return zzd.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zze() {
        return zze.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zzf() {
        return zzf.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzjt
    public final boolean zzg() {
        return zzg.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.gold.enhanced_ecommerce.format_logs", false);
        zzb = zzcrVar.zza("measurement.id.gold.enhanced_ecommerce.service", 0L);
        zzc = zzcrVar.zza("measurement.gold.enhanced_ecommerce.log_nested_complex_events", false);
        zzd = zzcrVar.zza("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false);
        zze = zzcrVar.zza("measurement.gold.enhanced_ecommerce.updated_schema.client", false);
        zzf = zzcrVar.zza("measurement.gold.enhanced_ecommerce.updated_schema.service", false);
        zzg = zzcrVar.zza("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false);
    }
}
