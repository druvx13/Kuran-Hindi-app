package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdo extends zzaev {
    private final String zzflf;
    private final zzbzx zzfqb;
    private final zzbzm zzftd;

    public zzcdo(String str, zzbzm zzbzmVar, zzbzx zzbzxVar) {
        this.zzflf = str;
        this.zzftd = zzbzmVar;
        this.zzfqb = zzbzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final IObjectWrapper zzrz() throws RemoteException {
        return ObjectWrapper.wrap(this.zzftd);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getHeadline() throws RemoteException {
        return this.zzfqb.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final List<?> getImages() throws RemoteException {
        return this.zzfqb.getImages();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final List<?> getMuteThisAdReasons() throws RemoteException {
        if (isCustomMuteThisAdEnabled()) {
            return this.zzfqb.getMuteThisAdReasons();
        }
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean isCustomMuteThisAdEnabled() throws RemoteException {
        return (this.zzfqb.getMuteThisAdReasons().isEmpty() || this.zzfqb.zzakz() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getBody() throws RemoteException {
        return this.zzfqb.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzacs zzsa() throws RemoteException {
        return this.zzfqb.zzsa();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getCallToAction() throws RemoteException {
        return this.zzfqb.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getAdvertiser() throws RemoteException {
        return this.zzfqb.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final double getStarRating() throws RemoteException {
        return this.zzfqb.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getStore() throws RemoteException {
        return this.zzfqb.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getPrice() throws RemoteException {
        return this.zzfqb.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void destroy() throws RemoteException {
        this.zzftd.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzxl getVideoController() throws RemoteException {
        return this.zzfqb.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzftd.zzg(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzftd.zzi(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzftd.zzh(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzack zzsb() throws RemoteException {
        return this.zzfqb.zzsb();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final IObjectWrapper zzsc() throws RemoteException {
        return this.zzfqb.zzsc();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzflf;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final Bundle getExtras() throws RemoteException {
        return this.zzfqb.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(zzaer zzaerVar) throws RemoteException {
        this.zzftd.zza(zzaerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(zzww zzwwVar) throws RemoteException {
        this.zzftd.zza(zzwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(zzws zzwsVar) throws RemoteException {
        this.zzftd.zza(zzwsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zzsk() {
        this.zzftd.zzsk();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void recordCustomClickGesture() {
        this.zzftd.recordCustomClickGesture();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final boolean isCustomClickGestureEnabled() {
        return this.zzftd.isCustomClickGestureEnabled();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void cancelUnconfirmedClick() throws RemoteException {
        this.zzftd.cancelUnconfirmedClick();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzacr zzsl() throws RemoteException {
        return this.zzftd.zzakt().zzsl();
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final zzxg zzki() throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcua)).booleanValue()) {
            return this.zzftd.zzaia();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaes
    public final void zza(zzxf zzxfVar) throws RemoteException {
        this.zzftd.zza(zzxfVar);
    }
}
