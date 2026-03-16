package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkz implements zzcz<zzlc> {
    private static zzkz zza = new zzkz();
    private final zzcz<zzlc> zzb;

    public static boolean zzb() {
        return ((zzlc) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzlc) zza.zza()).zzb();
    }

    private zzkz(zzcz<zzlc> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzkz() {
        this(zzdc.zza(new zzlb()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzlc zza() {
        return this.zzb.zza();
    }
}
