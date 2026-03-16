package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzrt extends AppOpenAd {
    private final zzrm zzbsa;

    public zzrt(zzrm zzrmVar) {
        this.zzbsa = zzrmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final zzvz zzdv() {
        try {
            return this.zzbsa.zzdv();
        } catch (RemoteException e) {
            zzazw.zzc("", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void zza(zzrs zzrsVar) {
        try {
            this.zzbsa.zza(zzrsVar);
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
