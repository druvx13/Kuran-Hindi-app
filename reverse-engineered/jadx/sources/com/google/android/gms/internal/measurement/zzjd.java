package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjd implements zzcz<zzjg> {
    private static zzjd zza = new zzjd();
    private final zzcz<zzjg> zzb;

    public static boolean zzb() {
        return ((zzjg) zza.zza()).zza();
    }

    private zzjd(zzcz<zzjg> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzjd() {
        this(zzdc.zza(new zzjf()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzjg zza() {
        return this.zzb.zza();
    }
}
