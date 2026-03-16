package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzaqz extends zzgk implements zzara {
    public zzaqz() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            zzarb zzarbVar = null;
            zzard zzardVar = null;
            zzard zzardVar2 = null;
            zzard zzardVar3 = null;
            zzard zzardVar4 = null;
            if (i == 2) {
                zzaqu zzaquVar = (zzaqu) zzgj.zza(parcel, zzaqu.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzarb) {
                        zzarbVar = (zzarb) queryLocalInterface;
                    } else {
                        zzarbVar = new zzare(readStrongBinder);
                    }
                }
                zza(zzaquVar, zzarbVar);
                parcel2.writeNoException();
            } else if (i == 4) {
                zzarj zzarjVar = (zzarj) zzgj.zza(parcel, zzarj.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzard) {
                        zzardVar4 = (zzard) queryLocalInterface2;
                    } else {
                        zzardVar4 = new zzarf(readStrongBinder2);
                    }
                }
                zza(zzarjVar, zzardVar4);
                parcel2.writeNoException();
            } else if (i == 5) {
                zzarj zzarjVar2 = (zzarj) zzgj.zza(parcel, zzarj.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzard) {
                        zzardVar3 = (zzard) queryLocalInterface3;
                    } else {
                        zzardVar3 = new zzarf(readStrongBinder3);
                    }
                }
                zzb(zzarjVar2, zzardVar3);
                parcel2.writeNoException();
            } else if (i == 6) {
                zzarj zzarjVar3 = (zzarj) zzgj.zza(parcel, zzarj.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof zzard) {
                        zzardVar2 = (zzard) queryLocalInterface4;
                    } else {
                        zzardVar2 = new zzarf(readStrongBinder4);
                    }
                }
                zzc(zzarjVar3, zzardVar2);
                parcel2.writeNoException();
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof zzard) {
                        zzardVar = (zzard) queryLocalInterface5;
                    } else {
                        zzardVar = new zzarf(readStrongBinder5);
                    }
                }
                zza(readString, zzardVar);
                parcel2.writeNoException();
            }
        } else {
            zzaqw zza = zza((zzaqu) zzgj.zza(parcel, zzaqu.CREATOR));
            parcel2.writeNoException();
            zzgj.zzb(parcel2, zza);
        }
        return true;
    }
}
