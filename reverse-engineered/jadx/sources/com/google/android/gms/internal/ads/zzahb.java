package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzahb implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbaj zzbsv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahb(zzagu zzaguVar, zzbaj zzbajVar) {
        this.zzbsv = zzbajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzbsv.setException(new RuntimeException("Connection failed."));
    }
}
