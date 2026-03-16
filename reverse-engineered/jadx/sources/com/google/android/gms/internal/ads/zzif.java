package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzif {
    private static boolean zzaiv = false;
    private static boolean zzaiw = false;
    private int streamType;
    private zzhl zzaek;
    private int zzagt;
    private final zzim zzaiy;
    private final zziv zzaiz;
    private final zzhv[] zzaja;
    private final zzil zzajb;
    private final long[] zzajd;
    private final zzih zzaje;
    private final LinkedList<zzik> zzajf;
    private AudioTrack zzajg;
    private int zzajh;
    private int zzaji;
    private int zzajj;
    private boolean zzajk;
    private int zzajl;
    private long zzajm;
    private zzhl zzajn;
    private long zzajo;
    private long zzajp;
    private ByteBuffer zzajq;
    private int zzajr;
    private int zzajs;
    private int zzajt;
    private long zzaju;
    private long zzajv;
    private boolean zzajw;
    private long zzajx;
    private Method zzajy;
    private int zzajz;
    private long zzaka;
    private long zzakb;
    private int zzakc;
    private long zzakd;
    private long zzake;
    private int zzakf;
    private int zzakg;
    private long zzakh;
    private long zzaki;
    private long zzakj;
    private zzhv[] zzakk;
    private ByteBuffer[] zzakl;
    private ByteBuffer zzakm;
    private ByteBuffer zzakn;
    private byte[] zzako;
    private int zzakp;
    private int zzakq;
    private boolean zzakr;
    private boolean zzaks;
    private int zzakt;
    private boolean zzaku;
    private boolean zzakv;
    private long zzakw;
    private float zzcy;
    private final zzhs zzaix = null;
    private final ConditionVariable zzajc = new ConditionVariable(true);

    public zzif(zzhs zzhsVar, zzhv[] zzhvVarArr, zzil zzilVar) {
        this.zzajb = zzilVar;
        if (zzov.SDK_INT >= 18) {
            try {
                this.zzajy = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzov.SDK_INT >= 19) {
            this.zzaje = new zzig();
        } else {
            this.zzaje = new zzih(null);
        }
        this.zzaiy = new zzim();
        this.zzaiz = new zziv();
        zzhv[] zzhvVarArr2 = new zzhv[zzhvVarArr.length + 3];
        this.zzaja = zzhvVarArr2;
        zzhvVarArr2[0] = new zzit();
        zzhv[] zzhvVarArr3 = this.zzaja;
        zzhvVarArr3[1] = this.zzaiy;
        System.arraycopy(zzhvVarArr, 0, zzhvVarArr3, 2, zzhvVarArr.length);
        this.zzaja[zzhvVarArr.length + 2] = this.zzaiz;
        this.zzajd = new long[10];
        this.zzcy = 1.0f;
        this.zzakg = 0;
        this.streamType = 3;
        this.zzakt = 0;
        this.zzaek = zzhl.zzahe;
        this.zzakq = -1;
        this.zzakk = new zzhv[0];
        this.zzakl = new ByteBuffer[0];
        this.zzajf = new LinkedList<>();
    }

    public final boolean zzaw(String str) {
        zzhs zzhsVar = this.zzaix;
        return zzhsVar != null && zzhsVar.zzs(zzax(str));
    }

    public final long zzj(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        Method method;
        if (isInitialized() && this.zzakg != 0) {
            if (this.zzajg.getPlayState() == 3) {
                long zzgb = this.zzaje.zzgb();
                if (zzgb != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - this.zzajv >= 30000) {
                        long[] jArr = this.zzajd;
                        int i = this.zzajs;
                        jArr[i] = zzgb - nanoTime;
                        this.zzajs = (i + 1) % 10;
                        int i2 = this.zzajt;
                        if (i2 < 10) {
                            this.zzajt = i2 + 1;
                        }
                        this.zzajv = nanoTime;
                        this.zzaju = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = this.zzajt;
                            if (i3 >= i4) {
                                break;
                            }
                            this.zzaju += this.zzajd[i3] / i4;
                            i3++;
                        }
                    }
                    if (!zzfw() && nanoTime - this.zzajx >= 500000) {
                        boolean zzfx = this.zzaje.zzfx();
                        this.zzajw = zzfx;
                        if (zzfx) {
                            long zzfy = this.zzaje.zzfy() / 1000;
                            long zzfz = this.zzaje.zzfz();
                            if (zzfy < this.zzaki) {
                                this.zzajw = false;
                            } else if (Math.abs(zzfy - nanoTime) > 5000000) {
                                StringBuilder sb = new StringBuilder(136);
                                sb.append("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(zzfz);
                                sb.append(", ");
                                sb.append(zzfy);
                                sb.append(", ");
                                sb.append(nanoTime);
                                sb.append(", ");
                                sb.append(zzgb);
                                Log.w("AudioTrack", sb.toString());
                                this.zzajw = false;
                            } else if (Math.abs(zzdw(zzfz) - zzgb) > 5000000) {
                                StringBuilder sb2 = new StringBuilder(138);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(zzfz);
                                sb2.append(", ");
                                sb2.append(zzfy);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(zzgb);
                                Log.w("AudioTrack", sb2.toString());
                                this.zzajw = false;
                            }
                        }
                        if (this.zzajy != null && !this.zzajk) {
                            try {
                                long intValue = (((Integer) method.invoke(this.zzajg, null)).intValue() * 1000) - this.zzajm;
                                this.zzakj = intValue;
                                long max = Math.max(intValue, 0L);
                                this.zzakj = max;
                                if (max > 5000000) {
                                    StringBuilder sb3 = new StringBuilder(61);
                                    sb3.append("Ignoring impossibly large audio latency: ");
                                    sb3.append(max);
                                    Log.w("AudioTrack", sb3.toString());
                                    this.zzakj = 0L;
                                }
                            } catch (Exception unused) {
                                this.zzajy = null;
                            }
                        }
                        this.zzajx = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (this.zzajw) {
                j = zzdw(this.zzaje.zzfz() + zzdx(nanoTime2 - (this.zzaje.zzfy() / 1000)));
            } else {
                if (this.zzajt == 0) {
                    j = this.zzaje.zzgb();
                } else {
                    j = nanoTime2 + this.zzaju;
                }
                if (!z) {
                    j -= this.zzakj;
                }
            }
            long j5 = this.zzakh;
            while (!this.zzajf.isEmpty() && j >= zzik.zzb(this.zzajf.getFirst())) {
                zzik remove = this.zzajf.remove();
                this.zzaek = zzik.zza(remove);
                this.zzajp = zzik.zzb(remove);
                this.zzajo = zzik.zzc(remove) - this.zzakh;
            }
            if (this.zzaek.zzahf == 1.0f) {
                j4 = (j + this.zzajo) - this.zzajp;
            } else {
                if (this.zzajf.isEmpty() && this.zzaiz.zzgk() >= 1024) {
                    j2 = this.zzajo;
                    j3 = zzov.zza(j - this.zzajp, this.zzaiz.zzgj(), this.zzaiz.zzgk());
                } else {
                    j2 = this.zzajo;
                    double d = this.zzaek.zzahf;
                    double d2 = j - this.zzajp;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    j3 = (long) (d * d2);
                }
                j4 = j3 + j2;
            }
            return j5 + j4;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzij {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzif.zza(java.lang.String, int, int, int, int, int[]):void");
    }

    private final void zzfm() {
        zzhv[] zzhvVarArr;
        ArrayList arrayList = new ArrayList();
        for (zzhv zzhvVar : this.zzaja) {
            if (zzhvVar.isActive()) {
                arrayList.add(zzhvVar);
            } else {
                zzhvVar.flush();
            }
        }
        int size = arrayList.size();
        this.zzakk = (zzhv[]) arrayList.toArray(new zzhv[size]);
        this.zzakl = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzhv zzhvVar2 = this.zzakk[i];
            zzhvVar2.flush();
            this.zzakl[i] = zzhvVar2.zzfl();
        }
    }

    public final void play() {
        this.zzaks = true;
        if (isInitialized()) {
            this.zzaki = System.nanoTime() / 1000;
            this.zzajg.play();
        }
    }

    public final void zzfn() {
        if (this.zzakg == 1) {
            this.zzakg = 2;
        }
    }

    public final boolean zza(ByteBuffer byteBuffer, long j) throws zzii, zzin {
        int i;
        int zzj;
        ByteBuffer byteBuffer2 = this.zzakm;
        zzoh.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!isInitialized()) {
            this.zzajc.block();
            if (this.zzaku) {
                this.zzajg = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzajh).setEncoding(this.zzajj).setSampleRate(this.zzagt).build(), this.zzajl, 1, this.zzakt);
            } else if (this.zzakt == 0) {
                this.zzajg = new AudioTrack(this.streamType, this.zzagt, this.zzajh, this.zzajj, this.zzajl, 1);
            } else {
                this.zzajg = new AudioTrack(this.streamType, this.zzagt, this.zzajh, this.zzajj, this.zzajl, 1, this.zzakt);
            }
            int state = this.zzajg.getState();
            if (state != 1) {
                try {
                    this.zzajg.release();
                } catch (Exception unused) {
                } finally {
                    this.zzajg = null;
                }
                throw new zzii(state, this.zzagt, this.zzajh, this.zzajl);
            }
            int audioSessionId = this.zzajg.getAudioSessionId();
            if (this.zzakt != audioSessionId) {
                this.zzakt = audioSessionId;
                this.zzajb.zzu(audioSessionId);
            }
            this.zzaje.zza(this.zzajg, zzfw());
            zzft();
            this.zzakv = false;
            if (this.zzaks) {
                play();
            }
        }
        if (zzfw()) {
            if (this.zzajg.getPlayState() == 2) {
                this.zzakv = false;
                return false;
            } else if (this.zzajg.getPlayState() == 1 && this.zzaje.zzga() != 0) {
                return false;
            }
        }
        boolean z = this.zzakv;
        boolean zzfq = zzfq();
        this.zzakv = zzfq;
        if (z && !zzfq && this.zzajg.getPlayState() != 1) {
            this.zzajb.zzc(this.zzajl, zzgr.zzdo(this.zzajm), SystemClock.elapsedRealtime() - this.zzakw);
        }
        if (this.zzakm == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzajk && this.zzakf == 0) {
                int i2 = this.zzajj;
                if (i2 == 7 || i2 == 8) {
                    zzj = zzip.zzj(byteBuffer);
                } else if (i2 == 5) {
                    zzj = zzht.zzfh();
                } else if (i2 == 6) {
                    zzj = zzht.zzh(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzakf = zzj;
            }
            if (this.zzajn != null) {
                if (!zzfp()) {
                    return false;
                }
                this.zzajf.add(new zzik(this.zzajn, Math.max(0L, j), zzdw(zzfu()), null));
                this.zzajn = null;
                zzfm();
            }
            if (this.zzakg == 0) {
                this.zzakh = Math.max(0L, j);
                this.zzakg = 1;
            } else {
                long zzdw = this.zzakh + zzdw(this.zzajk ? this.zzakb : this.zzaka / this.zzajz);
                if (this.zzakg != 1 || Math.abs(zzdw - j) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzdw);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzakg = 2;
                }
                if (this.zzakg == i) {
                    this.zzakh += j - zzdw;
                    this.zzakg = 1;
                    this.zzajb.zzej();
                }
            }
            if (this.zzajk) {
                this.zzakb += this.zzakf;
            } else {
                this.zzaka += byteBuffer.remaining();
            }
            this.zzakm = byteBuffer;
        }
        if (this.zzajk) {
            zzb(this.zzakm, j);
        } else {
            zzdv(j);
        }
        if (this.zzakm.hasRemaining()) {
            return false;
        }
        this.zzakm = null;
        return true;
    }

    private final void zzdv(long j) throws zzin {
        ByteBuffer byteBuffer;
        int length = this.zzakk.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzakl[i - 1];
            } else {
                byteBuffer = this.zzakm;
                if (byteBuffer == null) {
                    byteBuffer = zzhv.zzaig;
                }
            }
            if (i == length) {
                zzb(byteBuffer, j);
            } else {
                zzhv zzhvVar = this.zzakk[i];
                zzhvVar.zzi(byteBuffer);
                ByteBuffer zzfl = zzhvVar.zzfl();
                this.zzakl[i] = zzfl;
                if (zzfl.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r11 < r10) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzb(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzin {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzif.zzb(java.nio.ByteBuffer, long):boolean");
    }

    public final void zzfo() throws zzin {
        if (!this.zzakr && isInitialized() && zzfp()) {
            this.zzaje.zzdy(zzfu());
            this.zzajr = 0;
            this.zzakr = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzfp() throws com.google.android.gms.internal.ads.zzin {
        /*
            r9 = this;
            int r0 = r9.zzakq
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzajk
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzhv[] r0 = r9.zzakk
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzakq = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzakq
            com.google.android.gms.internal.ads.zzhv[] r5 = r9.zzakk
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzfk()
        L28:
            r9.zzdv(r7)
            boolean r0 = r4.zzfd()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzakq
            int r0 = r0 + r2
            r9.zzakq = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzakn
            if (r0 == 0) goto L44
            r9.zzb(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzakn
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzakq = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzif.zzfp():boolean");
    }

    public final boolean zzfd() {
        if (isInitialized()) {
            return this.zzakr && !zzfq();
        }
        return true;
    }

    public final boolean zzfq() {
        if (isInitialized()) {
            if (zzfu() <= this.zzaje.zzga()) {
                if (zzfw() && this.zzajg.getPlayState() == 2 && this.zzajg.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final zzhl zzb(zzhl zzhlVar) {
        if (this.zzajk) {
            zzhl zzhlVar2 = zzhl.zzahe;
            this.zzaek = zzhlVar2;
            return zzhlVar2;
        }
        zzhl zzhlVar3 = new zzhl(this.zzaiz.zzb(zzhlVar.zzahf), this.zzaiz.zzc(zzhlVar.zzahg));
        zzhl zzhlVar4 = this.zzajn;
        if (zzhlVar4 == null) {
            if (!this.zzajf.isEmpty()) {
                zzhlVar4 = zzik.zza(this.zzajf.getLast());
            } else {
                zzhlVar4 = this.zzaek;
            }
        }
        if (!zzhlVar3.equals(zzhlVar4)) {
            if (isInitialized()) {
                this.zzajn = zzhlVar3;
            } else {
                this.zzaek = zzhlVar3;
            }
        }
        return this.zzaek;
    }

    public final zzhl zzfr() {
        return this.zzaek;
    }

    public final void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        if (this.zzaku) {
            return;
        }
        reset();
        this.zzakt = 0;
    }

    public final void zzv(int i) {
        zzoh.checkState(zzov.SDK_INT >= 21);
        if (this.zzaku && this.zzakt == i) {
            return;
        }
        this.zzaku = true;
        this.zzakt = i;
        reset();
    }

    public final void zzfs() {
        if (this.zzaku) {
            this.zzaku = false;
            this.zzakt = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzcy != f) {
            this.zzcy = f;
            zzft();
        }
    }

    private final void zzft() {
        if (isInitialized()) {
            if (zzov.SDK_INT >= 21) {
                this.zzajg.setVolume(this.zzcy);
                return;
            }
            AudioTrack audioTrack = this.zzajg;
            float f = this.zzcy;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void pause() {
        this.zzaks = false;
        if (isInitialized()) {
            zzfv();
            this.zzaje.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzaka = 0L;
            this.zzakb = 0L;
            this.zzakd = 0L;
            this.zzake = 0L;
            this.zzakf = 0;
            zzhl zzhlVar = this.zzajn;
            if (zzhlVar != null) {
                this.zzaek = zzhlVar;
                this.zzajn = null;
            } else if (!this.zzajf.isEmpty()) {
                this.zzaek = zzik.zza(this.zzajf.getLast());
            }
            this.zzajf.clear();
            this.zzajo = 0L;
            this.zzajp = 0L;
            this.zzakm = null;
            this.zzakn = null;
            int i = 0;
            while (true) {
                zzhv[] zzhvVarArr = this.zzakk;
                if (i >= zzhvVarArr.length) {
                    break;
                }
                zzhv zzhvVar = zzhvVarArr[i];
                zzhvVar.flush();
                this.zzakl[i] = zzhvVar.zzfl();
                i++;
            }
            this.zzakr = false;
            this.zzakq = -1;
            this.zzajq = null;
            this.zzajr = 0;
            this.zzakg = 0;
            this.zzakj = 0L;
            zzfv();
            if (this.zzajg.getPlayState() == 3) {
                this.zzajg.pause();
            }
            AudioTrack audioTrack = this.zzajg;
            this.zzajg = null;
            this.zzaje.zza(null, false);
            this.zzajc.close();
            new zzie(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzhv zzhvVar : this.zzaja) {
            zzhvVar.reset();
        }
        this.zzakt = 0;
        this.zzaks = false;
    }

    private final boolean isInitialized() {
        return this.zzajg != null;
    }

    private final long zzdw(long j) {
        return (j * 1000000) / this.zzagt;
    }

    private final long zzdx(long j) {
        return (j * this.zzagt) / 1000000;
    }

    private final long zzfu() {
        return this.zzajk ? this.zzake : this.zzakd / this.zzakc;
    }

    private final void zzfv() {
        this.zzaju = 0L;
        this.zzajt = 0;
        this.zzajs = 0;
        this.zzajv = 0L;
        this.zzajw = false;
        this.zzajx = 0L;
    }

    private final boolean zzfw() {
        if (zzov.SDK_INT < 23) {
            int i = this.zzajj;
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzax(String str) {
        char c;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return c != 3 ? 0 : 8;
                }
                return 7;
            }
            return 6;
        }
        return 5;
    }
}
