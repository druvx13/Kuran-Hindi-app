package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjo implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzv zzc;
    private final /* synthetic */ zzm zzd;
    private final /* synthetic */ zzv zze;
    private final /* synthetic */ zziz zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjo(zziz zzizVar, boolean z, boolean z2, zzv zzvVar, zzm zzmVar, zzv zzvVar2) {
        this.zzf = zzizVar;
        this.zza = z;
        this.zzb = z2;
        this.zzc = zzvVar;
        this.zzd = zzmVar;
        this.zze = zzvVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        zzfbVar = this.zzf.zzb;
        if (zzfbVar == null) {
            this.zzf.zzr().zzf().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zza) {
            this.zzf.zza(zzfbVar, this.zzb ? null : this.zzc, this.zzd);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze.zza)) {
                    zzfbVar.zza(this.zzc, this.zzd);
                } else {
                    zzfbVar.zza(this.zzc);
                }
            } catch (RemoteException e) {
                this.zzf.zzr().zzf().zza("Failed to send conditional user property to the service", e);
            }
        }
        this.zzf.zzak();
    }
}
