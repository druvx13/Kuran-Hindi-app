package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzji implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zziz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zziz zzizVar, zzm zzmVar, boolean z) {
        this.zzc = zzizVar;
        this.zza = zzmVar;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        zzfbVar = this.zzc.zzb;
        if (zzfbVar == null) {
            this.zzc.zzr().zzf().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            zzfbVar.zza(this.zza);
            if (this.zzb) {
                this.zzc.zzj().zzad();
            }
            this.zzc.zza(zzfbVar, (AbstractSafeParcelable) null, this.zza);
            this.zzc.zzak();
        } catch (RemoteException e) {
            this.zzc.zzr().zzf().zza("Failed to send app launch to the service", e);
        }
    }
}
