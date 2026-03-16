package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnw<AdT> implements zzbnx<AdT> {
    private final Map<String, zzcnj<AdT>> zzfku;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbnw(Map<String, zzcnj<AdT>> map) {
        this.zzfku = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzcnj<AdT> zze(int i, String str) {
        return this.zzfku.get(str);
    }
}
