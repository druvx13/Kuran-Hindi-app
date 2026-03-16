package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsc implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzrx zzbsk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsc(zzrx zzrxVar) {
        this.zzbsk = zzrxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzsg zzsgVar;
        zzsg zzsgVar2;
        obj = this.zzbsk.lock;
        synchronized (obj) {
            try {
                zzsgVar = this.zzbsk.zzbsg;
                if (zzsgVar != null) {
                    zzrx zzrxVar = this.zzbsk;
                    zzsgVar2 = this.zzbsk.zzbsg;
                    zzrxVar.zzbsh = zzsgVar2.zzmy();
                }
            } catch (DeadObjectException e) {
                zzawr.zzc("Unable to obtain a cache service instance.", e);
                this.zzbsk.disconnect();
            }
            obj2 = this.zzbsk.lock;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zzbsk.lock;
        synchronized (obj) {
            this.zzbsk.zzbsh = null;
            obj2 = this.zzbsk.lock;
            obj2.notifyAll();
        }
    }
}
