package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzvz extends IInterface {
    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzxl getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzaas zzaasVar) throws RemoteException;

    void zza(zzapq zzapqVar) throws RemoteException;

    void zza(zzapw zzapwVar, String str) throws RemoteException;

    void zza(zzasn zzasnVar) throws RemoteException;

    void zza(zzrn zzrnVar) throws RemoteException;

    void zza(zzum zzumVar) throws RemoteException;

    void zza(zzut zzutVar) throws RemoteException;

    void zza(zzvl zzvlVar) throws RemoteException;

    void zza(zzvm zzvmVar) throws RemoteException;

    void zza(zzwc zzwcVar) throws RemoteException;

    void zza(zzwh zzwhVar) throws RemoteException;

    void zza(zzwn zzwnVar) throws RemoteException;

    void zza(zzxf zzxfVar) throws RemoteException;

    void zza(zzxr zzxrVar) throws RemoteException;

    void zza(zzze zzzeVar) throws RemoteException;

    boolean zza(zzuj zzujVar) throws RemoteException;

    void zzbn(String str) throws RemoteException;

    IObjectWrapper zzke() throws RemoteException;

    void zzkf() throws RemoteException;

    zzum zzkg() throws RemoteException;

    String zzkh() throws RemoteException;

    zzxg zzki() throws RemoteException;

    zzwh zzkj() throws RemoteException;

    zzvm zzkk() throws RemoteException;
}
