package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzatq extends zzgk implements zzatn {
    public zzatq() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onRewardedAdLoaded();
        } else if (i != 2) {
            return false;
        } else {
            onRewardedAdFailedToLoad(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
