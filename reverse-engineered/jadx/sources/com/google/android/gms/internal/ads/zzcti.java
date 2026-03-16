package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbuj;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcti extends zzvy implements zzbti {
    private final ViewGroup zzfiv;
    private final zzbgy zzggh;
    private zzblx zzgiu;
    private final Context zzgiz;
    private final zzbte zzgji;
    private zzum zzgjj;
    private zzaas zzgjk;
    private zzdri<zzblx> zzgjl;
    private final zzctp zzgje = new zzctp();
    private final zzctm zzgjf = new zzctm();
    private final zzcto zzgjg = new zzcto();
    private final zzctk zzgjh = new zzctk();
    private final zzdhg zzgja = new zzdhg();

    public zzcti(zzbgy zzbgyVar, Context context, zzum zzumVar, String str) {
        this.zzfiv = new FrameLayout(context);
        this.zzggh = zzbgyVar;
        this.zzgiz = context;
        this.zzgja.zzd(zzumVar).zzgr(str);
        zzbte zzacz = zzbgyVar.zzacz();
        this.zzgji = zzacz;
        zzacz.zza(this, this.zzggh.zzacv());
        this.zzgjj = zzumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void showInterstitial() {
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
    public final void zza(zzasn zzasnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzrn zzrnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzut zzutVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzxr zzxrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzbn(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final IObjectWrapper zzke() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfiv);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized boolean zza(zzuj zzujVar) {
        this.zzgja.zzd(this.zzgjj);
        this.zzgja.zzbo(this.zzgjj.zzcfd);
        return zzg(zzujVar);
    }

    private final synchronized boolean zzg(zzuj zzujVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzbd(this.zzgiz) && zzujVar.zzceu == null) {
            zzawr.zzfa("Failed to load the ad because app ID is missing.");
            if (this.zzgje != null) {
                this.zzgje.onAdFailedToLoad(8);
            }
            return false;
        } else if (this.zzgjl != null) {
            return false;
        } else {
            zzdhn.zze(this.zzgiz, zzujVar.zzcej);
            zzdhe zzasc = this.zzgja.zzh(zzujVar).zzasc();
            if (zzabp.zzcxf.get().booleanValue() && this.zzgja.zzkg().zzcfa && this.zzgje != null) {
                this.zzgje.onAdFailedToLoad(1);
                return false;
            }
            zzbmt zzb = zzb(zzasc);
            zzdri<zzblx> zzaii = zzb.zzaed().zzaii();
            this.zzgjl = zzaii;
            zzdqw.zza(zzaii, new zzctl(this, zzb), this.zzggh.zzacv());
            return true;
        }
    }

    private final synchronized zzbmt zzb(zzdhe zzdheVar) {
        return this.zzggh.zzadc().zzc(new zzbqj.zza().zzcb(this.zzgiz).zza(zzdheVar).zzair()).zzc(new zzbuj.zza().zza((zzub) this.zzgje, this.zzggh.zzacv()).zza(this.zzgjf, this.zzggh.zzacv()).zza((zzbqx) this.zzgje, this.zzggh.zzacv()).zza((zzbsm) this.zzgje, this.zzggh.zzacv()).zza((zzbrc) this.zzgje, this.zzggh.zzacv()).zza(this.zzgjg, this.zzggh.zzacv()).zza(this.zzgjh, this.zzggh.zzacv()).zzajm()).zza(new zzcsm(this.zzgjk)).zzb(new zzbyl(zzcae.zzfsw, null)).zza(new zzbnp(this.zzgji)).zzb(new zzbls(this.zzfiv)).zzafg();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgiu != null) {
            this.zzgiu.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgiu != null) {
            this.zzgiu.zzahz().zzbx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgiu != null) {
            this.zzgiu.zzahz().zzby(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvm zzvmVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgje.zzc(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvm zzkk() {
        return this.zzgje.zzapl();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzwh zzwhVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgjg.zzb(zzwhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzwh zzkj() {
        return this.zzgjg.zzapk();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zzkf() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        if (this.zzgiu != null) {
            this.zzgiu.zzkf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized zzum zzkg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgiu != null) {
            return zzdhh.zzb(this.zzgiz, Collections.singletonList(this.zzgiu.zzahd()));
        }
        return this.zzgja.zzkg();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzum zzumVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzgja.zzd(zzumVar);
        this.zzgjj = zzumVar;
        if (this.zzgiu != null) {
            this.zzgiu.zza(this.zzfiv, zzumVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgiu == null || this.zzgiu.zzaia() == null) {
            return null;
        }
        return this.zzgiu.zzaia().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String zzkh() {
        if (this.zzgiu == null || this.zzgiu.zzaia() == null) {
            return null;
        }
        return this.zzgiu.zzaia().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized zzxg zzki() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcua)).booleanValue()) {
            if (this.zzgiu == null) {
                return null;
            }
            return this.zzgiu.zzaia();
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
    public final synchronized zzxl getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzgiu != null) {
            return this.zzgiu.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized String getAdUnitId() {
        return this.zzgja.zzasa();
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzze zzzeVar) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzgja.zzc(zzzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zza(zzvl zzvlVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgjf.zzb(zzvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final synchronized void zza(zzaas zzaasVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgjk = zzaasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final synchronized void zzaix() {
        boolean zza;
        ViewParent parent = this.zzfiv.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zza = com.google.android.gms.ads.internal.zzq.zzkw().zza(view, view.getContext());
        } else {
            zza = false;
        }
        if (zza) {
            if (this.zzgiu != null && this.zzgiu.zzahi() != null) {
                this.zzgja.zzd(zzdhh.zzb(this.zzgiz, Collections.singletonList(this.zzgiu.zzahi())));
            }
            zzg(this.zzgja.zzarz());
            return;
        }
        this.zzgji.zzdp(60);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdri zza(zzcti zzctiVar, zzdri zzdriVar) {
        zzctiVar.zzgjl = null;
        return null;
    }
}
