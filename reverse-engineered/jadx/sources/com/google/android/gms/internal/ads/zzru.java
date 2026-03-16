package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzru extends zzgi implements zzrs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzru(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzrs
    public final void onAppOpenAdClosed() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
