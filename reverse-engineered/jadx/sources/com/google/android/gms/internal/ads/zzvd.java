package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzvd extends zzvg<zzvs> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcfo;
    private final /* synthetic */ zzalp zzcfp;
    private final /* synthetic */ zzuu zzcfq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvd(zzuu zzuuVar, Context context, String str, zzalp zzalpVar) {
        this.zzcfq = zzuuVar;
        this.val$context = context;
        this.zzcfo = str;
        this.zzcfp = zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzvs zzpm() {
        zzuu.zza(this.val$context, "native_ad");
        return new zzyi();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvs zzpn() throws RemoteException {
        zzue zzueVar;
        zzueVar = this.zzcfq.zzcfg;
        return zzueVar.zza(this.val$context, this.zzcfo, this.zzcfp);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvs zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zza(ObjectWrapper.wrap(this.val$context), this.zzcfo, this.zzcfp, 201004000);
    }
}
