package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbbr implements Runnable {
    private final /* synthetic */ zzbbf zzecg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbr(zzbbs zzbbsVar, zzbbf zzbbfVar) {
        this.zzecg = zzbbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzecg.zzyt();
    }
}
