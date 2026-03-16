package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzalu extends zzgk implements zzalv {
    public zzalu() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzalv zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof zzalv) {
            return (zzalv) queryLocalInterface;
        }
        return new zzalx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzalw zzalzVar;
        switch (i) {
            case 1:
                onAdClicked();
                break;
            case 2:
                onAdClosed();
                break;
            case 3:
                onAdFailedToLoad(parcel.readInt());
                break;
            case 4:
                onAdLeftApplication();
                break;
            case 5:
                onAdOpened();
                break;
            case 6:
                onAdLoaded();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzalzVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof zzalw) {
                        zzalzVar = (zzalw) queryLocalInterface;
                    } else {
                        zzalzVar = new zzalz(readStrongBinder);
                    }
                }
                zza(zzalzVar);
                break;
            case 8:
                onAdImpression();
                break;
            case 9:
                onAppEvent(parcel.readString(), parcel.readString());
                break;
            case 10:
                zza(zzadr.zzr(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                onVideoEnd();
                break;
            case 12:
                zzdl(parcel.readString());
                break;
            case 13:
                zztp();
                break;
            case 14:
                zzb((zzatc) zzgj.zza(parcel, zzatc.CREATOR));
                break;
            case 15:
                onVideoPause();
                break;
            case 16:
                zza(zzatd.zzao(parcel.readStrongBinder()));
                break;
            case 17:
                zzcx(parcel.readInt());
                break;
            case 18:
                zztq();
                break;
            case 19:
                zzb((Bundle) zzgj.zza(parcel, Bundle.CREATOR));
                break;
            case 20:
                onVideoPlay();
                break;
            case 21:
                zzdm(parcel.readString());
                break;
            case 22:
                zzc(parcel.readInt(), parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
