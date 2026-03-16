package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zziq implements zzil {
    private final /* synthetic */ zzio zzama;

    private zziq(zzio zzioVar) {
        this.zzama = zzioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzu(int i) {
        zzio.zza(this.zzama).zzt(i);
        zzio.zzu(i);
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzej() {
        zzio.zzgc();
        zzio.zza(this.zzama, true);
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzc(int i, long j, long j2) {
        zzio.zza(this.zzama).zza(i, j, j2);
        zzio.zzb(i, j, j2);
    }
}
