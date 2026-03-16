package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjn implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzm zze;
    private final /* synthetic */ zziz zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjn(zziz zzizVar, AtomicReference atomicReference, String str, String str2, String str3, zzm zzmVar) {
        this.zzf = zzizVar;
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        synchronized (this.zza) {
            try {
                zzfbVar = this.zzf.zzb;
            } catch (RemoteException e) {
                this.zzf.zzr().zzf().zza("(legacy) Failed to get conditional properties; remote exception", zzfj.zza(this.zzb), this.zzc, e);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
            }
            if (zzfbVar == null) {
                this.zzf.zzr().zzf().zza("(legacy) Failed to get conditional properties; not connected to service", zzfj.zza(this.zzb), this.zzc, this.zzd);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(this.zzb)) {
                this.zza.set(zzfbVar.zza(this.zzc, this.zzd, this.zze));
            } else {
                this.zza.set(zzfbVar.zza(this.zzb, this.zzc, this.zzd));
            }
            this.zzf.zzak();
            this.zza.notify();
        }
    }
}
