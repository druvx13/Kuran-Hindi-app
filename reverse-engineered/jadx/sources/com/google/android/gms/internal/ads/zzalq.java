package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzalq extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzxl getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzahc zzahcVar, List<zzahk> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzasy zzasyVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzasy zzasyVar, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, String str2, zzalv zzalvVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, String str2, zzalv zzalvVar, zzaci zzaciVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzum zzumVar, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzum zzumVar, zzuj zzujVar, String str, String str2, zzalv zzalvVar) throws RemoteException;

    void zza(zzuj zzujVar, String str) throws RemoteException;

    void zza(zzuj zzujVar, String str, String str2) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper, zzuj zzujVar, String str, zzalv zzalvVar) throws RemoteException;

    void zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzt(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zztf() throws RemoteException;

    zzaly zztg() throws RemoteException;

    zzamd zzth() throws RemoteException;

    Bundle zzti() throws RemoteException;

    Bundle zztj() throws RemoteException;

    boolean zztk() throws RemoteException;

    zzado zztl() throws RemoteException;

    zzame zztm() throws RemoteException;

    zzaoj zztn() throws RemoteException;

    zzaoj zzto() throws RemoteException;
}
