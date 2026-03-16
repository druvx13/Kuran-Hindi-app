package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzvh extends zzvg<zzask> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzalp zzcfp;
    private final /* synthetic */ zzuu zzcfq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvh(zzuu zzuuVar, Context context, zzalp zzalpVar) {
        this.zzcfq = zzuuVar;
        this.val$context = context;
        this.zzcfp = zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzask zzpm() {
        zzuu.zza(this.val$context, "rewarded_video");
        return new zzyu();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzask zzpn() throws RemoteException {
        zzasr zzasrVar;
        zzasrVar = this.zzcfq.zzcfj;
        return zzasrVar.zza(this.val$context, this.zzcfp);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzask zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zza(ObjectWrapper.wrap(this.val$context), this.zzcfp, 201004000);
    }
}
