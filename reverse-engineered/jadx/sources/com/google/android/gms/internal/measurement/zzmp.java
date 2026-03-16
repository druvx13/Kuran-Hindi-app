package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzmp implements zzcz<zzms> {
    private static zzmp zza = new zzmp();
    private final zzcz<zzms> zzb;

    public static boolean zzb() {
        return ((zzms) zza.zza()).zza();
    }

    private zzmp(zzcz<zzms> zzczVar) {
        this.zzb = zzdc.zza((zzcz) zzczVar);
    }

    public zzmp() {
        this(zzdc.zza(new zzmr()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final /* synthetic */ zzms zza() {
        return this.zzb.zza();
    }
}
