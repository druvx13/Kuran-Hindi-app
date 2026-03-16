package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdrm implements Runnable {
    private final /* synthetic */ Runnable zzhii;
    private final /* synthetic */ zzdrj zzhij;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrm(zzdrj zzdrjVar, Runnable runnable) {
        this.zzhij = zzdrjVar;
        this.zzhii = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzhij.zzhie = false;
        this.zzhii.run();
    }
}
