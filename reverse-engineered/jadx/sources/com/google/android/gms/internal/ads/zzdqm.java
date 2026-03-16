package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdqm<T> extends zzdre<T> {
    private final Executor zzhhq;
    boolean zzhhr = true;
    private final /* synthetic */ zzdqk zzhhs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqm(zzdqk zzdqkVar, Executor executor) {
        this.zzhhs = zzdqkVar;
        this.zzhhq = (Executor) zzdoj.checkNotNull(executor);
    }

    abstract void setValue(T t);

    @Override // com.google.android.gms.internal.ads.zzdre
    final boolean isDone() {
        return this.zzhhs.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void execute() {
        try {
            this.zzhhq.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.zzhhr) {
                this.zzhhs.setException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdre
    final void zzb(T t, Throwable th) {
        zzdqk.zza(this.zzhhs, (zzdqm) null);
        if (th != null) {
            if (th instanceof ExecutionException) {
                this.zzhhs.setException(th.getCause());
                return;
            } else if (th instanceof CancellationException) {
                this.zzhhs.cancel(false);
                return;
            } else {
                this.zzhhs.setException(th);
                return;
            }
        }
        setValue(t);
    }
}
