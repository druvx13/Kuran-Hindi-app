package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzatt implements RewardItem {
    private final zzate zzdri;

    public zzatt(zzate zzateVar) {
        this.zzdri = zzateVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzate zzateVar = this.zzdri;
        if (zzateVar == null) {
            return null;
        }
        try {
            return zzateVar.getType();
        } catch (RemoteException e) {
            zzazw.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzate zzateVar = this.zzdri;
        if (zzateVar == null) {
            return 0;
        }
        try {
            return zzateVar.getAmount();
        } catch (RemoteException e) {
            zzazw.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
