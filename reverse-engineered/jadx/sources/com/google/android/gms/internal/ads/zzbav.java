package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbav extends zzbbi implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzeaj = new HashMap();
    private final zzbca zzeak;
    private final boolean zzeal;
    private int zzeam;
    private int zzean;
    private MediaPlayer zzeao;
    private Uri zzeap;
    private int zzeaq;
    private int zzear;
    private int zzeas;
    private int zzeat;
    private int zzeau;
    private zzbbv zzeav;
    private boolean zzeaw;
    private int zzeax;
    private zzbbf zzeay;

    public zzbav(Context context, boolean z, boolean z2, zzbby zzbbyVar, zzbca zzbcaVar) {
        super(context);
        this.zzeam = 0;
        this.zzean = 0;
        setSurfaceTextureListener(this);
        this.zzeak = zzbcaVar;
        this.zzeaw = z;
        this.zzeal = z2;
        zzbcaVar.zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final String zzyk() {
        String str = this.zzeaw ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zza(zzbbf zzbbfVar) {
        this.zzeay = zzbbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzsf zzd = zzsf.zzd(parse);
        if (zzd == null || zzd.url != null) {
            if (zzd != null) {
                parse = Uri.parse(zzd.url);
            }
            this.zzeap = parse;
            this.zzeax = 0;
            zzyl();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void stop() {
        zzawr.zzeg("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzeao;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzeao.release();
            this.zzeao = null;
            zzdc(0);
            this.zzean = 0;
        }
        this.zzeak.onStop();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzawr.zzeg(sb.toString());
        this.zzeaq = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzear = videoHeight;
        if (this.zzeaq == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzawr.zzeg("AdMediaPlayerView prepared");
        zzdc(2);
        this.zzeak.zzfa();
        zzaxa.zzdwf.post(new zzbax(this));
        this.zzeaq = mediaPlayer.getVideoWidth();
        this.zzear = mediaPlayer.getVideoHeight();
        int i = this.zzeax;
        if (i != 0) {
            seekTo(i);
        }
        zzym();
        int i2 = this.zzeaq;
        int i3 = this.zzear;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzawr.zzfb(sb.toString());
        if (this.zzean == 3) {
            play();
        }
        zzyo();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzawr.zzeg("AdMediaPlayerView completion");
        zzdc(5);
        this.zzean = 5;
        zzaxa.zzdwf.post(new zzbba(this));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeaj.get(Integer.valueOf(i));
        String str2 = zzeaj.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawr.zzeg(sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeaj.get(Integer.valueOf(i));
        String str2 = zzeaj.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawr.zzfc(sb.toString());
        zzdc(-1);
        this.zzean = -1;
        zzaxa.zzdwf.post(new zzbaz(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzeas = i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzawr.zzeg("AdMediaPlayerView surface created");
        zzyl();
        zzaxa.zzdwf.post(new zzbbc(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzawr.zzeg("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.zzean == 3;
        z = (this.zzeaq == i && this.zzear == i2) ? false : false;
        if (this.zzeao != null && z2 && z) {
            int i3 = this.zzeax;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzm(i, i2);
        }
        zzaxa.zzdwf.post(new zzbbb(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawr.zzeg("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzeao;
        if (mediaPlayer != null && this.zzeax == 0) {
            this.zzeax = mediaPlayer.getCurrentPosition();
        }
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzzb();
        }
        zzaxa.zzdwf.post(new zzbbe(this));
        zzat(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeak.zzc(this);
        this.zzebg.zza(surfaceTexture, this.zzeay);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzawr.zzeg(sb.toString());
        zzaxa.zzdwf.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzbay
            private final int zzdwt;
            private final zzbav zzebb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzebb = this;
                this.zzdwt = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzebb.zzdd(this.zzdwt);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.zzeaq, i);
        int defaultSize2 = getDefaultSize(this.zzear, i2);
        if (this.zzeaq > 0 && this.zzear > 0 && this.zzeav == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.zzeaq;
                int i5 = i4 * size2;
                int i6 = this.zzear;
                if (i5 < size * i6) {
                    defaultSize = (i4 * size2) / i6;
                    defaultSize2 = size2;
                } else {
                    if (i4 * size2 > size * i6) {
                        defaultSize2 = (i6 * size) / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i7 = (this.zzear * size) / this.zzeaq;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i8 = (this.zzeaq * size2) / this.zzear;
                if (mode != Integer.MIN_VALUE || i8 <= size) {
                    defaultSize = i8;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i9 = this.zzeaq;
                int i10 = this.zzear;
                if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                    defaultSize2 = i10;
                } else {
                    i9 = (i9 * size2) / i10;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                } else {
                    defaultSize2 = (this.zzear * size) / this.zzeaq;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzm(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i11 = this.zzeat;
            if ((i11 > 0 && i11 != defaultSize) || ((i3 = this.zzeau) > 0 && i3 != defaultSize2)) {
                zzym();
            }
            this.zzeat = defaultSize;
            this.zzeau = defaultSize2;
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    private final void zzyl() {
        zzawr.zzeg("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzeap == null || surfaceTexture == null) {
            return;
        }
        zzat(false);
        try {
            com.google.android.gms.ads.internal.zzq.zzlm();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzeao = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzeao.setOnCompletionListener(this);
            this.zzeao.setOnErrorListener(this);
            this.zzeao.setOnInfoListener(this);
            this.zzeao.setOnPreparedListener(this);
            this.zzeao.setOnVideoSizeChangedListener(this);
            this.zzeas = 0;
            if (this.zzeaw) {
                zzbbv zzbbvVar = new zzbbv(getContext());
                this.zzeav = zzbbvVar;
                zzbbvVar.zza(surfaceTexture, getWidth(), getHeight());
                this.zzeav.start();
                SurfaceTexture zzzc = this.zzeav.zzzc();
                if (zzzc != null) {
                    surfaceTexture = zzzc;
                } else {
                    this.zzeav.zzzb();
                    this.zzeav = null;
                }
            }
            this.zzeao.setDataSource(getContext(), this.zzeap);
            com.google.android.gms.ads.internal.zzq.zzln();
            this.zzeao.setSurface(new Surface(surfaceTexture));
            this.zzeao.setAudioStreamType(3);
            this.zzeao.setScreenOnWhilePlaying(true);
            this.zzeao.prepareAsync();
            zzdc(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzeap);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzawr.zzd(sb.toString(), e);
            onError(this.zzeao, 1, 0);
        }
    }

    private final void zzym() {
        if (this.zzeal && zzyn() && this.zzeao.getCurrentPosition() > 0 && this.zzean != 3) {
            zzawr.zzeg("AdMediaPlayerView nudging MediaPlayer");
            zzd(0.0f);
            this.zzeao.start();
            int currentPosition = this.zzeao.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
            while (zzyn() && this.zzeao.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzeao.pause();
            zzyo();
        }
    }

    private final void zzat(boolean z) {
        zzawr.zzeg("AdMediaPlayerView release");
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzzb();
            this.zzeav = null;
        }
        MediaPlayer mediaPlayer = this.zzeao;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzeao.release();
            this.zzeao = null;
            zzdc(0);
            if (z) {
                this.zzean = 0;
                this.zzean = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void play() {
        zzawr.zzeg("AdMediaPlayerView play");
        if (zzyn()) {
            this.zzeao.start();
            zzdc(3);
            this.zzebg.zzyq();
            zzaxa.zzdwf.post(new zzbbd(this));
        }
        this.zzean = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void pause() {
        zzawr.zzeg("AdMediaPlayerView pause");
        if (zzyn() && this.zzeao.isPlaying()) {
            this.zzeao.pause();
            zzdc(4);
            zzaxa.zzdwf.post(new zzbbg(this));
        }
        this.zzean = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getDuration() {
        if (zzyn()) {
            return this.zzeao.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getCurrentPosition() {
        if (zzyn()) {
            return this.zzeao.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzawr.zzeg(sb.toString());
        if (zzyn()) {
            this.zzeao.seekTo(i);
            this.zzeax = 0;
            return;
        }
        this.zzeax = i;
    }

    private final boolean zzyn() {
        int i;
        return (this.zzeao == null || (i = this.zzeam) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zza(float f, float f2) {
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzeao;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzeao;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi, com.google.android.gms.internal.ads.zzbcb
    public final void zzyo() {
        zzd(this.zzebh.getVolume());
    }

    private final void zzd(float f) {
        MediaPlayer mediaPlayer = this.zzeao;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        zzawr.zzfc("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private final void zzdc(int i) {
        if (i == 3) {
            this.zzeak.zzzp();
            this.zzebh.zzzp();
        } else if (this.zzeam == 3) {
            this.zzeak.zzzq();
            this.zzebh.zzzq();
        }
        this.zzeam = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdd(int i) {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzeaj.put(-1004, "MEDIA_ERROR_IO");
            zzeaj.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzeaj.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzeaj.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzeaj.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzeaj.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzeaj.put(1, "MEDIA_ERROR_UNKNOWN");
        zzeaj.put(1, "MEDIA_INFO_UNKNOWN");
        zzeaj.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzeaj.put(701, "MEDIA_INFO_BUFFERING_START");
        zzeaj.put(702, "MEDIA_INFO_BUFFERING_END");
        zzeaj.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzeaj.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzeaj.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzeaj.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzeaj.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
