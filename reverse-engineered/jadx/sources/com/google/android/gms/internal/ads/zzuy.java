package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzuy extends zzvg<zzvz> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzcfo;
    private final /* synthetic */ zzalp zzcfp;
    private final /* synthetic */ zzuu zzcfq;
    private final /* synthetic */ zzum zzcfr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuy(zzuu zzuuVar, Context context, zzum zzumVar, String str, zzalp zzalpVar) {
        this.zzcfq = zzuuVar;
        this.val$context = context;
        this.zzcfr = zzumVar;
        this.zzcfo = str;
        this.zzcfp = zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvz zzpm() {
        zzuu.zza(this.val$context, FirebaseAnalytics.Event.APP_OPEN);
        return new zzym();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvz zzpn() throws RemoteException {
        zzuh zzuhVar;
        zzuhVar = this.zzcfq.zzcff;
        return zzuhVar.zza(this.val$context, this.zzcfr, this.zzcfo, this.zzcfp, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzvz zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zzc(ObjectWrapper.wrap(this.val$context), this.zzcfr, this.zzcfo, this.zzcfp, 201004000);
    }
}
