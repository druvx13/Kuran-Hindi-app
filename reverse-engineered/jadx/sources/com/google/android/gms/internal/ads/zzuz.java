package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzuz extends zzvg<zzapg> {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ zzuu zzcfq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzuz(zzuu zzuuVar, Activity activity) {
        this.zzcfq = zzuuVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzapg zzpm() {
        zzuu.zza(this.val$activity, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzapg zzpn() throws RemoteException {
        zzape zzapeVar;
        zzapeVar = this.zzcfq.zzcfl;
        return zzapeVar.zzc(this.val$activity);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzapg zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zzb(ObjectWrapper.wrap(this.val$activity));
    }
}
