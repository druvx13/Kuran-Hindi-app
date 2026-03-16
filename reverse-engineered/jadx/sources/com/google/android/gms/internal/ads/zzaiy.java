package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaiy implements Runnable {
    private final /* synthetic */ String zzdch;
    private final /* synthetic */ zzaiu zzdci;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaiy(zzaiu zzaiuVar, String str) {
        this.zzdci = zzaiuVar;
        this.zzdch = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbek zzbekVar;
        zzbekVar = this.zzdci.zzdce;
        zzbekVar.loadData(this.zzdch, "text/html", "UTF-8");
    }
}
