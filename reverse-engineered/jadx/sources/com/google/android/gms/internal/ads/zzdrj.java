package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdrj implements Executor {
    boolean zzhie = true;
    private final /* synthetic */ Executor zzhif;
    private final /* synthetic */ zzdpw zzhig;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrj(Executor executor, zzdpw zzdpwVar) {
        this.zzhif = executor;
        this.zzhig = zzdpwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zzhif.execute(new zzdrm(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.zzhie) {
                this.zzhig.setException(e);
            }
        }
    }
}
