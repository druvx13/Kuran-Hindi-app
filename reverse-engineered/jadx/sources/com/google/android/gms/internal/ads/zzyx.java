package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzyx implements Runnable {
    private final /* synthetic */ zzyu zzcib;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyx(zzyu zzyuVar) {
        this.zzcib = zzyuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasn zzasnVar;
        zzasn zzasnVar2;
        zzasnVar = this.zzcib.zzchy;
        if (zzasnVar != null) {
            try {
                zzasnVar2 = this.zzcib.zzchy;
                zzasnVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazw.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
