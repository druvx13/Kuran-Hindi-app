package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzakv implements zzagi {
    private final /* synthetic */ zzakq zzdef;
    private final zzajs zzdei;
    private final zzbaj<O> zzdej;

    public zzakv(zzakq zzakqVar, zzajs zzajsVar, zzbaj<O> zzbajVar) {
        this.zzdef = zzakqVar;
        this.zzdei = zzajsVar;
        this.zzdej = zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzc(JSONObject jSONObject) {
        zzakj zzakjVar;
        try {
            try {
                zzbaj<O> zzbajVar = this.zzdej;
                zzakjVar = this.zzdef.zzdea;
                zzbajVar.set(zzakjVar.zzd(jSONObject));
                this.zzdei.release();
            } catch (IllegalStateException unused) {
                this.zzdei.release();
            } catch (JSONException e) {
                this.zzdej.setException(e);
                this.zzdei.release();
            }
        } catch (Throwable th) {
            this.zzdei.release();
            throw th;
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
        } finally {
            this.zzdei.release();
        }
    }
}
