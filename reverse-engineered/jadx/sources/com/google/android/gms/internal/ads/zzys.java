package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzys extends zzati {
    @Override // com.google.android.gms.internal.ads.zzatf
    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzatk zzatkVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzats zzatsVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzaua zzauaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzxa zzxaVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzxf zzxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzxg zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final zzate zzqt() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza(zzuj zzujVar, zzatn zzatnVar) throws RemoteException {
        zza(zzatnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzb(zzuj zzujVar, zzatn zzatnVar) throws RemoteException {
        zza(zzatnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    private static void zza(final zzatn zzatnVar) {
        zzazw.zzfa("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazm.zzzn.post(new Runnable(zzatnVar) { // from class: com.google.android.gms.internal.ads.zzyv
            private final zzatn zzchz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzchz = zzatnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzatn zzatnVar2 = this.zzchz;
                if (zzatnVar2 != null) {
                    try {
                        zzatnVar2.onRewardedAdFailedToLoad(1);
                    } catch (RemoteException e) {
                        zzazw.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }
}
