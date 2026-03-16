package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcdm implements zzacg {
    private final /* synthetic */ zzcdn zzfwb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdm(zzcdn zzcdnVar) {
        this.zzfwb = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    public final void zzc(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    public final void zzrx() {
        zzbzm zzbzmVar;
        zzbzm zzbzmVar2;
        zzbzmVar = this.zzfwb.zzftd;
        if (zzbzmVar != null) {
            zzbzmVar2 = this.zzfwb.zzftd;
            zzbzmVar2.zzfx(NativeCustomTemplateAd.ASSET_NAME_VIDEO);
        }
    }
}
