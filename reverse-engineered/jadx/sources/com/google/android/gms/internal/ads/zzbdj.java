package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbdj implements Runnable {
    private final /* synthetic */ zzbdk zzegm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdj(zzbdk zzbdkVar) {
        this.zzegm = zzbdkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzq.zzls().zzb(this.zzegm);
    }
}
