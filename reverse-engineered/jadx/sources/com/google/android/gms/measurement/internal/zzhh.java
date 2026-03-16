package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public class zzhh implements zzhj {
    protected final zzgq zzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(zzgq zzgqVar) {
        Preconditions.checkNotNull(zzgqVar);
        this.zzx = zzgqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public zzw zzu() {
        return this.zzx.zzu();
    }

    public zzx zzt() {
        return this.zzx.zzb();
    }

    public zzfv zzs() {
        return this.zzx.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public zzfj zzr() {
        return this.zzx.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public zzgj zzq() {
        return this.zzx.zzq();
    }

    public zzla zzp() {
        return this.zzx.zzi();
    }

    public zzfh zzo() {
        return this.zzx.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public Context zzn() {
        return this.zzx.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public Clock zzm() {
        return this.zzx.zzm();
    }

    public zzah zzl() {
        return this.zzx.zzx();
    }

    public void zzd() {
        this.zzx.zzq().zzd();
    }

    public void zzc() {
        this.zzx.zzq().zzc();
    }

    public void zzb() {
        this.zzx.zzae();
    }

    public void zza() {
        this.zzx.zzaf();
    }
}
