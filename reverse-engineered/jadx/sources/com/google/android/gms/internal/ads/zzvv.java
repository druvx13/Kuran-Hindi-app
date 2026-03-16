package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzvv extends zzgk implements zzvs {
    public zzvv() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzvm zzvmVar = null;
        zzwn zzwnVar = null;
        switch (i) {
            case 1:
                zzvr zzqa = zzqa();
                parcel2.writeNoException();
                zzgj.zza(parcel2, zzqa);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof zzvm) {
                        zzvmVar = (zzvm) queryLocalInterface;
                    } else {
                        zzvmVar = new zzvo(readStrongBinder);
                    }
                }
                zzb(zzvmVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zza(zzadv.zzs(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                zza(zzadw.zzt(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                zza(parcel.readString(), zzaec.zzv(parcel.readStrongBinder()), zzaeb.zzu(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                zza((zzaci) zzgj.zza(parcel, zzaci.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface2 instanceof zzwn) {
                        zzwnVar = (zzwn) queryLocalInterface2;
                    } else {
                        zzwnVar = new zzwm(readStrongBinder2);
                    }
                }
                zzb(zzwnVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zza(zzaej.zzw(parcel.readStrongBinder()), (zzum) zzgj.zza(parcel, zzum.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                zza((PublisherAdViewOptions) zzgj.zza(parcel, PublisherAdViewOptions.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                zza(zzaek.zzx(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zza((zzahm) zzgj.zza(parcel, zzahm.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza(zzahx.zzab(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
