package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzanu extends zzgk implements zzanv {
    public zzanu() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzanv zzaf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzanv) {
            return (zzanv) queryLocalInterface;
        }
        return new zzanx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzanw zzanyVar;
        zzanw zzanwVar;
        zzanj zzanjVar = null;
        zzanq zzansVar = null;
        zzanp zzanrVar = null;
        zzanq zzansVar2 = null;
        zzank zzanmVar = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzgj.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzgj.zza(parcel, Bundle.CREATOR);
            zzum zzumVar = (zzum) zzgj.zza(parcel, zzum.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzanwVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzanw) {
                    zzanyVar = (zzanw) queryLocalInterface;
                } else {
                    zzanyVar = new zzany(readStrongBinder);
                }
                zzanwVar = zzanyVar;
            }
            zza(asInterface, readString, bundle, bundle2, zzumVar, zzanwVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzaoj zztn = zztn();
            parcel2.writeNoException();
            zzgj.zzb(parcel2, zztn);
        } else if (i == 3) {
            zzaoj zzto = zzto();
            parcel2.writeNoException();
            zzgj.zzb(parcel2, zzto);
        } else if (i == 5) {
            zzxl videoController = getVideoController();
            parcel2.writeNoException();
            zzgj.zza(parcel2, videoController);
        } else if (i == 10) {
            zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 11) {
            zza(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        } else {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzuj zzujVar = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzanj) {
                            zzanjVar = (zzanj) queryLocalInterface2;
                        } else {
                            zzanjVar = new zzanl(readStrongBinder2);
                        }
                    }
                    zza(readString2, readString3, zzujVar, asInterface2, zzanjVar, zzalu.zzad(parcel.readStrongBinder()), (zzum) zzgj.zza(parcel, zzum.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzuj zzujVar2 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzank) {
                            zzanmVar = (zzank) queryLocalInterface3;
                        } else {
                            zzanmVar = new zzanm(readStrongBinder3);
                        }
                    }
                    zza(readString4, readString5, zzujVar2, asInterface3, zzanmVar, zzalu.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzz = zzz(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgj.writeBoolean(parcel2, zzz);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzuj zzujVar3 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzanq) {
                            zzansVar2 = (zzanq) queryLocalInterface4;
                        } else {
                            zzansVar2 = new zzans(readStrongBinder4);
                        }
                    }
                    zza(readString6, readString7, zzujVar3, asInterface4, zzansVar2, zzalu.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzaa = zzaa(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgj.writeBoolean(parcel2, zzaa);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzuj zzujVar4 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzanp) {
                            zzanrVar = (zzanp) queryLocalInterface5;
                        } else {
                            zzanrVar = new zzanr(readStrongBinder5);
                        }
                    }
                    zza(readString8, readString9, zzujVar4, asInterface5, zzanrVar, zzalu.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzdp(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    zzuj zzujVar5 = (zzuj) zzgj.zza(parcel, zzuj.CREATOR);
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface6 instanceof zzanq) {
                            zzansVar = (zzanq) queryLocalInterface6;
                        } else {
                            zzansVar = new zzans(readStrongBinder6);
                        }
                    }
                    zzb(readString10, readString11, zzujVar5, asInterface6, zzansVar, zzalu.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
