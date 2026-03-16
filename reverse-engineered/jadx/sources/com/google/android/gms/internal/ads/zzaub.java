package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaub extends zzatd {
    private final String type;
    private final int zzdqy;

    public zzaub(zzatc zzatcVar) {
        this(zzatcVar != null ? zzatcVar.type : "", zzatcVar != null ? zzatcVar.zzdqy : 1);
    }

    public zzaub(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzaub(String str, int i) {
        this.type = str;
        this.zzdqy = i;
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final String getType() throws RemoteException {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final int getAmount() throws RemoteException {
        return this.zzdqy;
    }
}
