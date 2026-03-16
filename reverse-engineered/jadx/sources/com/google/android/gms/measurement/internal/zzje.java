package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzje implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzm zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zziz zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzje(zziz zzizVar, AtomicReference atomicReference, zzm zzmVar, boolean z) {
        this.zzd = zzizVar;
        this.zza = atomicReference;
        this.zzb = zzmVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        synchronized (this.zza) {
            try {
                zzfbVar = this.zzd.zzb;
            } catch (RemoteException e) {
                this.zzd.zzr().zzf().zza("Failed to get all user properties; remote exception", e);
                this.zza.notify();
            }
            if (zzfbVar == null) {
                this.zzd.zzr().zzf().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            this.zza.set(zzfbVar.zza(this.zzb, this.zzc));
            this.zzd.zzak();
            this.zza.notify();
        }
    }
}
