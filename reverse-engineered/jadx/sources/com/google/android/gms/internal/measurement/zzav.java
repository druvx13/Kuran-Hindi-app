package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzx;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
/* loaded from: classes.dex */
public final class zzav extends zzx.zza {
    private final /* synthetic */ zzk zzc;
    private final /* synthetic */ int zzd;
    private final /* synthetic */ zzx zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(zzx zzxVar, zzk zzkVar, int i) {
        super(zzxVar);
        this.zze = zzxVar;
        this.zzc = zzkVar;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws RemoteException {
        zzm zzmVar;
        zzmVar = this.zze.zzr;
        zzmVar.getTestFlag(this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    protected final void zzb() {
        this.zzc.zza((Bundle) null);
    }
}
