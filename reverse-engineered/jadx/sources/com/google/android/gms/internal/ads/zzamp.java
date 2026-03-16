package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzamp extends zzalu {
    private final zzasy zzdgr;
    private final Adapter zzdhb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamp(Adapter adapter, zzasy zzasyVar) {
        this.zzdhb = adapter;
        this.zzdgr = zzasyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdImpression() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdLeftApplication() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onVideoEnd() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onVideoPause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onVideoPlay() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(zzado zzadoVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(zzalw zzalwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzb(zzatc zzatcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzc(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzcx(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzdl(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zzdm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdLoaded() throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zzag(ObjectWrapper.wrap(this.zzdhb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdOpened() throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zzah(ObjectWrapper.wrap(this.zzdhb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdClosed() throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zzaj(ObjectWrapper.wrap(this.zzdhb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zza(zzate zzateVar) throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zza(ObjectWrapper.wrap(this.zzdhb), new zzatc(zzateVar.getType(), zzateVar.getAmount()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zztp() throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zzai(ObjectWrapper.wrap(this.zzdhb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void zztq() throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zzam(ObjectWrapper.wrap(this.zzdhb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdClicked() throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zzak(ObjectWrapper.wrap(this.zzdhb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzasy zzasyVar = this.zzdgr;
        if (zzasyVar != null) {
            zzasyVar.zze(ObjectWrapper.wrap(this.zzdhb), i);
        }
    }
}
