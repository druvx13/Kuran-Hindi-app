package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdry<V> extends zzdre<V> {
    private final Callable<V> zzhht;
    private final /* synthetic */ zzdrw zzhir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdry(zzdrw zzdrwVar, Callable<V> callable) {
        this.zzhir = zzdrwVar;
        this.zzhht = (Callable) zzdoj.checkNotNull(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final boolean isDone() {
        return this.zzhir.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final V zzawn() throws Exception {
        return this.zzhht.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final void zzb(V v, Throwable th) {
        if (th == null) {
            this.zzhir.set(v);
        } else {
            this.zzhir.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final String zzawo() {
        return this.zzhht.toString();
    }
}
