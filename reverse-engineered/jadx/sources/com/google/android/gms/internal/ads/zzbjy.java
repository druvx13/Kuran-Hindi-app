package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbjy implements zzbjx {
    private zzawt zzduw;

    public zzbjy(zzawt zzawtVar) {
        this.zzduw = zzawtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjx
    public final void zzl(Map<String, String> map) {
        this.zzduw.zzap(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
