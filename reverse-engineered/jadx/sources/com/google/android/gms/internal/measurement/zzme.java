package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzme implements zzmb {
    private static final zzcl<Boolean> zza;
    private static final zzcl<Boolean> zzb;

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmb
    public final boolean zzb() {
        return zzb.zzc().booleanValue();
    }

    static {
        zzcr zzcrVar = new zzcr(zzcm.zza("com.google.android.gms.measurement"));
        zza = zzcrVar.zza("measurement.personalized_ads_signals_collection_enabled", true);
        zzb = zzcrVar.zza("measurement.personalized_ads_property_translation_enabled", true);
    }
}
