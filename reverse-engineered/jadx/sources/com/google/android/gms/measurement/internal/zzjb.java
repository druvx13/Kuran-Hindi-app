package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjb implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzkz zzb;
    private final /* synthetic */ zzm zzc;
    private final /* synthetic */ zziz zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjb(zziz zzizVar, boolean z, zzkz zzkzVar, zzm zzmVar) {
        this.zzd = zzizVar;
        this.zza = z;
        this.zzb = zzkzVar;
        this.zzc = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfb zzfbVar;
        zzfbVar = this.zzd.zzb;
        if (zzfbVar == null) {
            this.zzd.zzr().zzf().zza("Discarding data. Failed to set user property");
            return;
        }
        this.zzd.zza(zzfbVar, this.zza ? null : this.zzb, this.zzc);
        this.zzd.zzak();
    }
}
