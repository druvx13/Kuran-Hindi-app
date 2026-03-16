package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjh implements Runnable {
    private final /* synthetic */ zziv zza;
    private final /* synthetic */ zziz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjh(zziz zzizVar, zziv zzivVar) {
        this.zzb = zzizVar;
        this.zza = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        zzfbVar = this.zzb.zzb;
        if (zzfbVar == null) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to service");
            return;
        }
        try {
            if (this.zza == null) {
                zzfbVar.zza(0L, (String) null, (String) null, this.zzb.zzn().getPackageName());
            } else {
                zzfbVar.zza(this.zza.zzc, this.zza.zza, this.zza.zzb, this.zzb.zzn().getPackageName());
            }
            this.zzb.zzak();
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to the service", e);
        }
    }
}
