package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzart implements Callable<zzars> {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzaru zzdqr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzart(zzaru zzaruVar, Context context) {
        this.zzdqr = zzaruVar;
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzars call() throws Exception {
        WeakHashMap weakHashMap;
        zzars zzvb;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzdqr.zzdqs;
        zzarw zzarwVar = (zzarw) weakHashMap.get(this.val$context);
        if (zzarwVar != null) {
            if (!(zzarwVar.zzdqv + zzabf.zzcvx.get().longValue() < com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis())) {
                zzvb = new zzarr(this.val$context, zzarwVar.zzdqw).zzvb();
                weakHashMap2 = this.zzdqr.zzdqs;
                weakHashMap2.put(this.val$context, new zzarw(this.zzdqr, zzvb));
                return zzvb;
            }
        }
        zzvb = new zzarr(this.val$context).zzvb();
        weakHashMap2 = this.zzdqr.zzdqs;
        weakHashMap2.put(this.val$context, new zzarw(this.zzdqr, zzvb));
        return zzvb;
    }
}
