package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzale extends zzbgu {
    private final AppMeasurementSdk zzden;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzale(AppMeasurementSdk appMeasurementSdk) {
        this.zzden = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void performAction(Bundle bundle) throws RemoteException {
        this.zzden.performAction(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final Bundle performActionWithResponse(Bundle bundle) throws RemoteException {
        return this.zzden.performActionWithResponse(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void logEvent(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzden.logEvent(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zza(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzden.setUserProperty(str, str2, iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final Map getUserProperties(String str, String str2, boolean z) throws RemoteException {
        return this.zzden.getUserProperties(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final int getMaxUserProperties(String str) throws RemoteException {
        return this.zzden.getMaxUserProperties(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void setConditionalUserProperty(Bundle bundle) throws RemoteException {
        this.zzden.setConditionalUserProperty(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzden.clearConditionalUserProperty(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final List getConditionalUserProperties(String str, String str2) throws RemoteException {
        return this.zzden.getConditionalUserProperties(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final String getAppInstanceId() throws RemoteException {
        return this.zzden.getAppInstanceId();
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final String getGmpAppId() throws RemoteException {
        return this.zzden.getGmpAppId();
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final long generateEventId() throws RemoteException {
        return this.zzden.generateEventId();
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void beginAdUnitExposure(String str) throws RemoteException {
        this.zzden.beginAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void endAdUnitExposure(String str) throws RemoteException {
        this.zzden.endAdUnitExposure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final void zzb(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.zzden.setCurrentScreen(iObjectWrapper != null ? (Activity) ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final String getCurrentScreenName() throws RemoteException {
        return this.zzden.getCurrentScreenName();
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final String getCurrentScreenClass() throws RemoteException {
        return this.zzden.getCurrentScreenClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbgr
    public final String getAppIdOrigin() throws RemoteException {
        return this.zzden.getAppIdOrigin();
    }
}
