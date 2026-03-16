package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzamz implements Runnable {
    private final /* synthetic */ zzams zzdhi;
    private final /* synthetic */ AdRequest.ErrorCode zzdhj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamz(zzams zzamsVar, AdRequest.ErrorCode errorCode) {
        this.zzdhi = zzamsVar;
        this.zzdhj = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzalv zzalvVar;
        try {
            zzalvVar = this.zzdhi.zzdgu;
            zzalvVar.onAdFailedToLoad(zzane.zza(this.zzdhj));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }
}
