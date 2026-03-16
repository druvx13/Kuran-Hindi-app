package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbcc implements AudioManager.OnAudioFocusChangeListener {
    private float zzcy = 1.0f;
    private boolean zzebp;
    private final AudioManager zzeeo;
    private final zzbcb zzeep;
    private boolean zzeeq;
    private boolean zzeer;

    public zzbcc(Context context, zzbcb zzbcbVar) {
        this.zzeeo = (AudioManager) context.getSystemService("audio");
        this.zzeep = zzbcbVar;
    }

    public final void setMuted(boolean z) {
        this.zzeer = z;
        zzzr();
    }

    public final void setVolume(float f) {
        this.zzcy = f;
        zzzr();
    }

    public final float getVolume() {
        float f = this.zzeer ? 0.0f : this.zzcy;
        if (this.zzeeq) {
            return f;
        }
        return 0.0f;
    }

    public final void zzzp() {
        this.zzebp = true;
        zzzr();
    }

    public final void zzzq() {
        this.zzebp = false;
        zzzr();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.zzeeq = i > 0;
        this.zzeep.zzyo();
    }

    private final void zzzr() {
        boolean z;
        boolean z2;
        boolean z3 = this.zzebp && !this.zzeer && this.zzcy > 0.0f;
        if (z3 && !(z2 = this.zzeeq)) {
            AudioManager audioManager = this.zzeeo;
            if (audioManager != null && !z2) {
                this.zzeeq = audioManager.requestAudioFocus(this, 3, 2) == 1;
            }
            this.zzeep.zzyo();
        } else if (z3 || !(z = this.zzeeq)) {
        } else {
            AudioManager audioManager2 = this.zzeeo;
            if (audioManager2 != null && z) {
                this.zzeeq = audioManager2.abandonAudioFocus(this) == 0;
            }
            this.zzeep.zzyo();
        }
    }
}
