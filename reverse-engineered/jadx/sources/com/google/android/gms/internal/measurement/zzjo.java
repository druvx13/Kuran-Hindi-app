package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjo implements zzcz<zzjn> {
    private static zzjo zza = new zzjo();
    private final zzcz<zzjn> zzb;

    public static boolean zzb() {
        return ((zzjn) zza.zza()).zza();
    }

    public static boolean zzc() {
        return ((zzjn) zza.zza()).zzb();
    }

    private zzjo(zzcz<zzjn> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzjo() {
        this(zzdc.zza(new zzjq()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzjn zza() {
        return this.zzb.zza();
    }
}
