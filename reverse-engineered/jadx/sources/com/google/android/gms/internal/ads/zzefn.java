package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzefn extends zzefm {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0153, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zza(r23, r8) > (-65)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zza(r23, r8) > (-65)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fa, code lost:
        return -1;
     */
    @Override // com.google.android.gms.internal.ads.zzefm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefn.zzb(int, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefm
    public final String zzo(byte[] bArr, int i, int i2) throws zzeco {
        boolean zze;
        boolean zze2;
        boolean zzf;
        boolean zzg;
        boolean zze3;
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte zza = zzefi.zza(bArr, i);
            zze3 = zzefj.zze(zza);
            if (!zze3) {
                break;
            }
            i++;
            zzefj.zza(zza, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte zza2 = zzefi.zza(bArr, i);
            zze = zzefj.zze(zza2);
            if (zze) {
                int i7 = i5 + 1;
                zzefj.zza(zza2, cArr, i5);
                while (i6 < i3) {
                    byte zza3 = zzefi.zza(bArr, i6);
                    zze2 = zzefj.zze(zza3);
                    if (!zze2) {
                        break;
                    }
                    i6++;
                    zzefj.zza(zza3, cArr, i7);
                    i7++;
                }
                i = i6;
                i5 = i7;
            } else {
                zzf = zzefj.zzf(zza2);
                if (!zzf) {
                    zzg = zzefj.zzg(zza2);
                    if (zzg) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            zzefj.zza(zza2, zzefi.zza(bArr, i6), zzefi.zza(bArr, i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw zzeco.zzbfo();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzefj.zza(zza2, zzefi.zza(bArr, i6), zzefi.zza(bArr, i9), zzefi.zza(bArr, i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw zzeco.zzbfo();
                    }
                } else if (i6 < i3) {
                    zzefj.zza(zza2, zzefi.zza(bArr, i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw zzeco.zzbfo();
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefm
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            char charAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(charAt2);
            sb.append(" at index ");
            sb.append(i + i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i4 = 0;
        while (true) {
            c = 128;
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzefi.zza(bArr, j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 >= c || j4 >= j5) {
                if (charAt3 < 2048 && j4 <= j5 - 2) {
                    long j6 = j4 + j;
                    zzefi.zza(bArr, j4, (byte) ((charAt3 >>> 6) | 960));
                    zzefi.zza(bArr, j6, (byte) ((charAt3 & '?') | 128));
                    j2 = j6 + j;
                    j3 = j;
                } else if ((charAt3 >= 55296 && 57343 >= charAt3) || j4 > j5 - 3) {
                    if (j4 <= j5 - 4) {
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt4 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                long j7 = j4 + 1;
                                zzefi.zza(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                long j8 = j7 + 1;
                                zzefi.zza(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j8 + 1;
                                zzefi.zza(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 = 1;
                                j2 = j9 + 1;
                                zzefi.zza(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new zzefo(i4 - 1, length);
                    } else if (55296 <= charAt3 && charAt3 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt3, charSequence.charAt(i3)))) {
                        throw new zzefo(i4, length);
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Failed writing ");
                        sb2.append(charAt3);
                        sb2.append(" at index ");
                        sb2.append(j4);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                } else {
                    long j10 = j4 + j;
                    zzefi.zza(bArr, j4, (byte) ((charAt3 >>> '\f') | 480));
                    long j11 = j10 + j;
                    zzefi.zza(bArr, j10, (byte) (((charAt3 >>> 6) & 63) | 128));
                    zzefi.zza(bArr, j11, (byte) ((charAt3 & '?') | 128));
                    j2 = j11 + 1;
                    j3 = 1;
                }
                i4++;
                c = 128;
                long j12 = j3;
                j4 = j2;
                j = j12;
            } else {
                long j13 = j4 + j;
                zzefi.zza(bArr, j4, (byte) charAt3);
                j3 = j;
                j2 = j13;
            }
            i4++;
            c = 128;
            long j122 = j3;
            j4 = j2;
            j = j122;
        }
        return (int) j4;
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        int zzhl;
        int zzap;
        int zzj;
        if (i2 == 0) {
            zzhl = zzefk.zzhl(i);
            return zzhl;
        } else if (i2 == 1) {
            zzap = zzefk.zzap(i, zzefi.zza(bArr, j));
            return zzap;
        } else if (i2 == 2) {
            zzj = zzefk.zzj(i, zzefi.zza(bArr, j), zzefi.zza(bArr, j + 1));
            return zzj;
        } else {
            throw new AssertionError();
        }
    }
}
