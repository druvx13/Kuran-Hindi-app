package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqa<I, O> extends zzdpy<I, O, zzdnx<? super I, ? extends O>, O> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqa(zzdri<? extends I> zzdriVar, zzdnx<? super I, ? extends O> zzdnxVar) {
        super(zzdriVar, zzdnxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    final void setResult(@NullableDecl O o) {
        set(o);
    }

    @Override // com.google.android.gms.internal.ads.zzdpy
    @NullableDecl
    final /* synthetic */ Object zzc(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzdnx) obj).apply(obj2);
    }
}
