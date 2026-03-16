package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnl implements zzbrp, zzbsm {
    private final zzazz zzbmo;
    private final zzbek zzdce;
    private final zzdgo zzfkd;
    private IObjectWrapper zzfke;
    private boolean zzfkf;
    private final Context zzvf;

    public zzbnl(Context context, zzbek zzbekVar, zzdgo zzdgoVar, zzazz zzazzVar) {
        this.zzvf = context;
        this.zzdce = zzbekVar;
        this.zzfkd = zzdgoVar;
        this.zzbmo = zzazzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final synchronized void onAdLoaded() {
        if (this.zzfkf) {
            return;
        }
        zzahw();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final synchronized void onAdImpression() {
        if (!this.zzfkf) {
            zzahw();
        }
        if (this.zzfkd.zzdos && this.zzfke != null && this.zzdce != null) {
            this.zzdce.zza("onSdkImpression", new ArrayMap());
        }
    }

    private final synchronized void zzahw() {
        if (this.zzfkd.zzdos) {
            if (this.zzdce == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzq.zzll().zzo(this.zzvf)) {
                int i = this.zzbmo.zzdzn;
                int i2 = this.zzbmo.zzdzo;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                this.zzfke = com.google.android.gms.ads.internal.zzq.zzll().zza(sb.toString(), this.zzdce.getWebView(), "", "javascript", this.zzfkd.zzgua.optInt("media_type", -1) == 0 ? null : "javascript");
                View view = this.zzdce.getView();
                if (this.zzfke != null && view != null) {
                    com.google.android.gms.ads.internal.zzq.zzll().zza(this.zzfke, view);
                    this.zzdce.zzap(this.zzfke);
                    com.google.android.gms.ads.internal.zzq.zzll().zzab(this.zzfke);
                    this.zzfkf = true;
                }
            }
        }
    }
}
