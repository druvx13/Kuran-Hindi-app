package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzahi implements AdapterStatus {
    private final String description;
    private final int zzdbi;
    private final AdapterStatus.State zzdbj;

    public zzahi(AdapterStatus.State state, String str, int i) {
        this.zzdbj = state;
        this.description = str;
        this.zzdbi = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.zzdbj;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.description;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.zzdbi;
    }
}
