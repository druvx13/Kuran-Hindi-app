package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzyn implements Runnable {
    private final /* synthetic */ zzyk zzchu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyn(zzyk zzykVar) {
        this.zzchu = zzykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzyi.zza(this.zzchu.zzcht) != null) {
            try {
                zzyi.zza(this.zzchu.zzcht).onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazw.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
