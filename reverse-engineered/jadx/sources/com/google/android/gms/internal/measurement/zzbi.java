package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzx;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
/* loaded from: classes.dex */
final class zzbi extends zzx.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzk zzd;
    private final /* synthetic */ zzx.zzd zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzx.zzd zzdVar, Activity activity, zzk zzkVar) {
        super(zzx.this);
        this.zze = zzdVar;
        this.zzc = activity;
        this.zzd = zzkVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzx.zza
    final void zza() throws RemoteException {
        zzm zzmVar;
        zzmVar = zzx.this.zzr;
        zzmVar.onActivitySaveInstanceState(ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}
