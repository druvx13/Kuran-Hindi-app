package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaoh implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzalv zzdhr;
    private final /* synthetic */ zzaoa zzdhs;
    private final /* synthetic */ zzanq zzdhx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoh(zzaoa zzaoaVar, zzanq zzanqVar, zzalv zzalvVar) {
        this.zzdhs = zzaoaVar;
        this.zzdhx = zzanqVar;
        this.zzdhr = zzalvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        if (mediationRewardedAd == null) {
            zzazw.zzfc("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdhx.zzdo("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzazw.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdhs.zzdgt = mediationRewardedAd;
            this.zzdhx.zzty();
        } catch (RemoteException e2) {
            zzazw.zzc("", e2);
        }
        return new zzaog(this.zzdhr);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdhx.zzdo(str);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
