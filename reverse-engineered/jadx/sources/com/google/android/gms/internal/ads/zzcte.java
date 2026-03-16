package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcte extends zzvy {
    private final ViewGroup zzfiv;
    private final zzdhe zzfll;
    private final zzvm zzfps;
    private final zzblx zzgiu;
    private final Context zzvf;

    public zzcte(Context context, zzvm zzvmVar, zzdhe zzdheVar, zzblx zzblxVar) {
        this.zzvf = context;
        this.zzfps = zzvmVar;
        this.zzfll = zzdheVar;
        this.zzgiu = zzblxVar;
        FrameLayout frameLayout = new FrameLayout(this.zzvf);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgiu.zzahe(), com.google.android.gms.ads.internal.zzq.zzky().zzxl());
        frameLayout.setMinimumHeight(zzkg().heightPixels);
        frameLayout.setMinimumWidth(zzkg().widthPixels);
        this.zzfiv = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapq zzapqVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapw zzapwVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzasn zzasnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzrn zzrnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzut zzutVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxr zzxrVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzbn(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final IObjectWrapper zzke() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfiv);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgiu.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean zza(zzuj zzujVar) throws RemoteException {
        zzawr.zzfb("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgiu.zzahz().zzbx(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgiu.zzahz().zzby(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzkf() throws RemoteException {
        this.zzgiu.zzkf();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzum zzkg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzdhh.zzb(this.zzvf, Collections.singletonList(this.zzgiu.zzahd()));
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgiu.zzaia() != null) {
            return this.zzgiu.zzaia().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxl getVideoController() throws RemoteException {
        return this.zzgiu.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String getAdUnitId() throws RemoteException {
        return this.zzfll.zzgux;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzwh zzkj() throws RemoteException {
        return this.zzfll.zzgvc;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzkk() throws RemoteException {
        return this.zzfps;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final String zzkh() throws RemoteException {
        if (this.zzgiu.zzaia() != null) {
            return this.zzgiu.zzaia().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxg zzki() {
        return this.zzgiu.zzaia();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzze zzzeVar) throws RemoteException {
        zzawr.zzfb("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzum zzumVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzblx zzblxVar = this.zzgiu;
        if (zzblxVar != null) {
            zzblxVar.zza(this.zzfiv, zzumVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzaas zzaasVar) throws RemoteException {
        zzawr.zzfb("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvl zzvlVar) throws RemoteException {
        zzawr.zzfb("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwn zzwnVar) throws RemoteException {
        zzawr.zzfb("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzawr.zzfb("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvm zzvmVar) throws RemoteException {
        zzawr.zzfb("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwh zzwhVar) throws RemoteException {
        zzawr.zzfb("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwc zzwcVar) throws RemoteException {
        zzawr.zzfb("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final Bundle getAdMetadata() throws RemoteException {
        zzawr.zzfb("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxf zzxfVar) {
        zzawr.zzfb("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
