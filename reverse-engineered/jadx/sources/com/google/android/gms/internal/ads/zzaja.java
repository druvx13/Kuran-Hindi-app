package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaja implements Runnable {
    private final /* synthetic */ zzaiu zzdci;
    private final /* synthetic */ String zzdck;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaja(zzaiu zzaiuVar, String str) {
        this.zzdci = zzaiuVar;
        this.zzdck = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbek zzbekVar;
        zzbekVar = this.zzdci.zzdce;
        zzbekVar.loadUrl(this.zzdck);
    }
}
