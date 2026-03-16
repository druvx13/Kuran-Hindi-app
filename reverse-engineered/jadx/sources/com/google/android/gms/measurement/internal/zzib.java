package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzib implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzhr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzib(zzhr zzhrVar, Bundle bundle) {
        this.zzb = zzhrVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzd(this.zza);
    }
}
