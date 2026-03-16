package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzaev extends zzgk implements zzaes {
    public zzaev() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaer zzaetVar;
        switch (i) {
            case 2:
                String headline = getHeadline();
                parcel2.writeNoException();
                parcel2.writeString(headline);
                return true;
            case 3:
                List images = getImages();
                parcel2.writeNoException();
                parcel2.writeList(images);
                return true;
            case 4:
                String body = getBody();
                parcel2.writeNoException();
                parcel2.writeString(body);
                return true;
            case 5:
                zzacs zzsa = zzsa();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzsa);
                return true;
            case 6:
                String callToAction = getCallToAction();
                parcel2.writeNoException();
                parcel2.writeString(callToAction);
                return true;
            case 7:
                String advertiser = getAdvertiser();
                parcel2.writeNoException();
                parcel2.writeString(advertiser);
                return true;
            case 8:
                double starRating = getStarRating();
                parcel2.writeNoException();
                parcel2.writeDouble(starRating);
                return true;
            case 9:
                String store = getStore();
                parcel2.writeNoException();
                parcel2.writeString(store);
                return true;
            case 10:
                String price = getPrice();
                parcel2.writeNoException();
                parcel2.writeString(price);
                return true;
            case 11:
                zzxl videoController = getVideoController();
                parcel2.writeNoException();
                zzgj.zza(parcel2, videoController);
                return true;
            case 12:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                zzack zzsb = zzsb();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzsb);
                return true;
            case 15:
                performClick((Bundle) zzgj.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                boolean recordImpression = recordImpression((Bundle) zzgj.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, recordImpression);
                return true;
            case 17:
                reportTouchEvent((Bundle) zzgj.zza(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzrz = zzrz();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzrz);
                return true;
            case 19:
                IObjectWrapper zzsc = zzsc();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzsc);
                return true;
            case 20:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, extras);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzaetVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof zzaer) {
                        zzaetVar = (zzaer) queryLocalInterface;
                    } else {
                        zzaetVar = new zzaet(readStrongBinder);
                    }
                }
                zza(zzaetVar);
                parcel2.writeNoException();
                return true;
            case 22:
                cancelUnconfirmedClick();
                parcel2.writeNoException();
                return true;
            case 23:
                List muteThisAdReasons = getMuteThisAdReasons();
                parcel2.writeNoException();
                parcel2.writeList(muteThisAdReasons);
                return true;
            case 24:
                boolean isCustomMuteThisAdEnabled = isCustomMuteThisAdEnabled();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, isCustomMuteThisAdEnabled);
                return true;
            case 25:
                zza(zzwz.zzg(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                zza(zzwv.zzf(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                zzsk();
                parcel2.writeNoException();
                return true;
            case 28:
                recordCustomClickGesture();
                parcel2.writeNoException();
                return true;
            case 29:
                zzacr zzsl = zzsl();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzsl);
                return true;
            case 30:
                boolean isCustomClickGestureEnabled = isCustomClickGestureEnabled();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, isCustomClickGestureEnabled);
                return true;
            case 31:
                zzxg zzki = zzki();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzki);
                return true;
            case 32:
                zza(zzxe.zzi(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
