package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcum implements zzdnx {
    static final zzdnx zzdsc = new zzcum();

    private zzcum() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnx
    public final Object apply(Object obj) {
        String optString;
        optString = ((JSONObject) obj).optString("nas");
        return optString;
    }
}
