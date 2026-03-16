package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagv extends zzgi implements zzags {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzags
    public final void zza(zzagm zzagmVar, zzagq zzagqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzagmVar);
        zzgj.zza(obtainAndWriteInterfaceToken, zzagqVar);
        zzb(2, obtainAndWriteInterfaceToken);
    }
}
