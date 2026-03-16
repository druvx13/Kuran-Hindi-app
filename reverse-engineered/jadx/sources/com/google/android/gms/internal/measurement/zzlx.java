package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzlx implements zzcz<zzma> {
    private static zzlx zza = new zzlx();
    private final zzcz<zzma> zzb;

    public static boolean zzb() {
        return ((zzma) zza.zza()).zza();
    }

    public static long zzc() {
        return ((zzma) zza.zza()).zzb();
    }

    private zzlx(zzcz<zzma> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzlx() {
        this(zzdc.zza(new zzlz()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzma zza() {
        return this.zzb.zza();
    }
}
