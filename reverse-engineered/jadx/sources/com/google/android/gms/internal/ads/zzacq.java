package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzacq extends zzgk implements zzacr {
    public zzacq() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public static zzacr zzn(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        if (queryLocalInterface instanceof zzacr) {
            return (zzacr) queryLocalInterface;
        }
        return new zzact(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaee zzaehVar;
        switch (i) {
            case 2:
                float aspectRatio = getAspectRatio();
                parcel2.writeNoException();
                parcel2.writeFloat(aspectRatio);
                return true;
            case 3:
                zzo(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper zzry = zzry();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzry);
                return true;
            case 5:
                float duration = getDuration();
                parcel2.writeNoException();
                parcel2.writeFloat(duration);
                return true;
            case 6:
                float currentTime = getCurrentTime();
                parcel2.writeNoException();
                parcel2.writeFloat(currentTime);
                return true;
            case 7:
                zzxl videoController = getVideoController();
                parcel2.writeNoException();
                zzgj.zza(parcel2, videoController);
                return true;
            case 8:
                boolean hasVideoContent = hasVideoContent();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, hasVideoContent);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaehVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof zzaee) {
                        zzaehVar = (zzaee) queryLocalInterface;
                    } else {
                        zzaehVar = new zzaeh(readStrongBinder);
                    }
                }
                zza(zzaehVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
