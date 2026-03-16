package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagy implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzbaj zzbsv;
    private final /* synthetic */ zzagu zzdbf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagy(zzagu zzaguVar, zzbaj zzbajVar) {
        this.zzdbf = zzaguVar;
        this.zzbsv = zzbajVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzagn zzagnVar;
        try {
            zzbaj zzbajVar = this.zzbsv;
            zzagnVar = this.zzdbf.zzdbd;
            zzbajVar.set(zzagnVar.zzso());
        } catch (DeadObjectException e) {
            this.zzbsv.setException(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbaj zzbajVar = this.zzbsv;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzbajVar.setException(new RuntimeException(sb.toString()));
    }
}
