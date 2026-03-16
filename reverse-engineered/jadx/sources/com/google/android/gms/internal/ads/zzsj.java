package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsj extends zzgi implements zzsk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final zzse zza(zzsf zzsfVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzsfVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzse zzseVar = (zzse) zzgj.zza(transactAndReadException, zzse.CREATOR);
        transactAndReadException.recycle();
        return zzseVar;
    }
}
