package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdgb extends AdMetadataListener {
    private final /* synthetic */ zzxa zzgsx;
    private final /* synthetic */ zzdgc zzgsy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgb(zzdgc zzdgcVar, zzxa zzxaVar) {
        this.zzgsy = zzdgcVar;
        this.zzgsx = zzxaVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzcel zzcelVar;
        zzcelVar = this.zzgsy.zzgtb;
        if (zzcelVar != null) {
            try {
                this.zzgsx.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzawr.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
