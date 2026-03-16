package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzanx extends zzgi implements zzanv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzum zzumVar, zzanw zzanwVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, bundle);
        zzgj.zza(obtainAndWriteInterfaceToken, bundle2);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzanwVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final zzaoj zztn() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        zzaoj zzaojVar = (zzaoj) zzgj.zza(transactAndReadException, zzaoj.CREATOR);
        transactAndReadException.recycle();
        return zzaojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final zzaoj zzto() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        zzaoj zzaojVar = (zzaoj) zzgj.zza(transactAndReadException, zzaoj.CREATOR);
        transactAndReadException.recycle();
        return zzaojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final zzxl getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        zzxl zzk = zzxk.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        obtainAndWriteInterfaceToken.writeTypedArray(bundleArr, 0);
        zza(11, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanj zzanjVar, zzalv zzalvVar, zzum zzumVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzanjVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalvVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzank zzankVar, zzalv zzalvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzankVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalvVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanq zzanqVar, zzalv zzalvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzanqVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalvVar);
        zza(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        boolean zza = zzgj.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanp zzanpVar, zzalv zzalvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzanpVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalvVar);
        zza(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zzdp(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(19, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzanv
    public final void zzb(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanq zzanqVar, zzalv zzalvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgj.zza(obtainAndWriteInterfaceToken, zzujVar);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzanqVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalvVar);
        zza(20, obtainAndWriteInterfaceToken);
    }
}
