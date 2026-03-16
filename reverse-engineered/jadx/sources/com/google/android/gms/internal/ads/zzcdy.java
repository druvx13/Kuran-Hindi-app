package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdy implements com.google.android.gms.ads.internal.overlay.zzo, com.google.android.gms.ads.internal.overlay.zzt, zzafj, zzafl, zzub {
    private zzub zzceb;
    private zzafj zzczu;
    private zzafl zzczw;
    private com.google.android.gms.ads.internal.overlay.zzo zzdkt;
    private com.google.android.gms.ads.internal.overlay.zzt zzdkx;

    private zzcdy() {
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final synchronized void onAdClicked() {
        if (this.zzceb != null) {
            this.zzceb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zztz() {
        if (this.zzdkt != null) {
            this.zzdkt.zztz();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        if (this.zzdkt != null) {
            this.zzdkt.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        if (this.zzdkt != null) {
            this.zzdkt.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzua() {
        if (this.zzdkt != null) {
            this.zzdkt.zzua();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final synchronized void zzuq() {
        if (this.zzdkx != null) {
            this.zzdkx.zzuq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final synchronized void zza(String str, Bundle bundle) {
        if (this.zzczu != null) {
            this.zzczu.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzczw != null) {
            this.zzczw.onAppEvent(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zza(zzub zzubVar, zzafj zzafjVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzafl zzaflVar, com.google.android.gms.ads.internal.overlay.zzt zztVar) {
        this.zzceb = zzubVar;
        this.zzczu = zzafjVar;
        this.zzdkt = zzoVar;
        this.zzczw = zzaflVar;
        this.zzdkx = zztVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcdy(zzcdu zzcduVar) {
        this();
    }
}
