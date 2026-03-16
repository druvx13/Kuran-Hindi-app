package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzazo extends Thread {
    private final /* synthetic */ String zzdxx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazo(zzazl zzazlVar, String str) {
        this.zzdxx = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzbaa().zzeq(this.zzdxx);
    }
}
