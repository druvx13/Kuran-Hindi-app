package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfb implements com.google.android.gms.ads.internal.zzi {
    private final /* synthetic */ zzcey zzfxf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfb(zzcey zzceyVar) {
        this.zzfxf = zzceyVar;
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzkc() {
        zzbte zzbteVar;
        zzbteVar = this.zzfxf.zzfxb;
        zzbteVar.onPause();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzkd() {
        zzbte zzbteVar;
        zzbteVar = this.zzfxf.zzfxb;
        zzbteVar.onResume();
    }
}
