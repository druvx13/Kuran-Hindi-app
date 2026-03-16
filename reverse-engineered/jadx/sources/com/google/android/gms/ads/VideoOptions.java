package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzze;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zzacy;
    private final boolean zzacz;
    private final boolean zzada;

    public VideoOptions(zzze zzzeVar) {
        this.zzacy = zzzeVar.zzacy;
        this.zzacz = zzzeVar.zzacz;
        this.zzada = zzzeVar.zzada;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzacy = true;
        private boolean zzacz = false;
        private boolean zzada = false;

        public final Builder setStartMuted(boolean z) {
            this.zzacy = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzacz = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzada = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzacy = builder.zzacy;
        this.zzacz = builder.zzacz;
        this.zzada = builder.zzada;
    }

    public final boolean getStartMuted() {
        return this.zzacy;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzacz;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzada;
    }
}
