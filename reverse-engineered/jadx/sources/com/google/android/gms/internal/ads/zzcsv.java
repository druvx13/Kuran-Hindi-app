package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcsv implements com.google.android.gms.ads.internal.zze {
    private final /* synthetic */ zzbwu zzgip;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsv(zzcsq zzcsqVar, zzbwu zzbwuVar) {
        this.zzgip = zzbwuVar;
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjy() {
        this.zzgip.zzaej().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjz() {
        this.zzgip.zzaek().onAdImpression();
        this.zzgip.zzael().zzajr();
    }
}
