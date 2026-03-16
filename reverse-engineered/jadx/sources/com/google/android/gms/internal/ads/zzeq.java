package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeq implements Runnable {
    private final /* synthetic */ zzeo zzyz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(zzeo zzeoVar) {
        this.zzyz = zzeoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzyz.zzcr();
    }
}
