package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzns implements zzcz<zznr> {
    private static zzns zza = new zzns();
    private final zzcz<zznr> zzb;

    public static boolean zzb() {
        return ((zznr) zza.zza()).zza();
    }

    private zzns(zzcz<zznr> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzns() {
        this(zzdc.zza(new zznt()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zznr zza() {
        return this.zzb.zza();
    }
}
