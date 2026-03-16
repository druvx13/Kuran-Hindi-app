package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzamn implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzalv zzdgy;
    private final /* synthetic */ zzaml zzdgz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamn(zzaml zzamlVar, zzalv zzalvVar) {
        this.zzdgz = zzamlVar;
        this.zzdgy = zzalvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            this.zzdgz.zzdgt = mediationRewardedAd;
            this.zzdgy.onAdLoaded();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
        return new zzauc(this.zzdgy);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzdgz.zzdgp;
            String canonicalName = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            zzazw.zzed(sb.toString());
            this.zzdgy.zzc(0, str);
            this.zzdgy.onAdFailedToLoad(0);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
