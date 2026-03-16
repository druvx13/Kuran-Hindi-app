package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzja;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzkc implements zzjm {
    private static final zzjn zzaon = new zzkb();
    private static final byte[] zzaoo = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzaop = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzaoq = new UUID(72057594037932032L, -9223371306706625679L);
    private long zzaht;
    private final zzkf zzaof;
    private final zzka zzaor;
    private final SparseArray<zzkd> zzaos;
    private final boolean zzaot;
    private final zzos zzaou;
    private final zzos zzaov;
    private final zzos zzaow;
    private final zzos zzaox;
    private final zzos zzaoy;
    private final zzos zzaoz;
    private final zzos zzapa;
    private final zzos zzapb;
    private final zzos zzapc;
    private ByteBuffer zzapd;
    private long zzape;
    private long zzapf;
    private long zzapg;
    private long zzaph;
    private zzkd zzapi;
    private boolean zzapj;
    private int zzapk;
    private long zzapl;
    private boolean zzapm;
    private long zzapn;
    private long zzapo;
    private long zzapp;
    private zzom zzapq;
    private zzom zzapr;
    private boolean zzaps;
    private int zzapt;
    private long zzapu;
    private long zzapv;
    private int zzapw;
    private int zzapx;
    private int[] zzapy;
    private int zzapz;
    private int zzaqa;
    private int zzaqb;
    private int zzaqc;
    private boolean zzaqd;
    private boolean zzaqe;
    private boolean zzaqf;
    private boolean zzaqg;
    private byte zzaqh;
    private int zzaqi;
    private int zzaqj;
    private int zzaqk;
    private boolean zzaql;
    private boolean zzaqm;
    private zzjo zzaqn;

    public zzkc() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzaj(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzak(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void release() {
    }

    private zzkc(int i) {
        this(new zzjv(), 0);
    }

    private zzkc(zzka zzkaVar, int i) {
        this.zzapf = -1L;
        this.zzapg = -9223372036854775807L;
        this.zzaph = -9223372036854775807L;
        this.zzaht = -9223372036854775807L;
        this.zzapn = -1L;
        this.zzapo = -1L;
        this.zzapp = -9223372036854775807L;
        this.zzaor = zzkaVar;
        zzkaVar.zza(new zzke(this, null));
        this.zzaot = true;
        this.zzaof = new zzkf();
        this.zzaos = new SparseArray<>();
        this.zzaow = new zzos(4);
        this.zzaox = new zzos(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzaoy = new zzos(4);
        this.zzaou = new zzos(zzon.zzbhb);
        this.zzaov = new zzos(4);
        this.zzaoz = new zzos();
        this.zzapa = new zzos();
        this.zzapb = new zzos(8);
        this.zzapc = new zzos();
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final boolean zza(zzjl zzjlVar) throws IOException, InterruptedException {
        return new zzkg().zza(zzjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void zza(zzjo zzjoVar) {
        this.zzaqn = zzjoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjm
    public final void zzc(long j, long j2) {
        this.zzapp = -9223372036854775807L;
        this.zzapt = 0;
        this.zzaor.reset();
        this.zzaof.reset();
        zzgt();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzjl r9, com.google.android.gms.internal.ads.zzjs r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.zzaql = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.zzaql
            if (r3 != 0) goto L3a
            com.google.android.gms.internal.ads.zzka r2 = r8.zzaor
            boolean r2 = r2.zzb(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.zzapm
            if (r5 == 0) goto L25
            r8.zzapo = r3
            long r3 = r8.zzapn
            r10.position = r3
            r8.zzapm = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.zzapj
            if (r3 == 0) goto L36
            long r3 = r8.zzapo
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.position = r3
            r8.zzapo = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 == 0) goto L3d
            return r0
        L3d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zza(com.google.android.gms.internal.ads.zzjl, com.google.android.gms.internal.ads.zzjs):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, long j, long j2) throws zzhi {
        if (i == 160) {
            this.zzaqm = false;
        } else if (i == 174) {
            this.zzapi = new zzkd(null);
        } else if (i == 187) {
            this.zzaps = false;
        } else if (i == 19899) {
            this.zzapk = -1;
            this.zzapl = -1L;
        } else if (i == 20533) {
            this.zzapi.zzaqq = true;
        } else if (i == 21968) {
            this.zzapi.zzaqx = true;
        } else if (i == 408125543) {
            long j3 = this.zzapf;
            if (j3 != -1 && j3 != j) {
                throw new zzhi("Multiple Segment elements not supported");
            }
            this.zzapf = j;
            this.zzape = j2;
        } else if (i == 475249515) {
            this.zzapq = new zzom();
            this.zzapr = new zzom();
        } else if (i == 524531317 && !this.zzapj) {
            if (this.zzaot && this.zzapn != -1) {
                this.zzapm = true;
                return;
            }
            this.zzaqn.zza(new zzju(this.zzaht));
            this.zzapj = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzal(int i) throws zzhi {
        zzjr zzjuVar;
        zzom zzomVar;
        zzom zzomVar2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.zzapt != 2) {
                return;
            }
            if (!this.zzaqm) {
                this.zzaqb |= 1;
            }
            zza(this.zzaos.get(this.zzapz), this.zzapu);
            this.zzapt = 0;
        } else if (i == 174) {
            String str = this.zzapi.zzaqo;
            if ((("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) ? 1 : 1) != 0) {
                zzkd zzkdVar = this.zzapi;
                zzkdVar.zza(this.zzaqn, zzkdVar.number);
                this.zzaos.put(this.zzapi.number, this.zzapi);
            }
            this.zzapi = null;
        } else if (i == 19899) {
            int i4 = this.zzapk;
            if (i4 != -1) {
                long j = this.zzapl;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.zzapn = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzhi("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            if (this.zzapi.zzaqq) {
                if (this.zzapi.zzaqs == null) {
                    throw new zzhi("Encrypted Track found but ContentEncKeyID was not found");
                }
                this.zzapi.zzagl = new zzja(new zzja.zza(zzgr.zzadl, "video/webm", this.zzapi.zzaqs.zzaol));
            }
        } else if (i == 28032) {
            if (this.zzapi.zzaqq && this.zzapi.zzaqr != null) {
                throw new zzhi("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.zzapg == -9223372036854775807L) {
                this.zzapg = 1000000L;
            }
            long j2 = this.zzaph;
            if (j2 != -9223372036854775807L) {
                this.zzaht = zzea(j2);
            }
        } else if (i != 374648427) {
            if (i == 475249515 && !this.zzapj) {
                zzjo zzjoVar = this.zzaqn;
                if (this.zzapf == -1 || this.zzaht == -9223372036854775807L || (zzomVar = this.zzapq) == null || zzomVar.size() == 0 || (zzomVar2 = this.zzapr) == null || zzomVar2.size() != this.zzapq.size()) {
                    this.zzapq = null;
                    this.zzapr = null;
                    zzjuVar = new zzju(this.zzaht);
                } else {
                    int size = this.zzapq.size();
                    int[] iArr = new int[size];
                    long[] jArr = new long[size];
                    long[] jArr2 = new long[size];
                    long[] jArr3 = new long[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        jArr3[i5] = this.zzapq.get(i5);
                        jArr[i5] = this.zzapf + this.zzapr.get(i5);
                    }
                    while (true) {
                        i2 = size - 1;
                        if (i3 >= i2) {
                            break;
                        }
                        int i6 = i3 + 1;
                        iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                        jArr2[i3] = jArr3[i6] - jArr3[i3];
                        i3 = i6;
                    }
                    iArr[i2] = (int) ((this.zzapf + this.zzape) - jArr[i2]);
                    jArr2[i2] = this.zzaht - jArr3[i2];
                    this.zzapq = null;
                    this.zzapr = null;
                    zzjuVar = new zzjk(iArr, jArr, jArr2, jArr3);
                }
                zzjoVar.zza(zzjuVar);
                this.zzapj = true;
            }
        } else if (this.zzaos.size() == 0) {
            throw new zzhi("No valid tracks were found");
        } else {
            this.zzaqn.zzgr();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i, long j) throws zzhi {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new zzhi(sb.toString());
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new zzhi(sb2.toString());
        } else {
            switch (i) {
                case 131:
                    this.zzapi.type = (int) j;
                    return;
                case 136:
                    this.zzapi.zzarq = j == 1;
                    return;
                case 155:
                    this.zzapv = zzea(j);
                    return;
                case 159:
                    this.zzapi.zzags = (int) j;
                    return;
                case 176:
                    this.zzapi.width = (int) j;
                    return;
                case 179:
                    this.zzapq.add(zzea(j));
                    return;
                case 186:
                    this.zzapi.height = (int) j;
                    return;
                case 215:
                    this.zzapi.number = (int) j;
                    return;
                case 231:
                    this.zzapp = zzea(j);
                    return;
                case 241:
                    if (this.zzaps) {
                        return;
                    }
                    this.zzapr.add(j);
                    this.zzaps = true;
                    return;
                case 251:
                    this.zzaqm = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzhi(sb3.toString());
                case 17029:
                    if (j < 1 || j > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j);
                        sb4.append(" not supported");
                        throw new zzhi(sb4.toString());
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzhi(sb5.toString());
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzhi(sb6.toString());
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzhi(sb7.toString());
                case 21420:
                    this.zzapl = j + this.zzapf;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzapi.zzagp = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzapi.zzagp = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzapi.zzagp = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzapi.zzagp = 3;
                        return;
                    }
                case 21680:
                    this.zzapi.zzaqu = (int) j;
                    return;
                case 21682:
                    this.zzapi.zzaqw = (int) j;
                    return;
                case 21690:
                    this.zzapi.zzaqv = (int) j;
                    return;
                case 21930:
                    this.zzapi.zzarr = j == 1;
                    return;
                case 22186:
                    this.zzapi.zzaro = j;
                    return;
                case 22203:
                    this.zzapi.zzarp = j;
                    return;
                case 25188:
                    this.zzapi.zzarn = (int) j;
                    return;
                case 2352003:
                    this.zzapi.zzaqp = (int) j;
                    return;
                case 2807729:
                    this.zzapg = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.zzapi.zzara = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.zzapi.zzara = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.zzapi.zzaqz = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.zzapi.zzaqz = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.zzapi.zzaqz = 3;
                            return;
                        case 21947:
                            this.zzapi.zzaqx = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                this.zzapi.zzaqy = 1;
                                return;
                            } else if (i5 == 9) {
                                this.zzapi.zzaqy = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                this.zzapi.zzaqy = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzapi.zzarb = (int) j;
                            return;
                        case 21949:
                            this.zzapi.zzarc = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, double d) {
        if (i == 181) {
            this.zzapi.zzagt = (int) d;
        } else if (i == 17545) {
            this.zzaph = (long) d;
        } else {
            switch (i) {
                case 21969:
                    this.zzapi.zzard = (float) d;
                    return;
                case 21970:
                    this.zzapi.zzare = (float) d;
                    return;
                case 21971:
                    this.zzapi.zzarf = (float) d;
                    return;
                case 21972:
                    this.zzapi.zzarg = (float) d;
                    return;
                case 21973:
                    this.zzapi.zzarh = (float) d;
                    return;
                case 21974:
                    this.zzapi.zzari = (float) d;
                    return;
                case 21975:
                    this.zzapi.zzarj = (float) d;
                    return;
                case 21976:
                    this.zzapi.zzark = (float) d;
                    return;
                case 21977:
                    this.zzapi.zzarl = (float) d;
                    return;
                case 21978:
                    this.zzapi.zzarm = (float) d;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str) throws zzhi {
        if (i == 134) {
            this.zzapi.zzaqo = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            zzkd.zza(this.zzapi, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhi(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fc, code lost:
        throw new com.google.android.gms.internal.ads.zzhi("EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(int r20, int r21, com.google.android.gms.internal.ads.zzjl r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkc.zza(int, int, com.google.android.gms.internal.ads.zzjl):void");
    }

    private final void zza(zzkd zzkdVar, long j) {
        int i;
        byte[] zzbi;
        if ("S_TEXT/UTF8".equals(zzkdVar.zzaqo)) {
            byte[] bArr = this.zzapa.data;
            long j2 = this.zzapv;
            if (j2 == -9223372036854775807L) {
                zzbi = zzaop;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                zzbi = zzov.zzbi(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (1000000 * i)) / 1000))));
            }
            System.arraycopy(zzbi, 0, bArr, 19, 12);
            zzjt zzjtVar = zzkdVar.zzars;
            zzos zzosVar = this.zzapa;
            zzjtVar.zza(zzosVar, zzosVar.limit());
            this.zzaqk += this.zzapa.limit();
        }
        zzkdVar.zzars.zza(j, this.zzaqb, this.zzaqk, 0, zzkdVar.zzaqs);
        this.zzaql = true;
        zzgt();
    }

    private final void zzgt() {
        this.zzaqc = 0;
        this.zzaqk = 0;
        this.zzaqj = 0;
        this.zzaqd = false;
        this.zzaqe = false;
        this.zzaqg = false;
        this.zzaqi = 0;
        this.zzaqh = (byte) 0;
        this.zzaqf = false;
        this.zzaoz.reset();
    }

    private final void zzb(zzjl zzjlVar, int i) throws IOException, InterruptedException {
        if (this.zzaow.limit() >= i) {
            return;
        }
        if (this.zzaow.capacity() < i) {
            zzos zzosVar = this.zzaow;
            zzosVar.zzb(Arrays.copyOf(zzosVar.data, Math.max(this.zzaow.data.length << 1, i)), this.zzaow.limit());
        }
        zzjlVar.readFully(this.zzaow.data, this.zzaow.limit(), i - this.zzaow.limit());
        this.zzaow.zzbh(i);
    }

    private final void zza(zzjl zzjlVar, zzkd zzkdVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzkdVar.zzaqo)) {
            int length = zzaoo.length + i;
            if (this.zzapa.capacity() < length) {
                this.zzapa.data = Arrays.copyOf(zzaoo, length + i);
            }
            zzjlVar.readFully(this.zzapa.data, zzaoo.length, i);
            this.zzapa.zzbi(0);
            this.zzapa.zzbh(length);
            return;
        }
        zzjt zzjtVar = zzkdVar.zzars;
        if (!this.zzaqd) {
            if (zzkdVar.zzaqq) {
                this.zzaqb &= -1073741825;
                if (!this.zzaqe) {
                    zzjlVar.readFully(this.zzaow.data, 0, 1);
                    this.zzaqc++;
                    if ((this.zzaow.data[0] & 128) == 128) {
                        throw new zzhi("Extension bit is set in signal byte");
                    }
                    this.zzaqh = this.zzaow.data[0];
                    this.zzaqe = true;
                }
                byte b = this.zzaqh;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.zzaqb |= 1073741824;
                    if (!this.zzaqf) {
                        zzjlVar.readFully(this.zzapb.data, 0, 8);
                        this.zzaqc += 8;
                        this.zzaqf = true;
                        this.zzaow.data[0] = (byte) ((z ? 128 : 0) | 8);
                        this.zzaow.zzbi(0);
                        zzjtVar.zza(this.zzaow, 1);
                        this.zzaqk++;
                        this.zzapb.zzbi(0);
                        zzjtVar.zza(this.zzapb, 8);
                        this.zzaqk += 8;
                    }
                    if (z) {
                        if (!this.zzaqg) {
                            zzjlVar.readFully(this.zzaow.data, 0, 1);
                            this.zzaqc++;
                            this.zzaow.zzbi(0);
                            this.zzaqi = this.zzaow.readUnsignedByte();
                            this.zzaqg = true;
                        }
                        int i3 = this.zzaqi << 2;
                        this.zzaow.reset(i3);
                        zzjlVar.readFully(this.zzaow.data, 0, i3);
                        this.zzaqc += i3;
                        short s = (short) ((this.zzaqi / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.zzapd;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.zzapd = ByteBuffer.allocate(i4);
                        }
                        this.zzapd.position(0);
                        this.zzapd.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.zzaqi;
                            if (i5 >= i2) {
                                break;
                            }
                            int zzje = this.zzaow.zzje();
                            if (i5 % 2 == 0) {
                                this.zzapd.putShort((short) (zzje - i6));
                            } else {
                                this.zzapd.putInt(zzje - i6);
                            }
                            i5++;
                            i6 = zzje;
                        }
                        int i7 = (i - this.zzaqc) - i6;
                        if (i2 % 2 == 1) {
                            this.zzapd.putInt(i7);
                        } else {
                            this.zzapd.putShort((short) i7);
                            this.zzapd.putInt(0);
                        }
                        this.zzapc.zzb(this.zzapd.array(), i4);
                        zzjtVar.zza(this.zzapc, i4);
                        this.zzaqk += i4;
                    }
                }
            } else if (zzkdVar.zzaqr != null) {
                this.zzaoz.zzb(zzkdVar.zzaqr, zzkdVar.zzaqr.length);
            }
            this.zzaqd = true;
        }
        int limit = i + this.zzaoz.limit();
        if (!"V_MPEG4/ISO/AVC".equals(zzkdVar.zzaqo) && !"V_MPEGH/ISO/HEVC".equals(zzkdVar.zzaqo)) {
            while (true) {
                int i8 = this.zzaqc;
                if (i8 >= limit) {
                    break;
                }
                zza(zzjlVar, zzjtVar, limit - i8);
            }
        } else {
            byte[] bArr = this.zzaov.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i9 = zzkdVar.zzart;
            int i10 = 4 - zzkdVar.zzart;
            while (this.zzaqc < limit) {
                int i11 = this.zzaqj;
                if (i11 == 0) {
                    int min = Math.min(i9, this.zzaoz.zziz());
                    zzjlVar.readFully(bArr, i10 + min, i9 - min);
                    if (min > 0) {
                        this.zzaoz.zze(bArr, i10, min);
                    }
                    this.zzaqc += i9;
                    this.zzaov.zzbi(0);
                    this.zzaqj = this.zzaov.zzje();
                    this.zzaou.zzbi(0);
                    zzjtVar.zza(this.zzaou, 4);
                    this.zzaqk += 4;
                } else {
                    this.zzaqj = i11 - zza(zzjlVar, zzjtVar, i11);
                }
            }
        }
        if ("A_VORBIS".equals(zzkdVar.zzaqo)) {
            this.zzaox.zzbi(0);
            zzjtVar.zza(this.zzaox, 4);
            this.zzaqk += 4;
        }
    }

    private final int zza(zzjl zzjlVar, zzjt zzjtVar, int i) throws IOException, InterruptedException {
        int zza;
        int zziz = this.zzaoz.zziz();
        if (zziz > 0) {
            zza = Math.min(i, zziz);
            zzjtVar.zza(this.zzaoz, zza);
        } else {
            zza = zzjtVar.zza(zzjlVar, i, false);
        }
        this.zzaqc += zza;
        this.zzaqk += zza;
        return zza;
    }

    private final long zzea(long j) throws zzhi {
        long j2 = this.zzapg;
        if (j2 == -9223372036854775807L) {
            throw new zzhi("Can't scale timecode prior to timecodeScale being set.");
        }
        return zzov.zza(j, j2, 1000L);
    }

    private static int[] zza(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length << 1, i)];
    }
}
