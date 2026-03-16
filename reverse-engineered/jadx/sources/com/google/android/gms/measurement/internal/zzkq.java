package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public class zzkq extends zzhh implements zzhj {
    protected final zzks zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkq(zzks zzksVar) {
        super(zzksVar.zzs());
        Preconditions.checkNotNull(zzksVar);
        this.zza = zzksVar;
    }

    public zzgk zzj() {
        return this.zza.zzc();
    }

    public zzac zzi() {
        return this.zza.zze();
    }

    public zzn e_() {
        return this.zza.zzf();
    }

    public zzkw zzg() {
        return this.zza.zzh();
    }
}
