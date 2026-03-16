package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzakk {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final zzakl<JSONObject> zzddu = new zzakm();
    public static final zzakj<InputStream> zzddv = zzakn.zzddw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ InputStream zze(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(UTF_8));
    }
}
