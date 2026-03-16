package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzanv extends IInterface {
    zzxl getVideoController() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzum zzumVar, zzanw zzanwVar) throws RemoteException;

    void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanj zzanjVar, zzalv zzalvVar, zzum zzumVar) throws RemoteException;

    void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzank zzankVar, zzalv zzalvVar) throws RemoteException;

    void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanp zzanpVar, zzalv zzalvVar) throws RemoteException;

    void zza(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanq zzanqVar, zzalv zzalvVar) throws RemoteException;

    void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(String str, String str2, zzuj zzujVar, IObjectWrapper iObjectWrapper, zzanq zzanqVar, zzalv zzalvVar) throws RemoteException;

    void zzdp(String str) throws RemoteException;

    zzaoj zztn() throws RemoteException;

    zzaoj zzto() throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException;
}
