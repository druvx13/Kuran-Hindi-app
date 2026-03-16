package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctr extends zzvy {
    private final Executor zzfhi;
    private final zzbgy zzggh;
    private final Context zzgiz;
    private final zzdhg zzgja;
    private zzaas zzgjk;
    private zzdri<zzbws> zzgjl;
    private zzbws zzgjx;
    private boolean zzgjy;
    private final zzctp zzgje = new zzctp();
    private final zzcto zzgjg = new zzcto();
    private final zzdez zzgjw = new zzdez(new zzdih());
    private final zzctk zzgjh = new zzctk();

    public zzctr(zzbgy zzbgyVar, Context context, zzum zzumVar, String str) {
        zzdhg zzdhgVar = new zzdhg();
        this.zzgja = zzdhgVar;
        this.zzgjy = false;
        this.zzggh = zzbgyVar;
        zzdhgVar.zzd(zzumVar).zzgr(str);
        this.zzfhi = zzbgyVar.zzacv();
        this.zzgiz = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzxl getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapq zzapqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzapw zzapwVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzrn zzrnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzum zzumVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzut zzutVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvl zzvlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxr zzxrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzbn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final IObjectWrapper zzke() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzkf() {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzum zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized boolean zza(zzuj zzujVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzbd(this.zzgiz) && zzujVar.zzceu == null) {
            zzawr.zzfa("Failed to load the ad because app ID is missing.");
            if (this.zzgje != null) {
                this.zzgje.onAdFailedToLoad(8);
            }
            return false;
        }
        if (this.zzgjl == null && !zzapm()) {
            zzdhn.zze(this.zzgiz, zzujVar.zzcej);
            this.zzgjx = null;
            zzdhe zzasc = this.zzgja.zzh(zzujVar).zzasc();
            zzbuj.zza zzaVar = new zzbuj.zza();
            if (this.zzgjw != null) {
                zzaVar.zza((zzbqx) this.zzgjw, this.zzggh.zzacv()).zza((zzbsm) this.zzgjw, this.zzggh.zzacv()).zza((zzbrc) this.zzgjw, this.zzggh.zzacv());
            }
            zzbxr zzafm = this.zzggh.zzadf().zzd(new zzbqj.zza().zzcb(this.zzgiz).zza(zzasc).zzair()).zzd(zzaVar.zza((zzbqx) this.zzgje, this.zzggh.zzacv()).zza((zzbsm) this.zzgje, this.zzggh.zzacv()).zza((zzbrc) this.zzgje, this.zzggh.zzacv()).zza((zzub) this.zzgje, this.zzggh.zzacv()).zza(this.zzgjg, this.zzggh.zzacv()).zza(this.zzgjh, this.zzggh.zzacv()).zzajm()).zzb(new zzcsm(this.zzgjk)).zzafm();
            zzdri<zzbws> zzaii = zzafm.zzaed().zzaii();
            this.zzgjl = zzaii;
            zzdqw.zza(zzaii, new zzctq(this, zzafm), this.zzfhi);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgjx != null) {
            this.zzgjx.zzahz().zzbz(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgjx != null) {
            this.zzgjx.zzahz().zzbx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgjx != null) {
            this.zzgjx.zzahz().zzby(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvm zzvmVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgje.zzc(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwh zzwhVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgjg.zzb(zzwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void showInterstitial() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzgjx == null) {
            return;
        }
        this.zzgjx.zzbi(this.zzgjy);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgjx == null || this.zzgjx.zzaia() == null) {
            return null;
        }
        return this.zzgjx.zzaia().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String zzkh() {
        if (this.zzgjx == null || this.zzgjx.zzaia() == null) {
            return null;
        }
        return this.zzgjx.zzaia().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized zzxg zzki() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcua)).booleanValue()) {
            if (this.zzgjx == null) {
                return null;
            }
            return this.zzgjx.zzaia();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzwn zzwnVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgja.zzc(zzwnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgja.zzbp(z);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized boolean isLoading() {
        boolean z;
        if (this.zzgjl != null) {
            z = this.zzgjl.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized boolean isReady() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzapm();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String getAdUnitId() {
        return this.zzgja.zzasa();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzwh zzkj() {
        return this.zzgjg.zzapk();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzkk() {
        return this.zzgje.zzapl();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgjy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzze zzzeVar) {
        this.zzgja.zzc(zzzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzaas zzaasVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgjk = zzaasVar;
    }

    private final synchronized boolean zzapm() {
        boolean z;
        if (this.zzgjx != null) {
            z = this.zzgjx.isClosed() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxf zzxfVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzgjh.zzb(zzxfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwc zzwcVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzasn zzasnVar) {
        this.zzgjw.zzb(zzasnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdri zza(zzctr zzctrVar, zzdri zzdriVar) {
        zzctrVar.zzgjl = null;
        return null;
    }
}
