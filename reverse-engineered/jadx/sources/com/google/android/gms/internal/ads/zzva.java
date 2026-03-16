package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzva extends zzvg<zzvz> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcfo;
    private final /* synthetic */ zzalp zzcfp;
    private final /* synthetic */ zzuu zzcfq;
    private final /* synthetic */ zzum zzcfr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzva(zzuu zzuuVar, Context context, zzum zzumVar, String str, zzalp zzalpVar) {
        this.zzcfq = zzuuVar;
        this.val$context = context;
        this.zzcfr = zzumVar;
        this.zzcfo = str;
        this.zzcfp = zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvz zzpm() {
        zzuu.zza(this.val$context, "interstitial");
        return new zzym();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvz zzpn() throws RemoteException {
        zzuh zzuhVar;
        zzuhVar = this.zzcfq.zzcff;
        return zzuhVar.zza(this.val$context, this.zzcfr, this.zzcfo, this.zzcfp, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvz zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzcfr, this.zzcfo, this.zzcfp, 201004000);
    }
}
