package com.google.android.gms.internal.ads;

import java.lang.Throwable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpu<V, X extends Throwable> extends zzdpv<V, X, zzdqj<? super X, ? extends V>, zzdri<? extends V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpu(zzdri<? extends V> zzdriVar, Class<X> cls, zzdqj<? super X, ? extends V> zzdqjVar) {
        super(zzdriVar, cls, zzdqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdpv
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdri) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdpv
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        zzdqj zzdqjVar = (zzdqj) obj;
        zzdri zzf = zzdqjVar.zzf(th);
        zzdoj.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdqjVar);
        return zzf;
    }
}
