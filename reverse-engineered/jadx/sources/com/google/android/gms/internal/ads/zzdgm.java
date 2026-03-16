package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgm {
    private final Clock zzbnt;
    private final Object lock = new Object();
    private volatile int zzgti = zzdgl.zzgte;
    private volatile long zzdup = 0;

    public zzdgm(Clock clock) {
        this.zzbnt = clock;
    }

    private final void zzr(int i, int i2) {
        zzarr();
        long currentTimeMillis = this.zzbnt.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzgti != i) {
                return;
            }
            this.zzgti = i2;
            if (this.zzgti == zzdgl.zzgtg) {
                this.zzdup = currentTimeMillis;
            }
        }
    }

    private final void zzarr() {
        long currentTimeMillis = this.zzbnt.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzgti == zzdgl.zzgtg) {
                if (this.zzdup + ((Long) zzvj.zzpv().zzd(zzzz.zzcsm)).longValue() <= currentTimeMillis) {
                    this.zzgti = zzdgl.zzgte;
                }
            }
        }
    }

    public final void zzbn(boolean z) {
        if (z) {
            zzr(zzdgl.zzgte, zzdgl.zzgtf);
        } else {
            zzr(zzdgl.zzgtf, zzdgl.zzgte);
        }
    }

    public final boolean zzars() {
        boolean z;
        synchronized (this.lock) {
            zzarr();
            z = this.zzgti == zzdgl.zzgtf;
        }
        return z;
    }

    public final boolean zzart() {
        boolean z;
        synchronized (this.lock) {
            zzarr();
            z = this.zzgti == zzdgl.zzgtg;
        }
        return z;
    }

    public final void zzvx() {
        zzr(zzdgl.zzgtf, zzdgl.zzgtg);
    }
}
