package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzke extends zze {
    protected zzkm zza;
    protected zzkk zzb;
    private Handler zzc;
    private zzkf zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzke(zzgq zzgqVar) {
        super(zzgqVar);
        this.zza = new zzkm(this);
        this.zzb = new zzkk(this);
        this.zzd = new zzkf(this);
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzab() {
        zzq().zza(new zzkd(this, zzm().elapsedRealtime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac() {
        zzd();
        if (this.zzc == null) {
            this.zzc = new com.google.android.gms.internal.measurement.zzj(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(long j) {
        zzd();
        zzac();
        zzr().zzx().zza("Activity resumed, time", Long.valueOf(j));
        this.zzd.zza();
        this.zzb.zza(j);
        zzkm zzkmVar = this.zza;
        zzkmVar.zza.zzd();
        if (zzkmVar.zza.zzx.zzab()) {
            if (zzkmVar.zza.zzt().zza(zzap.zzav)) {
                zzkmVar.zza.zzs().zzt.zza(false);
            }
            zzkmVar.zza(zzkmVar.zza.zzm().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j) {
        zzd();
        zzac();
        zzr().zzx().zza("Activity paused, time", Long.valueOf(j));
        this.zzd.zzb();
        this.zzb.zzb(j);
        zzkm zzkmVar = this.zza;
        if (zzkmVar.zza.zzt().zza(zzap.zzav)) {
            zzkmVar.zza.zzs().zzt.zza(true);
        }
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        return this.zzb.zza(z, z2, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzhr zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziz zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzff zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzke zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzfh zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzgj zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzfv zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzw zzu() {
        return super.zzu();
    }
}
