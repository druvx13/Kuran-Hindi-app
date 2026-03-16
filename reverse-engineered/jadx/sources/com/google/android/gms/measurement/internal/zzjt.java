package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzjt implements Runnable {
    private final /* synthetic */ ComponentName zza;
    private final /* synthetic */ zzjr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjt(zzjr zzjrVar, ComponentName componentName) {
        this.zzb = zzjrVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zza(this.zza);
    }
}
