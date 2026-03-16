package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawq implements Runnable {
    private final /* synthetic */ zzawn zzdvg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawq(zzawn zzawnVar) {
        this.zzdvg = zzawnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdvg.thread = Thread.currentThread();
        this.zzdvg.zzup();
    }
}
