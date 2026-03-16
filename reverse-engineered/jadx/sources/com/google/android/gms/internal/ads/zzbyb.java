package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztf;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyb implements com.google.android.gms.ads.internal.overlay.zzo, zzbsm {
    private final zzazz zzbmo;
    private final zzbek zzdce;
    private final zzdgo zzfkd;
    private IObjectWrapper zzfke;
    private final zztf.zza.EnumC0025zza zzfpf;
    private final Context zzvf;

    public zzbyb(Context context, zzbek zzbekVar, zzdgo zzdgoVar, zzazz zzazzVar, zztf.zza.EnumC0025zza enumC0025zza) {
        this.zzvf = context;
        this.zzdce = zzbekVar;
        this.zzfkd = zzdgoVar;
        this.zzbmo = zzazzVar;
        this.zzfpf = enumC0025zza;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        if ((this.zzfpf == zztf.zza.EnumC0025zza.REWARD_BASED_VIDEO_AD || this.zzfpf == zztf.zza.EnumC0025zza.INTERSTITIAL) && this.zzfkd.zzdos && this.zzdce != null && com.google.android.gms.ads.internal.zzq.zzll().zzo(this.zzvf)) {
            int i = this.zzbmo.zzdzn;
            int i2 = this.zzbmo.zzdzo;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            IObjectWrapper zza = com.google.android.gms.ads.internal.zzq.zzll().zza(sb.toString(), this.zzdce.getWebView(), "", "javascript", this.zzfkd.zzgua.optInt("media_type", -1) == 0 ? null : "javascript");
            this.zzfke = zza;
            if (zza == null || this.zzdce.getView() == null) {
                return;
            }
            com.google.android.gms.ads.internal.zzq.zzll().zza(this.zzfke, this.zzdce.getView());
            this.zzdce.zzap(this.zzfke);
            com.google.android.gms.ads.internal.zzq.zzll().zzab(this.zzfke);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zztz() {
        this.zzfke = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzua() {
        zzbek zzbekVar;
        if (this.zzfke == null || (zzbekVar = this.zzdce) == null) {
            return;
        }
        zzbekVar.zza("onSdkImpression", new HashMap());
    }
}
