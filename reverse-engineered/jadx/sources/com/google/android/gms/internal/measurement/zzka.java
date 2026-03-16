package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzka implements zzcz<zzjz> {
    private static zzka zza = new zzka();
    private final zzcz<zzjz> zzb;

    public static boolean zzb() {
        return ((zzjz) zza.zza()).zza();
    }

    private zzka(zzcz<zzjz> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzka() {
        this(zzdc.zza(new zzkc()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzjz zza() {
        return this.zzb.zza();
    }
}
