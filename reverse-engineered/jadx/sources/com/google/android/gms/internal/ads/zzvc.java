package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzvc extends zzvg<zzwp> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzuu zzcfq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvc(zzuu zzuuVar, Context context) {
        this.zzcfq = zzuuVar;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzwp zzpm() {
        zzuu.zza(this.val$context, "mobile_ads_settings");
        return new zzyo();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzwp zzpn() throws RemoteException {
        zzyj zzyjVar;
        zzyjVar = this.zzcfq.zzcfh;
        return zzyjVar.zzh(this.val$context);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzwp zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zza(ObjectWrapper.wrap(this.val$context), 201004000);
    }
}
