package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzio extends zzlb implements zzol {
    private int zzags;
    private int zzagu;
    private final zzhw zzalq;
    private final zzif zzalr;
    private boolean zzals;
    private boolean zzalt;
    private MediaFormat zzalu;
    private long zzalv;
    private boolean zzalw;

    public zzio(zzld zzldVar) {
        this(zzldVar, null, true);
    }

    public static void zzb(int i, long j, long j2) {
    }

    public static void zzgc() {
    }

    public static void zzu(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzhk
    public final zzol zzdz() {
        return this;
    }

    private zzio(zzld zzldVar, zzjf<zzjh> zzjfVar, boolean z) {
        this(zzldVar, null, true, null, null);
    }

    private zzio(zzld zzldVar, zzjf<zzjh> zzjfVar, boolean z, zzdns zzdnsVar, zzhx zzhxVar) {
        this(zzldVar, null, true, null, null, null, new zzhv[0]);
    }

    private zzio(zzld zzldVar, zzjf<zzjh> zzjfVar, boolean z, zzdns zzdnsVar, zzhx zzhxVar, zzhs zzhsVar, zzhv... zzhvVarArr) {
        super(1, zzldVar, zzjfVar, z);
        this.zzalr = new zzif(null, zzhvVarArr, new zziq(this));
        this.zzalq = new zzhw(null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final int zza(zzld zzldVar, zzhf zzhfVar) throws zzlj {
        String str = zzhfVar.zzagi;
        boolean z = false;
        if (zzoo.zzbd(str)) {
            int i = zzov.SDK_INT >= 21 ? 16 : 0;
            if (!zzay(str) || zzldVar.zzhi() == null) {
                zzlc zzb = zzldVar.zzb(str, false);
                if (zzb == null) {
                    return 1;
                }
                if (zzov.SDK_INT < 21 || ((zzhfVar.zzagt == -1 || zzb.zzas(zzhfVar.zzagt)) && (zzhfVar.zzags == -1 || zzb.zzat(zzhfVar.zzags)))) {
                    z = true;
                }
                return i | 4 | (z ? 3 : 2);
            }
            return i | 4 | 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzlc zza(zzld zzldVar, zzhf zzhfVar, boolean z) throws zzlj {
        zzlc zzhi;
        if (zzay(zzhfVar.zzagi) && (zzhi = zzldVar.zzhi()) != null) {
            this.zzals = true;
            return zzhi;
        }
        this.zzals = false;
        return super.zza(zzldVar, zzhfVar, z);
    }

    private final boolean zzay(String str) {
        return this.zzalr.zzaw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void zza(zzlc zzlcVar, MediaCodec mediaCodec, zzhf zzhfVar, MediaCrypto mediaCrypto) {
        this.zzalt = zzov.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(zzlcVar.name) && "samsung".equals(zzov.MANUFACTURER) && (zzov.DEVICE.startsWith("zeroflte") || zzov.DEVICE.startsWith("herolte") || zzov.DEVICE.startsWith("heroqlte"));
        if (this.zzals) {
            MediaFormat zzez = zzhfVar.zzez();
            this.zzalu = zzez;
            zzez.setString("mime", "audio/raw");
            mediaCodec.configure(this.zzalu, (Surface) null, (MediaCrypto) null, 0);
            this.zzalu.setString("mime", zzhfVar.zzagi);
            return;
        }
        mediaCodec.configure(zzhfVar.zzez(), (Surface) null, (MediaCrypto) null, 0);
        this.zzalu = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void zzc(String str, long j, long j2) {
        this.zzalq.zza(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb
    public final void zzd(zzhf zzhfVar) throws zzgq {
        super.zzd(zzhfVar);
        this.zzalq.zzb(zzhfVar);
        this.zzagu = "audio/raw".equals(zzhfVar.zzagi) ? zzhfVar.zzagu : 2;
        this.zzags = zzhfVar.zzags;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzgq {
        int[] iArr;
        int i;
        boolean z = this.zzalu != null;
        String string = z ? this.zzalu.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.zzalu;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzalt && integer == 6 && (i = this.zzags) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.zzags; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.zzalr.zza(string, integer, integer2, this.zzagu, 0, iArr);
        } catch (zzij e) {
            throw zzgq.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void zze(boolean z) throws zzgq {
        super.zze(z);
        this.zzalq.zza(this.zzazz);
        int i = zzeh().zzahj;
        if (i != 0) {
            this.zzalr.zzv(i);
        } else {
            this.zzalr.zzfs();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void zza(long j, boolean z) throws zzgq {
        super.zza(j, z);
        this.zzalr.reset();
        this.zzalv = j;
        this.zzalw = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void onStarted() {
        super.onStarted();
        this.zzalr.play();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void onStopped() {
        this.zzalr.pause();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzgp
    public final void zzeg() {
        try {
            this.zzalr.release();
            try {
                super.zzeg();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzeg();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzhk
    public final boolean zzfd() {
        return super.zzfd() && this.zzalr.zzfd();
    }

    @Override // com.google.android.gms.internal.ads.zzlb, com.google.android.gms.internal.ads.zzhk
    public final boolean isReady() {
        return this.zzalr.zzfq() || super.isReady();
    }

    @Override // com.google.android.gms.internal.ads.zzol
    public final long zzgb() {
        long zzj = this.zzalr.zzj(zzfd());
        if (zzj != Long.MIN_VALUE) {
            if (!this.zzalw) {
                zzj = Math.max(this.zzalv, zzj);
            }
            this.zzalv = zzj;
            this.zzalw = false;
        }
        return this.zzalv;
    }

    @Override // com.google.android.gms.internal.ads.zzol
    public final zzhl zzb(zzhl zzhlVar) {
        return this.zzalr.zzb(zzhlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzol
    public final zzhl zzfr() {
        return this.zzalr.zzfr();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzgq {
        if (this.zzals && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzazz.zzani++;
            this.zzalr.zzfn();
            return true;
        } else {
            try {
                if (this.zzalr.zza(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.zzazz.zzanh++;
                    return true;
                }
                return false;
            } catch (zzii | zzin e) {
                throw zzgq.zza(e, getIndex());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    protected final void zzgd() throws zzgq {
        try {
            this.zzalr.zzfo();
        } catch (zzin e) {
            throw zzgq.zza(e, getIndex());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzgv
    public final void zza(int i, Object obj) throws zzgq {
        if (i == 2) {
            this.zzalr.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzalr.setStreamType(((Integer) obj).intValue());
        } else {
            super.zza(i, obj);
        }
    }

    public static /* synthetic */ boolean zza(zzio zzioVar, boolean z) {
        zzioVar.zzalw = true;
        return true;
    }
}
