package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcos extends zzasx implements zzbsf {
    private zzasy zzgfk;
    private zzbsi zzgfl;
    private zzbwg zzgfm;

    public final synchronized void zza(zzasy zzasyVar) {
        this.zzgfk = zzasyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsf
    public final synchronized void zza(zzbsi zzbsiVar) {
        this.zzgfl = zzbsiVar;
    }

    public final synchronized void zza(zzbwg zzbwgVar) {
        this.zzgfm = zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzaf(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzaf(iObjectWrapper);
        }
        if (this.zzgfm != null) {
            this.zzgfm.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzd(iObjectWrapper, i);
        }
        if (this.zzgfm != null) {
            this.zzgfm.zzdq(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzai(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zza(IObjectWrapper iObjectWrapper, zzatc zzatcVar) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zza(iObjectWrapper, zzatcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzak(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzaj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zze(iObjectWrapper, i);
        }
        if (this.zzgfl != null) {
            this.zzgfl.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzal(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzam(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzah(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzah(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzag(iObjectWrapper);
        }
        if (this.zzgfl != null) {
            this.zzgfl.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzgfk != null) {
            this.zzgfk.zzb(bundle);
        }
    }
}
