package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdmx extends zzgi implements zzdmy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzdmy
    public final zzdmw zza(zzdmu zzdmuVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzdmuVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzdmw zzdmwVar = (zzdmw) zzgj.zza(transactAndReadException, zzdmw.CREATOR);
        transactAndReadException.recycle();
        return zzdmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmy
    public final void zza(zzdmp zzdmpVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzdmpVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzdmy
    public final zzdng zza(zzdne zzdneVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzdneVar);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        zzdng zzdngVar = (zzdng) zzgj.zza(transactAndReadException, zzdng.CREATOR);
        transactAndReadException.recycle();
        return zzdngVar;
    }
}
