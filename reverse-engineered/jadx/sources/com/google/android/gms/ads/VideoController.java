package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzxl;
import com.google.android.gms.internal.ads.zzzf;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    private zzxl zzacw;
    private VideoLifecycleCallbacks zzacx;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void zza(zzxl zzxlVar) {
        synchronized (this.lock) {
            this.zzacw = zzxlVar;
            if (this.zzacx != null) {
                setVideoLifecycleCallbacks(this.zzacx);
            }
        }
    }

    public final zzxl zzdu() {
        zzxl zzxlVar;
        synchronized (this.lock) {
            zzxlVar = this.zzacw;
        }
        return zzxlVar;
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return;
            }
            try {
                this.zzacw.play();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call play on video controller.", e);
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return;
            }
            try {
                this.zzacw.pause();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call pause on video controller.", e);
            }
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return;
            }
            try {
                this.zzacw.stop();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call stop on video controller.", e);
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return;
            }
            try {
                this.zzacw.mute(z);
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call mute on video controller.", e);
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return true;
            }
            try {
                return this.zzacw.isMuted();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return 0;
            }
            try {
                return this.zzacw.getPlaybackState();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return false;
            }
            try {
                return this.zzacw.isCustomControlsEnabled();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return false;
            }
            try {
                return this.zzacw.isClickToExpandEnabled();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final float getVideoDuration() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return 0.0f;
            }
            try {
                return this.zzacw.getDuration();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call getDuration on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final float getVideoCurrentTime() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return 0.0f;
            }
            try {
                return this.zzacw.getCurrentTime();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call getCurrentTime on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzacx = videoLifecycleCallbacks;
            if (this.zzacw == null) {
                return;
            }
            try {
                this.zzacw.zza(new zzzf(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzacx;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzacw != null;
        }
        return z;
    }

    @Deprecated
    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzacw == null) {
                return 0.0f;
            }
            try {
                return this.zzacw.getAspectRatio();
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
