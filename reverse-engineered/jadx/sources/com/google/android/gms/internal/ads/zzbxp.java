package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxp implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzbsu zzfpb;
    private final zzbvp zzfpc;

    public zzbxp(zzbsu zzbsuVar, zzbvp zzbvpVar) {
        this.zzfpb = zzbsuVar;
        this.zzfpc = zzbvpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zztz() {
        this.zzfpb.zztz();
        this.zzfpc.onHide();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        this.zzfpb.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        this.zzfpb.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzua() {
        this.zzfpb.zzua();
        this.zzfpc.zzajp();
    }
}
