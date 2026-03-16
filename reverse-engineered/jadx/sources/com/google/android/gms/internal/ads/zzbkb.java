package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkb implements zzbjx {
    private final zzdgm zzfgh;

    public zzbkb(zzdgm zzdgmVar) {
        this.zzfgh = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zzl(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzfgh.zzbn(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
