package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzle;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzia implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzhr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzia(zzhr zzhrVar, long j) {
        this.zzb = zzhrVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhr zzhrVar = this.zzb;
        long j = this.zza;
        zzhrVar.zzd();
        zzhrVar.zzb();
        zzhrVar.zzw();
        zzhrVar.zzr().zzw().zza("Resetting analytics data (FE)");
        zzke zzk = zzhrVar.zzk();
        zzk.zzd();
        zzk.zzb.zza();
        boolean zzab = zzhrVar.zzx.zzab();
        zzfv zzs = zzhrVar.zzs();
        zzs.zzh.zza(j);
        if (!TextUtils.isEmpty(zzs.zzs().zzw.zza())) {
            zzs.zzw.zza(null);
        }
        if (zzle.zzb() && zzs.zzt().zza(zzap.zzcr)) {
            zzs.zzq.zza(0L);
        }
        if (!zzs.zzt().zzh()) {
            zzs.zzc(!zzab);
        }
        zzhrVar.zzh().zzad();
        if (zzle.zzb() && zzhrVar.zzt().zza(zzap.zzcr)) {
            zzhrVar.zzk().zza.zza();
        }
        zzhrVar.zzb = !zzab;
        this.zzb.zzh().zza(new AtomicReference<>());
    }
}
