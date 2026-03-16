package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzass implements RewardItem {
    private final zzasd zzdrc;

    public zzass(zzasd zzasdVar) {
        this.zzdrc = zzasdVar;
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final String getType() {
        zzasd zzasdVar = this.zzdrc;
        if (zzasdVar == null) {
            return null;
        }
        try {
            return zzasdVar.getType();
        } catch (RemoteException e) {
            zzazw.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final int getAmount() {
        zzasd zzasdVar = this.zzdrc;
        if (zzasdVar == null) {
            return 0;
        }
        try {
            return zzasdVar.getAmount();
        } catch (RemoteException e) {
            zzazw.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
