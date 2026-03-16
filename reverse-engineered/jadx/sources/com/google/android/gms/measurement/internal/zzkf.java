package com.google.android.gms.measurement.internal;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkf {
    final /* synthetic */ zzke zza;
    private zzki zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkf(zzke zzkeVar) {
        this.zza = zzkeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Handler handler;
        this.zza.zzd();
        if (!this.zza.zzt().zza(zzap.zzci) || this.zzb == null) {
            return;
        }
        handler = this.zza.zzc;
        handler.removeCallbacks(this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Handler handler;
        if (this.zza.zzt().zza(zzap.zzci)) {
            this.zzb = new zzki(this, this.zza.zzm().currentTimeMillis());
            handler = this.zza.zzc;
            handler.postDelayed(this.zzb, 2000L);
        }
    }
}
