package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcma implements zzdqx<ParcelFileDescriptor> {
    private final /* synthetic */ zzard zzgcp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcma(zzclo zzcloVar, zzard zzardVar) {
        this.zzgcp = zzardVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        try {
            this.zzgcp.zza(zzaye.zza(th, zzcjk.zzd(th)));
        } catch (RemoteException e) {
            zzawr.zza("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zzgcp.zzb(parcelFileDescriptor);
        } catch (RemoteException e) {
            zzawr.zza("Service can't call client", e);
        }
    }
}
