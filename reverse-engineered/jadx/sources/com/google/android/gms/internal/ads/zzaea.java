package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaea extends zzgi implements zzady {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final void zza(zzado zzadoVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, zzadoVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(1, obtainAndWriteInterfaceToken);
    }
}
