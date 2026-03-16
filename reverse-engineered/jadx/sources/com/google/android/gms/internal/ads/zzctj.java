package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctj extends zzvq {
    private final zzctt zzgjm;

    public zzctj(Context context, zzbgy zzbgyVar, zzdhg zzdhgVar, zzcae zzcaeVar, zzvm zzvmVar) {
        zzctv zzctvVar = new zzctv(zzcaeVar);
        zzctvVar.zzc(zzvmVar);
        this.zzgjm = new zzctt(new zzcub(zzbgyVar, context, zzctvVar, zzdhgVar), zzdhgVar.zzasa());
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgjm.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final void zzb(zzuj zzujVar) throws RemoteException {
        this.zzgjm.zza(zzujVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final synchronized void zza(zzuj zzujVar, int i) throws RemoteException {
        this.zzgjm.zza(zzujVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final synchronized String getMediationAdapterClassName() {
        return this.zzgjm.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzvr
    public final synchronized String zzkh() {
        return this.zzgjm.zzkh();
    }
}
