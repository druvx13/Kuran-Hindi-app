package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzif implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzhr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzif(zzhr zzhrVar, AtomicReference atomicReference) {
        this.zzb = zzhrVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Long.valueOf(this.zzb.zzt().zza(this.zzb.zzg().zzab(), zzap.zzal)));
            this.zza.notify();
        }
    }
}
