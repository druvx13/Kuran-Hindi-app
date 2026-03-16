package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzky implements zzcz<zzkx> {
    private static zzky zza = new zzky();
    private final zzcz<zzkx> zzb;

    public static boolean zzb() {
        return ((zzkx) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzkx) zza.zza()).zzb();
    }

    private zzky(zzcz<zzkx> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzky() {
        this(zzdc.zza(new zzla()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzkx zza() {
        return this.zzb.zza();
    }
}
