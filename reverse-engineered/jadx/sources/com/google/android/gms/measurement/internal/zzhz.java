package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzhz implements Runnable {
    private final /* synthetic */ zzhq zza;
    private final /* synthetic */ zzhr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhz(zzhr zzhrVar, zzhq zzhqVar) {
        this.zzb = zzhrVar;
        this.zza = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
    }
}
