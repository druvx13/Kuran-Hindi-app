package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcnu implements zzbnt {
    private final zzbek zzelg;

    private zzcnu(zzbek zzbekVar) {
        this.zzelg = zzbekVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbnt zzp(zzbek zzbekVar) {
        return new zzcnu(zzbekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final zzxl getVideoController() {
        return this.zzelg.zzzf();
    }
}
