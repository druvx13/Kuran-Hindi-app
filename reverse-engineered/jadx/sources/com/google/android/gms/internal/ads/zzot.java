package com.google.android.gms.internal.ads;

import android.os.SystemClock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzot implements zzol {
    private boolean started;
    private zzhl zzaek = zzhl.zzahe;
    private long zzbht;
    private long zzbhu;

    public final void start() {
        if (this.started) {
            return;
        }
        this.zzbhu = SystemClock.elapsedRealtime();
        this.started = true;
    }

    public final void stop() {
        if (this.started) {
            zzel(zzgb());
            this.started = false;
        }
    }

    public final void zzel(long j) {
        this.zzbht = j;
        if (this.started) {
            this.zzbhu = SystemClock.elapsedRealtime();
        }
    }

    public final void zza(zzol zzolVar) {
        zzel(zzolVar.zzgb());
        this.zzaek = zzolVar.zzfr();
    }

    @Override // com.google.android.gms.internal.ads.zzol
    public final long zzgb() {
        long zzdu;
        long j = this.zzbht;
        if (this.started) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzbhu;
            if (this.zzaek.zzahf == 1.0f) {
                zzdu = zzgr.zzdp(elapsedRealtime);
            } else {
                zzdu = this.zzaek.zzdu(elapsedRealtime);
            }
            return j + zzdu;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzol
    public final zzhl zzb(zzhl zzhlVar) {
        if (this.started) {
            zzel(zzgb());
        }
        this.zzaek = zzhlVar;
        return zzhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzol
    public final zzhl zzfr() {
        return this.zzaek;
    }
}
