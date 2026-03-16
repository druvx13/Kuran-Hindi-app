package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbad implements Executor {
    private final Handler zzdzx = new zzawu(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzq.zzkw();
                zzaxa.zza(com.google.android.gms.ads.internal.zzq.zzla().getApplicationContext(), th);
                throw th;
            }
        }
        this.zzdzx.post(runnable);
    }
}
