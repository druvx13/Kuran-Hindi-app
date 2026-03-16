package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzjv implements Runnable {
    private final /* synthetic */ zzjr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjv(zzjr zzjrVar) {
        this.zza = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz zzizVar = this.zza.zza;
        Context zzn = this.zza.zza.zzn();
        this.zza.zza.zzu();
        zzizVar.zza(new ComponentName(zzn, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
