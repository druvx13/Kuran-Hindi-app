package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzlx implements Runnable {
    private final /* synthetic */ zzly zzbau;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlx(zzly zzlyVar) {
        this.zzbau = zzlyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbau.zzhs();
    }
}
