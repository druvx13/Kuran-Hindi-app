package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcog extends zzani {
    private zzcnl<zzanv, zzcot> zzgey;
    private final /* synthetic */ zzcof zzgez;

    private zzcog(zzcof zzcofVar, zzcnl<zzanv, zzcot> zzcnlVar) {
        this.zzgez = zzcofVar;
        this.zzgey = zzcnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcof.zza(this.zzgez, (View) ObjectWrapper.unwrap(iObjectWrapper));
        this.zzgey.zzgel.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final void zzdo(String str) throws RemoteException {
        this.zzgey.zzgel.zzc(0, str);
    }
}
