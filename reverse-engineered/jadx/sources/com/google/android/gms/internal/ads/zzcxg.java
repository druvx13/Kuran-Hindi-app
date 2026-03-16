package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdah;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxg<S extends zzdah<?>> implements zzdak<S> {
    private final Clock zzbnt;
    private final AtomicReference<zzcxf<S>> zzgmu = new AtomicReference<>();
    private final zzdak<S> zzgmv;
    private final long zzgmw;

    public zzcxg(zzdak<S> zzdakVar, long j, Clock clock) {
        this.zzbnt = clock;
        this.zzgmv = zzdakVar;
        this.zzgmw = j;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<S> zzaqa() {
        zzcxf<S> zzcxfVar = this.zzgmu.get();
        if (zzcxfVar == null || zzcxfVar.hasExpired()) {
            zzcxfVar = new zzcxf<>(this.zzgmv.zzaqa(), this.zzgmw, this.zzbnt);
            this.zzgmu.set(zzcxfVar);
        }
        return zzcxfVar.zzgms;
    }
}
