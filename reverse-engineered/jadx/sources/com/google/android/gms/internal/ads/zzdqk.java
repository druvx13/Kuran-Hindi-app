package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqd;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqk<V> extends zzdqd<Object, V> {
    private zzdqm<?> zzhhp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqk(zzdot<? extends zzdri<?>> zzdotVar, boolean z, Executor executor, Callable<V> callable) {
        super(zzdotVar, z, false);
        this.zzhhp = new zzdqn(this, callable, executor);
        zzawi();
    }

    @Override // com.google.android.gms.internal.ads.zzdqd
    final void zzb(int i, @NullableDecl Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqd
    final void zzawj() {
        zzdqm<?> zzdqmVar = this.zzhhp;
        if (zzdqmVar != null) {
            zzdqmVar.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdqd
    public final void zza(zzdqd.zza zzaVar) {
        super.zza(zzaVar);
        if (zzaVar == zzdqd.zza.OUTPUT_FUTURE_DONE) {
            this.zzhhp = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpw
    protected final void interruptTask() {
        zzdqm<?> zzdqmVar = this.zzhhp;
        if (zzdqmVar != null) {
            zzdqmVar.interruptTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzdqm zza(zzdqk zzdqkVar, zzdqm zzdqmVar) {
        zzdqkVar.zzhhp = null;
        return null;
    }
}
