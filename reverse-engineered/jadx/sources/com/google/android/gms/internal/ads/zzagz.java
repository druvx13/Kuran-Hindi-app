package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagz implements Runnable {
    private final /* synthetic */ zzagu zzdbf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagz(zzagu zzaguVar) {
        this.zzdbf = zzaguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdbf.disconnect();
    }
}
