package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjk implements Runnable {
    private final /* synthetic */ zzan zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzc;
    private final /* synthetic */ zziz zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjk(zziz zzizVar, zzan zzanVar, String str, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zzd = zzizVar;
        this.zza = zzanVar;
        this.zzb = str;
        this.zzc = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        try {
            zzfbVar = this.zzd.zzb;
            if (zzfbVar == null) {
                this.zzd.zzr().zzf().zza("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] zza = zzfbVar.zza(this.zza, this.zzb);
            this.zzd.zzak();
            this.zzd.zzp().zza(this.zzc, zza);
        } catch (RemoteException e) {
            this.zzd.zzr().zzf().zza("Failed to send event to the service to bundle", e);
        } finally {
            this.zzd.zzp().zza(this.zzc, (byte[]) null);
        }
    }
}
