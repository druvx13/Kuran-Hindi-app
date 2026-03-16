package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzln;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzkj {
    private static final int zzavp = zzov.zzbj("vide");
    private static final int zzavq = zzov.zzbj("soun");
    private static final int zzavr = zzov.zzbj("text");
    private static final int zzavs = zzov.zzbj("sbtl");
    private static final int zzavt = zzov.zzbj("subt");
    private static final int zzavu = zzov.zzbj("clcp");
    private static final int zzavv = zzov.zzbj("cenc");
    private static final int zzavb = zzov.zzbj("meta");

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
        if (r14 == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0485 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzkx zza(com.google.android.gms.internal.ads.zzkh r50, com.google.android.gms.internal.ads.zzkk r51, long r52, com.google.android.gms.internal.ads.zzja r54, boolean r55) throws com.google.android.gms.internal.ads.zzhi {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkj.zza(com.google.android.gms.internal.ads.zzkh, com.google.android.gms.internal.ads.zzkk, long, com.google.android.gms.internal.ads.zzja, boolean):com.google.android.gms.internal.ads.zzkx");
    }

    public static zzkz zza(zzkx zzkxVar, zzkh zzkhVar, zzjq zzjqVar) throws zzhi {
        zzkl zzkqVar;
        boolean z;
        int i;
        int i2;
        zzkx zzkxVar2;
        int i3;
        long[] jArr;
        int[] iArr;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long j;
        boolean z2;
        long[] jArr3;
        int[] iArr3;
        int i5;
        long[] jArr4;
        int[] iArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        zzkk zzan = zzkhVar.zzan(zzki.zzauq);
        if (zzan != null) {
            zzkqVar = new zzkn(zzan);
        } else {
            zzkk zzan2 = zzkhVar.zzan(zzki.zzaur);
            if (zzan2 == null) {
                throw new zzhi("Track has no sample table size information");
            }
            zzkqVar = new zzkq(zzan2);
        }
        int zzgw = zzkqVar.zzgw();
        if (zzgw == 0) {
            return new zzkz(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzkk zzan3 = zzkhVar.zzan(zzki.zzaus);
        if (zzan3 == null) {
            zzan3 = zzkhVar.zzan(zzki.zzaut);
            z = true;
        } else {
            z = false;
        }
        zzos zzosVar = zzan3.zzavw;
        zzos zzosVar2 = zzkhVar.zzan(zzki.zzaup).zzavw;
        zzos zzosVar3 = zzkhVar.zzan(zzki.zzaum).zzavw;
        zzkk zzan4 = zzkhVar.zzan(zzki.zzaun);
        zzos zzosVar4 = null;
        zzos zzosVar5 = zzan4 != null ? zzan4.zzavw : null;
        zzkk zzan5 = zzkhVar.zzan(zzki.zzauo);
        zzos zzosVar6 = zzan5 != null ? zzan5.zzavw : null;
        zzkm zzkmVar = new zzkm(zzosVar2, zzosVar, z);
        zzosVar3.zzbi(12);
        int zzje = zzosVar3.zzje() - 1;
        int zzje2 = zzosVar3.zzje();
        int zzje3 = zzosVar3.zzje();
        if (zzosVar6 != null) {
            zzosVar6.zzbi(12);
            i = zzosVar6.zzje();
        } else {
            i = 0;
        }
        int i10 = -1;
        if (zzosVar5 != null) {
            zzosVar5.zzbi(12);
            i2 = zzosVar5.zzje();
            if (i2 > 0) {
                i10 = zzosVar5.zzje() - 1;
                zzosVar4 = zzosVar5;
            }
        } else {
            zzosVar4 = zzosVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzkqVar.zzgy() && "audio/raw".equals(zzkxVar.zzahd.zzagi) && zzje == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[zzgw];
            iArr = new int[zzgw];
            jArr2 = new long[zzgw];
            int i11 = i2;
            iArr2 = new int[zzgw];
            int i12 = i10;
            long j3 = 0;
            j = 0;
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i;
            int i18 = zzje3;
            int i19 = zzje2;
            int i20 = zzje;
            int i21 = i11;
            while (i13 < zzgw) {
                while (i15 == 0) {
                    zzoh.checkState(zzkmVar.zzgz());
                    j3 = zzkmVar.zzavy;
                    i15 = zzkmVar.zzavx;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (zzosVar6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = zzosVar6.zzje();
                        i16 = zzosVar6.readInt();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j3;
                iArr[i13] = zzkqVar.zzgx();
                if (iArr[i13] > i4) {
                    i4 = iArr[i13];
                }
                int i25 = zzgw;
                zzkl zzklVar = zzkqVar;
                jArr2[i13] = j + i24;
                iArr2[i13] = zzosVar4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = zzosVar4.zzje() - 1;
                    }
                }
                long[] jArr6 = jArr5;
                j += i23;
                int i26 = i22 - 1;
                if (i26 != 0 || i20 <= 0) {
                    i8 = i23;
                    i9 = i26;
                } else {
                    i9 = zzosVar3.zzje();
                    i8 = zzosVar3.zzje();
                    i20--;
                }
                int i27 = i9;
                j3 += iArr[i13];
                i15--;
                i13++;
                zzgw = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i27;
                i18 = i8;
                zzkqVar = zzklVar;
            }
            i3 = zzgw;
            long[] jArr7 = jArr5;
            int i28 = i19;
            zzoh.checkArgument(i14 == 0);
            while (i17 > 0) {
                zzoh.checkArgument(zzosVar6.zzje() == 0);
                zzosVar6.readInt();
                i17--;
            }
            if (i21 == 0 && i28 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    zzkxVar2 = zzkxVar;
                    jArr = jArr7;
                }
            } else {
                i7 = i15;
            }
            zzkxVar2 = zzkxVar;
            int i29 = zzkxVar2.id;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i29);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i28);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i20);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr7;
        } else {
            zzkxVar2 = zzkxVar;
            i3 = zzgw;
            zzkl zzklVar2 = zzkqVar;
            long[] jArr8 = new long[zzkmVar.length];
            int i30 = zzkmVar.length;
            int[] iArr5 = new int[i30];
            while (zzkmVar.zzgz()) {
                jArr8[zzkmVar.index] = zzkmVar.zzavy;
                iArr5[zzkmVar.index] = zzkmVar.zzavx;
            }
            int zzgx = zzklVar2.zzgx();
            long j4 = zzje3;
            int i31 = 8192 / zzgx;
            int i32 = 0;
            for (int i33 = 0; i33 < i30; i33++) {
                i32 += zzov.zzf(iArr5[i33], i31);
            }
            long[] jArr9 = new long[i32];
            int[] iArr6 = new int[i32];
            long[] jArr10 = new long[i32];
            int[] iArr7 = new int[i32];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i34 < i30) {
                int i38 = iArr5[i34];
                long j5 = jArr8[i34];
                long[] jArr11 = jArr8;
                int i39 = i38;
                while (i39 > 0) {
                    int min = Math.min(i31, i39);
                    jArr9[i36] = j5;
                    iArr6[i36] = zzgx * min;
                    i37 = Math.max(i37, iArr6[i36]);
                    jArr10[i36] = i35 * j4;
                    iArr7[i36] = 1;
                    j5 += iArr6[i36];
                    i35 += min;
                    i39 -= min;
                    i36++;
                    i30 = i30;
                    iArr5 = iArr5;
                }
                i34++;
                jArr8 = jArr11;
            }
            zzkr zzkrVar = new zzkr(jArr9, iArr6, i37, jArr10, iArr7);
            jArr = zzkrVar.zzany;
            iArr = zzkrVar.zzanx;
            i4 = zzkrVar.zzawl;
            jArr2 = zzkrVar.zzawm;
            iArr2 = zzkrVar.zzawn;
            j = 0;
        }
        if (zzkxVar2.zzayi == null || zzjqVar.zzgs()) {
            zzov.zza(jArr2, 1000000L, zzkxVar2.zzcv);
            return new zzkz(jArr, iArr, i4, jArr2, iArr2);
        }
        if (zzkxVar2.zzayi.length == 1 && zzkxVar2.type == 1 && jArr2.length >= 2) {
            long j6 = zzkxVar2.zzayj[0];
            long zza = zzov.zza(zzkxVar2.zzayi[0], zzkxVar2.zzcv, zzkxVar2.zzayf) + j6;
            if (jArr2[0] <= j6 && j6 < jArr2[1] && jArr2[jArr2.length - 1] < zza && zza <= j) {
                long j7 = j - zza;
                long zza2 = zzov.zza(j6 - jArr2[0], zzkxVar2.zzahd.zzagt, zzkxVar2.zzcv);
                long zza3 = zzov.zza(j7, zzkxVar2.zzahd.zzagt, zzkxVar2.zzcv);
                if ((zza2 != 0 || zza3 != 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    zzjqVar.zzagv = (int) zza2;
                    zzjqVar.zzagw = (int) zza3;
                    zzov.zza(jArr2, 1000000L, zzkxVar2.zzcv);
                    return new zzkz(jArr, iArr, i4, jArr2, iArr2);
                }
            }
        }
        if (zzkxVar2.zzayi.length == 1) {
            char c = 0;
            if (zzkxVar2.zzayi[0] == 0) {
                int i40 = 0;
                while (i40 < jArr2.length) {
                    jArr2[i40] = zzov.zza(jArr2[i40] - zzkxVar2.zzayj[c], 1000000L, zzkxVar2.zzcv);
                    i40++;
                    c = 0;
                }
                return new zzkz(jArr, iArr, i4, jArr2, iArr2);
            }
        }
        boolean z3 = zzkxVar2.type == 1;
        boolean z4 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (i42 < zzkxVar2.zzayi.length) {
            long j8 = zzkxVar2.zzayj[i42];
            if (j8 != -1) {
                i6 = i4;
                long zza4 = zzov.zza(zzkxVar2.zzayi[i42], zzkxVar2.zzcv, zzkxVar2.zzayf);
                int zzb = zzov.zzb(jArr2, j8, true, true);
                int zzb2 = zzov.zzb(jArr2, j8 + zza4, z3, false);
                i41 += zzb2 - zzb;
                z4 |= i43 != zzb;
                i43 = zzb2;
            } else {
                i6 = i4;
            }
            i42++;
            i4 = i6;
        }
        int i44 = i4;
        boolean z5 = z4 | (i41 != i3);
        long[] jArr12 = z5 ? new long[i41] : jArr;
        int[] iArr8 = z5 ? new int[i41] : iArr;
        int i45 = z5 ? 0 : i44;
        int[] iArr9 = z5 ? new int[i41] : iArr2;
        long[] jArr13 = new long[i41];
        int i46 = i45;
        int i47 = 0;
        int i48 = 0;
        while (i47 < zzkxVar2.zzayi.length) {
            long j9 = zzkxVar2.zzayj[i47];
            long j10 = zzkxVar2.zzayi[i47];
            if (j9 != -1) {
                int[] iArr10 = iArr9;
                i5 = i47;
                long[] jArr14 = jArr12;
                long[] jArr15 = jArr;
                int zzb3 = zzov.zzb(jArr2, j9, true, true);
                int zzb4 = zzov.zzb(jArr2, zzov.zza(j10, zzkxVar2.zzcv, zzkxVar2.zzayf) + j9, z3, false);
                if (z5) {
                    int i49 = zzb4 - zzb3;
                    jArr3 = jArr14;
                    jArr4 = jArr15;
                    System.arraycopy(jArr4, zzb3, jArr3, i48, i49);
                    System.arraycopy(iArr, zzb3, iArr8, i48, i49);
                    z2 = z3;
                    iArr4 = iArr10;
                    System.arraycopy(iArr2, zzb3, iArr4, i48, i49);
                } else {
                    jArr3 = jArr14;
                    z2 = z3;
                    iArr4 = iArr10;
                    jArr4 = jArr15;
                }
                int i50 = i46;
                while (zzb3 < zzb4) {
                    int[] iArr11 = iArr4;
                    int i51 = zzb4;
                    long j11 = j9;
                    jArr13[i48] = zzov.zza(j2, 1000000L, zzkxVar2.zzayf) + zzov.zza(jArr2[zzb3] - j9, 1000000L, zzkxVar2.zzcv);
                    if (z5 && iArr8[i48] > i50) {
                        i50 = iArr[zzb3];
                    }
                    i48++;
                    zzb3++;
                    j9 = j11;
                    zzb4 = i51;
                    iArr4 = iArr11;
                }
                iArr3 = iArr4;
                i46 = i50;
            } else {
                z2 = z3;
                jArr3 = jArr12;
                iArr3 = iArr9;
                i5 = i47;
                jArr4 = jArr;
            }
            j2 += j10;
            i47 = i5 + 1;
            jArr = jArr4;
            jArr12 = jArr3;
            z3 = z2;
            iArr9 = iArr3;
        }
        long[] jArr16 = jArr12;
        int[] iArr12 = iArr9;
        boolean z6 = false;
        for (int i52 = 0; i52 < iArr12.length && !z6; i52++) {
            z6 |= (iArr12[i52] & 1) != 0;
        }
        if (!z6) {
            throw new zzhi("The edited sample sequence does not contain a sync sample.");
        }
        return new zzkz(jArr16, iArr8, i46, jArr13, iArr12);
    }

    public static zzln zza(zzkk zzkkVar, boolean z) {
        if (z) {
            return null;
        }
        zzos zzosVar = zzkkVar.zzavw;
        zzosVar.zzbi(8);
        while (zzosVar.zziz() >= 8) {
            int position = zzosVar.getPosition();
            int readInt = zzosVar.readInt();
            if (zzosVar.readInt() == zzki.zzavb) {
                zzosVar.zzbi(position);
                int i = position + readInt;
                zzosVar.zzbj(12);
                while (true) {
                    if (zzosVar.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzosVar.getPosition();
                    int readInt2 = zzosVar.readInt();
                    if (zzosVar.readInt() == zzki.zzavc) {
                        zzosVar.zzbi(position2);
                        int i2 = position2 + readInt2;
                        zzosVar.zzbj(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzosVar.getPosition() < i2) {
                            zzln.zza zzd = zzku.zzd(zzosVar);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzln(arrayList);
                        }
                    } else {
                        zzosVar.zzbj(readInt2 - 8);
                    }
                }
                return null;
            }
            zzosVar.zzbj(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzos zzosVar, int i) {
        zzosVar.zzbi(i + 8 + 4);
        zzosVar.zzbj(1);
        zzc(zzosVar);
        zzosVar.zzbj(2);
        int readUnsignedByte = zzosVar.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzosVar.zzbj(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzosVar.zzbj(zzosVar.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzosVar.zzbj(2);
        }
        zzosVar.zzbj(1);
        zzc(zzosVar);
        int readUnsignedByte2 = zzosVar.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzosVar.zzbj(12);
        zzosVar.zzbj(1);
        int zzc = zzc(zzosVar);
        byte[] bArr = new byte[zzc];
        zzosVar.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzos zzosVar, int i, int i2, zzko zzkoVar, int i3) {
        int position = zzosVar.getPosition();
        while (true) {
            if (position - i >= i2) {
                return 0;
            }
            zzosVar.zzbi(position);
            int readInt = zzosVar.readInt();
            zzoh.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzosVar.readInt() == zzki.zzatv) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzla zzlaVar = null;
                boolean z = false;
                while (i4 - position < readInt) {
                    zzosVar.zzbi(i4);
                    int readInt2 = zzosVar.readInt();
                    int readInt3 = zzosVar.readInt();
                    if (readInt3 == zzki.zzaub) {
                        num = Integer.valueOf(zzosVar.readInt());
                    } else if (readInt3 == zzki.zzatw) {
                        zzosVar.zzbj(4);
                        z = zzosVar.readInt() == zzavv;
                    } else if (readInt3 == zzki.zzatx) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzlaVar = null;
                                break;
                            }
                            zzosVar.zzbi(i5);
                            int readInt4 = zzosVar.readInt();
                            if (zzosVar.readInt() == zzki.zzaty) {
                                zzosVar.zzbj(6);
                                boolean z2 = zzosVar.readUnsignedByte() == 1;
                                int readUnsignedByte = zzosVar.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzosVar.zze(bArr, 0, 16);
                                zzlaVar = new zzla(z2, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                    }
                    i4 += readInt2;
                }
                if (z) {
                    zzoh.checkArgument(num != null, "frma atom is mandatory");
                    zzoh.checkArgument(zzlaVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzlaVar);
                }
                if (pair != null) {
                    zzkoVar.zzawg[i3] = (zzla) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            position += readInt;
        }
    }

    private static int zzc(zzos zzosVar) {
        int readUnsignedByte = zzosVar.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzosVar.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
