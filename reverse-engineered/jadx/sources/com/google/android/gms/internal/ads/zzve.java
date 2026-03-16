package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzve extends zzvg<zzadd> {
    private final /* synthetic */ zzuu zzcfq;
    private final /* synthetic */ View zzcfs;
    private final /* synthetic */ HashMap zzcft;
    private final /* synthetic */ HashMap zzcfu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzve(zzuu zzuuVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzcfq = zzuuVar;
        this.zzcfs = view;
        this.zzcft = hashMap;
        this.zzcfu = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzadd zzpm() {
        zzuu.zza(this.zzcfs.getContext(), "native_ad_view_holder_delegate");
        return new zzyt();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzadd zzpn() throws RemoteException {
        zzaez zzaezVar;
        zzaezVar = this.zzcfq.zzcfm;
        return zzaezVar.zzb(this.zzcfs, this.zzcft, this.zzcfu);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzadd zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zza(ObjectWrapper.wrap(this.zzcfs), ObjectWrapper.wrap(this.zzcft), ObjectWrapper.wrap(this.zzcfu));
    }
}
