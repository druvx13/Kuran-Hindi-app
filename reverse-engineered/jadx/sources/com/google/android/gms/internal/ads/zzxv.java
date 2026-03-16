package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzxv {
    private final zzuk zzaca;
    private VideoOptions zzblb;
    private boolean zzbli;
    private AppEventListener zzblk;
    private zzvz zzbsb;
    private String zzbsc;
    private final zzalm zzbse;
    private zzub zzceb;
    private AdListener zzcee;
    private AdSize[] zzcfn;
    private final AtomicBoolean zzcgx;
    private final VideoController zzcgy;
    private final zzvi zzcgz;
    private OnCustomRenderedAdLoadedListener zzcha;
    private ViewGroup zzchb;
    private int zzchc;
    private OnPaidEventListener zzchd;

    private static boolean zzcv(int i) {
        return i == 1;
    }

    public zzxv(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzuk.zzcev, 0);
    }

    public zzxv(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzuk.zzcev, i);
    }

    public zzxv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzuk.zzcev, 0);
    }

    public zzxv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzuk.zzcev, i);
    }

    private zzxv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzuk zzukVar, zzvz zzvzVar, int i) {
        zzum zzumVar;
        this.zzbse = new zzalm();
        this.zzcgy = new VideoController();
        this.zzcgz = new zzxu(this);
        this.zzchb = viewGroup;
        this.zzaca = zzukVar;
        this.zzbsb = null;
        this.zzcgx = new AtomicBoolean(false);
        this.zzchc = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzuv zzuvVar = new zzuv(context, attributeSet);
                this.zzcfn = zzuvVar.zzy(z);
                this.zzbsc = zzuvVar.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzazm zzpr = zzvj.zzpr();
                    AdSize adSize = this.zzcfn[0];
                    int i2 = this.zzchc;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzumVar = zzum.zzpk();
                    } else {
                        zzum zzumVar2 = new zzum(context, adSize);
                        zzumVar2.zzcez = zzcv(i2);
                        zzumVar = zzumVar2;
                    }
                    zzpr.zza(viewGroup, zzumVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzvj.zzpr().zza(viewGroup, new zzum(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private zzxv(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzuk zzukVar, int i) {
        this(viewGroup, attributeSet, z, zzukVar, null, i);
    }

    public final void destroy() {
        try {
            if (this.zzbsb != null) {
                this.zzbsb.destroy();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzcee;
    }

    public final AdSize getAdSize() {
        zzum zzkg;
        try {
            if (this.zzbsb != null && (zzkg = this.zzbsb.zzkg()) != null) {
                return zzkg.zzpl();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzcfn;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzcfn;
    }

    public final String getAdUnitId() {
        zzvz zzvzVar;
        if (this.zzbsc == null && (zzvzVar = this.zzbsb) != null) {
            try {
                this.zzbsc = zzvzVar.getAdUnitId();
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
        return this.zzbsc;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzblk;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcha;
    }

    public final void zza(zzxt zzxtVar) {
        zzvz zzd;
        try {
            if (this.zzbsb == null) {
                if ((this.zzcfn == null || this.zzbsc == null) && this.zzbsb == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzchb.getContext();
                zzum zza = zza(context, this.zzcfn, this.zzchc);
                if ("search_v2".equals(zza.zzacf)) {
                    zzd = new zzvb(zzvj.zzps(), context, zza, this.zzbsc).zzd(context, false);
                } else {
                    zzd = new zzux(zzvj.zzps(), context, zza, this.zzbsc, this.zzbse).zzd(context, false);
                }
                this.zzbsb = zzd;
                zzd.zza(new zzuf(this.zzcgz));
                if (this.zzceb != null) {
                    this.zzbsb.zza(new zzua(this.zzceb));
                }
                if (this.zzblk != null) {
                    this.zzbsb.zza(new zzuq(this.zzblk));
                }
                if (this.zzcha != null) {
                    this.zzbsb.zza(new zzaax(this.zzcha));
                }
                if (this.zzblb != null) {
                    this.zzbsb.zza(new zzze(this.zzblb));
                }
                this.zzbsb.zza(new zzyz(this.zzchd));
                this.zzbsb.setManualImpressionsEnabled(this.zzbli);
                try {
                    IObjectWrapper zzke = this.zzbsb.zzke();
                    if (zzke != null) {
                        this.zzchb.addView((View) ObjectWrapper.unwrap(zzke));
                    }
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
            if (this.zzbsb.zza(zzuk.zza(this.zzchb.getContext(), zzxtVar))) {
                this.zzbse.zzf(zzxtVar.zzqk());
            }
        } catch (RemoteException e2) {
            zzazw.zze("#007 Could not call remote method.", e2);
        }
    }

    public final void pause() {
        try {
            if (this.zzbsb != null) {
                this.zzbsb.pause();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordManualImpression() {
        if (this.zzcgx.getAndSet(true)) {
            return;
        }
        try {
            if (this.zzbsb != null) {
                this.zzbsb.zzkf();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void resume() {
        try {
            if (this.zzbsb != null) {
                this.zzbsb.resume();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzcee = adListener;
        this.zzcgz.zza(adListener);
    }

    public final void zza(zzub zzubVar) {
        try {
            this.zzceb = zzubVar;
            if (this.zzbsb != null) {
                this.zzbsb.zza(zzubVar != null ? new zzua(zzubVar) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzcfn != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzcfn = adSizeArr;
        try {
            if (this.zzbsb != null) {
                this.zzbsb.zza(zza(this.zzchb.getContext(), this.zzcfn, this.zzchc));
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
        this.zzchb.requestLayout();
    }

    public final void setAdUnitId(String str) {
        if (this.zzbsc != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzbsc = str;
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzblk = appEventListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(appEventListener != null ? new zzuq(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcha = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbsb != null) {
                this.zzbsb.zza(onCustomRenderedAdLoadedListener != null ? new zzaax(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbli = z;
        try {
            if (this.zzbsb != null) {
                this.zzbsb.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbsb != null) {
                return this.zzbsb.zzkh();
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbsb != null) {
                return this.zzbsb.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzxg zzxgVar = null;
        try {
            if (this.zzbsb != null) {
                zzxgVar = this.zzbsb.zzki();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzxgVar);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzchd = onPaidEventListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(new zzyz(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final VideoController getVideoController() {
        return this.zzcgy;
    }

    public final zzxl zzdu() {
        zzvz zzvzVar = this.zzbsb;
        if (zzvzVar == null) {
            return null;
        }
        try {
            return zzvzVar.getVideoController();
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzblb = videoOptions;
        try {
            if (this.zzbsb != null) {
                this.zzbsb.zza(videoOptions == null ? null : new zzze(videoOptions));
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions getVideoOptions() {
        return this.zzblb;
    }

    public final boolean zza(zzvz zzvzVar) {
        if (zzvzVar == null) {
            return false;
        }
        try {
            IObjectWrapper zzke = zzvzVar.zzke();
            if (zzke != null && ((View) ObjectWrapper.unwrap(zzke)).getParent() == null) {
                this.zzchb.addView((View) ObjectWrapper.unwrap(zzke));
                this.zzbsb = zzvzVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    private static zzum zza(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzum.zzpk();
            }
        }
        zzum zzumVar = new zzum(context, adSizeArr);
        zzumVar.zzcez = zzcv(i);
        return zzumVar;
    }
}
