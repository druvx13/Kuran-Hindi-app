package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbep implements com.google.android.gms.ads.internal.overlay.zzo {
    private com.google.android.gms.ads.internal.overlay.zzo zzdkt;
    private zzbek zzeim;

    public zzbep(zzbek zzbekVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzeim = zzbekVar;
        this.zzdkt = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzua() {
        this.zzdkt.zzua();
        this.zzeim.zzum();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zztz() {
        this.zzdkt.zztz();
        this.zzeim.zzabc();
    }
}
