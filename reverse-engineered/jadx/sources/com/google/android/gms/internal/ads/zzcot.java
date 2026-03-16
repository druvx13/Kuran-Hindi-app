package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcot extends zzalu implements zzbsf {
    private zzalv zzdhw;
    private zzbsi zzgfl;

    public final synchronized void zzb(zzalv zzalvVar) {
        this.zzdhw = zzalvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final synchronized void zza(zzbsi zzbsiVar) {
        this.zzgfl = zzbsiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdClicked() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdClosed() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdFailedToLoad(i);
        }
        if (this.zzgfl != null) {
            this.zzgfl.zzg(i, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zzc(int i, String str) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zzc(i, str);
        }
        if (this.zzgfl != null) {
            this.zzgfl.zzg(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdOpened() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdLoaded();
        }
        if (this.zzgfl != null) {
            this.zzgfl.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zza(zzalw zzalwVar) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zza(zzalwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAdImpression() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zza(zzado zzadoVar, String str) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zza(zzadoVar, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onVideoEnd() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onVideoEnd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zzdl(String str) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zzdl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zztp() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zztp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onVideoPlay();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zzb(zzatc zzatcVar) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zzb(zzatcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void onVideoPause() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.onVideoPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zzb(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zztq() throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zztq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zzcx(int i) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zzcx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zzdm(String str) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zzdm(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalv
    public final synchronized void zza(zzate zzateVar) throws RemoteException {
        if (this.zzdhw != null) {
            this.zzdhw.zza(zzateVar);
        }
    }
}
