package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzamw implements Runnable {
    private final /* synthetic */ zzams zzdhi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamw(zzams zzamsVar) {
        this.zzdhi = zzamsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzalv zzalvVar;
        try {
            zzalvVar = this.zzdhi.zzdgu;
            zzalvVar.onAdClosed();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }
}
