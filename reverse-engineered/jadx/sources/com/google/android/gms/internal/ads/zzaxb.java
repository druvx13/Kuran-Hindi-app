package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaxb implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzaxa zzdwj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxb(zzaxa zzaxaVar, Context context) {
        this.zzdwj = zzaxaVar;
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.zzdwj.zzdwg;
        synchronized (obj) {
            this.zzdwj.zzbft = zzaxa.zzaq(this.val$context);
            obj2 = this.zzdwj.zzdwg;
            obj2.notifyAll();
        }
    }
}
