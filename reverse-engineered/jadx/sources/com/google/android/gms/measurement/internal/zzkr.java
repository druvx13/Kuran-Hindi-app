package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkr implements Runnable {
    private final /* synthetic */ zzkx zza;
    private final /* synthetic */ zzks zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkr(zzks zzksVar, zzkx zzkxVar) {
        this.zzb = zzksVar;
        this.zza = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
