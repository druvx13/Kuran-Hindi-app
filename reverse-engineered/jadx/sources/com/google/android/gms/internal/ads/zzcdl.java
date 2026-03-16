package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdl extends zzadn {
    private final String zzflf;
    private final zzbzx zzfqb;
    private final zzbzm zzftd;

    public zzcdl(String str, zzbzm zzbzmVar, zzbzx zzbzxVar) {
        this.zzflf = str;
        this.zzftd = zzbzmVar;
        this.zzfqb = zzbzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final IObjectWrapper zzrz() throws RemoteException {
        return ObjectWrapper.wrap(this.zzftd);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final String getHeadline() throws RemoteException {
        return this.zzfqb.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final List<?> getImages() throws RemoteException {
        return this.zzfqb.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final String getBody() throws RemoteException {
        return this.zzfqb.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final zzacs zzsd() throws RemoteException {
        return this.zzfqb.zzsd();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final String getCallToAction() throws RemoteException {
        return this.zzfqb.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final String getAdvertiser() throws RemoteException {
        return this.zzfqb.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final Bundle getExtras() throws RemoteException {
        return this.zzfqb.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void destroy() throws RemoteException {
        this.zzftd.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final zzxl getVideoController() throws RemoteException {
        return this.zzfqb.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzftd.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzftd.zzi(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzftd.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final zzack zzsb() throws RemoteException {
        return this.zzfqb.zzsb();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final IObjectWrapper zzsc() throws RemoteException {
        return this.zzfqb.zzsc();
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzflf;
    }
}
