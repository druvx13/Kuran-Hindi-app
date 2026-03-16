package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpx<V, X extends Throwable> extends zzdpv<V, X, zzdnx<? super X, ? extends V>, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpx(zzdri<? extends V> zzdriVar, Class<X> cls, zzdnx<? super X, ? extends V> zzdnxVar) {
        super(zzdriVar, cls, zzdnxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdpv
    final void setResult(@NullableDecl V v) {
        set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzdpv
    @NullableDecl
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        return ((zzdnx) obj).apply(th);
    }
}
