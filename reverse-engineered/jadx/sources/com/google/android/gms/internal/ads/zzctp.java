package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctp implements zzbqx, zzbrc, zzbrp, zzbsm, zzub {
    private zzvm zzgjt;

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzb(zzasd zzasdVar, String str, String str2) {
    }

    public final synchronized void zzc(zzvm zzvmVar) {
        this.zzgjt = zzvmVar;
    }

    public final synchronized zzvm zzapl() {
        return this.zzgjt;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final synchronized void onAdClosed() {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdClosed();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdClosed.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final synchronized void onAdFailedToLoad(int i) {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final synchronized void onAdLeftApplication() {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdLeftApplication();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final synchronized void onAdLoaded() {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdLoaded();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final synchronized void onAdOpened() {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdOpened();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdOpened.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final synchronized void onAdClicked() {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdClicked();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final synchronized void onAdImpression() {
        if (this.zzgjt != null) {
            try {
                this.zzgjt.onAdImpression();
            } catch (RemoteException e) {
                zzawr.zzd("Remote Exception at onAdImpression.", e);
            }
        }
    }
}
