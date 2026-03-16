package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzix implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zziv zzc;
    private final /* synthetic */ zziv zzd;
    private final /* synthetic */ zziy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzix(zziy zziyVar, boolean z, long j, zziv zzivVar, zziv zzivVar2) {
        this.zze = zziyVar;
        this.zza = z;
        this.zzb = j;
        this.zzc = zzivVar;
        this.zzd = zzivVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.zze.zzt().zza(zzap.zzbb)) {
            z = this.zza && this.zze.zza != null;
            if (z) {
                zziy zziyVar = this.zze;
                zziyVar.zza(zziyVar.zza, true, this.zzb);
            }
        } else {
            if (this.zza && this.zze.zza != null) {
                zziy zziyVar2 = this.zze;
                zziyVar2.zza(zziyVar2.zza, true, this.zzb);
            }
            z = false;
        }
        zziv zzivVar = this.zzc;
        if ((zzivVar != null && zzivVar.zzc == this.zzd.zzc && zzla.zzc(this.zzc.zzb, this.zzd.zzb) && zzla.zzc(this.zzc.zza, this.zzd.zza)) ? true : true) {
            Bundle bundle = new Bundle();
            zziy.zza(this.zzd, bundle, true);
            zziv zzivVar2 = this.zzc;
            if (zzivVar2 != null) {
                if (zzivVar2.zza != null) {
                    bundle.putString("_pn", this.zzc.zza);
                }
                bundle.putString("_pc", this.zzc.zzb);
                bundle.putLong("_pi", this.zzc.zzc);
            }
            if (this.zze.zzt().zza(zzap.zzbb) && z) {
                long zzb = this.zze.zzk().zzb.zzb();
                if (zzb > 0) {
                    this.zze.zzp().zza(bundle, zzb);
                }
            }
            this.zze.zzf().zzb("auto", "_vs", bundle);
        }
        this.zze.zza = this.zzd;
        this.zze.zzh().zza(this.zzd);
    }
}
