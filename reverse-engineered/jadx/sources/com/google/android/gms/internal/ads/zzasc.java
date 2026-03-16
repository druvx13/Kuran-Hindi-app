package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzasc implements zzarn {
    private zzakh<JSONObject, JSONObject> zzdqu;
    private zzakh<JSONObject, JSONObject> zzdqz;

    public zzasc(Context context) {
        this.zzdqz = com.google.android.gms.ads.internal.zzq.zzlj().zza(context, zzazz.zzyi()).zza("google.afma.request.getAdDictionary", zzakk.zzddu, zzakk.zzddu);
        this.zzdqu = com.google.android.gms.ads.internal.zzq.zzlj().zza(context, zzazz.zzyi()).zza("google.afma.sdkConstants.getSdkConstants", zzakk.zzddu, zzakk.zzddu);
    }

    @Override // com.google.android.gms.internal.ads.zzarn
    public final zzakh<JSONObject, JSONObject> zzuu() {
        return this.zzdqu;
    }
}
