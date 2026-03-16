package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkd implements zzbjx {
    private final zzawt zzduw;

    public zzbkd(zzawt zzawtVar) {
        this.zzduw = zzawtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zzl(Map<String, String> map) {
        String str = map.get("value");
        if ("auto_collect_location".equals(map.get("key"))) {
            this.zzduw.zzaq(Boolean.parseBoolean(str));
        }
    }
}
