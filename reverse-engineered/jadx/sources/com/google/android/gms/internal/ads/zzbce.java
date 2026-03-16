package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbce extends zzbbi implements TextureView.SurfaceTextureListener, zzbdc {
    private Surface zzbiu;
    private final zzbca zzeak;
    private final boolean zzeal;
    private int zzeaq;
    private int zzear;
    private int zzeat;
    private int zzeau;
    private zzbbv zzeav;
    private final boolean zzeaw;
    private zzbbf zzeay;
    private final zzbbx zzebj;
    private String[] zzebw;
    private final zzbby zzeet;
    private zzbcu zzeeu;
    private String zzeev;
    private boolean zzeew;
    private int zzeex;
    private boolean zzeey;
    private boolean zzeez;
    private float zzefa;

    public zzbce(Context context, zzbca zzbcaVar, zzbbx zzbbxVar, boolean z, boolean z2, zzbby zzbbyVar) {
        super(context);
        this.zzeex = 1;
        this.zzeal = z2;
        this.zzebj = zzbbxVar;
        this.zzeak = zzbcaVar;
        this.zzeaw = z;
        this.zzeet = zzbbyVar;
        setSurfaceTextureListener(this);
        this.zzeak.zzb(this);
    }

    private final zzbcu zzzs() {
        return new zzbcu(this.zzebj.getContext(), this.zzeet);
    }

    private final String zzzt() {
        return com.google.android.gms.ads.internal.zzq.zzkw().zzr(this.zzebj.getContext(), this.zzebj.zzzk().zzbnd);
    }

    private final boolean zzzu() {
        return (this.zzeeu == null || this.zzeew) ? false : true;
    }

    private final boolean zzzv() {
        return zzzu() && this.zzeex != 1;
    }

    private final void zzzw() {
        String str;
        if (this.zzeeu != null || (str = this.zzeev) == null || this.zzbiu == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzbdl zzfh = this.zzebj.zzfh(this.zzeev);
            if (zzfh instanceof zzbea) {
                zzbcu zzaan = ((zzbea) zzfh).zzaan();
                this.zzeeu = zzaan;
                if (zzaan.zzaah() == null) {
                    zzawr.zzfc("Precached video player has been released.");
                    return;
                }
            } else if (zzfh instanceof zzbdx) {
                zzbdx zzbdxVar = (zzbdx) zzfh;
                String zzzt = zzzt();
                ByteBuffer byteBuffer = zzbdxVar.getByteBuffer();
                boolean zzaal = zzbdxVar.zzaal();
                String url = zzbdxVar.getUrl();
                if (url == null) {
                    zzawr.zzfc("Stream cache URL is null.");
                    return;
                }
                zzbcu zzzs = zzzs();
                this.zzeeu = zzzs;
                zzzs.zza(new Uri[]{Uri.parse(url)}, zzzt, byteBuffer, zzaal);
            } else {
                String valueOf = String.valueOf(this.zzeev);
                zzawr.zzfc(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.zzeeu = zzzs();
            String zzzt2 = zzzt();
            Uri[] uriArr = new Uri[this.zzebw.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzebw;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzeeu.zza(uriArr, zzzt2);
        }
        this.zzeeu.zza(this);
        zza(this.zzbiu, false);
        int playbackState = this.zzeeu.zzaah().getPlaybackState();
        this.zzeex = playbackState;
        if (playbackState == 3) {
            zzzx();
        }
    }

    private final void zza(Surface surface, boolean z) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zza(surface, z);
        } else {
            zzawr.zzfc("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzb(f, z);
        } else {
            zzawr.zzfc("Trying to set volume before player is initalized.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi, com.google.android.gms.internal.ads.zzbcb
    public final void zzyo() {
        zza(this.zzebh.getVolume(), false);
    }

    private final void zzzx() {
        if (this.zzeey) {
            return;
        }
        this.zzeey = true;
        zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbcd
            private final zzbce zzees;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzees = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzees.zzaag();
            }
        });
        zzyo();
        this.zzeak.zzfa();
        if (this.zzeez) {
            play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final String zzyk() {
        String str = this.zzeaw ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zza(zzbbf zzbbfVar) {
        this.zzeay = zzbbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzeev = str;
            this.zzebw = new String[]{str};
            zzzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zzb(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.zzeev = str;
            this.zzebw = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void play() {
        if (zzzv()) {
            if (this.zzeet.zzedr) {
                zzzz();
            }
            this.zzeeu.zzaah().zzg(true);
            this.zzeak.zzzp();
            this.zzebh.zzzp();
            this.zzebg.zzyq();
            zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbci
                private final zzbce zzees;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzees = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzees.zzaae();
                }
            });
            return;
        }
        this.zzeez = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void stop() {
        if (zzzu()) {
            this.zzeeu.zzaah().stop();
            if (this.zzeeu != null) {
                zza((Surface) null, true);
                zzbcu zzbcuVar = this.zzeeu;
                if (zzbcuVar != null) {
                    zzbcuVar.zza((zzbdc) null);
                    this.zzeeu.release();
                    this.zzeeu = null;
                }
                this.zzeex = 1;
                this.zzeew = false;
                this.zzeey = false;
                this.zzeez = false;
            }
        }
        this.zzeak.zzzq();
        this.zzebh.zzzq();
        this.zzeak.onStop();
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void pause() {
        if (zzzv()) {
            if (this.zzeet.zzedr) {
                zzaaa();
            }
            this.zzeeu.zzaah().zzg(false);
            this.zzeak.zzzq();
            this.zzebh.zzzq();
            zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbch
                private final zzbce zzees;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzees = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzees.zzaad();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void seekTo(int i) {
        if (zzzv()) {
            this.zzeeu.zzaah().seekTo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zzde(int i) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzaak().zzdl(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zzdf(int i) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzaak().zzdm(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zzdg(int i) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzaak().zzdg(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zzdh(int i) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzaak().zzdh(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zzdi(int i) {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzdi(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final void zza(float f, float f2) {
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getCurrentPosition() {
        if (zzzv()) {
            return (int) this.zzeeu.zzaah().zzem();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getDuration() {
        if (zzzv()) {
            return (int) this.zzeeu.zzaah().getDuration();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getVideoWidth() {
        return this.zzeaq;
    }

    @Override // com.google.android.gms.internal.ads.zzbbi
    public final int getVideoHeight() {
        return this.zzear;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzefa;
        if (f != 0.0f && this.zzeav == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            float f4 = this.zzefa;
            if (f4 < f3) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzm(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i4 = this.zzeat;
            if (((i4 > 0 && i4 != measuredWidth) || ((i3 = this.zzeau) > 0 && i3 != measuredHeight)) && this.zzeal && zzzu()) {
                zzgt zzaah = this.zzeeu.zzaah();
                if (zzaah.zzem() > 0 && !zzaah.zzek()) {
                    zza(0.0f, true);
                    zzaah.zzg(true);
                    long zzem = zzaah.zzem();
                    long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
                    while (zzzu() && zzaah.zzem() == zzem && com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis() - currentTimeMillis <= 250) {
                    }
                    zzaah.zzg(false);
                    zzyo();
                }
            }
            this.zzeat = measuredWidth;
            this.zzeau = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzeaw) {
            zzbbv zzbbvVar = new zzbbv(getContext());
            this.zzeav = zzbbvVar;
            zzbbvVar.zza(surfaceTexture, i, i2);
            this.zzeav.start();
            SurfaceTexture zzzc = this.zzeav.zzzc();
            if (zzzc != null) {
                surfaceTexture = zzzc;
            } else {
                this.zzeav.zzzb();
                this.zzeav = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzbiu = surface;
        if (this.zzeeu == null) {
            zzzw();
        } else {
            zza(surface, true);
            if (!this.zzeet.zzedr) {
                zzzz();
            }
        }
        if (this.zzeaq == 0 || this.zzear == 0) {
            zzo(i, i2);
        } else {
            zzzy();
        }
        zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbck
            private final zzbce zzees;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzees = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzees.zzaac();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzm(i, i2);
        }
        zzaxa.zzdwf.post(new Runnable(this, i, i2) { // from class: com.google.android.gms.internal.ads.zzbcj
            private final int zzdwt;
            private final int zzdwu;
            private final zzbce zzees;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzees = this;
                this.zzdwt = i;
                this.zzdwu = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzees.zzp(this.zzdwt, this.zzdwu);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeak.zzc(this);
        this.zzebg.zza(surfaceTexture, this.zzeay);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        zzbbv zzbbvVar = this.zzeav;
        if (zzbbvVar != null) {
            zzbbvVar.zzzb();
            this.zzeav = null;
        }
        if (this.zzeeu != null) {
            zzaaa();
            Surface surface = this.zzbiu;
            if (surface != null) {
                surface.release();
            }
            this.zzbiu = null;
            zza((Surface) null, true);
        }
        zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbcm
            private final zzbce zzees;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzees = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzees.zzaab();
            }
        });
        return true;
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzawr.zzeg(sb.toString());
        zzaxa.zzdwf.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzbcl
            private final int zzdwt;
            private final zzbce zzees;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzees = this;
                this.zzdwt = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzees.zzdk(this.zzdwt);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zzb(final boolean z, final long j) {
        if (this.zzebj != null) {
            zzbab.zzdzv.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.zzbco
                private final boolean zzecc;
                private final zzbce zzees;
                private final long zzefe;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzees = this;
                    this.zzecc = z;
                    this.zzefe = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzees.zzc(this.zzecc, this.zzefe);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zzdj(int i) {
        if (this.zzeex != i) {
            this.zzeex = i;
            if (i == 3) {
                zzzx();
            } else if (i != 4) {
            } else {
                if (this.zzeet.zzedr) {
                    zzaaa();
                }
                this.zzeak.zzzq();
                this.zzebh.zzzq();
                zzaxa.zzdwf.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbcg
                    private final zzbce zzees;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzees = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzees.zzaaf();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zzn(int i, int i2) {
        this.zzeaq = i;
        this.zzear = i2;
        zzzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbdc
    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzawr.zzfc(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzeew = true;
        if (this.zzeet.zzedr) {
            zzaaa();
        }
        zzaxa.zzdwf.post(new Runnable(this, sb2) { // from class: com.google.android.gms.internal.ads.zzbcf
            private final String zzdbv;
            private final zzbce zzees;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzees = this;
                this.zzdbv = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzees.zzfi(this.zzdbv);
            }
        });
    }

    private final void zzzy() {
        zzo(this.zzeaq, this.zzear);
    }

    private final void zzo(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzefa != f) {
            this.zzefa = f;
            requestLayout();
        }
    }

    private final void zzzz() {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzaw(true);
        }
    }

    private final void zzaaa() {
        zzbcu zzbcuVar = this.zzeeu;
        if (zzbcuVar != null) {
            zzbcuVar.zzaw(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzebj.zza(z, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdk(int i) {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaab() {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzys();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(int i, int i2) {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzk(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaac() {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzyp();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaad() {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.onPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaae() {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzyq();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfi(String str) {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzm("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaaf() {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzyr();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaag() {
        zzbbf zzbbfVar = this.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar.zzfa();
        }
    }
}
