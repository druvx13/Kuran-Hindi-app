package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjq implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzm zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzn zzd;
    private final /* synthetic */ zziz zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjq(zziz zzizVar, String str, String str2, zzm zzmVar, com.google.android.gms.internal.measurement.zzn zznVar) {
        this.zze = zzizVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzmVar;
        this.zzd = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzfbVar = this.zze.zzb;
            if (zzfbVar == null) {
                this.zze.zzr().zzf().zza("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                return;
            }
            ArrayList<Bundle> zzb = zzla.zzb(zzfbVar.zza(this.zza, this.zzb, this.zzc));
            this.zze.zzak();
            this.zze.zzp().zza(this.zzd, zzb);
        } catch (RemoteException e) {
            this.zze.zzr().zzf().zza("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
        } finally {
            this.zze.zzp().zza(this.zzd, arrayList);
        }
    }
}
