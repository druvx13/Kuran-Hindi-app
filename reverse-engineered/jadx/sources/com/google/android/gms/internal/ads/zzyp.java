package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzyp implements Runnable {
    private final /* synthetic */ zzym zzchw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyp(zzym zzymVar) {
        this.zzchw = zzymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzvm zzvmVar;
        zzvm zzvmVar2;
        zzvmVar = this.zzchw.zzbmt;
        if (zzvmVar != null) {
            try {
                zzvmVar2 = this.zzchw.zzbmt;
                zzvmVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzazw.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
