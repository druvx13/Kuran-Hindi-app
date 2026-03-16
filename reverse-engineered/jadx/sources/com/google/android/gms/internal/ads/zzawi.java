package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawi {
    private final Object lock;
    private volatile int zzduo;
    private volatile long zzdup;

    private zzawi() {
        this.lock = new Object();
        this.zzduo = zzawh.zzduk;
        this.zzdup = 0L;
    }

    public final void zzvx() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzduo == zzawh.zzdum) {
                if (this.zzdup + ((Long) zzvj.zzpv().zzd(zzzz.zzcsm)).longValue() <= currentTimeMillis) {
                    this.zzduo = zzawh.zzduk;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzduo != 2) {
                return;
            }
            this.zzduo = 3;
            if (this.zzduo == zzawh.zzdum) {
                this.zzdup = currentTimeMillis2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzawi(zzawf zzawfVar) {
        this();
    }
}
