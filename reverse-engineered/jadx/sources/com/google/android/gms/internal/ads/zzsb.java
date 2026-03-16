package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsb implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzrx zzbsk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsb(zzrx zzrxVar) {
        this.zzbsk = zzrxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzsg zzsgVar;
        Object obj2;
        obj = this.zzbsk.lock;
        synchronized (obj) {
            this.zzbsk.zzbsh = null;
            zzsgVar = this.zzbsk.zzbsg;
            if (zzsgVar != null) {
                zzrx.zza(this.zzbsk, (zzsg) null);
            }
            obj2 = this.zzbsk.lock;
            obj2.notifyAll();
        }
    }
}
