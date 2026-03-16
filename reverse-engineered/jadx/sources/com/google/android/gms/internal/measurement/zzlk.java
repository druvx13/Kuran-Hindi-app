package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzlk implements zzcz<zzlj> {
    private static zzlk zza = new zzlk();
    private final zzcz<zzlj> zzb;

    public static boolean zzb() {
        return ((zzlj) zza.zza()).zza();
    }

    private zzlk(zzcz<zzlj> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzlk() {
        this(zzdc.zza(new zzlm()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzlj zza() {
        return this.zzb.zza();
    }
}
