package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzig extends zzih {
    private final AudioTimestamp zzakx;
    private long zzaky;
    private long zzakz;
    private long zzala;

    public zzig() {
        super(null);
        this.zzakx = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zza(AudioTrack audioTrack, boolean z) {
        super.zza(audioTrack, z);
        this.zzaky = 0L;
        this.zzakz = 0L;
        this.zzala = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final boolean zzfx() {
        boolean timestamp = this.zzajg.getTimestamp(this.zzakx);
        if (timestamp) {
            long j = this.zzakx.framePosition;
            if (this.zzakz > j) {
                this.zzaky++;
            }
            this.zzakz = j;
            this.zzala = j + (this.zzaky << 32);
        }
        return timestamp;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final long zzfy() {
        return this.zzakx.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final long zzfz() {
        return this.zzala;
    }
}
