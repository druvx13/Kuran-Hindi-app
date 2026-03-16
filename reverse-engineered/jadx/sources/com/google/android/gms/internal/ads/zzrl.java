package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzrl extends zzgk implements zzrm {
    public zzrl() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzrs zzruVar;
        if (i == 2) {
            zzvz zzdv = zzdv();
            parcel2.writeNoException();
            zzgj.zza(parcel2, zzdv);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzruVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                if (queryLocalInterface instanceof zzrs) {
                    zzruVar = (zzrs) queryLocalInterface;
                } else {
                    zzruVar = new zzru(readStrongBinder);
                }
            }
            zza(zzruVar);
            parcel2.writeNoException();
            return true;
        }
    }
}
