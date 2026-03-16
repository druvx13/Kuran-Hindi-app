package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjf implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzb;
    private final /* synthetic */ zziz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjf(zziz zzizVar, zzm zzmVar, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zzc = zzizVar;
        this.zza = zzmVar;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        try {
            zzfbVar = this.zzc.zzb;
            if (zzfbVar == null) {
                this.zzc.zzr().zzf().zza("Failed to get app instance id");
                return;
            }
            String zzc = zzfbVar.zzc(this.zza);
            if (zzc != null) {
                this.zzc.zzf().zza(zzc);
                this.zzc.zzs().zzj.zza(zzc);
            }
            this.zzc.zzak();
            this.zzc.zzp().zza(this.zzb, zzc);
        } catch (RemoteException e) {
            this.zzc.zzr().zzf().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzp().zza(this.zzb, (String) null);
        }
    }
}
