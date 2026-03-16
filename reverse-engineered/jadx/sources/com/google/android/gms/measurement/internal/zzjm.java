package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjm implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ zziz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjm(zziz zzizVar, zzm zzmVar) {
        this.zzb = zzizVar;
        this.zza = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        zzfbVar = this.zzb.zzb;
        if (zzfbVar == null) {
            this.zzb.zzr().zzf().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzfbVar.zzb(this.zza);
            this.zzb.zzak();
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send measurementEnabled to the service", e);
        }
    }
}
