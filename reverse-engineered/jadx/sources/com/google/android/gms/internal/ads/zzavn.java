package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzavn extends IInterface {
    void zza(IObjectWrapper iObjectWrapper, zzavt zzavtVar, zzavm zzavmVar) throws RemoteException;

    void zza(zzaqh zzaqhVar) throws RemoteException;

    void zza(List<Uri> list, IObjectWrapper iObjectWrapper, zzapx zzapxVar) throws RemoteException;

    void zzan(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzao(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void zzb(List<Uri> list, IObjectWrapper iObjectWrapper, zzapx zzapxVar) throws RemoteException;
}
