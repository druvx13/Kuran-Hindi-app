package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzald implements zzagi {
    private final zzbaj<O> zzdej;
    private final /* synthetic */ zzalb zzdem;

    public zzald(zzalb zzalbVar, zzbaj<O> zzbajVar) {
        this.zzdem = zzalbVar;
        this.zzdej = zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzc(JSONObject jSONObject) {
        zzakj zzakjVar;
        try {
            zzbaj<O> zzbajVar = this.zzdej;
            zzakjVar = this.zzdem.zzdea;
            zzbajVar.set(zzakjVar.zzd(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzdej.setException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.zzdej.setException(new zzake());
            } else {
                this.zzdej.setException(new zzake(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
