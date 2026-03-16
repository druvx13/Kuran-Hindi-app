package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzwe extends zzgi implements zzwc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final void onAdMetadataChanged() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
