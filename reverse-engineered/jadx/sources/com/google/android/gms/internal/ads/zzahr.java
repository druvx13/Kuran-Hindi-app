package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzahr extends zzgk implements zzaho {
    public zzahr() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaht zzahvVar;
        if (i == 3) {
            zzxl videoController = getVideoController();
            parcel2.writeNoException();
            zzgj.zza(parcel2, videoController);
            return true;
        } else if (i == 4) {
            destroy();
            parcel2.writeNoException();
            return true;
        } else if (i != 5) {
            if (i == 6) {
                zzr(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i != 7) {
                return false;
            } else {
                zzacr zzsl = zzsl();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzsl);
                return true;
            }
        } else {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzahvVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                if (queryLocalInterface instanceof zzaht) {
                    zzahvVar = (zzaht) queryLocalInterface;
                } else {
                    zzahvVar = new zzahv(readStrongBinder);
                }
            }
            zza(asInterface, zzahvVar);
            parcel2.writeNoException();
            return true;
        }
    }
}
