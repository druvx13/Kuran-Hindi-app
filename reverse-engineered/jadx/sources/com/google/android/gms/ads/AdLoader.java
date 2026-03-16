package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaci;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzafb;
import com.google.android.gms.internal.ads.zzafc;
import com.google.android.gms.internal.ads.zzafd;
import com.google.android.gms.internal.ads.zzafe;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzuf;
import com.google.android.gms.internal.ads.zzuk;
import com.google.android.gms.internal.ads.zzum;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzvr;
import com.google.android.gms.internal.ads.zzvs;
import com.google.android.gms.internal.ads.zzxt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class AdLoader {
    private final zzuk zzaca;
    private final zzvr zzacb;
    private final Context zzvf;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        private final zzvs zzabz;
        private final Context zzvf;

        @Deprecated
        public Builder withCorrelator(Correlator correlator) {
            return this;
        }

        public Builder(Context context, String str) {
            this((Context) Preconditions.checkNotNull(context, "context cannot be null"), zzvj.zzps().zzb(context, str, new zzalm()));
        }

        private Builder(Context context, zzvs zzvsVar) {
            this.zzvf = context;
            this.zzabz = zzvsVar;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzabz.zza(new zzafb(onContentAdLoadedListener));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to add content ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzabz.zza(new zzaey(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to add app install ad listener", e);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzabz.zza(new zzafe(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            try {
                this.zzabz.zza(str, new zzafd(onCustomTemplateAdLoadedListener), onCustomClickListener == null ? null : new zzafa(onCustomClickListener));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzabz.zza(new zzafc(onPublisherAdViewLoadedListener), new zzum(this.zzvf, adSizeArr));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzabz.zzb(new zzuf(adListener));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzabz.zza(new zzaci(nativeAdOptions));
            } catch (RemoteException e) {
                zzazw.zzd("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzabz.zza(publisherAdViewOptions);
            } catch (RemoteException e) {
                zzazw.zzd("Failed to specify DFP banner ad options", e);
            }
            return this;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zzvf, this.zzabz.zzqa());
            } catch (RemoteException e) {
                zzazw.zzc("Failed to build AdLoader.", e);
                return null;
            }
        }
    }

    AdLoader(Context context, zzvr zzvrVar) {
        this(context, zzvrVar, zzuk.zzcev);
    }

    private AdLoader(Context context, zzvr zzvrVar, zzuk zzukVar) {
        this.zzvf = context;
        this.zzacb = zzvrVar;
        this.zzaca = zzukVar;
    }

    private final void zza(zzxt zzxtVar) {
        try {
            this.zzacb.zzb(zzuk.zza(this.zzvf, zzxtVar));
        } catch (RemoteException e) {
            zzazw.zzc("Failed to load ad.", e);
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdq());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzacb.zza(zzuk.zza(this.zzvf, adRequest.zzdq()), i);
        } catch (RemoteException e) {
            zzazw.zzc("Failed to load ads.", e);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdq());
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzacb.zzkh();
        } catch (RemoteException e) {
            zzazw.zzd("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzacb.isLoading();
        } catch (RemoteException e) {
            zzazw.zzd("Failed to check if ad is loading.", e);
            return false;
        }
    }
}
