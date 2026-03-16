package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzcsb extends zzalu {
    private final zzbsh zzfkr;
    private final zzbrx zzflh;
    private final zzbre zzfow;
    private final zzbsu zzfpb;
    private final zzbro zzfqc;
    private final zzbqw zzfqd;
    private final zzbtw zzfwo;
    private final zzbtp zzgho;
    private final zzbwi zzghy;

    public zzcsb(zzbqw zzbqwVar, zzbro zzbroVar, zzbrx zzbrxVar, zzbsh zzbshVar, zzbtw zzbtwVar, zzbsu zzbsuVar, zzbwi zzbwiVar, zzbtp zzbtpVar, zzbre zzbreVar) {
        this.zzfqd = zzbqwVar;
        this.zzfqc = zzbroVar;
        this.zzflh = zzbrxVar;
        this.zzfkr = zzbshVar;
        this.zzfwo = zzbtwVar;
        this.zzfpb = zzbsuVar;
        this.zzghy = zzbwiVar;
        this.zzgho = zzbtpVar;
        this.zzfow = zzbreVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdFailedToLoad(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(zzado zzadoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(zzalw zzalwVar) {
    }

    public void zza(zzate zzateVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    public void zzb(zzatc zzatcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzc(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzdl(String str) {
    }

    public void zztq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdClicked() {
        this.zzfqd.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdClosed() {
        this.zzfpb.zztz();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdLeftApplication() {
        this.zzflh.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdOpened() {
        this.zzfpb.zzua();
        this.zzgho.zzaiz();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAppEvent(String str, String str2) {
        this.zzfwo.onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdLoaded() {
        this.zzfkr.onAdLoaded();
    }

    public void onAdImpression() {
        this.zzfqc.onAdImpression();
        this.zzgho.zzaiy();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onVideoPause() {
        this.zzghy.onVideoPause();
    }

    public void zztp() {
        this.zzghy.onVideoStart();
    }

    public void onVideoEnd() {
        this.zzghy.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onVideoPlay() throws RemoteException {
        this.zzghy.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    @Deprecated
    public final void zzcx(int i) throws RemoteException {
        this.zzfow.zzf(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzdm(String str) {
        this.zzfow.zzf(0, str);
    }
}
