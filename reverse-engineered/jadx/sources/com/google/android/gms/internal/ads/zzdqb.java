package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqb<I, O> extends zzdpy<I, O, zzdqj<? super I, ? extends O>, zzdri<? extends O>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqb(zzdri<? extends I> zzdriVar, zzdqj<? super I, ? extends O> zzdqjVar) {
        super(zzdriVar, zzdqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdri) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    final /* synthetic */ Object zzc(Object obj, @NullableDecl Object obj2) throws Exception {
        zzdqj zzdqjVar = (zzdqj) obj;
        zzdri<O> zzf = zzdqjVar.zzf(obj2);
        zzdoj.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzdqjVar);
        return zzf;
    }
}
