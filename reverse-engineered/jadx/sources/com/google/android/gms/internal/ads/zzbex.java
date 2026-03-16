package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbex implements Runnable {
    private final /* synthetic */ zzbev zzejh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbex(zzbev zzbevVar) {
        this.zzejh = zzbevVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbek zzbekVar;
        zzbekVar = this.zzejh.zzeje;
        zzbekVar.destroy();
    }
}
