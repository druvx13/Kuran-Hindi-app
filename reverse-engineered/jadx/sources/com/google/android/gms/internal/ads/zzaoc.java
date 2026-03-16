package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzaoc implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    private final /* synthetic */ zzank zzdhq;
    private final /* synthetic */ zzalv zzdhr;
    private final /* synthetic */ zzaoa zzdhs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoc(zzaoa zzaoaVar, zzank zzankVar, zzalv zzalvVar) {
        this.zzdhs = zzaoaVar;
        this.zzdhq = zzankVar;
        this.zzdhr = zzalvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzazw.zzfc("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdhq.zzdo("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazw.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdhs.zzdho = mediationInterstitialAd;
            this.zzdhq.zzty();
        } catch (RemoteException e2) {
            zzazw.zzc("", e2);
        }
        return new zzaog(this.zzdhr);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdhq.zzdo(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
