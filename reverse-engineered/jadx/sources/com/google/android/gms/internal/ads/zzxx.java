package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzxx {
    private final zzuk zzaca;
    private AppEventListener zzblk;
    private boolean zzbmf;
    private zzvz zzbsb;
    private String zzbsc;
    private final zzalm zzbse;
    private zzub zzceb;
    private AdListener zzcee;
    private AdMetadataListener zzcef;
    private OnCustomRenderedAdLoadedListener zzcha;
    private OnPaidEventListener zzchd;
    private RewardedVideoAdListener zzchj;
    private boolean zzchk;
    private final Context zzvf;

    public zzxx(Context context) {
        this(context, zzuk.zzcev, null);
    }

    public zzxx(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzuk.zzcev, publisherInterstitialAd);
    }

    private zzxx(Context context, zzuk zzukVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbse = new zzalm();
        this.zzvf = context;
        this.zzaca = zzukVar;
    }

    public final AdListener getAdListener() {
        return this.zzcee;
    }

    public final String getAdUnitId() {
        return this.zzbsc;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzblk;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcha;
    }

    public final boolean isLoaded() {
        try {
            if (this.zzbsb == null) {
                return false;
            }
            return this.zzbsb.isReady();
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbsb == null) {
                return false;
            }
            return this.zzbsb.isLoading();
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    public final void zza(zzxt zzxtVar) {
        try {
            if (this.zzbsb == null) {
                if (this.zzbsc == null) {
                    zzcp("loadAd");
                }
                zzum zzpi = this.zzchk ? zzum.zzpi() : new zzum();
                zzuu zzps = zzvj.zzps();
                Context context = this.zzvf;
                zzvz zzd = new zzva(zzps, context, zzpi, this.zzbsc, this.zzbse).zzd(context, false);
                this.zzbsb = zzd;
                if (this.zzcee != null) {
                    zzd.zza(new zzuf(this.zzcee));
                }
                if (this.zzceb != null) {
                    this.zzbsb.zza(new zzua(this.zzceb));
                }
                if (this.zzcef != null) {
                    this.zzbsb.zza(new zzug(this.zzcef));
                }
                if (this.zzblk != null) {
                    this.zzbsb.zza(new zzuq(this.zzblk));
                }
                if (this.zzcha != null) {
                    this.zzbsb.zza(new zzaax(this.zzcha));
                }
                if (this.zzchj != null) {
                    this.zzbsb.zza(new zzasu(this.zzchj));
                }
                this.zzbsb.zza(new zzyz(this.zzchd));
                this.zzbsb.setImmersiveMode(this.zzbmf);
            }
            if (this.zzbsb.zza(zzuk.zza(this.zzvf, zzxtVar))) {
                this.zzbse.zzf(zzxtVar.zzqk());
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzcee = adListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(adListener != null ? new zzuf(adListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zza(zzub zzubVar) {
        try {
            this.zzceb = zzubVar;
            if (this.zzbsb != null) {
                this.zzbsb.zza(zzubVar != null ? new zzua(zzubVar) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzbsc != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzbsc = str;
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        try {
            this.zzcef = adMetadataListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(adMetadataListener != null ? new zzug(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            if (this.zzbsb != null) {
                return this.zzbsb.getAdMetadata();
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzblk = appEventListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(appEventListener != null ? new zzuq(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzcha = onCustomRenderedAdLoadedListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(onCustomRenderedAdLoadedListener != null ? new zzaax(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzchj = rewardedVideoAdListener;
            if (this.zzbsb != null) {
                this.zzbsb.zza(rewardedVideoAdListener != null ? new zzasu(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void zzd(boolean z) {
        this.zzchk = true;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbsb != null) {
                return this.zzbsb.zzkh();
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzxg zzxgVar = null;
        try {
            if (this.zzbsb != null) {
                zzxgVar = this.zzbsb.zzki();
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
        return ResponseInfo.zza(zzxgVar);
    }

    public final void show() {
        try {
            zzcp("show");
            this.zzbsb.showInterstitial();
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzbmf = z;
            if (this.zzbsb != null) {
                this.zzbsb.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzazw.zze("#008 Must be called on the main UI thread.", e);
        }
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

    private final void zzcp(String str) {
        if (this.zzbsb != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }
}
