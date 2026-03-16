package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzamk implements InitializationCompleteCallback {
    private final /* synthetic */ zzahc zzdgo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamk(zzaml zzamlVar, zzahc zzahcVar) {
        this.zzdgo = zzahcVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zzdgo.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zzdgo.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
