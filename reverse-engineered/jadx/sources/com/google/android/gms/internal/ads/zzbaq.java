package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public class zzbaq<T> {
    private final zzbaj<T> zzeae = new zzbaj<>();
    private final AtomicInteger zzeaf = new AtomicInteger(0);

    public zzbaq() {
        zzdqw.zza(this.zzeae, new zzbap(this), zzbab.zzdzw);
    }

    @Deprecated
    public final void zza(zzban<T> zzbanVar, zzbal zzbalVar) {
        zzdqw.zza(this.zzeae, new zzbas(this, zzbanVar, zzbalVar), zzbab.zzdzw);
    }

    @Deprecated
    public final void zzm(T t) {
        this.zzeae.set(t);
    }

    @Deprecated
    public final void reject() {
        this.zzeae.setException(new Exception());
    }

    @Deprecated
    public final int getStatus() {
        return this.zzeaf.get();
    }
}
