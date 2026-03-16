package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzuw extends zzvg<zzatf> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcfo;
    private final /* synthetic */ zzalp zzcfp;
    private final /* synthetic */ zzuu zzcfq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuw(zzuu zzuuVar, Context context, String str, zzalp zzalpVar) {
        this.zzcfq = zzuuVar;
        this.val$context = context;
        this.zzcfo = str;
        this.zzcfp = zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzatf zzpm() {
        zzuu.zza(this.val$context, "rewarded");
        return new zzys();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzatf zzpn() throws RemoteException {
        return zzatv.zzd(this.val$context, this.zzcfo, this.zzcfp);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzatf zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zzb(ObjectWrapper.wrap(this.val$context), this.zzcfo, this.zzcfp, 201004000);
    }
}
