package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzjk implements zzjr {
    private final int length;
    private final long zzaht;
    private final int[] zzanx;
    private final long[] zzany;
    private final long[] zzanz;
    private final long[] zzaoa;

    public zzjk(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzanx = iArr;
        this.zzany = jArr;
        this.zzanz = jArr2;
        this.zzaoa = jArr3;
        int length = iArr.length;
        this.length = length;
        if (length > 0) {
            this.zzaht = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.zzaht = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final long getDurationUs() {
        return this.zzaht;
    }

    @Override // com.google.android.gms.internal.ads.zzjr
    public final long zzdz(long j) {
        return this.zzany[zzov.zza(this.zzaoa, j, true, true)];
    }
}
