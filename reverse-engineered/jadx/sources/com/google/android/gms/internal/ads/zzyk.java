package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzyk extends zzvq {
    final /* synthetic */ zzyi zzcht;

    private zzyk(zzyi zzyiVar) {
        this.zzcht = zzyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final String zzkh() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzb(zzuj zzujVar) throws RemoteException {
        zza(zzujVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zza(zzuj zzujVar, int i) throws RemoteException {
        zzazw.zzfa("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazm.zzzn.post(new zzyn(this));
    }
}
