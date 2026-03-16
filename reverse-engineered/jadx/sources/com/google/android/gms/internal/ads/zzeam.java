package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeam {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzeap zzeapVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzeapVar.zzhtb = b;
            return i2;
        }
        return zza(b, bArr, i2, zzeapVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, zzeap zzeapVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzeapVar.zzhtb = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzeapVar.zzhtb = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzeapVar.zzhtb = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzeapVar.zzhtb = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzeapVar.zzhtb = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(byte[] bArr, int i, zzeap zzeapVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzeapVar.zzhtc = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzeapVar.zzhtc = j2;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzg(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzh(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzg(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzi(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzf(bArr, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(byte[] bArr, int i, zzeap zzeapVar) throws zzeco {
        int zza = zza(bArr, i, zzeapVar);
        int i2 = zzeapVar.zzhtb;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzeapVar.zzhtd = "";
                return zza;
            }
            zzeapVar.zzhtd = new String(bArr, zza, i2, zzecg.UTF_8);
            return zza + i2;
        }
        throw zzeco.zzbfh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(byte[] bArr, int i, zzeap zzeapVar) throws zzeco {
        int zza = zza(bArr, i, zzeapVar);
        int i2 = zzeapVar.zzhtb;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzeapVar.zzhtd = "";
                return zza;
            }
            zzeapVar.zzhtd = zzefk.zzo(bArr, zza, i2);
            return zza + i2;
        }
        throw zzeco.zzbfh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(byte[] bArr, int i, zzeap zzeapVar) throws zzeco {
        int zza = zza(bArr, i, zzeapVar);
        int i2 = zzeapVar.zzhtb;
        if (i2 < 0) {
            throw zzeco.zzbfh();
        }
        if (i2 <= bArr.length - zza) {
            if (i2 == 0) {
                zzeapVar.zzhtd = zzeaq.zzhtf;
                return zza;
            }
            zzeapVar.zzhtd = zzeaq.zzh(bArr, zza, i2);
            return zza + i2;
        }
        throw zzeco.zzbfg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzeek zzeekVar, byte[] bArr, int i, int i2, zzeap zzeapVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzeapVar);
            i4 = zzeapVar.zzhtb;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzeco.zzbfg();
        }
        Object newInstance = zzeekVar.newInstance();
        int i6 = i4 + i5;
        zzeekVar.zza(newInstance, bArr, i5, i6, zzeapVar);
        zzeekVar.zzak(newInstance);
        zzeapVar.zzhtd = newInstance;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzeek zzeekVar, byte[] bArr, int i, int i2, int i3, zzeap zzeapVar) throws IOException {
        zzeds zzedsVar = (zzeds) zzeekVar;
        Object newInstance = zzedsVar.newInstance();
        int zza = zzedsVar.zza((zzeds) newInstance, bArr, i, i2, i3, zzeapVar);
        zzedsVar.zzak(newInstance);
        zzeapVar.zzhtd = newInstance;
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzecl<?> zzeclVar, zzeap zzeapVar) {
        zzece zzeceVar = (zzece) zzeclVar;
        int zza = zza(bArr, i2, zzeapVar);
        zzeceVar.zzgw(zzeapVar.zzhtb);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzeapVar);
            if (i != zzeapVar.zzhtb) {
                break;
            }
            zza = zza(bArr, zza2, zzeapVar);
            zzeceVar.zzgw(zzeapVar.zzhtb);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(byte[] bArr, int i, zzecl<?> zzeclVar, zzeap zzeapVar) throws IOException {
        zzece zzeceVar = (zzece) zzeclVar;
        int zza = zza(bArr, i, zzeapVar);
        int i2 = zzeapVar.zzhtb + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzeapVar);
            zzeceVar.zzgw(zzeapVar.zzhtb);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzeco.zzbfg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzeek<?> zzeekVar, int i, byte[] bArr, int i2, int i3, zzecl<?> zzeclVar, zzeap zzeapVar) throws IOException {
        int zza = zza(zzeekVar, bArr, i2, i3, zzeapVar);
        zzeclVar.add(zzeapVar.zzhtd);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzeapVar);
            if (i != zzeapVar.zzhtb) {
                break;
            }
            zza = zza(zzeekVar, bArr, zza2, i3, zzeapVar);
            zzeclVar.add(zzeapVar.zzhtd);
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzefb zzefbVar, zzeap zzeapVar) throws zzeco {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzeapVar);
                zzefbVar.zzd(i, Long.valueOf(zzeapVar.zzhtc));
                return zzb;
            } else if (i4 == 1) {
                zzefbVar.zzd(i, Long.valueOf(zzg(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzeapVar);
                int i5 = zzeapVar.zzhtb;
                if (i5 < 0) {
                    throw zzeco.zzbfh();
                }
                if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzefbVar.zzd(i, zzeaq.zzhtf);
                    } else {
                        zzefbVar.zzd(i, zzeaq.zzh(bArr, zza, i5));
                    }
                    return zza + i5;
                }
                throw zzeco.zzbfg();
            } else if (i4 != 3) {
                if (i4 == 5) {
                    zzefbVar.zzd(i, Integer.valueOf(zzf(bArr, i2)));
                    return i2 + 4;
                }
                throw zzeco.zzbfj();
            } else {
                zzefb zzbhe = zzefb.zzbhe();
                int i6 = (i & (-8)) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzeapVar);
                    int i8 = zzeapVar.zzhtb;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = zza2;
                        break;
                    }
                    int zza3 = zza(i7, bArr, zza2, i3, zzbhe, zzeapVar);
                    i7 = i8;
                    i2 = zza3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzeco.zzbfn();
                }
                zzefbVar.zzd(i, zzbhe);
                return i2;
            }
        }
        throw zzeco.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3, zzeap zzeapVar) throws zzeco {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzeco.zzbfj();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = zza(bArr, i2, zzeapVar);
                            i6 = zzeapVar.zzhtb;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = zza(i6, bArr, i2, i3, zzeapVar);
                        }
                        if (i2 > i3 || i6 != i5) {
                            throw zzeco.zzbfn();
                        }
                        return i2;
                    }
                    return zza(bArr, i2, zzeapVar) + zzeapVar.zzhtb;
                }
                return i2 + 8;
            }
            return zzb(bArr, i2, zzeapVar);
        }
        throw zzeco.zzbfj();
    }
}
