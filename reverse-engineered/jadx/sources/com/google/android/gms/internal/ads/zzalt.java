package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzalt extends zzgk implements zzalq {
    public zzalt() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzalv zzalvVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzum zzumVar = (zzum) zzgj.zza(parcel, zzum.CREATOR);
                zzuj zzujVar = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder);
                    }
                }
                zza(asInterface, zzumVar, zzujVar, readString, zzalvVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper zztf = zztf();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zztf);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzuj zzujVar2 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface2;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder2);
                    }
                }
                zza(asInterface2, zzujVar2, readString2, zzalvVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzum zzumVar2 = (zzum) zzgj.zza(parcel, zzum.CREATOR);
                zzuj zzujVar3 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface3;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder3);
                    }
                }
                zza(asInterface3, zzumVar2, zzujVar3, readString3, readString4, zzalvVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzuj zzujVar4 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface4;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder4);
                    }
                }
                zza(asInterface4, zzujVar4, readString5, readString6, zzalvVar);
                parcel2.writeNoException();
                return true;
            case 8:
                pause();
                parcel2.writeNoException();
                return true;
            case 9:
                resume();
                parcel2.writeNoException();
                return true;
            case 10:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzuj) zzgj.zza(parcel, zzuj.CREATOR), parcel.readString(), zzasx.zzan(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                zza((zzuj) zzgj.zza(parcel, zzuj.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean isInitialized = isInitialized();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, isInitialized);
                return true;
            case 14:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzuj zzujVar5 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface5 instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface5;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder5);
                    }
                }
                zza(asInterface5, zzujVar5, readString7, readString8, zzalvVar, (zzaci) zzgj.zza(parcel, zzaci.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                zzaly zztg = zztg();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zztg);
                return true;
            case 16:
                zzamd zzth = zzth();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzth);
                return true;
            case 17:
                Bundle zzti = zzti();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, zzti);
                return true;
            case 18:
                Bundle interstitialAdapterInfo = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, interstitialAdapterInfo);
                return true;
            case 19:
                Bundle zztj = zztj();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, zztj);
                return true;
            case 20:
                zza((zzuj) zzgj.zza(parcel, zzuj.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                zzs(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zztk = zztk();
                parcel2.writeNoException();
                zzgj.writeBoolean(parcel2, zztk);
                return true;
            case 23:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzasx.zzan(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                zzado zztl = zztl();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zztl);
                return true;
            case 25:
                setImmersiveMode(zzgj.zza(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                zzxl videoController = getVideoController();
                parcel2.writeNoException();
                zzgj.zza(parcel2, videoController);
                return true;
            case 27:
                zzame zztm = zztm();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zztm);
                return true;
            case 28:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzuj zzujVar6 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface6;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder6);
                    }
                }
                zzb(asInterface6, zzujVar6, readString9, zzalvVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                zzt(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzahf.zzz(parcel.readStrongBinder()), parcel.createTypedArrayList(zzahk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzuj zzujVar7 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface7 instanceof zzalv) {
                        zzalvVar = (zzalv) queryLocalInterface7;
                    } else {
                        zzalvVar = new zzalx(readStrongBinder7);
                    }
                }
                zzc(asInterface7, zzujVar7, readString10, zzalvVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzaoj zztn = zztn();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, zztn);
                return true;
            case 34:
                zzaoj zzto = zzto();
                parcel2.writeNoException();
                zzgj.zzb(parcel2, zzto);
                return true;
        }
    }
}
