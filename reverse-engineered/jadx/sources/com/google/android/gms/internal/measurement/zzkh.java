package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkh implements zzcz<zzkk> {
    private static zzkh zza = new zzkh();
    private final zzcz<zzkk> zzb;

    public static boolean zzb() {
        return ((zzkk) zza.zza()).zza();
    }

    private zzkh(zzcz<zzkk> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzkh() {
        this(zzdc.zza(new zzkj()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzkk zza() {
        return this.zzb.zza();
    }
}
