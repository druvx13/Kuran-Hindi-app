package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzmo implements zzcz<zzmn> {
    private static zzmo zza = new zzmo();
    private final zzcz<zzmn> zzb;

    public static boolean zzb() {
        return ((zzmn) zza.zza()).zza();
    }

    private zzmo(zzcz<zzmn> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzmo() {
        this(zzdc.zza(new zzmq()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzmn zza() {
        return this.zzb.zza();
    }
}
