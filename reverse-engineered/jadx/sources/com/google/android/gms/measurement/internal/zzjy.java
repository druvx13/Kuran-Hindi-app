package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzjy implements Runnable {
    private final /* synthetic */ zzjr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjy(zzjr zzjrVar) {
        this.zza = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz.zza(this.zza.zza, (zzfb) null);
        this.zza.zza.zzan();
    }
}
