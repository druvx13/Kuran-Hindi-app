package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzju implements zzjr {
    private final long zzaht;

    public zzju(long j) {
        this.zzaht = j;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final boolean isSeekable() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final long zzdz(long j) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final long getDurationUs() {
        return this.zzaht;
    }
}
