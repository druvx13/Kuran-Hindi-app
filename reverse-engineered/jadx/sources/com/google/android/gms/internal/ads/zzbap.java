package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbap<T> implements zzdqx<T> {
    private final /* synthetic */ zzbaq zzead;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbap(zzbaq zzbaqVar) {
        this.zzead = zzbaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void onSuccess(T t) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzead.zzeaf;
        atomicInteger.set(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzead.zzeaf;
        atomicInteger.set(-1);
    }
}
