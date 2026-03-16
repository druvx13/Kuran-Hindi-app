package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjg implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzm zzb;
    private final /* synthetic */ zziz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjg(zziz zzizVar, AtomicReference atomicReference, zzm zzmVar) {
        this.zzc = zzizVar;
        this.zza = atomicReference;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        synchronized (this.zza) {
            try {
                zzfbVar = this.zzc.zzb;
            } catch (RemoteException e) {
                this.zzc.zzr().zzf().zza("Failed to get app instance id", e);
                this.zza.notify();
            }
            if (zzfbVar == null) {
                this.zzc.zzr().zzf().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            this.zza.set(zzfbVar.zzc(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzf().zza(str);
                this.zzc.zzs().zzj.zza(str);
            }
            this.zzc.zzak();
            this.zza.notify();
        }
    }
}
