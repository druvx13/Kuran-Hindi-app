package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzwb extends zzgi implements zzvz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final IObjectWrapper zzke() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void destroy() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isReady() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zza(zzuj zzujVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void pause() throws RemoteException {
        zza(5, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void resume() throws RemoteException {
        zza(6, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvm zzvmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzvmVar);
        zza(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwh zzwhVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzwhVar);
        zza(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void showInterstitial() throws RemoteException {
        zza(9, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void stopLoading() throws RemoteException {
        zza(10, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzkf() throws RemoteException {
        zza(11, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzum zzkg() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        zzum zzumVar = (zzum) zzgj.zza(transactAndReadException, zzum.CREATOR);
        transactAndReadException.recycle();
        return zzumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzum zzumVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapq zzapqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzapqVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapw zzapwVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzapwVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(15, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzaas zzaasVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzaasVar);
        zza(19, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvl zzvlVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzvlVar);
        zza(20, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwn zzwnVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzwnVar);
        zza(21, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(22, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isLoading() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzasn zzasnVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzasnVar);
        zza(24, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setUserId(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(25, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxl getVideoController() throws RemoteException {
        zzxl zzxnVar;
        Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzxnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzxl) {
                zzxnVar = (zzxl) queryLocalInterface;
            } else {
                zzxnVar = new zzxn(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzze zzzeVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzzeVar);
        zza(29, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxr zzxrVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzxrVar);
        zza(30, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String getAdUnitId() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(31, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzwh zzkj() throws RemoteException {
        zzwh zzwjVar;
        Parcel transactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwjVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzwh) {
                zzwjVar = (zzwh) queryLocalInterface;
            } else {
                zzwjVar = new zzwj(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzkk() throws RemoteException {
        zzvm zzvoVar;
        Parcel transactAndReadException = transactAndReadException(33, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzvm) {
                zzvoVar = (zzvm) queryLocalInterface;
            } else {
                zzvoVar = new zzvo(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(34, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String zzkh() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwc zzwcVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzwcVar);
        zza(36, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(37, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgj.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzbn(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(38, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzut zzutVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzutVar);
        zza(39, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzrn zzrnVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzrnVar);
        zza(40, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxg zzki() throws RemoteException {
        zzxg zzxiVar;
        Parcel transactAndReadException = transactAndReadException(41, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzxiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzxg) {
                zzxiVar = (zzxg) queryLocalInterface;
            } else {
                zzxiVar = new zzxi(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxf zzxfVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzxfVar);
        zza(42, obtainAndWriteInterfaceToken);
    }
}
