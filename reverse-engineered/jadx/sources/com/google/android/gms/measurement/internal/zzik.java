package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzik implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzhr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzik(zzhr zzhrVar, boolean z) {
        this.zzb = zzhrVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzd(this.zza);
    }
}
