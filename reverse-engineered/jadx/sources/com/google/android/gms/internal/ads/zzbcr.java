package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbcr implements zzhj {
    private int zzbgj;
    private final zzny zzefl;
    private long zzefm;
    private long zzefn;
    private long zzefo;
    private long zzefp;
    private boolean zzefq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcr() {
        this(15000, 30000, 2500L, 5000L);
    }

    private zzbcr(int i, int i2, long j, long j2) {
        this.zzefl = new zzny(true, 65536);
        this.zzefm = 15000000L;
        this.zzefn = 30000000L;
        this.zzefo = 2500000L;
        this.zzefp = 5000000L;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzfa() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zza(zzhk[] zzhkVarArr, zzna zznaVar, zznl zznlVar) {
        this.zzbgj = 0;
        for (int i = 0; i < zzhkVarArr.length; i++) {
            if (zznlVar.zzba(i) != null) {
                this.zzbgj += zzov.zzbm(zzhkVarArr[i].getTrackType());
            }
        }
        this.zzefl.zzbc(this.zzbgj);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void onStopped() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzfb() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final zzns zzfc() {
        return this.zzefl;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final synchronized boolean zzc(long j, boolean z) {
        long j2;
        j2 = z ? this.zzefp : this.zzefo;
        return j2 <= 0 || j >= j2;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final synchronized boolean zzdt(long j) {
        boolean z;
        char c;
        z = false;
        if (j > this.zzefn) {
            c = 0;
        } else {
            c = j < this.zzefm ? (char) 2 : (char) 1;
        }
        boolean z2 = this.zzefl.zziq() >= this.zzbgj;
        if (c == 2 || (c == 1 && this.zzefq && !z2)) {
            z = true;
        }
        this.zzefq = z;
        return z;
    }

    public final synchronized void zzdl(int i) {
        this.zzefm = i * 1000;
    }

    public final synchronized void zzdm(int i) {
        this.zzefn = i * 1000;
    }

    public final synchronized void zzdg(int i) {
        this.zzefo = i * 1000;
    }

    public final synchronized void zzdh(int i) {
        this.zzefp = i * 1000;
    }

    private final void zzk(boolean z) {
        this.zzbgj = 0;
        this.zzefq = false;
        if (z) {
            this.zzefl.reset();
        }
    }
}
