package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdgk extends AdMetadataListener {
    private final /* synthetic */ zzdgi zzgtc;
    private final /* synthetic */ zzwc zzgtd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgk(zzdgi zzdgiVar, zzwc zzwcVar) {
        this.zzgtc = zzdgiVar;
        this.zzgtd = zzwcVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzcel zzcelVar;
        zzcelVar = this.zzgtc.zzgtb;
        if (zzcelVar != null) {
            try {
                this.zzgtd.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzawr.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
