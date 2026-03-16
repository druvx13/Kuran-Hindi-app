package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgi extends zzasj {
    private final zzdgz zzfmx;
    private boolean zzgjy = false;
    private final zzdfw zzgsz;
    private final zzdez zzgta;
    private zzcel zzgtb;

    public zzdgi(zzdfw zzdfwVar, zzdez zzdezVar, zzdgz zzdgzVar) {
        this.zzgsz = zzdfwVar;
        this.zzgta = zzdezVar;
        this.zzfmx = zzdgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void setAppPackageName(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void zza(zzast zzastVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (zzaab.zzcr(zzastVar.zzbsc)) {
            return;
        }
        if (zzapm()) {
            if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcrl)).booleanValue()) {
                return;
            }
        }
        zzdft zzdftVar = new zzdft(null);
        this.zzgtb = null;
        this.zzgsz.zzdt(zzdgw.zzguj);
        this.zzgsz.zza(zzastVar.zzdlx, zzastVar.zzbsc, zzdftVar, new zzdgh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void destroy() throws RemoteException {
        zzl(null);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzgta.zza((AdMetadataListener) null);
        if (this.zzgtb != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzgtb.zzahz().zzbz(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void pause() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgtb != null) {
            this.zzgtb.zzahz().zzbx(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void resume() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgtb != null) {
            this.zzgtb.zzahz().zzby(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void show() throws RemoteException {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzgtb == null) {
            return;
        }
        if (iObjectWrapper != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof Activity) {
                activity = (Activity) unwrap;
                this.zzgtb.zzb(this.zzgjy, activity);
            }
        }
        activity = null;
        this.zzgtb.zzb(this.zzgjy, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final boolean zzqu() {
        zzcel zzcelVar = this.zzgtb;
        return zzcelVar != null && zzcelVar.zzqu();
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgtb == null || this.zzgtb.zzaia() == null) {
            return null;
        }
        return this.zzgtb.zzaia().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final boolean isLoaded() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzapm();
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzasn zzasnVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzgta.zzb(zzasnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzasi zzasiVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzgta.zzb(zzasiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final void zza(zzwc zzwcVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzwcVar == null) {
            this.zzgta.zza((AdMetadataListener) null);
        } else {
            this.zzgta.zza(new zzdgk(this, zzwcVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzcel zzcelVar = this.zzgtb;
        return zzcelVar != null ? zzcelVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzfmx.zzdrf = str;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcln)).booleanValue()) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzfmx.zzdrg = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgjy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public final synchronized zzxg zzki() throws RemoteException {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcua)).booleanValue()) {
            if (this.zzgtb != null) {
                return this.zzgtb.zzaia();
            }
            return null;
        }
        return null;
    }

    private final synchronized boolean zzapm() {
        boolean z;
        if (this.zzgtb != null) {
            z = this.zzgtb.isClosed() ? false : true;
        }
        return z;
    }
}
