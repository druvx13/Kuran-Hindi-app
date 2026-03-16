package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzsa implements Runnable {
    private final /* synthetic */ zzrx zzbsk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsa(zzrx zzrxVar) {
        this.zzbsk = zzrxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbsk.disconnect();
    }
}
