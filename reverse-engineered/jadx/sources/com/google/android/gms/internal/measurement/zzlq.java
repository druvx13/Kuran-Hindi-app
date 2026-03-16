package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzlq implements zzcz<zzlp> {
    private static zzlq zza = new zzlq();
    private final zzcz<zzlp> zzb;

    public static boolean zzb() {
        return ((zzlp) zza.zza()).zza();
    }

    private zzlq(zzcz<zzlp> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzlq() {
        this(zzdc.zza(new zzls()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzlp zza() {
        return this.zzb.zza();
    }
}
