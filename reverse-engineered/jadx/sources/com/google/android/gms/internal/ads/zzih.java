package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzih {
    private int zzagt;
    protected AudioTrack zzajg;
    private boolean zzalb;
    private long zzalc;
    private long zzald;
    private long zzale;
    private long zzalf;
    private long zzalg;
    private long zzalh;

    private zzih() {
    }

    public boolean zzfx() {
        return false;
    }

    public void zza(AudioTrack audioTrack, boolean z) {
        this.zzajg = audioTrack;
        this.zzalb = z;
        this.zzalf = -9223372036854775807L;
        this.zzalc = 0L;
        this.zzald = 0L;
        this.zzale = 0L;
        if (audioTrack != null) {
            this.zzagt = audioTrack.getSampleRate();
        }
    }

    public final void zzdy(long j) {
        this.zzalg = zzga();
        this.zzalf = SystemClock.elapsedRealtime() * 1000;
        this.zzalh = j;
        this.zzajg.stop();
    }

    public final void pause() {
        if (this.zzalf != -9223372036854775807L) {
            return;
        }
        this.zzajg.pause();
    }

    public final long zzga() {
        if (this.zzalf != -9223372036854775807L) {
            return Math.min(this.zzalh, this.zzalg + ((((SystemClock.elapsedRealtime() * 1000) - this.zzalf) * this.zzagt) / 1000000));
        }
        int playState = this.zzajg.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & this.zzajg.getPlaybackHeadPosition();
        if (this.zzalb) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzale = this.zzalc;
            }
            playbackHeadPosition += this.zzale;
        }
        if (this.zzalc > playbackHeadPosition) {
            this.zzald++;
        }
        this.zzalc = playbackHeadPosition;
        return playbackHeadPosition + (this.zzald << 32);
    }

    public final long zzgb() {
        return (zzga() * 1000000) / this.zzagt;
    }

    public long zzfy() {
        throw new UnsupportedOperationException();
    }

    public long zzfz() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzih(zzie zzieVar) {
        this();
    }
}
