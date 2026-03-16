package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdrv<V> extends zzdre<zzdri<V>> {
    private final zzdqh<V> zzhiq;
    private final /* synthetic */ zzdrw zzhir;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrv(zzdrw zzdrwVar, zzdqh<V> zzdqhVar) {
        this.zzhir = zzdrwVar;
        this.zzhiq = (zzdqh) zzdoj.checkNotNull(zzdqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final boolean isDone() {
        return this.zzhir.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final String zzawo() {
        return this.zzhiq.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final /* synthetic */ void zzb(Object obj, Throwable th) {
        zzdri<? extends V> zzdriVar = (zzdri) obj;
        if (th == null) {
            this.zzhir.setFuture(zzdriVar);
        } else {
            this.zzhir.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final /* synthetic */ Object zzawn() throws Exception {
        return (zzdri) zzdoj.zza(this.zzhiq.zzaql(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzhiq);
    }
}
