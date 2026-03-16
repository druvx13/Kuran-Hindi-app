package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdqv<V> extends zzdqs<V> implements zzdri<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdqs
    /* renamed from: zzawq */
    public abstract zzdri<? extends V> zzawp();

    @Override // com.google.android.gms.internal.ads.zzdri
    public void addListener(Runnable runnable, Executor executor) {
        zzawp().addListener(runnable, executor);
    }
}
