package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzvf extends zzvg<zzacw> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzuu zzcfq;
    private final /* synthetic */ FrameLayout zzcfv;
    private final /* synthetic */ FrameLayout zzcfw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvf(zzuu zzuuVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzcfq = zzuuVar;
        this.zzcfv = frameLayout;
        this.zzcfw = frameLayout2;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    protected final /* synthetic */ zzacw zzpm() {
        zzuu.zza(this.val$context, "native_ad_view_delegate");
        return new zzyq();
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzacw zzpn() throws RemoteException {
        zzaew zzaewVar;
        zzaewVar = this.zzcfq.zzcfi;
        return zzaewVar.zzb(this.val$context, this.zzcfv, this.zzcfw);
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* synthetic */ zzacw zza(zzwi zzwiVar) throws RemoteException {
        return zzwiVar.zza(ObjectWrapper.wrap(this.zzcfv), ObjectWrapper.wrap(this.zzcfw));
    }
}
