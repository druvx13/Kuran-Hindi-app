package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbbs {
    private long zzeci;
    private final long zzech = TimeUnit.MILLISECONDS.toNanos(((Long) zzvj.zzpv().zzd(zzzz.zzcjq)).longValue());
    private boolean zzecj = true;

    public final void zzyq() {
        this.zzecj = true;
    }

    public final void zza(SurfaceTexture surfaceTexture, zzbbf zzbbfVar) {
        if (zzbbfVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzecj || Math.abs(timestamp - this.zzeci) >= this.zzech) {
            this.zzecj = false;
            this.zzeci = timestamp;
            zzaxa.zzdwf.post(new zzbbr(this, zzbbfVar));
        }
    }
}
