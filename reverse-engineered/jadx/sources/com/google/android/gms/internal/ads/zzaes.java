package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public interface zzaes extends IInterface {
    void cancelUnconfirmedClick() throws RemoteException;

    void destroy() throws RemoteException;

    String getAdvertiser() throws RemoteException;

    String getBody() throws RemoteException;

    String getCallToAction() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getHeadline() throws RemoteException;

    List getImages() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    List getMuteThisAdReasons() throws RemoteException;

    String getPrice() throws RemoteException;

    double getStarRating() throws RemoteException;

    String getStore() throws RemoteException;

    zzxl getVideoController() throws RemoteException;

    boolean isCustomClickGestureEnabled() throws RemoteException;

    boolean isCustomMuteThisAdEnabled() throws RemoteException;

    void performClick(Bundle bundle) throws RemoteException;

    void recordCustomClickGesture() throws RemoteException;

    boolean recordImpression(Bundle bundle) throws RemoteException;

    void reportTouchEvent(Bundle bundle) throws RemoteException;

    void zza(zzaer zzaerVar) throws RemoteException;

    void zza(zzws zzwsVar) throws RemoteException;

    void zza(zzww zzwwVar) throws RemoteException;

    void zza(zzxf zzxfVar) throws RemoteException;

    zzxg zzki() throws RemoteException;

    IObjectWrapper zzrz() throws RemoteException;

    zzacs zzsa() throws RemoteException;

    zzack zzsb() throws RemoteException;

    IObjectWrapper zzsc() throws RemoteException;

    void zzsk() throws RemoteException;

    zzacr zzsl() throws RemoteException;
}
