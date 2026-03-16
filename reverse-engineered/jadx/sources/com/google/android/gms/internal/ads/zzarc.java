package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzarc extends zzgi implements zzara {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final zzaqw zza(zzaqu zzaquVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzaquVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzaqw zzaqwVar = (zzaqw) zzgj.zza(transactAndReadException, zzaqw.CREATOR);
        transactAndReadException.recycle();
        return zzaqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzaqu zzaquVar, zzarb zzarbVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzaquVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzarbVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(zzarj zzarjVar, zzard zzardVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzarjVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzardVar);
        zza(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzb(zzarj zzarjVar, zzard zzardVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzarjVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzardVar);
        zza(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zzc(zzarj zzarjVar, zzard zzardVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzarjVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzardVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    public final void zza(String str, zzard zzardVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzardVar);
        zza(7, obtainAndWriteInterfaceToken);
    }
}
