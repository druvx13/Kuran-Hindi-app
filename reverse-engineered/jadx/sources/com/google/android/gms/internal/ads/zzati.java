package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzati extends zzgk implements zzatf {
    public zzati() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzatf zzap(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        if (queryLocalInterface instanceof zzatf) {
            return (zzatf) queryLocalInterface;
        }
        return new zzath(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzatn zzatnVar = null;
        zzatn zzatnVar2 = null;
        zzats zzatsVar = null;
        zzatk zzatkVar = null;
        switch (i) {
            case 1:
                zzuj zzujVar = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface instanceof zzatn) {
                        zzatnVar = (zzatn) queryLocalInterface;
                    } else {
                        zzatnVar = new zzatp(readStrongBinder);
                    }
                }
                zza(zzujVar, zzatnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    if (queryLocalInterface2 instanceof zzatk) {
                        zzatkVar = (zzatk) queryLocalInterface2;
                    } else {
                        zzatkVar = new zzatm(readStrongBinder2);
                    }
                }
                zza(zzatkVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isLoaded = isLoaded();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, isLoaded);
                return true;
            case 4:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 5:
                zzh(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    if (queryLocalInterface3 instanceof zzats) {
                        zzatsVar = (zzats) queryLocalInterface3;
                    } else {
                        zzatsVar = new zzatr(readStrongBinder3);
                    }
                }
                zza(zzatsVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zza((zzaua) zzgj.zza(parcel, zzaua.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zza(zzxd.zzh(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, adMetadata);
                return true;
            case 10:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzgj.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                zzate zzqt = zzqt();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzqt);
                return true;
            case 12:
                zzxg zzki = zzki();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzki);
                return true;
            case 13:
                zza(zzxe.zzi(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                zzuj zzujVar2 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    if (queryLocalInterface4 instanceof zzatn) {
                        zzatnVar2 = (zzatn) queryLocalInterface4;
                    } else {
                        zzatnVar2 = new zzatp(readStrongBinder4);
                    }
                }
                zzb(zzujVar2, zzatnVar2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
