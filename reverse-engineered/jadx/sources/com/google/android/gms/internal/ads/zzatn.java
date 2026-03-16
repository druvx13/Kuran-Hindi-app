package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzatn extends IInterface {
    void onRewardedAdFailedToLoad(int i) throws RemoteException;

    void onRewardedAdLoaded() throws RemoteException;
}
