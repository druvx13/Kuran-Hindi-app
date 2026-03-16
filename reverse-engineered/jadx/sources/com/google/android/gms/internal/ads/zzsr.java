package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsr implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbaj zzbsv;
    private final /* synthetic */ zzsl zzbsw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsr(zzsl zzslVar, zzbaj zzbajVar) {
        this.zzbsw = zzslVar;
        this.zzbsv = zzbajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzbsw.lock;
        synchronized (obj) {
            this.zzbsv.setException(new RuntimeException("Connection failed."));
        }
    }
}
