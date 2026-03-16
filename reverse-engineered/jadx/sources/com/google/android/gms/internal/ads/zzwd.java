package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzwd extends zzgi implements zzwa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final IBinder zza(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i, int i2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        transactAndReadException.recycle();
        return readStrongBinder;
    }
}
