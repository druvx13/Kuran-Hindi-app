package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzahx extends zzgk implements zzahu {
    public zzahx() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public static zzahu zzab(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof zzahu) {
            return (zzahu) queryLocalInterface;
        }
        return new zzahw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaho zzahqVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzahqVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                if (queryLocalInterface instanceof zzaho) {
                    zzahqVar = (zzaho) queryLocalInterface;
                } else {
                    zzahqVar = new zzahq(readStrongBinder);
                }
            }
            zza(zzahqVar);
        } else if (i != 2) {
            return false;
        } else {
            onInstreamAdFailedToLoad(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
