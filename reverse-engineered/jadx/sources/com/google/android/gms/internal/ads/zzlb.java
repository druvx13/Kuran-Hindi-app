package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzlb extends zzgp {
    private static final byte[] zzayp = zzov.zzbk("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzhf zzahd;
    private ByteBuffer[] zzakl;
    private final zzld zzayq;
    private final zzjf<zzjh> zzayr;
    private final boolean zzays;
    private final zzjb zzayt;
    private final zzjb zzayu;
    private final zzhh zzayv;
    private final List<Long> zzayw;
    private final MediaCodec.BufferInfo zzayx;
    private zzjd<zzjh> zzayy;
    private zzjd<zzjh> zzayz;
    private MediaCodec zzaza;
    private zzlc zzazb;
    private boolean zzazc;
    private boolean zzazd;
    private boolean zzaze;
    private boolean zzazf;
    private boolean zzazg;
    private boolean zzazh;
    private boolean zzazi;
    private boolean zzazj;
    private boolean zzazk;
    private ByteBuffer[] zzazl;
    private long zzazm;
    private int zzazn;
    private int zzazo;
    private boolean zzazp;
    private boolean zzazq;
    private int zzazr;
    private int zzazs;
    private boolean zzazt;
    private boolean zzazu;
    private boolean zzazv;
    private boolean zzazw;
    private boolean zzazx;
    private boolean zzazy;
    protected zziy zzazz;

    public zzlb(int i, zzld zzldVar, zzjf<zzjh> zzjfVar, boolean z) {
        super(i);
        zzoh.checkState(zzov.SDK_INT >= 16);
        this.zzayq = (zzld) zzoh.checkNotNull(zzldVar);
        this.zzayr = zzjfVar;
        this.zzays = z;
        this.zzayt = new zzjb(0);
        this.zzayu = new zzjb(0);
        this.zzayv = new zzhh();
        this.zzayw = new ArrayList();
        this.zzayx = new MediaCodec.BufferInfo();
        this.zzazr = 0;
        this.zzazs = 0;
    }

    protected void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgq {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgp
    public void onStarted() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgp
    public void onStopped() {
    }

    protected abstract int zza(zzld zzldVar, zzhf zzhfVar) throws zzlj;

    protected void zza(zzjb zzjbVar) {
    }

    protected abstract void zza(zzlc zzlcVar, MediaCodec mediaCodec, zzhf zzhfVar, MediaCrypto mediaCrypto) throws zzlj;

    protected abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgq;

    protected boolean zza(MediaCodec mediaCodec, boolean z, zzhf zzhfVar, zzhf zzhfVar2) {
        return false;
    }

    protected boolean zza(zzlc zzlcVar) {
        return true;
    }

    protected void zzc(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzhn
    public final int zzef() {
        return 4;
    }

    protected void zzgd() throws zzgq {
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int zza(zzhf zzhfVar) throws zzgq {
        try {
            return zza(this.zzayq, zzhfVar);
        } catch (zzlj e) {
            throw zzgq.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzlc zza(zzld zzldVar, zzhf zzhfVar, boolean z) throws zzlj {
        return zzldVar.zzb(zzhfVar.zzagi, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzhb() throws zzgq {
        zzhf zzhfVar;
        if (this.zzaza != null || (zzhfVar = this.zzahd) == null) {
            return;
        }
        this.zzayy = this.zzayz;
        String str = zzhfVar.zzagi;
        zzjd<zzjh> zzjdVar = this.zzayy;
        if (zzjdVar != null) {
            int state = zzjdVar.getState();
            if (state == 0) {
                throw zzgq.zza(this.zzayy.zzgo(), getIndex());
            }
            if (state == 3 || state == 4) {
                this.zzayy.zzgn();
                throw new NoSuchMethodError();
            }
            return;
        }
        if (this.zzazb == null) {
            try {
                this.zzazb = zza(this.zzayq, this.zzahd, false);
            } catch (zzlj e) {
                zza(new zzle(this.zzahd, (Throwable) e, false, -49998));
            }
            if (this.zzazb == null) {
                zza(new zzle(this.zzahd, (Throwable) null, false, -49999));
            }
        }
        if (zza(this.zzazb)) {
            String str2 = this.zzazb.name;
            this.zzazc = zzov.SDK_INT < 21 && this.zzahd.zzagk.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.zzazd = zzov.SDK_INT < 18 || (zzov.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzov.SDK_INT == 19 && zzov.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.zzaze = zzov.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzov.DEVICE) || "flounder_lte".equals(zzov.DEVICE) || "grouper".equals(zzov.DEVICE) || "tilapia".equals(zzov.DEVICE));
            this.zzazf = zzov.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.zzazg = (zzov.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzov.SDK_INT <= 19 && "hb2000".equals(zzov.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.zzazh = zzov.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
            this.zzazi = zzov.SDK_INT <= 18 && this.zzahd.zzags == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String valueOf = String.valueOf(str2);
                zzow.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                this.zzaza = MediaCodec.createByCodecName(str2);
                zzow.endSection();
                zzow.beginSection("configureCodec");
                zza(this.zzazb, this.zzaza, this.zzahd, (MediaCrypto) null);
                zzow.endSection();
                zzow.beginSection("startCodec");
                this.zzaza.start();
                zzow.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.zzazl = this.zzaza.getInputBuffers();
                this.zzakl = this.zzaza.getOutputBuffers();
            } catch (Exception e2) {
                zza(new zzle(this.zzahd, (Throwable) e2, false, str2));
            }
            this.zzazm = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.zzazn = -1;
            this.zzazo = -1;
            this.zzazy = true;
            this.zzazz.zzane++;
        }
    }

    private final void zza(zzle zzleVar) throws zzgq {
        throw zzgq.zza(zzleVar, getIndex());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec zzhc() {
        return this.zzaza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlc zzhd() {
        return this.zzazb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgp
    public void zze(boolean z) throws zzgq {
        this.zzazz = new zziy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgp
    public void zza(long j, boolean z) throws zzgq {
        this.zzazv = false;
        this.zzazw = false;
        if (this.zzaza != null) {
            this.zzazm = -9223372036854775807L;
            this.zzazn = -1;
            this.zzazo = -1;
            this.zzazy = true;
            this.zzazx = false;
            this.zzazp = false;
            this.zzayw.clear();
            this.zzazj = false;
            this.zzazk = false;
            if (this.zzazd || (this.zzazg && this.zzazu)) {
                zzhe();
                zzhb();
            } else if (this.zzazs != 0) {
                zzhe();
                zzhb();
            } else {
                this.zzaza.flush();
                this.zzazt = false;
            }
            if (!this.zzazq || this.zzahd == null) {
                return;
            }
            this.zzazr = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgp
    public void zzeg() {
        this.zzahd = null;
        try {
            zzhe();
            try {
                if (this.zzayy != null) {
                    this.zzayr.zza(this.zzayy);
                }
                try {
                    if (this.zzayz != null && this.zzayz != this.zzayy) {
                        this.zzayr.zza(this.zzayz);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.zzayz != null && this.zzayz != this.zzayy) {
                        this.zzayr.zza(this.zzayz);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.zzayy != null) {
                    this.zzayr.zza(this.zzayy);
                }
                try {
                    if (this.zzayz != null && this.zzayz != this.zzayy) {
                        this.zzayr.zza(this.zzayz);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.zzayz != null && this.zzayz != this.zzayy) {
                        this.zzayr.zza(this.zzayz);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzhe() {
        this.zzazm = -9223372036854775807L;
        this.zzazn = -1;
        this.zzazo = -1;
        this.zzazx = false;
        this.zzazp = false;
        this.zzayw.clear();
        this.zzazl = null;
        this.zzakl = null;
        this.zzazb = null;
        this.zzazq = false;
        this.zzazt = false;
        this.zzazc = false;
        this.zzazd = false;
        this.zzaze = false;
        this.zzazf = false;
        this.zzazg = false;
        this.zzazi = false;
        this.zzazj = false;
        this.zzazk = false;
        this.zzazu = false;
        this.zzazr = 0;
        this.zzazs = 0;
        this.zzayt.zzcs = null;
        if (this.zzaza != null) {
            this.zzazz.zzanf++;
            try {
                this.zzaza.stop();
                try {
                    this.zzaza.release();
                    this.zzaza = null;
                    zzjd<zzjh> zzjdVar = this.zzayy;
                    if (zzjdVar == null || this.zzayz == zzjdVar) {
                        return;
                    }
                    try {
                        this.zzayr.zza(zzjdVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.zzaza = null;
                    zzjd<zzjh> zzjdVar2 = this.zzayy;
                    if (zzjdVar2 != null && this.zzayz != zzjdVar2) {
                        try {
                            this.zzayr.zza(zzjdVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.zzaza.release();
                    this.zzaza = null;
                    zzjd<zzjh> zzjdVar3 = this.zzayy;
                    if (zzjdVar3 != null && this.zzayz != zzjdVar3) {
                        try {
                            this.zzayr.zza(zzjdVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.zzaza = null;
                    zzjd<zzjh> zzjdVar4 = this.zzayy;
                    if (zzjdVar4 != null && this.zzayz != zzjdVar4) {
                        try {
                            this.zzayr.zza(zzjdVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public final void zzb(long j, long j2) throws zzgq {
        if (this.zzazw) {
            zzgd();
            return;
        }
        if (this.zzahd == null) {
            this.zzayu.clear();
            int zza = zza(this.zzayv, this.zzayu, true);
            if (zza != -5) {
                if (zza == -4) {
                    zzoh.checkState(this.zzayu.zzgh());
                    this.zzazv = true;
                    zzhg();
                    return;
                }
                return;
            }
            zzd(this.zzayv.zzahd);
        }
        zzhb();
        if (this.zzaza != null) {
            zzow.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzhf());
            zzow.endSection();
        } else {
            zzdn(j);
            this.zzayu.clear();
            int zza2 = zza(this.zzayv, this.zzayu, false);
            if (zza2 == -5) {
                zzd(this.zzayv.zzahd);
            } else if (zza2 == -4) {
                zzoh.checkState(this.zzayu.zzgh());
                this.zzazv = true;
                zzhg();
            }
        }
        this.zzazz.zzgm();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzhf() throws com.google.android.gms.internal.ads.zzgq {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlb.zzhf():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzd(zzhf zzhfVar) throws zzgq {
        MediaCodec mediaCodec;
        zzhf zzhfVar2 = this.zzahd;
        this.zzahd = zzhfVar;
        boolean z = true;
        if (!zzov.zza(zzhfVar.zzagl, zzhfVar2 == null ? null : zzhfVar2.zzagl)) {
            if (this.zzahd.zzagl != null) {
                zzjf<zzjh> zzjfVar = this.zzayr;
                if (zzjfVar == null) {
                    throw zzgq.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
                zzjd<zzjh> zza = zzjfVar.zza(Looper.myLooper(), this.zzahd.zzagl);
                this.zzayz = zza;
                if (zza == this.zzayy) {
                    this.zzayr.zza(zza);
                }
            } else {
                this.zzayz = null;
            }
        }
        if (this.zzayz == this.zzayy && (mediaCodec = this.zzaza) != null && zza(mediaCodec, this.zzazb.zzbaa, zzhfVar2, this.zzahd)) {
            this.zzazq = true;
            this.zzazr = 1;
            this.zzazj = (this.zzaze && this.zzahd.width == zzhfVar2.width && this.zzahd.height == zzhfVar2.height) ? false : false;
        } else if (this.zzazt) {
            this.zzazs = 1;
        } else {
            zzhe();
            zzhb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public boolean zzfd() {
        return this.zzazw;
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public boolean isReady() {
        if (this.zzahd == null || this.zzazx) {
            return false;
        }
        if (zzei() || this.zzazo >= 0) {
            return true;
        }
        return this.zzazm != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzazm;
    }

    private final boolean zzd(long j, long j2) throws zzgq {
        boolean zza;
        boolean z;
        if (this.zzazo < 0) {
            if (this.zzazh && this.zzazu) {
                try {
                    this.zzazo = this.zzaza.dequeueOutputBuffer(this.zzayx, 0L);
                } catch (IllegalStateException unused) {
                    zzhg();
                    if (this.zzazw) {
                        zzhe();
                    }
                    return false;
                }
            } else {
                this.zzazo = this.zzaza.dequeueOutputBuffer(this.zzayx, 0L);
            }
            int i = this.zzazo;
            if (i < 0) {
                if (i != -2) {
                    if (i == -3) {
                        this.zzakl = this.zzaza.getOutputBuffers();
                        return true;
                    }
                    if (this.zzazf && (this.zzazv || this.zzazs == 2)) {
                        zzhg();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.zzaza.getOutputFormat();
                if (this.zzaze && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzazk = true;
                } else {
                    if (this.zzazi) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzaza, outputFormat);
                }
                return true;
            } else if (this.zzazk) {
                this.zzazk = false;
                this.zzaza.releaseOutputBuffer(i, false);
                this.zzazo = -1;
                return true;
            } else if ((this.zzayx.flags & 4) != 0) {
                zzhg();
                this.zzazo = -1;
                return false;
            } else {
                ByteBuffer byteBuffer = this.zzakl[this.zzazo];
                if (byteBuffer != null) {
                    byteBuffer.position(this.zzayx.offset);
                    byteBuffer.limit(this.zzayx.offset + this.zzayx.size);
                }
                long j3 = this.zzayx.presentationTimeUs;
                int size = this.zzayw.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    } else if (this.zzayw.get(i2).longValue() == j3) {
                        this.zzayw.remove(i2);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                this.zzazp = z;
            }
        }
        if (this.zzazh && this.zzazu) {
            try {
                zza = zza(j, j2, this.zzaza, this.zzakl[this.zzazo], this.zzazo, this.zzayx.flags, this.zzayx.presentationTimeUs, this.zzazp);
            } catch (IllegalStateException unused2) {
                zzhg();
                if (this.zzazw) {
                    zzhe();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.zzaza;
            ByteBuffer[] byteBufferArr = this.zzakl;
            int i3 = this.zzazo;
            zza = zza(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzayx.flags, this.zzayx.presentationTimeUs, this.zzazp);
        }
        if (zza) {
            long j4 = this.zzayx.presentationTimeUs;
            this.zzazo = -1;
            return true;
        }
        return false;
    }

    private final void zzhg() throws zzgq {
        if (this.zzazs == 2) {
            zzhe();
            zzhb();
            return;
        }
        this.zzazw = true;
        zzgd();
    }
}
