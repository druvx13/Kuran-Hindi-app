package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzalr extends zzgi implements zzalp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzalq zzdg(String str) throws RemoteException {
        zzalq zzalsVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzalsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (queryLocalInterface instanceof zzalq) {
                zzalsVar = (zzalq) queryLocalInterface;
            } else {
                zzalsVar = new zzals(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzalsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final boolean zzdh(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzanv zzdk(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        zzanv zzaf = zzanu.zzaf(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzaf;
    }
}
