package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzlf {
    private static final SparseIntArray zzbak;
    private static final SparseIntArray zzbal;
    private static final Map<String, Integer> zzbam;
    private static final zzlc zzbah = zzlc.zzaz("OMX.google.raw.decoder");
    private static final Pattern zzbai = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<zza, List<zzlc>> zzbaj = new HashMap<>();
    private static int zzban = -1;

    public static zzlc zzhi() {
        return zzbah;
    }

    public static zzlc zzb(String str, boolean z) throws zzlj {
        List<zzlc> zzc = zzc(str, z);
        if (zzc.isEmpty()) {
            return null;
        }
        return zzc.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza {
        public final String mimeType;
        public final boolean zzbab;

        public zza(String str, boolean z) {
            this.mimeType = str;
            this.zzbab = z;
        }

        public final int hashCode() {
            String str = this.mimeType;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.zzbab ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == zza.class) {
                zza zzaVar = (zza) obj;
                if (TextUtils.equals(this.mimeType, zzaVar.mimeType) && this.zzbab == zzaVar.zzbab) {
                    return true;
                }
            }
            return false;
        }
    }

    private static synchronized List<zzlc> zzc(String str, boolean z) throws zzlj {
        synchronized (zzlf.class) {
            zza zzaVar = new zza(str, z);
            List<zzlc> list = zzbaj.get(zzaVar);
            if (list != null) {
                return list;
            }
            List<zzlc> zza2 = zza(zzaVar, zzov.SDK_INT >= 21 ? new zzlk(z) : new zzll());
            if (z && zza2.isEmpty() && 21 <= zzov.SDK_INT && zzov.SDK_INT <= 23) {
                zza2 = zza(zzaVar, new zzll());
                if (!zza2.isEmpty()) {
                    String str2 = zza2.get(0).name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<zzlc> unmodifiableList = Collections.unmodifiableList(zza2);
            zzbaj.put(zzaVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int zzhj() throws zzlj {
        if (zzban == -1) {
            int i = 0;
            zzlc zzb = zzb("video/avc", false);
            if (zzb != null) {
                MediaCodecInfo.CodecProfileLevel[] zzhh = zzb.zzhh();
                int length = zzhh.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = zzhh[i].level;
                    int i4 = 9437184;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 25344;
                    } else {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case 1024:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                continue;
                        }
                    }
                    i2 = Math.max(i4, i2);
                    i++;
                }
                i = Math.max(i2, zzov.SDK_INT >= 21 ? 345600 : 172800);
            }
            zzban = i;
        }
        return zzban;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3.equals("hev1") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> zzbc(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzbc(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2 A[Catch: Exception -> 0x02ae, TryCatch #1 {Exception -> 0x02ae, blocks: (B:3:0x0004, B:5:0x0016, B:9:0x0028, B:12:0x0030, B:14:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:27:0x0068, B:29:0x006e, B:32:0x0078, B:34:0x007c, B:36:0x0084, B:39:0x0090, B:41:0x0096, B:43:0x009e, B:45:0x00a8, B:47:0x00b2, B:49:0x00bc, B:51:0x00c6, B:53:0x00d0, B:55:0x00da, B:57:0x00e4, B:59:0x00ee, B:61:0x00f8, B:63:0x0102, B:65:0x010c, B:68:0x0118, B:70:0x011c, B:72:0x0124, B:74:0x012e, B:76:0x0138, B:78:0x0142, B:81:0x014d, B:84:0x0155, B:86:0x015d, B:88:0x0167, B:90:0x0171, B:92:0x017b, B:94:0x0183, B:96:0x018d, B:99:0x0198, B:101:0x019c, B:103:0x01a4, B:109:0x01b2, B:111:0x01ba, B:151:0x0232, B:154:0x023a, B:156:0x0240, B:157:0x0264, B:158:0x0298), top: B:169:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fd A[Catch: Exception -> 0x01f8, TryCatch #3 {Exception -> 0x01f8, blocks: (B:116:0x01d2, B:118:0x01dc, B:120:0x01e6, B:122:0x01ee, B:129:0x01fd, B:137:0x020b, B:134:0x0206, B:141:0x0219), top: B:173:0x01d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.android.gms.internal.ads.zzlc> zza(com.google.android.gms.internal.ads.zzlf.zza r17, com.google.android.gms.internal.ads.zzli r18) throws com.google.android.gms.internal.ads.zzlj {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zza(com.google.android.gms.internal.ads.zzlf$zza, com.google.android.gms.internal.ads.zzli):java.util.List");
    }

    private static Pair<Integer, Integer> zza(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            String valueOf2 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf3;
            } else {
                String valueOf4 = String.valueOf(str);
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf4) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            Integer valueOf5 = Integer.valueOf(zzbak.get(num.intValue()));
            if (valueOf5 == null) {
                String valueOf6 = String.valueOf(num);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf6).length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(valueOf6);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer valueOf7 = Integer.valueOf(zzbal.get(valueOf.intValue()));
            if (valueOf7 == null) {
                String valueOf8 = String.valueOf(valueOf);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf8).length() + 19);
                sb2.append("Unknown AVC level: ");
                sb2.append(valueOf8);
                Log.w("MediaCodecUtil", sb2.toString());
                return null;
            }
            return new Pair<>(valueOf5, valueOf7);
        } catch (NumberFormatException unused) {
            String valueOf9 = String.valueOf(str);
            Log.w("MediaCodecUtil", valueOf9.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf9) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        zzbak = sparseIntArray;
        sparseIntArray.put(66, 1);
        zzbak.put(77, 2);
        zzbak.put(88, 4);
        zzbak.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zzbal = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        zzbal.put(11, 4);
        zzbal.put(12, 8);
        zzbal.put(13, 16);
        zzbal.put(20, 32);
        zzbal.put(21, 64);
        zzbal.put(22, 128);
        zzbal.put(30, 256);
        zzbal.put(31, 512);
        zzbal.put(32, 1024);
        zzbal.put(40, 2048);
        zzbal.put(41, 4096);
        zzbal.put(42, 8192);
        zzbal.put(50, 16384);
        zzbal.put(51, 32768);
        zzbal.put(52, 65536);
        HashMap hashMap = new HashMap();
        zzbam = hashMap;
        hashMap.put("L30", 1);
        zzbam.put("L60", 4);
        zzbam.put("L63", 16);
        zzbam.put("L90", 64);
        zzbam.put("L93", 256);
        zzbam.put("L120", 1024);
        zzbam.put("L123", 4096);
        zzbam.put("L150", 16384);
        zzbam.put("L153", 65536);
        zzbam.put("L156", 262144);
        zzbam.put("L180", 1048576);
        zzbam.put("L183", 4194304);
        zzbam.put("L186", 16777216);
        zzbam.put("H30", 2);
        zzbam.put("H60", 8);
        zzbam.put("H63", 32);
        zzbam.put("H90", 128);
        zzbam.put("H93", 512);
        zzbam.put("H120", 2048);
        zzbam.put("H123", 8192);
        zzbam.put("H150", 32768);
        zzbam.put("H153", 131072);
        zzbam.put("H156", 524288);
        zzbam.put("H180", 2097152);
        zzbam.put("H183", 8388608);
        zzbam.put("H186", 33554432);
    }
}
