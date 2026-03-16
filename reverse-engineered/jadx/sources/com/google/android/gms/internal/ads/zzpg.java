package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpg extends zzlb {
    private static final int[] zzbil = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int zzahj;
    private boolean zzaku;
    private final zzpk zzbim;
    private final zzpl zzbin;
    private final long zzbio;
    private final int zzbip;
    private final boolean zzbiq;
    private final long[] zzbir;
    private zzhf[] zzbis;
    private zzpi zzbit;
    private Surface zzbiu;
    private Surface zzbiv;
    private int zzbiw;
    private boolean zzbix;
    private long zzbiy;
    private long zzbiz;
    private int zzbja;
    private int zzbjb;
    private int zzbjc;
    private float zzbjd;
    private int zzbje;
    private int zzbjf;
    private int zzbjg;
    private float zzbjh;
    private int zzbji;
    private int zzbjj;
    private int zzbjk;
    private float zzbjl;
    zzph zzbjm;
    private long zzbjn;
    private int zzbjo;
    private final Context zzvf;

    public zzpg(Context context, zzld zzldVar, long j, zzdns zzdnsVar, zzpm zzpmVar, int i) {
        this(context, zzldVar, 0L, null, false, zzdnsVar, zzpmVar, -1);
    }

    private static boolean zzem(long j) {
        return j < -30000;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzpg(Context context, zzld zzldVar, long j, zzjf<zzjh> zzjfVar, boolean z, zzdns zzdnsVar, zzpm zzpmVar, int i) {
        super(2, zzldVar, null, false);
        boolean z2 = false;
        this.zzbio = 0L;
        this.zzbip = -1;
        this.zzvf = context.getApplicationContext();
        this.zzbim = new zzpk(context);
        this.zzbin = new zzpl(zzdnsVar, zzpmVar);
        if (zzov.SDK_INT <= 22 && "foster".equals(zzov.DEVICE) && "NVIDIA".equals(zzov.MANUFACTURER)) {
            z2 = true;
        }
        this.zzbiq = z2;
        this.zzbir = new long[10];
        this.zzbjn = -9223372036854775807L;
        this.zzbiy = -9223372036854775807L;
        this.zzbje = -1;
        this.zzbjf = -1;
        this.zzbjh = -1.0f;
        this.zzbjd = -1.0f;
        this.zzbiw = 1;
        zzjj();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final int zza(zzld zzldVar, zzhf zzhfVar) throws zzlj {
        boolean z;
        String str = zzhfVar.zzagi;
        if (zzoo.zzbe(str)) {
            zzja zzjaVar = zzhfVar.zzagl;
            if (zzjaVar != null) {
                z = false;
                for (int i = 0; i < zzjaVar.zzann; i++) {
                    z |= zzjaVar.zzaa(i).zzanq;
                }
            } else {
                z = false;
            }
            zzlc zzb = zzldVar.zzb(str, z);
            if (zzb == null) {
                return 1;
            }
            boolean zzba = zzb.zzba(zzhfVar.zzagf);
            if (zzba && zzhfVar.width > 0 && zzhfVar.height > 0) {
                if (zzov.SDK_INT >= 21) {
                    zzba = zzb.zza(zzhfVar.width, zzhfVar.height, zzhfVar.zzagm);
                } else {
                    boolean z2 = zzhfVar.width * zzhfVar.height <= zzlf.zzhj();
                    if (!z2) {
                        int i2 = zzhfVar.width;
                        int i3 = zzhfVar.height;
                        String str2 = zzov.zzbhv;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("FalseCheck [legacyFrameSize, ");
                        sb.append(i2);
                        sb.append("x");
                        sb.append(i3);
                        sb.append("] [");
                        sb.append(str2);
                        sb.append("]");
                        Log.d("MediaCodecVideoRenderer", sb.toString());
                    }
                    zzba = z2;
                }
            }
            return (zzba ? 3 : 2) | (zzb.zzbaa ? 8 : 4) | (zzb.zzaku ? 16 : 0);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void zze(boolean z) throws zzgq {
        super.zze(z);
        int i = zzeh().zzahj;
        this.zzahj = i;
        this.zzaku = i != 0;
        this.zzbin.zza(this.zzazz);
        this.zzbim.enable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgp
    public final void zza(zzhf[] zzhfVarArr, long j) throws zzgq {
        this.zzbis = zzhfVarArr;
        if (this.zzbjn == -9223372036854775807L) {
            this.zzbjn = j;
        } else {
            int i = this.zzbjo;
            long[] jArr = this.zzbir;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zzbjo = i + 1;
            }
            this.zzbir[this.zzbjo - 1] = j;
        }
        super.zza(zzhfVarArr, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void zza(long j, boolean z) throws zzgq {
        super.zza(j, z);
        zzjh();
        this.zzbjb = 0;
        int i = this.zzbjo;
        if (i != 0) {
            this.zzbjn = this.zzbir[i - 1];
            this.zzbjo = 0;
        }
        if (z) {
            zzjg();
        } else {
            this.zzbiy = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzhk
    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.zzbix || (((surface = this.zzbiv) != null && this.zzbiu == surface) || zzhc() == null))) {
            this.zzbiy = -9223372036854775807L;
            return true;
        } else if (this.zzbiy == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzbiy) {
                return true;
            }
            this.zzbiy = -9223372036854775807L;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void onStarted() {
        super.onStarted();
        this.zzbja = 0;
        this.zzbiz = SystemClock.elapsedRealtime();
        this.zzbiy = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void onStopped() {
        zzjm();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void zzeg() {
        this.zzbje = -1;
        this.zzbjf = -1;
        this.zzbjh = -1.0f;
        this.zzbjd = -1.0f;
        this.zzbjn = -9223372036854775807L;
        this.zzbjo = 0;
        zzjj();
        zzjh();
        this.zzbim.disable();
        this.zzbjm = null;
        this.zzaku = false;
        try {
            super.zzeg();
        } finally {
            this.zzazz.zzgm();
            this.zzbin.zzb(this.zzazz);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzgv
    public final void zza(int i, Object obj) throws zzgq {
        if (i != 1) {
            if (i == 4) {
                this.zzbiw = ((Integer) obj).intValue();
                MediaCodec zzhc = zzhc();
                if (zzhc != null) {
                    zzhc.setVideoScalingMode(this.zzbiw);
                    return;
                }
                return;
            }
            super.zza(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.zzbiv;
            if (surface2 != null) {
                surface = surface2;
            } else {
                zzlc zzhd = zzhd();
                if (zzhd != null && zzn(zzhd.zzbab)) {
                    surface = zzpc.zzc(this.zzvf, zzhd.zzbab);
                    this.zzbiv = surface;
                }
            }
        }
        if (this.zzbiu != surface) {
            this.zzbiu = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec zzhc2 = zzhc();
                if (zzov.SDK_INT >= 23 && zzhc2 != null && surface != null) {
                    zzhc2.setOutputSurface(surface);
                } else {
                    zzhe();
                    zzhb();
                }
            }
            if (surface != null && surface != this.zzbiv) {
                zzjl();
                zzjh();
                if (state == 2) {
                    zzjg();
                    return;
                }
                return;
            }
            zzjj();
            zzjh();
        } else if (surface == null || surface == this.zzbiv) {
        } else {
            zzjl();
            if (this.zzbix) {
                this.zzbin.zza(this.zzbiu);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final boolean zza(zzlc zzlcVar) {
        return this.zzbiu != null || zzn(zzlcVar.zzbab);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void zza(zzlc zzlcVar, MediaCodec mediaCodec, zzhf zzhfVar, MediaCrypto mediaCrypto) throws zzlj {
        zzpi zzpiVar;
        Point point;
        zzhf[] zzhfVarArr = this.zzbis;
        int i = zzhfVar.width;
        int i2 = zzhfVar.height;
        int zzi = zzi(zzhfVar);
        if (zzhfVarArr.length == 1) {
            zzpiVar = new zzpi(i, i2, zzi);
        } else {
            boolean z = false;
            for (zzhf zzhfVar2 : zzhfVarArr) {
                if (zza(zzlcVar.zzbaa, zzhfVar, zzhfVar2)) {
                    z |= zzhfVar2.width == -1 || zzhfVar2.height == -1;
                    i = Math.max(i, zzhfVar2.width);
                    i2 = Math.max(i2, zzhfVar2.height);
                    zzi = Math.max(zzi, zzi(zzhfVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzhfVar.height > zzhfVar.width;
                int i3 = z2 ? zzhfVar.height : zzhfVar.width;
                int i4 = z2 ? zzhfVar.width : zzhfVar.height;
                float f = i4 / i3;
                int[] iArr = zzbil;
                int length = iArr.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (i7 * f);
                    if (i7 <= i3 || i8 <= i4) {
                        break;
                    }
                    int i9 = i3;
                    int i10 = i4;
                    if (zzov.SDK_INT >= 21) {
                        int i11 = z2 ? i8 : i7;
                        if (!z2) {
                            i7 = i8;
                        }
                        Point zzd = zzlcVar.zzd(i11, i7);
                        if (zzlcVar.zza(zzd.x, zzd.y, zzhfVar.zzagm)) {
                            point = zzd;
                            break;
                        }
                        i5++;
                        length = i6;
                        iArr = iArr2;
                        i3 = i9;
                        i4 = i10;
                    } else {
                        int zzf = zzov.zzf(i7, 16) << 4;
                        int zzf2 = zzov.zzf(i8, 16) << 4;
                        if (zzf * zzf2 <= zzlf.zzhj()) {
                            int i12 = z2 ? zzf2 : zzf;
                            if (!z2) {
                                zzf = zzf2;
                            }
                            point = new Point(i12, zzf);
                        } else {
                            i5++;
                            length = i6;
                            iArr = iArr2;
                            i3 = i9;
                            i4 = i10;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzi = Math.max(zzi, zza(zzhfVar.zzagi, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzpiVar = new zzpi(i, i2, zzi);
        }
        this.zzbit = zzpiVar;
        boolean z3 = this.zzbiq;
        int i13 = this.zzahj;
        MediaFormat zzez = zzhfVar.zzez();
        zzez.setInteger("max-width", zzpiVar.width);
        zzez.setInteger("max-height", zzpiVar.height);
        if (zzpiVar.zzbjq != -1) {
            zzez.setInteger("max-input-size", zzpiVar.zzbjq);
        }
        if (z3) {
            zzez.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            zzez.setFeatureEnabled("tunneled-playback", true);
            zzez.setInteger("audio-session-id", i13);
        }
        if (this.zzbiu == null) {
            zzoh.checkState(zzn(zzlcVar.zzbab));
            if (this.zzbiv == null) {
                this.zzbiv = zzpc.zzc(this.zzvf, zzlcVar.zzbab);
            }
            this.zzbiu = this.zzbiv;
        }
        mediaCodec.configure(zzez, this.zzbiu, (MediaCrypto) null, 0);
        if (zzov.SDK_INT < 23 || !this.zzaku) {
            return;
        }
        this.zzbjm = new zzph(this, mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzhe() {
        try {
            super.zzhe();
        } finally {
            Surface surface = this.zzbiv;
            if (surface != null) {
                if (this.zzbiu == surface) {
                    this.zzbiu = null;
                }
                this.zzbiv.release();
                this.zzbiv = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void zzc(String str, long j, long j2) {
        this.zzbin.zza(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzd(zzhf zzhfVar) throws zzgq {
        super.zzd(zzhfVar);
        this.zzbin.zzb(zzhfVar);
        this.zzbjd = zzhfVar.zzago == -1.0f ? 1.0f : zzhfVar.zzago;
        this.zzbjc = zzj(zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void zza(zzjb zzjbVar) {
        if (zzov.SDK_INT >= 23 || !this.zzaku) {
            return;
        }
        zzji();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzbje = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzbjf = integer2;
        this.zzbjh = this.zzbjd;
        if (zzov.SDK_INT >= 21) {
            int i = this.zzbjc;
            if (i == 90 || i == 270) {
                int i2 = this.zzbje;
                this.zzbje = this.zzbjf;
                this.zzbjf = i2;
                this.zzbjh = 1.0f / this.zzbjh;
            }
        } else {
            this.zzbjg = this.zzbjc;
        }
        mediaCodec.setVideoScalingMode(this.zzbiw);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final boolean zza(MediaCodec mediaCodec, boolean z, zzhf zzhfVar, zzhf zzhfVar2) {
        return zza(z, zzhfVar, zzhfVar2) && zzhfVar2.width <= this.zzbit.width && zzhfVar2.height <= this.zzbit.height && zzhfVar2.zzagj <= this.zzbit.zzbjq;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzbjo;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzbir;
            if (j3 < jArr[0]) {
                break;
            }
            this.zzbjn = jArr[0];
            int i4 = i3 - 1;
            this.zzbjo = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j4 = j3 - this.zzbjn;
        if (z) {
            zza(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.zzbiu == this.zzbiv) {
            if (zzem(j5)) {
                zza(mediaCodec, i, j4);
                return true;
            }
            return false;
        } else if (!this.zzbix) {
            if (zzov.SDK_INT >= 21) {
                zza(mediaCodec, i, j4, System.nanoTime());
            } else {
                zzb(mediaCodec, i, j4);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long zzf = this.zzbim.zzf(j3, (elapsedRealtime * 1000) + nanoTime);
            long j6 = (zzf - nanoTime) / 1000;
            if (zzem(j6)) {
                zzow.beginSection("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                zzow.endSection();
                this.zzazz.zzanj++;
                this.zzbja++;
                this.zzbjb++;
                this.zzazz.zzank = Math.max(this.zzbjb, this.zzazz.zzank);
                if (this.zzbja == this.zzbip) {
                    zzjm();
                }
                return true;
            }
            if (zzov.SDK_INT >= 21) {
                if (j6 < 50000) {
                    zza(mediaCodec, i, j4, zzf);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzb(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
    }

    private final void zza(MediaCodec mediaCodec, int i, long j) {
        zzow.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzow.endSection();
        this.zzazz.zzani++;
    }

    private final void zzb(MediaCodec mediaCodec, int i, long j) {
        zzjk();
        zzow.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzow.endSection();
        this.zzazz.zzanh++;
        this.zzbjb = 0;
        zzji();
    }

    private final void zza(MediaCodec mediaCodec, int i, long j, long j2) {
        zzjk();
        zzow.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzow.endSection();
        this.zzazz.zzanh++;
        this.zzbjb = 0;
        zzji();
    }

    private final boolean zzn(boolean z) {
        if (zzov.SDK_INT < 23 || this.zzaku) {
            return false;
        }
        return !z || zzpc.zzc(this.zzvf);
    }

    private final void zzjg() {
        this.zzbiy = this.zzbio > 0 ? SystemClock.elapsedRealtime() + this.zzbio : -9223372036854775807L;
    }

    private final void zzjh() {
        MediaCodec zzhc;
        this.zzbix = false;
        if (zzov.SDK_INT < 23 || !this.zzaku || (zzhc = zzhc()) == null) {
            return;
        }
        this.zzbjm = new zzph(this, zzhc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzji() {
        if (this.zzbix) {
            return;
        }
        this.zzbix = true;
        this.zzbin.zza(this.zzbiu);
    }

    private final void zzjj() {
        this.zzbji = -1;
        this.zzbjj = -1;
        this.zzbjl = -1.0f;
        this.zzbjk = -1;
    }

    private final void zzjk() {
        if (this.zzbji == this.zzbje && this.zzbjj == this.zzbjf && this.zzbjk == this.zzbjg && this.zzbjl == this.zzbjh) {
            return;
        }
        this.zzbin.zza(this.zzbje, this.zzbjf, this.zzbjg, this.zzbjh);
        this.zzbji = this.zzbje;
        this.zzbjj = this.zzbjf;
        this.zzbjk = this.zzbjg;
        this.zzbjl = this.zzbjh;
    }

    private final void zzjl() {
        if (this.zzbji == -1 && this.zzbjj == -1) {
            return;
        }
        this.zzbin.zza(this.zzbje, this.zzbjf, this.zzbjg, this.zzbjh);
    }

    private final void zzjm() {
        if (this.zzbja > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbin.zze(this.zzbja, elapsedRealtime - this.zzbiz);
            this.zzbja = 0;
            this.zzbiz = elapsedRealtime;
        }
    }

    private static int zzi(zzhf zzhfVar) {
        if (zzhfVar.zzagj != -1) {
            return zzhfVar.zzagj;
        }
        return zza(zzhfVar.zzagi, zzhfVar.width, zzhfVar.height);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zza(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                if ("BRAVIA 4K 2015".equals(zzov.MODEL)) {
                    return -1;
                }
                i3 = ((zzov.zzf(i, 16) * zzov.zzf(i2, 16)) << 4) << 4;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            } else if (c != 3) {
                if (c == 4 || c == 5) {
                    i3 = i * i2;
                    return (i3 * 3) / (i4 * 2);
                }
                return -1;
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private static boolean zza(boolean z, zzhf zzhfVar, zzhf zzhfVar2) {
        if (zzhfVar.zzagi.equals(zzhfVar2.zzagi) && zzj(zzhfVar) == zzj(zzhfVar2)) {
            if (z) {
                return true;
            }
            return zzhfVar.width == zzhfVar2.width && zzhfVar.height == zzhfVar2.height;
        }
        return false;
    }

    private static int zzj(zzhf zzhfVar) {
        if (zzhfVar.zzagn == -1) {
            return 0;
        }
        return zzhfVar.zzagn;
    }
}
