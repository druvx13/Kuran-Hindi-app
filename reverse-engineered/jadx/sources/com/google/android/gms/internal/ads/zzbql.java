package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbql implements zzegz<Bundle> {
    private final zzbqj zzfmy;

    private zzbql(zzbqj zzbqjVar) {
        this.zzfmy = zzbqjVar;
    }

    public static zzbql zzi(zzbqj zzbqjVar) {
        return new zzbql(zzbqjVar);
    }

    public static Bundle zzj(zzbqj zzbqjVar) {
        return zzbqjVar.zzaip();
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return this.zzfmy.zzaip();
    }
}
