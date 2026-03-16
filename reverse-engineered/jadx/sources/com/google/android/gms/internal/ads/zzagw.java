package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzagw extends zzagt {
    private final /* synthetic */ zzbaj zzbsv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagw(zzagx zzagxVar, zzbaj zzbajVar) {
        this.zzbsv = zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final void zza(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zzbsv.set(parcelFileDescriptor);
    }
}
