package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzvy extends zzgk implements zzvz {
    public zzvy() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzvz zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        if (queryLocalInterface instanceof zzvz) {
            return (zzvz) queryLocalInterface;
        }
        return new zzwb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzvm zzvmVar = null;
        zzxf zzxfVar = null;
        zzwc zzwcVar = null;
        zzwn zzwnVar = null;
        zzvl zzvlVar = null;
        zzwh zzwhVar = null;
        switch (i) {
            case 1:
                IObjectWrapper zzke = zzke();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzke);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean isReady = isReady();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, isReady);
                return true;
            case 4:
                boolean zza = zza((zzuj) zzgj.zza(parcel, zzuj.CREATOR));
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, zza);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzvm) {
                        zzvmVar = (zzvm) queryLocalInterface;
                    } else {
                        zzvmVar = new zzvo(readStrongBinder);
                    }
                }
                zza(zzvmVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof zzwh) {
                        zzwhVar = (zzwh) queryLocalInterface2;
                    } else {
                        zzwhVar = new zzwj(readStrongBinder2);
                    }
                }
                zza(zzwhVar);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                stopLoading();
                parcel2.writeNoException();
                return true;
            case 11:
                zzkf();
                parcel2.writeNoException();
                return true;
            case 12:
                zzum zzkg = zzkg();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, zzkg);
                return true;
            case 13:
                zza((zzum) zzgj.zza(parcel, zzum.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzapp.zzah(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                zza(zzapv.zzaj(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String mediationAdapterClassName = getMediationAdapterClassName();
                parcel2.writeNoException();
                parcel2.writeString(mediationAdapterClassName);
                return true;
            case 19:
                zza(zzaav.zzl(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface3 instanceof zzvl) {
                        zzvlVar = (zzvl) queryLocalInterface3;
                    } else {
                        zzvlVar = new zzvn(readStrongBinder3);
                    }
                }
                zza(zzvlVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface4 instanceof zzwn) {
                        zzwnVar = (zzwn) queryLocalInterface4;
                    } else {
                        zzwnVar = new zzwm(readStrongBinder4);
                    }
                }
                zza(zzwnVar);
                parcel2.writeNoException();
                return true;
            case 22:
                setManualImpressionsEnabled(zzgj.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                boolean isLoading = isLoading();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, isLoading);
                return true;
            case 24:
                zza(zzasq.zzam(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                setUserId(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                zzxl videoController = getVideoController();
                parcel2.writeNoException();
                zzgj.zza(parcel2, videoController);
                return true;
            case 29:
                zza((zzze) zzgj.zza(parcel, zzze.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                zza((zzxr) zzgj.zza(parcel, zzxr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String adUnitId = getAdUnitId();
                parcel2.writeNoException();
                parcel2.writeString(adUnitId);
                return true;
            case 32:
                zzwh zzkj = zzkj();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzkj);
                return true;
            case 33:
                zzvm zzkk = zzkk();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzkk);
                return true;
            case 34:
                setImmersiveMode(zzgj.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                String zzkh = zzkh();
                parcel2.writeNoException();
                parcel2.writeString(zzkh);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface5 instanceof zzwc) {
                        zzwcVar = (zzwc) queryLocalInterface5;
                    } else {
                        zzwcVar = new zzwe(readStrongBinder5);
                    }
                }
                zza(zzwcVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle adMetadata = getAdMetadata();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, adMetadata);
                return true;
            case 38:
                zzbn(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                zza((zzut) zzgj.zza(parcel, zzut.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                zza(zzrq.zzb(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                zzxg zzki = zzki();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzki);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface6 instanceof zzxf) {
                        zzxfVar = (zzxf) queryLocalInterface6;
                    } else {
                        zzxfVar = new zzxh(readStrongBinder6);
                    }
                }
                zza(zzxfVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
