package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbka implements zzbjx {
    private final Context zzvf;

    public zzbka(Context context) {
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zzl(Map<String, String> map) {
        CookieManager zzbf;
        String str = map.get("cookie");
        if (TextUtils.isEmpty(str) || (zzbf = com.google.android.gms.ads.internal.zzq.zzky().zzbf(this.zzvf)) == null) {
            return;
        }
        zzbf.setCookie("googleads.g.doubleclick.net", str);
    }
}
