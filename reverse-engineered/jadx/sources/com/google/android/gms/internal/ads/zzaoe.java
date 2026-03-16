package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzaoe implements SignalCallbacks {
    private final /* synthetic */ zzanw zzdhu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoe(zzaoa zzaoaVar, zzanw zzanwVar) {
        this.zzdhu = zzanwVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zzdhu.zzdq(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zzdhu.onFailure(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
