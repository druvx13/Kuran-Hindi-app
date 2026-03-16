package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzatf extends IInterface {
    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void zza(zzatk zzatkVar) throws RemoteException;

    void zza(zzats zzatsVar) throws RemoteException;

    void zza(zzaua zzauaVar) throws RemoteException;

    void zza(zzuj zzujVar, zzatn zzatnVar) throws RemoteException;

    void zza(zzxa zzxaVar) throws RemoteException;

    void zza(zzxf zzxfVar) throws RemoteException;

    void zzb(zzuj zzujVar, zzatn zzatnVar) throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzxg zzki() throws RemoteException;

    zzate zzqt() throws RemoteException;
}
