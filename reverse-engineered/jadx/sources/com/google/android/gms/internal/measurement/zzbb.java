package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
/* loaded from: classes.dex */
public final class zzbb extends zzx.zza {
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ zzx zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(zzx zzxVar, Bundle bundle) {
        super(zzxVar);
        this.zzd = zzxVar;
        this.zzc = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws RemoteException {
        zzm zzmVar;
        zzmVar = this.zzd.zzr;
        zzmVar.setConditionalUserProperty(this.zzc, this.zza);
    }
}
