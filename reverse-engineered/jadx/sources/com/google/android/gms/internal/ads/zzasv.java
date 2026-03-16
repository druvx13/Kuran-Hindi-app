package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzasv implements RewardedVideoAd {
    private final zzask zzdrd;
    private String zzdrf;
    private String zzdrg;
    private final Context zzvf;
    private final Object lock = new Object();
    private final zzasu zzdre = new zzasu(null);

    public zzasv(Context context, zzask zzaskVar) {
        this.zzdrd = zzaskVar == null ? new zzyu() : zzaskVar;
        this.zzvf = context.getApplicationContext();
    }

    private final void zza(String str, zzxt zzxtVar) {
        synchronized (this.lock) {
            if (this.zzdrd == null) {
                return;
            }
            try {
                this.zzdrd.zza(zzuk.zza(this.zzvf, zzxtVar, str));
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, AdRequest adRequest) {
        zza(str, adRequest.zzdq());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        zza(str, publisherAdRequest.zzdq());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void show() {
        synchronized (this.lock) {
            if (this.zzdrd == null) {
                return;
            }
            try {
                this.zzdrd.show();
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.lock) {
            this.zzdre.setRewardedVideoAdListener(rewardedVideoAdListener);
            if (this.zzdrd != null) {
                try {
                    this.zzdrd.zza(this.zzdre);
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.lock) {
            if (this.zzdrd != null) {
                try {
                    this.zzdrd.zza(new zzug(adMetadataListener));
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final Bundle getAdMetadata() {
        synchronized (this.lock) {
            if (this.zzdrd != null) {
                try {
                    return this.zzdrd.getAdMetadata();
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setUserId(String str) {
        synchronized (this.lock) {
            this.zzdrf = str;
            if (this.zzdrd != null) {
                try {
                    this.zzdrd.setUserId(str);
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final boolean isLoaded() {
        synchronized (this.lock) {
            if (this.zzdrd == null) {
                return false;
            }
            try {
                return this.zzdrd.isLoaded();
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause() {
        pause(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause(Context context) {
        synchronized (this.lock) {
            if (this.zzdrd == null) {
                return;
            }
            try {
                this.zzdrd.zzj(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume() {
        resume(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume(Context context) {
        synchronized (this.lock) {
            if (this.zzdrd == null) {
                return;
            }
            try {
                this.zzdrd.zzk(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy() {
        destroy(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy(Context context) {
        synchronized (this.lock) {
            this.zzdre.setRewardedVideoAdListener(null);
            if (this.zzdrd == null) {
                return;
            }
            try {
                this.zzdrd.zzl(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzazw.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.lock) {
            rewardedVideoAdListener = this.zzdre.getRewardedVideoAdListener();
        }
        return rewardedVideoAdListener;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getUserId() {
        String str;
        synchronized (this.lock) {
            str = this.zzdrf;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getMediationAdapterClassName() {
        try {
            if (this.zzdrd != null) {
                return this.zzdrd.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setImmersiveMode(boolean z) {
        synchronized (this.lock) {
            if (this.zzdrd != null) {
                try {
                    this.zzdrd.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setCustomData(String str) {
        synchronized (this.lock) {
            if (this.zzdrd != null) {
                try {
                    this.zzdrd.setCustomData(str);
                    this.zzdrg = str;
                } catch (RemoteException e) {
                    zzazw.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getCustomData() {
        String str;
        synchronized (this.lock) {
            str = this.zzdrg;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final ResponseInfo getResponseInfo() {
        zzxg zzxgVar = null;
        try {
            if (this.zzdrd != null) {
                zzxgVar = this.zzdrd.zzki();
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzxgVar);
    }
}
