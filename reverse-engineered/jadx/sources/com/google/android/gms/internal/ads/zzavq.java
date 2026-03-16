package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzavq extends zzgk implements zzavn {
    public zzavq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzavm zzavoVar;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzavt zzavtVar = (zzavt) zzgj.zza(parcel, zzavt.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzavoVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof zzavm) {
                        zzavoVar = (zzavm) queryLocalInterface;
                    } else {
                        zzavoVar = new zzavo(readStrongBinder);
                    }
                }
                zza(asInterface, zzavtVar, zzavoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzan(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper zzb = zzb(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper zzao = zzao(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzao);
                return true;
            case 5:
                zza(parcel.createTypedArrayList(Uri.CREATOR), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzaqa.zzak(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zzb(parcel.createTypedArrayList(Uri.CREATOR), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzaqa.zzak(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                zza((zzaqh) zzgj.zza(parcel, zzaqh.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
