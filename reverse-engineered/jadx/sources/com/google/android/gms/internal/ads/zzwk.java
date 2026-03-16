package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzwk extends zzgi implements zzwi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zza(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i) throws RemoteException {
        zzvz zzwbVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvz) {
                zzwbVar = (zzvz) queryLocalInterface;
            } else {
                zzwbVar = new zzwb(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zzb(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i) throws RemoteException {
        zzvz zzwbVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvz) {
                zzwbVar = (zzvz) queryLocalInterface;
            } else {
                zzwbVar = new zzwb(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvs zza(IObjectWrapper iObjectWrapper, String str, zzalp zzalpVar, int i) throws RemoteException {
        zzvs zzvuVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzvuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzvs) {
                zzvuVar = (zzvs) queryLocalInterface;
            } else {
                zzvuVar = new zzvu(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzwp zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzwp zzwrVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzwp) {
                zzwrVar = (zzwp) queryLocalInterface;
            } else {
                zzwrVar = new zzwr(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzacw zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper2);
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        zzacw zzp = zzacz.zzp(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzask zza(IObjectWrapper iObjectWrapper, zzalp zzalpVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
        zzask zzal = zzasj.zzal(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzal;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzapr zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        zzapr zzai = zzapu.zzai(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzapg zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        zzapg zzag = zzapf.zzag(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzwp zza(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzwp zzwrVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzwp) {
                zzwrVar = (zzwp) queryLocalInterface;
            } else {
                zzwrVar = new zzwr(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zza(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, int i) throws RemoteException {
        zzvz zzwbVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvz) {
                zzwbVar = (zzvz) queryLocalInterface;
            } else {
                zzwbVar = new zzwb(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzadd zza(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper2);
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper3);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        zzadd zzq = zzadc.zzq(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzatf zzb(IObjectWrapper iObjectWrapper, String str, zzalp zzalpVar, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
        zzatf zzap = zzati.zzap(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzap;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzvz zzc(IObjectWrapper iObjectWrapper, zzum zzumVar, String str, zzalp zzalpVar, int i) throws RemoteException {
        zzvz zzwbVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgj.zza(obtainAndWriteInterfaceToken, zzumVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgj.zza(obtainAndWriteInterfaceToken, zzalpVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvz) {
                zzwbVar = (zzvz) queryLocalInterface;
            } else {
                zzwbVar = new zzwb(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwbVar;
    }
}
