package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzath extends zzgi implements zzatf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzath(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzuj zzujVar, zzatn zzatnVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzatnVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzatk zzatkVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzatkVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final boolean isLoaded() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzats zzatsVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzatsVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzaua zzauaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzauaVar);
        zza(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzxa zzxaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzxaVar);
        zza(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgj.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzate zzqt() throws RemoteException {
        zzate zzatgVar;
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzatgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            if (queryLocalInterface instanceof zzate) {
                zzatgVar = (zzate) queryLocalInterface;
            } else {
                zzatgVar = new zzatg(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzatgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzxg zzki() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        zzxg zzj = zzxj.zzj(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzxf zzxfVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzxfVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzb(zzuj zzujVar, zzatn zzatnVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzatnVar);
        zza(14, obtainAndWriteInterfaceToken);
    }
}
