package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcfi implements zzbwj {
    private final zzbek zzelg;

    private zzcfi(zzbek zzbekVar) {
        this.zzelg = zzbekVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbwj zzn(zzbek zzbekVar) {
        return new zzcfi(zzbekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwj
    public final void zzajs() {
        this.zzelg.destroy();
    }
}
