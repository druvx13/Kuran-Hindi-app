package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzasz implements MediationRewardedVideoAdListener {
    private final zzasy zzdrh;

    public zzasz(zzasy zzasyVar) {
        this.zzdrh = zzasyVar;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onInitializationSucceeded.");
        try {
            this.zzdrh.zzaf(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onInitializationFailed.");
        try {
            this.zzdrh.zzd(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdLoaded.");
        try {
            this.zzdrh.zzag(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdOpened.");
        try {
            this.zzdrh.zzah(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onVideoStarted.");
        try {
            this.zzdrh.zzai(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdClosed.");
        try {
            this.zzdrh.zzaj(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onRewarded.");
        try {
            if (rewardItem != null) {
                this.zzdrh.zza(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), new zzatc(rewardItem));
            } else {
                this.zzdrh.zza(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), new zzatc("", 1));
            }
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdClicked.");
        try {
            this.zzdrh.zzak(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdFailedToLoad.");
        try {
            this.zzdrh.zze(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdLeftApplication.");
        try {
            this.zzdrh.zzal(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onVideoCompleted.");
        try {
            this.zzdrh.zzam(ObjectWrapper.wrap(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public final void zzb(Bundle bundle) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzazw.zzed("Adapter called onAdMetadataChanged.");
        try {
            this.zzdrh.zzb(bundle);
        } catch (RemoteException e) {
            zzazw.zze("#007 Could not call remote method.", e);
        }
    }
}
