package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeds<T> implements zzeek<T> {
    private final int[] zziad;
    private final Object[] zziae;
    private final int zziaf;
    private final int zziag;
    private final zzedo zziah;
    private final boolean zziai;
    private final boolean zziaj;
    private final boolean zziak;
    private final boolean zzial;
    private final int[] zziam;
    private final int zzian;
    private final int zziao;
    private final zzedw zziap;
    private final zzecy zziaq;
    private final zzefc<?, ?> zziar;
    private final zzebs<?> zzias;
    private final zzedh zziat;
    private static final int[] zziac = new int[0];
    private static final Unsafe zzhgt = zzefi.zzbhj();

    private zzeds(int[] iArr, Object[] objArr, int i, int i2, zzedo zzedoVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzedw zzedwVar, zzecy zzecyVar, zzefc<?, ?> zzefcVar, zzebs<?> zzebsVar, zzedh zzedhVar) {
        this.zziad = iArr;
        this.zziae = objArr;
        this.zziaf = i;
        this.zziag = i2;
        this.zziaj = zzedoVar instanceof zzecd;
        this.zziak = z;
        this.zziai = zzebsVar != null && zzebsVar.zzj(zzedoVar);
        this.zzial = false;
        this.zziam = iArr2;
        this.zzian = i3;
        this.zziao = i4;
        this.zziap = zzedwVar;
        this.zziaq = zzecyVar;
        this.zziar = zzefcVar;
        this.zzias = zzebsVar;
        this.zziah = zzedoVar;
        this.zziat = zzedhVar;
    }

    private static boolean zzhe(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzeds<T> zza(Class<T> cls, zzedm zzedmVar, zzedw zzedwVar, zzecy zzecyVar, zzefc<?, ?> zzefcVar, zzebs<?> zzebsVar, zzedh zzedhVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzeeb zzeebVar;
        int i18;
        int objectFieldOffset;
        int i19;
        int i20;
        Class<?> cls2;
        String str;
        int i21;
        int i22;
        Field zza;
        int i23;
        char charAt11;
        int i24;
        Field zza2;
        Field zza3;
        int i25;
        char charAt12;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        char charAt16;
        if (zzedmVar instanceof zzeeb) {
            zzeeb zzeebVar2 = (zzeeb) zzedmVar;
            int i29 = 0;
            boolean z2 = zzeebVar2.zzbge() == zzecd.zzf.zzhyk;
            String zzbgl = zzeebVar2.zzbgl();
            int length = zzbgl.length();
            int charAt17 = zzbgl.charAt(0);
            if (charAt17 >= 55296) {
                int i30 = charAt17 & 8191;
                int i31 = 1;
                int i32 = 13;
                while (true) {
                    i = i31 + 1;
                    charAt16 = zzbgl.charAt(i31);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i30 |= (charAt16 & 8191) << i32;
                    i32 += 13;
                    i31 = i;
                }
                charAt17 = i30 | (charAt16 << i32);
            } else {
                i = 1;
            }
            int i33 = i + 1;
            int charAt18 = zzbgl.charAt(i);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i28 = i33 + 1;
                    charAt15 = zzbgl.charAt(i33);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i34 |= (charAt15 & 8191) << i35;
                    i35 += 13;
                    i33 = i28;
                }
                charAt18 = i34 | (charAt15 << i35);
                i33 = i28;
            }
            if (charAt18 == 0) {
                iArr = zziac;
                i6 = 0;
                i3 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
            } else {
                int i36 = i33 + 1;
                int charAt19 = zzbgl.charAt(i33);
                if (charAt19 >= 55296) {
                    int i37 = charAt19 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt10 = zzbgl.charAt(i36);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i37 |= (charAt10 & 8191) << i38;
                        i38 += 13;
                        i36 = i14;
                    }
                    charAt19 = i37 | (charAt10 << i38);
                    i36 = i14;
                }
                int i39 = i36 + 1;
                int charAt20 = zzbgl.charAt(i36);
                if (charAt20 >= 55296) {
                    int i40 = charAt20 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt9 = zzbgl.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i13;
                    }
                    charAt20 = i40 | (charAt9 << i41);
                    i39 = i13;
                }
                int i42 = i39 + 1;
                charAt = zzbgl.charAt(i39);
                if (charAt >= 55296) {
                    int i43 = charAt & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt8 = zzbgl.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i12;
                    }
                    charAt = i43 | (charAt8 << i44);
                    i42 = i12;
                }
                int i45 = i42 + 1;
                int charAt21 = zzbgl.charAt(i42);
                if (charAt21 >= 55296) {
                    int i46 = charAt21 & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt7 = zzbgl.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i11;
                    }
                    charAt21 = i46 | (charAt7 << i47);
                    i45 = i11;
                }
                int i48 = i45 + 1;
                charAt2 = zzbgl.charAt(i45);
                if (charAt2 >= 55296) {
                    int i49 = charAt2 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt6 = zzbgl.charAt(i48);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i10;
                    }
                    charAt2 = i49 | (charAt6 << i50);
                    i48 = i10;
                }
                int i51 = i48 + 1;
                int charAt22 = zzbgl.charAt(i48);
                if (charAt22 >= 55296) {
                    int i52 = charAt22 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt5 = zzbgl.charAt(i51);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i52 |= (charAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i9;
                    }
                    charAt22 = i52 | (charAt5 << i53);
                    i51 = i9;
                }
                int i54 = i51 + 1;
                int charAt23 = zzbgl.charAt(i51);
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i54;
                    int i57 = 13;
                    while (true) {
                        i8 = i56 + 1;
                        charAt4 = zzbgl.charAt(i56);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i8;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i2 = i8;
                } else {
                    i2 = i54;
                }
                int i58 = i2 + 1;
                int charAt24 = zzbgl.charAt(i2);
                if (charAt24 >= 55296) {
                    int i59 = charAt24 & 8191;
                    int i60 = i58;
                    int i61 = 13;
                    while (true) {
                        i7 = i60 + 1;
                        charAt3 = zzbgl.charAt(i60);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i59 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i7;
                    }
                    charAt24 = i59 | (charAt3 << i61);
                    i58 = i7;
                }
                int i62 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i62;
                i5 = charAt24;
                i29 = charAt19;
                i33 = i58;
                int i63 = charAt22;
                iArr = new int[charAt24 + charAt22 + charAt23];
                i6 = i63;
            }
            Unsafe unsafe = zzhgt;
            Object[] zzbgm = zzeebVar2.zzbgm();
            Class<?> cls3 = zzeebVar2.zzbgg().getClass();
            int i64 = i33;
            int[] iArr2 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i65 = i5 + i6;
            int i66 = i5;
            int i67 = i64;
            int i68 = i65;
            int i69 = 0;
            int i70 = 0;
            while (i67 < length) {
                int i71 = i67 + 1;
                int charAt25 = zzbgl.charAt(i67);
                int i72 = length;
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i71;
                    int i75 = 13;
                    while (true) {
                        i27 = i74 + 1;
                        charAt14 = zzbgl.charAt(i74);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i73 |= (charAt14 & 8191) << i75;
                        i75 += 13;
                        i74 = i27;
                        i5 = i15;
                    }
                    charAt25 = i73 | (charAt14 << i75);
                    i16 = i27;
                } else {
                    i15 = i5;
                    i16 = i71;
                }
                int i76 = i16 + 1;
                int charAt26 = zzbgl.charAt(i16);
                if (charAt26 >= 55296) {
                    int i77 = charAt26 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i26 = i78 + 1;
                        charAt13 = zzbgl.charAt(i78);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i79;
                        i79 += 13;
                        i78 = i26;
                        z2 = z;
                    }
                    charAt26 = i77 | (charAt13 << i79);
                    i17 = i26;
                } else {
                    z = z2;
                    i17 = i76;
                }
                int i80 = charAt26 & 255;
                int i81 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i69] = i70;
                    i69++;
                }
                int i82 = charAt;
                if (i80 >= 51) {
                    int i83 = i17 + 1;
                    int charAt27 = zzbgl.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i84 = charAt27 & 8191;
                        int i85 = 13;
                        while (true) {
                            i25 = i83 + 1;
                            charAt12 = zzbgl.charAt(i83);
                            if (charAt12 < c) {
                                break;
                            }
                            i84 |= (charAt12 & 8191) << i85;
                            i85 += 13;
                            i83 = i25;
                            c = 55296;
                        }
                        charAt27 = i84 | (charAt12 << i85);
                        i83 = i25;
                    }
                    int i86 = i80 - 51;
                    int i87 = i83;
                    if (i86 == 9 || i86 == 17) {
                        objArr[((i70 / 3) << 1) + 1] = zzbgm[i4];
                        i4++;
                    } else if (i86 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i70 / 3) << 1) + 1] = zzbgm[i4];
                        i4++;
                    }
                    int i88 = charAt27 << 1;
                    Object obj = zzbgm[i88];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls3, (String) obj);
                        zzbgm[i88] = zza2;
                    }
                    zzeebVar = zzeebVar2;
                    String str2 = zzbgl;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza2);
                    int i89 = i88 + 1;
                    Object obj2 = zzbgm[i89];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls3, (String) obj2);
                        zzbgm[i89] = zza3;
                    }
                    cls2 = cls3;
                    i19 = i4;
                    i17 = i87;
                    str = str2;
                    i22 = 0;
                    i21 = (int) unsafe.objectFieldOffset(zza3);
                    i20 = i29;
                } else {
                    zzeebVar = zzeebVar2;
                    String str3 = zzbgl;
                    int i90 = i4 + 1;
                    Field zza4 = zza(cls3, (String) zzbgm[i4]);
                    if (i80 == 9 || i80 == 17) {
                        i18 = 1;
                        objArr[((i70 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i80 == 27 || i80 == 49) {
                            i18 = 1;
                            i24 = i90 + 1;
                            objArr[((i70 / 3) << 1) + 1] = zzbgm[i90];
                        } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i18 = 1;
                            if ((charAt17 & 1) == 1) {
                                i24 = i90 + 1;
                                objArr[((i70 / 3) << 1) + 1] = zzbgm[i90];
                            }
                        } else {
                            if (i80 == 50) {
                                int i91 = i66 + 1;
                                iArr[i66] = i70;
                                int i92 = (i70 / 3) << 1;
                                int i93 = i90 + 1;
                                objArr[i92] = zzbgm[i90];
                                if ((charAt26 & 2048) != 0) {
                                    i90 = i93 + 1;
                                    objArr[i92 + 1] = zzbgm[i93];
                                    i66 = i91;
                                } else {
                                    i90 = i93;
                                    i18 = 1;
                                    i66 = i91;
                                }
                            }
                            i18 = 1;
                        }
                        i90 = i24;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt17 & 1) != i18 || i80 > 17) {
                        i19 = i90;
                        i20 = i29;
                        cls2 = cls3;
                        str = str3;
                        i21 = 0;
                        i22 = 0;
                    } else {
                        int i94 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i95 = charAt28 & 8191;
                            int i96 = 13;
                            while (true) {
                                i23 = i94 + 1;
                                charAt11 = str.charAt(i94);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i95 |= (charAt11 & 8191) << i96;
                                i96 += 13;
                                i94 = i23;
                            }
                            charAt28 = i95 | (charAt11 << i96);
                            i94 = i23;
                        }
                        int i97 = (i29 << 1) + (charAt28 / 32);
                        Object obj3 = zzbgm[i97];
                        i19 = i90;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzbgm[i97] = zza;
                        }
                        i20 = i29;
                        cls2 = cls3;
                        i21 = (int) unsafe.objectFieldOffset(zza);
                        i22 = charAt28 % 32;
                        i17 = i94;
                    }
                    if (i80 >= 18 && i80 <= 49) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                int i98 = i70 + 1;
                iArr2[i70] = charAt25;
                int i99 = i98 + 1;
                iArr2[i98] = objectFieldOffset | ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i80 << 20);
                i70 = i99 + 1;
                iArr2[i99] = (i22 << 20) | i21;
                i29 = i20;
                zzbgl = str;
                i67 = i17;
                cls3 = cls2;
                i3 = i81;
                length = i72;
                i5 = i15;
                z2 = z;
                charAt = i82;
                i4 = i19;
                zzeebVar2 = zzeebVar;
            }
            return new zzeds<>(iArr2, objArr, charAt, i3, zzeebVar2.zzbgg(), z2, false, iArr, i5, i65, zzedwVar, zzecyVar, zzefcVar, zzebsVar, zzedhVar);
        }
        ((zzeev) zzedmVar).zzbge();
        int i100 = zzecd.zzf.zzhyk;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final T newInstance() {
        return (T) this.zziap.newInstance(this.zziah);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzefi.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.zzefi.zzo(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (com.google.android.gms.internal.ads.zzeem.zzg(com.google.android.gms.internal.ads.zzefi.zzp(r10, r6), com.google.android.gms.internal.ads.zzefi.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (com.google.android.gms.internal.ads.zzeem.zzg(com.google.android.gms.internal.ads.zzefi.zzp(r10, r6), com.google.android.gms.internal.ads.zzefi.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzl(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzk(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzl(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzk(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzk(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzk(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.zzeem.zzg(com.google.android.gms.internal.ads.zzefi.zzp(r10, r6), com.google.android.gms.internal.ads.zzefi.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (com.google.android.gms.internal.ads.zzeem.zzg(com.google.android.gms.internal.ads.zzefi.zzp(r10, r6), com.google.android.gms.internal.ads.zzefi.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (com.google.android.gms.internal.ads.zzeem.zzg(com.google.android.gms.internal.ads.zzefi.zzp(r10, r6), com.google.android.gms.internal.ads.zzefi.zzp(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012e, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzm(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzm(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzk(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzl(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzk(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzk(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0178, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzl(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
        if (com.google.android.gms.internal.ads.zzefi.zzl(r10, r6) == com.google.android.gms.internal.ads.zzefi.zzl(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzefi.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.zzefi.zzn(r11, r6))) goto L85;
     */
    @Override // com.google.android.gms.internal.ads.zzeek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.equals(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final int hashCode(T t) {
        int i;
        int zzfr;
        int length = this.zziad.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzhc = zzhc(i3);
            int i4 = this.zziad[i3];
            long j = 1048575 & zzhc;
            int i5 = 37;
            switch ((zzhc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzfr = zzecg.zzfr(Double.doubleToLongBits(zzefi.zzo(t, j)));
                    i2 = i + zzfr;
                    break;
                case 1:
                    i = i2 * 53;
                    zzfr = Float.floatToIntBits(zzefi.zzn(t, j));
                    i2 = i + zzfr;
                    break;
                case 2:
                    i = i2 * 53;
                    zzfr = zzecg.zzfr(zzefi.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 3:
                    i = i2 * 53;
                    zzfr = zzecg.zzfr(zzefi.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 4:
                    i = i2 * 53;
                    zzfr = zzefi.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 5:
                    i = i2 * 53;
                    zzfr = zzecg.zzfr(zzefi.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 6:
                    i = i2 * 53;
                    zzfr = zzefi.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 7:
                    i = i2 * 53;
                    zzfr = zzecg.zzbu(zzefi.zzm(t, j));
                    i2 = i + zzfr;
                    break;
                case 8:
                    i = i2 * 53;
                    zzfr = ((String) zzefi.zzp(t, j)).hashCode();
                    i2 = i + zzfr;
                    break;
                case 9:
                    Object zzp = zzefi.zzp(t, j);
                    if (zzp != null) {
                        i5 = zzp.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzfr = zzefi.zzp(t, j).hashCode();
                    i2 = i + zzfr;
                    break;
                case 11:
                    i = i2 * 53;
                    zzfr = zzefi.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 12:
                    i = i2 * 53;
                    zzfr = zzefi.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 13:
                    i = i2 * 53;
                    zzfr = zzefi.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 14:
                    i = i2 * 53;
                    zzfr = zzecg.zzfr(zzefi.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 15:
                    i = i2 * 53;
                    zzfr = zzefi.zzk(t, j);
                    i2 = i + zzfr;
                    break;
                case 16:
                    i = i2 * 53;
                    zzfr = zzecg.zzfr(zzefi.zzl(t, j));
                    i2 = i + zzfr;
                    break;
                case 17:
                    Object zzp2 = zzefi.zzp(t, j);
                    if (zzp2 != null) {
                        i5 = zzp2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzfr = zzefi.zzp(t, j).hashCode();
                    i2 = i + zzfr;
                    break;
                case 50:
                    i = i2 * 53;
                    zzfr = zzefi.zzp(t, j).hashCode();
                    i2 = i + zzfr;
                    break;
                case 51:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzfr(Double.doubleToLongBits(zzf(t, j)));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = Float.floatToIntBits(zzg(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzbu(zzj(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = ((String) zzefi.zzp(t, j)).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzefi.zzp(t, j).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzefi.zzp(t, j).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzh(t, j);
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzecg.zzfr(zzi(t, j));
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzeds<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzfr = zzefi.zzp(t, j).hashCode();
                        i2 = i + zzfr;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zziar.zzay(t).hashCode();
        return this.zziai ? (hashCode * 53) + this.zzias.zzai(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzf(T t, T t2) {
        if (t2 == null) {
            throw null;
        }
        for (int i = 0; i < this.zziad.length; i += 3) {
            int zzhc = zzhc(i);
            long j = 1048575 & zzhc;
            int i2 = this.zziad[i];
            switch ((zzhc & 267386880) >>> 20) {
                case 0:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza(t, j, zzefi.zzo(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza((Object) t, j, zzefi.zzn(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza((Object) t, j, zzefi.zzl(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza((Object) t, j, zzefi.zzl(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zzb(t, j, zzefi.zzk(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza((Object) t, j, zzefi.zzl(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zzb(t, j, zzefi.zzk(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza(t, j, zzefi.zzm(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza(t, j, zzefi.zzp(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza(t, j, zzefi.zzp(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zzb(t, j, zzefi.zzk(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zzb(t, j, zzefi.zzk(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zzb(t, j, zzefi.zzk(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza((Object) t, j, zzefi.zzl(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zzb(t, j, zzefi.zzk(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zze((zzeds<T>) t2, i)) {
                        zzefi.zza((Object) t, j, zzefi.zzl(t2, j));
                        zzf((zzeds<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zziaq.zza(t, t2, j);
                    break;
                case 50:
                    zzeem.zza(this.zziat, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzeds<T>) t2, i2, i)) {
                        zzefi.zza(t, j, zzefi.zzp(t2, j));
                        zzb((zzeds<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zza((zzeds<T>) t2, i2, i)) {
                        zzefi.zza(t, j, zzefi.zzp(t2, j));
                        zzb((zzeds<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzeem.zza(this.zziar, t, t2);
        if (this.zziai) {
            zzeem.zza(this.zzias, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzhc = zzhc(i) & 1048575;
        if (zze((zzeds<T>) t2, i)) {
            Object zzp = zzefi.zzp(t, zzhc);
            Object zzp2 = zzefi.zzp(t2, zzhc);
            if (zzp != null && zzp2 != null) {
                zzefi.zza(t, zzhc, zzecg.zzd(zzp, zzp2));
                zzf((zzeds<T>) t, i);
            } else if (zzp2 != null) {
                zzefi.zza(t, zzhc, zzp2);
                zzf((zzeds<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzhc = zzhc(i);
        int i2 = this.zziad[i];
        long j = zzhc & 1048575;
        if (zza((zzeds<T>) t2, i2, i)) {
            Object zzp = zzefi.zzp(t, j);
            Object zzp2 = zzefi.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzefi.zza(t, j, zzecg.zzd(zzp, zzp2));
                zzb((zzeds<T>) t, i2, i);
            } else if (zzp2 != null) {
                zzefi.zza(t, j, zzp2);
                zzb((zzeds<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzeek
    public final int zzau(T t) {
        int i;
        int i2;
        long j;
        int zzk;
        int zzl;
        int zzaj;
        int zzv;
        int zzah;
        int zzgk;
        int zzgm;
        int zzc;
        int zzah2;
        int zzgk2;
        int zzgm2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zziak) {
            Unsafe unsafe = zzhgt;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zziad.length) {
                int zzhc = zzhc(i5);
                int i7 = (zzhc & i3) >>> 20;
                int i8 = this.zziad[i5];
                long j2 = zzhc & 1048575;
                int i9 = (i7 < zzeby.DOUBLE_LIST_PACKED.id() || i7 > zzeby.SINT64_LIST_PACKED.id()) ? 0 : this.zziad[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzc(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 1:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 2:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzk(i8, zzefi.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 3:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzl(i8, zzefi.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 4:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzaf(i8, zzefi.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 5:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzn(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 6:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzai(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 7:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzi(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 8:
                        if (zze((zzeds<T>) t, i5)) {
                            Object zzp = zzefi.zzp(t, j2);
                            if (zzp instanceof zzeaq) {
                                zzc = zzebk.zzc(i8, (zzeaq) zzp);
                                break;
                            } else {
                                zzc = zzebk.zzl(i8, (String) zzp);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 9:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzeem.zzc(i8, zzefi.zzp(t, j2), zzgz(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 10:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzc(i8, (zzeaq) zzefi.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 11:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzag(i8, zzefi.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 12:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzak(i8, zzefi.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 13:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzaj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 14:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzo(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 15:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzah(i8, zzefi.zzk(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 16:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzm(i8, zzefi.zzl(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 17:
                        if (zze((zzeds<T>) t, i5)) {
                            zzc = zzebk.zzc(i8, (zzedo) zzefi.zzp(t, j2), zzgz(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 18:
                        zzc = zzeem.zzw(i8, zze(t, j2), false);
                        break;
                    case 19:
                        zzc = zzeem.zzv(i8, zze(t, j2), false);
                        break;
                    case 20:
                        zzc = zzeem.zzo(i8, zze(t, j2), false);
                        break;
                    case 21:
                        zzc = zzeem.zzp(i8, zze(t, j2), false);
                        break;
                    case 22:
                        zzc = zzeem.zzs(i8, zze(t, j2), false);
                        break;
                    case 23:
                        zzc = zzeem.zzw(i8, zze(t, j2), false);
                        break;
                    case 24:
                        zzc = zzeem.zzv(i8, zze(t, j2), false);
                        break;
                    case 25:
                        zzc = zzeem.zzx(i8, zze(t, j2), false);
                        break;
                    case 26:
                        zzc = zzeem.zzc(i8, zze(t, j2));
                        break;
                    case 27:
                        zzc = zzeem.zzc(i8, zze(t, j2), zzgz(i5));
                        break;
                    case 28:
                        zzc = zzeem.zzd(i8, zze(t, j2));
                        break;
                    case 29:
                        zzc = zzeem.zzt(i8, zze(t, j2), false);
                        break;
                    case 30:
                        zzc = zzeem.zzr(i8, zze(t, j2), false);
                        break;
                    case 31:
                        zzc = zzeem.zzv(i8, zze(t, j2), false);
                        break;
                    case 32:
                        zzc = zzeem.zzw(i8, zze(t, j2), false);
                        break;
                    case 33:
                        zzc = zzeem.zzu(i8, zze(t, j2), false);
                        break;
                    case 34:
                        zzc = zzeem.zzq(i8, zze(t, j2), false);
                        break;
                    case 35:
                        zzah2 = zzeem.zzah((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 36:
                        zzah2 = zzeem.zzag((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 37:
                        zzah2 = zzeem.zzz((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 38:
                        zzah2 = zzeem.zzaa((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 39:
                        zzah2 = zzeem.zzad((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 40:
                        zzah2 = zzeem.zzah((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 41:
                        zzah2 = zzeem.zzag((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 42:
                        zzah2 = zzeem.zzai((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 43:
                        zzah2 = zzeem.zzae((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 44:
                        zzah2 = zzeem.zzac((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 45:
                        zzah2 = zzeem.zzag((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 46:
                        zzah2 = zzeem.zzah((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 47:
                        zzah2 = zzeem.zzaf((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 48:
                        zzah2 = zzeem.zzab((List) unsafe.getObject(t, j2));
                        if (zzah2 > 0) {
                            if (this.zzial) {
                                unsafe.putInt(t, i9, zzah2);
                            }
                            zzgk2 = zzebk.zzgk(i8);
                            zzgm2 = zzebk.zzgm(zzah2);
                            zzc = zzgk2 + zzgm2 + zzah2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 49:
                        zzc = zzeem.zzd(i8, zze(t, j2), zzgz(i5));
                        break;
                    case 50:
                        zzc = this.zziat.zzb(i8, zzefi.zzp(t, j2), zzha(i5));
                        break;
                    case 51:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzc(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 52:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 53:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzk(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 54:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzl(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 55:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzaf(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 56:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzn(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 57:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzai(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 58:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzi(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 59:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            Object zzp2 = zzefi.zzp(t, j2);
                            if (zzp2 instanceof zzeaq) {
                                zzc = zzebk.zzc(i8, (zzeaq) zzp2);
                                break;
                            } else {
                                zzc = zzebk.zzl(i8, (String) zzp2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 60:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzeem.zzc(i8, zzefi.zzp(t, j2), zzgz(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 61:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzc(i8, (zzeaq) zzefi.zzp(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 62:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzag(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 63:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzak(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 64:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzaj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 65:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzo(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 66:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzah(i8, zzh(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 67:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzm(i8, zzi(t, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    case 68:
                        if (zza((zzeds<T>) t, i8, i5)) {
                            zzc = zzebk.zzc(i8, (zzedo) zzefi.zzp(t, j2), zzgz(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i3 = 267386880;
                        }
                    default:
                        i5 += 3;
                        i3 = 267386880;
                }
                i6 += zzc;
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zziar, t);
        }
        Unsafe unsafe2 = zzhgt;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zziad.length) {
            int zzhc2 = zzhc(i11);
            int[] iArr = this.zziad;
            int i14 = iArr[i11];
            int i15 = (zzhc2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & 1048575;
                i2 = i4 << (i16 >>> 20);
                if (i17 != i10) {
                    i13 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i = i16;
            } else {
                i = (!this.zzial || i15 < zzeby.DOUBLE_LIST_PACKED.id() || i15 > zzeby.SINT64_LIST_PACKED.id()) ? 0 : this.zziad[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzhc2 & 1048575;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzebk.zzc(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzebk.zzb(i14, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzk = zzebk.zzk(i14, unsafe2.getLong(t, j3));
                        i12 += zzk;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzk = zzebk.zzl(i14, unsafe2.getLong(t, j3));
                        i12 += zzk;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzk = zzebk.zzaf(i14, unsafe2.getInt(t, j3));
                        i12 += zzk;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzk = zzebk.zzn(i14, 0L);
                        i12 += zzk;
                    }
                    break;
                case 6:
                    if ((i13 & i2) != 0) {
                        i12 += zzebk.zzai(i14, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i13 & i2) != 0) {
                        i12 += zzebk.zzi(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzeaq) {
                            zzl = zzebk.zzc(i14, (zzeaq) object);
                        } else {
                            zzl = zzebk.zzl(i14, (String) object);
                        }
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i2) != 0) {
                        zzl = zzeem.zzc(i14, unsafe2.getObject(t, j3), zzgz(i11));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzc(i14, (zzeaq) unsafe2.getObject(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzag(i14, unsafe2.getInt(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzak(i14, unsafe2.getInt(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i2) != 0) {
                        zzaj = zzebk.zzaj(i14, 0);
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzo(i14, 0L);
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzah(i14, unsafe2.getInt(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzm(i14, unsafe2.getLong(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i2) != 0) {
                        zzl = zzebk.zzc(i14, (zzedo) unsafe2.getObject(t, j3), zzgz(i11));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 18:
                    zzl = zzeem.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzl;
                    j = 0;
                    break;
                case 19:
                    zzv = zzeem.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 20:
                    zzv = zzeem.zzo(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 21:
                    zzv = zzeem.zzp(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 22:
                    zzv = zzeem.zzs(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 23:
                    zzv = zzeem.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 24:
                    zzv = zzeem.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 25:
                    zzv = zzeem.zzx(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 26:
                    zzl = zzeem.zzc(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzl;
                    j = 0;
                    break;
                case 27:
                    zzl = zzeem.zzc(i14, (List<?>) unsafe2.getObject(t, j3), zzgz(i11));
                    i12 += zzl;
                    j = 0;
                    break;
                case 28:
                    zzl = zzeem.zzd(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzl;
                    j = 0;
                    break;
                case 29:
                    zzl = zzeem.zzt(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzl;
                    j = 0;
                    break;
                case 30:
                    zzv = zzeem.zzr(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 31:
                    zzv = zzeem.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 32:
                    zzv = zzeem.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 33:
                    zzv = zzeem.zzu(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 34:
                    zzv = zzeem.zzq(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 35:
                    zzah = zzeem.zzah((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 36:
                    zzah = zzeem.zzag((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 37:
                    zzah = zzeem.zzz((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 38:
                    zzah = zzeem.zzaa((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 39:
                    zzah = zzeem.zzad((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 40:
                    zzah = zzeem.zzah((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 41:
                    zzah = zzeem.zzag((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 42:
                    zzah = zzeem.zzai((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 43:
                    zzah = zzeem.zzae((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 44:
                    zzah = zzeem.zzac((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 45:
                    zzah = zzeem.zzag((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 46:
                    zzah = zzeem.zzah((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 47:
                    zzah = zzeem.zzaf((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 48:
                    zzah = zzeem.zzab((List) unsafe2.getObject(t, j3));
                    if (zzah > 0) {
                        if (this.zzial) {
                            unsafe2.putInt(t, i, zzah);
                        }
                        zzgk = zzebk.zzgk(i14);
                        zzgm = zzebk.zzgm(zzah);
                        zzaj = zzgk + zzgm + zzah;
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 49:
                    zzl = zzeem.zzd(i14, (List) unsafe2.getObject(t, j3), zzgz(i11));
                    i12 += zzl;
                    j = 0;
                    break;
                case 50:
                    zzl = this.zziat.zzb(i14, unsafe2.getObject(t, j3), zzha(i11));
                    i12 += zzl;
                    j = 0;
                    break;
                case 51:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzc(i14, 0.0d);
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 52:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzaj = zzebk.zzb(i14, 0.0f);
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 53:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzk(i14, zzi(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 54:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzl(i14, zzi(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 55:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzaf(i14, zzh(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzn(i14, 0L);
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzaj = zzebk.zzai(i14, 0);
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzaj = zzebk.zzi(i14, true);
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzeaq) {
                            zzl = zzebk.zzc(i14, (zzeaq) object2);
                        } else {
                            zzl = zzebk.zzl(i14, (String) object2);
                        }
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 60:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzeem.zzc(i14, unsafe2.getObject(t, j3), zzgz(i11));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 61:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzc(i14, (zzeaq) unsafe2.getObject(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzag(i14, zzh(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 63:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzak(i14, zzh(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzaj = zzebk.zzaj(i14, 0);
                        i12 += zzaj;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzo(i14, 0L);
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 66:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzah(i14, zzh(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 67:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzm(i14, zzi(t, j3));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzeds<T>) t, i14, i11)) {
                        zzl = zzebk.zzc(i14, (zzedo) unsafe2.getObject(t, j3), zzgz(i11));
                        i12 += zzl;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i11 += 3;
            i4 = 1;
        }
        int i18 = 0;
        int zza = i12 + zza(this.zziar, t);
        if (this.zziai) {
            zzebt<?> zzai = this.zzias.zzai(t);
            for (int i19 = 0; i19 < zzai.zzhut.zzbgq(); i19++) {
                Map.Entry<?, Object> zzhj = zzai.zzhut.zzhj(i19);
                i18 += zzebt.zzb((zzebv) zzhj.getKey(), zzhj.getValue());
            }
            for (Map.Entry<?, Object> entry : zzai.zzhut.zzbgr()) {
                i18 += zzebt.zzb((zzebv) entry.getKey(), entry.getValue());
            }
            return zza + i18;
        }
        return zza;
    }

    private static <UT, UB> int zza(zzefc<UT, UB> zzefcVar, T t) {
        return zzefcVar.zzau(zzefcVar.zzay(t));
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzefi.zzp(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // com.google.android.gms.internal.ads.zzeek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r14, com.google.android.gms.internal.ads.zzefv r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.zza(java.lang.Object, com.google.android.gms.internal.ads.zzefv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzb(T r19, com.google.android.gms.internal.ads.zzefv r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.zzb(java.lang.Object, com.google.android.gms.internal.ads.zzefv):void");
    }

    private final <K, V> void zza(zzefv zzefvVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzefvVar.zza(i, this.zziat.zzas(zzha(i2)), this.zziat.zzao(obj));
        }
    }

    private static <UT, UB> void zza(zzefc<UT, UB> zzefcVar, T t, zzefv zzefvVar) throws IOException {
        zzefcVar.zza((zzefc<UT, UB>) zzefcVar.zzay(t), zzefvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(T t, zzeee zzeeeVar, zzebq zzebqVar) throws IOException {
        if (zzebqVar == null) {
            throw null;
        }
        zzefc zzefcVar = this.zziar;
        zzebs<?> zzebsVar = this.zzias;
        zzebt<?> zzebtVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzbdw = zzeeeVar.zzbdw();
                int zzhf = zzhf(zzbdw);
                if (zzhf >= 0) {
                    int zzhc = zzhc(zzhf);
                    switch ((267386880 & zzhc) >>> 20) {
                        case 0:
                            zzefi.zza(t, zzhc & 1048575, zzeeeVar.readDouble());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 1:
                            zzefi.zza((Object) t, zzhc & 1048575, zzeeeVar.readFloat());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 2:
                            zzefi.zza((Object) t, zzhc & 1048575, zzeeeVar.zzbda());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 3:
                            zzefi.zza((Object) t, zzhc & 1048575, zzeeeVar.zzbcz());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 4:
                            zzefi.zzb(t, zzhc & 1048575, zzeeeVar.zzbdb());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 5:
                            zzefi.zza((Object) t, zzhc & 1048575, zzeeeVar.zzbdc());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 6:
                            zzefi.zzb(t, zzhc & 1048575, zzeeeVar.zzbdd());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 7:
                            zzefi.zza(t, zzhc & 1048575, zzeeeVar.zzbde());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 8:
                            zza(t, zzhc, zzeeeVar);
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 9:
                            if (zze((zzeds<T>) t, zzhf)) {
                                long j = zzhc & 1048575;
                                zzefi.zza(t, j, zzecg.zzd(zzefi.zzp(t, j), zzeeeVar.zza(zzgz(zzhf), zzebqVar)));
                                break;
                            } else {
                                zzefi.zza(t, zzhc & 1048575, zzeeeVar.zza(zzgz(zzhf), zzebqVar));
                                zzf((zzeds<T>) t, zzhf);
                                continue;
                            }
                        case 10:
                            zzefi.zza(t, zzhc & 1048575, zzeeeVar.zzbdg());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 11:
                            zzefi.zzb(t, zzhc & 1048575, zzeeeVar.zzbdh());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 12:
                            int zzbdi = zzeeeVar.zzbdi();
                            zzech zzhb = zzhb(zzhf);
                            if (zzhb != null && !zzhb.zzf(zzbdi)) {
                                obj = zzeem.zza(zzbdw, zzbdi, obj, zzefcVar);
                                break;
                            }
                            zzefi.zzb(t, zzhc & 1048575, zzbdi);
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 13:
                            zzefi.zzb(t, zzhc & 1048575, zzeeeVar.zzbdj());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 14:
                            zzefi.zza((Object) t, zzhc & 1048575, zzeeeVar.zzbdk());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 15:
                            zzefi.zzb(t, zzhc & 1048575, zzeeeVar.zzbdl());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 16:
                            zzefi.zza((Object) t, zzhc & 1048575, zzeeeVar.zzbdm());
                            zzf((zzeds<T>) t, zzhf);
                            continue;
                        case 17:
                            if (zze((zzeds<T>) t, zzhf)) {
                                long j2 = zzhc & 1048575;
                                zzefi.zza(t, j2, zzecg.zzd(zzefi.zzp(t, j2), zzeeeVar.zzb(zzgz(zzhf), zzebqVar)));
                                break;
                            } else {
                                zzefi.zza(t, zzhc & 1048575, zzeeeVar.zzb(zzgz(zzhf), zzebqVar));
                                zzf((zzeds<T>) t, zzhf);
                                continue;
                            }
                        case 18:
                            zzeeeVar.zzj(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 19:
                            zzeeeVar.zzk(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 20:
                            zzeeeVar.zzm(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 21:
                            zzeeeVar.zzl(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 22:
                            zzeeeVar.zzn(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 23:
                            zzeeeVar.zzo(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 24:
                            zzeeeVar.zzp(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 25:
                            zzeeeVar.zzq(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 26:
                            if (zzhe(zzhc)) {
                                zzeeeVar.zzr(this.zziaq.zza(t, zzhc & 1048575));
                                break;
                            } else {
                                zzeeeVar.readStringList(this.zziaq.zza(t, zzhc & 1048575));
                                continue;
                            }
                        case 27:
                            zzeeeVar.zza(this.zziaq.zza(t, zzhc & 1048575), zzgz(zzhf), zzebqVar);
                            continue;
                        case 28:
                            zzeeeVar.zzs(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 29:
                            zzeeeVar.zzt(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 30:
                            List<Integer> zza = this.zziaq.zza(t, zzhc & 1048575);
                            zzeeeVar.zzu(zza);
                            obj = zzeem.zza(zzbdw, zza, zzhb(zzhf), obj, zzefcVar);
                            continue;
                        case 31:
                            zzeeeVar.zzv(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 32:
                            zzeeeVar.zzw(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 33:
                            zzeeeVar.zzx(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 34:
                            zzeeeVar.zzy(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 35:
                            zzeeeVar.zzj(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 36:
                            zzeeeVar.zzk(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 37:
                            zzeeeVar.zzm(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 38:
                            zzeeeVar.zzl(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 39:
                            zzeeeVar.zzn(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 40:
                            zzeeeVar.zzo(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 41:
                            zzeeeVar.zzp(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 42:
                            zzeeeVar.zzq(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 43:
                            zzeeeVar.zzt(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 44:
                            List<Integer> zza2 = this.zziaq.zza(t, zzhc & 1048575);
                            zzeeeVar.zzu(zza2);
                            obj = zzeem.zza(zzbdw, zza2, zzhb(zzhf), obj, zzefcVar);
                            continue;
                        case 45:
                            zzeeeVar.zzv(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 46:
                            zzeeeVar.zzw(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 47:
                            zzeeeVar.zzx(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 48:
                            zzeeeVar.zzy(this.zziaq.zza(t, zzhc & 1048575));
                            continue;
                        case 49:
                            zzeeeVar.zzb(this.zziaq.zza(t, zzhc & 1048575), zzgz(zzhf), zzebqVar);
                            continue;
                        case 50:
                            Object zzha = zzha(zzhf);
                            long zzhc2 = zzhc(zzhf) & 1048575;
                            Object zzp = zzefi.zzp(t, zzhc2);
                            if (zzp == null) {
                                zzp = this.zziat.zzar(zzha);
                                zzefi.zza(t, zzhc2, zzp);
                            } else if (this.zziat.zzap(zzp)) {
                                Object zzar = this.zziat.zzar(zzha);
                                this.zziat.zze(zzar, zzp);
                                zzefi.zza(t, zzhc2, zzar);
                                zzp = zzar;
                            }
                            zzeeeVar.zza(this.zziat.zzan(zzp), this.zziat.zzas(zzha), zzebqVar);
                            continue;
                        case 51:
                            zzefi.zza(t, zzhc & 1048575, Double.valueOf(zzeeeVar.readDouble()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 52:
                            zzefi.zza(t, zzhc & 1048575, Float.valueOf(zzeeeVar.readFloat()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 53:
                            zzefi.zza(t, zzhc & 1048575, Long.valueOf(zzeeeVar.zzbda()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 54:
                            zzefi.zza(t, zzhc & 1048575, Long.valueOf(zzeeeVar.zzbcz()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 55:
                            zzefi.zza(t, zzhc & 1048575, Integer.valueOf(zzeeeVar.zzbdb()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 56:
                            zzefi.zza(t, zzhc & 1048575, Long.valueOf(zzeeeVar.zzbdc()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 57:
                            zzefi.zza(t, zzhc & 1048575, Integer.valueOf(zzeeeVar.zzbdd()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 58:
                            zzefi.zza(t, zzhc & 1048575, Boolean.valueOf(zzeeeVar.zzbde()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 59:
                            zza(t, zzhc, zzeeeVar);
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 60:
                            if (zza((zzeds<T>) t, zzbdw, zzhf)) {
                                long j3 = zzhc & 1048575;
                                zzefi.zza(t, j3, zzecg.zzd(zzefi.zzp(t, j3), zzeeeVar.zza(zzgz(zzhf), zzebqVar)));
                            } else {
                                zzefi.zza(t, zzhc & 1048575, zzeeeVar.zza(zzgz(zzhf), zzebqVar));
                                zzf((zzeds<T>) t, zzhf);
                            }
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 61:
                            zzefi.zza(t, zzhc & 1048575, zzeeeVar.zzbdg());
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 62:
                            zzefi.zza(t, zzhc & 1048575, Integer.valueOf(zzeeeVar.zzbdh()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 63:
                            int zzbdi2 = zzeeeVar.zzbdi();
                            zzech zzhb2 = zzhb(zzhf);
                            if (zzhb2 != null && !zzhb2.zzf(zzbdi2)) {
                                obj = zzeem.zza(zzbdw, zzbdi2, obj, zzefcVar);
                                break;
                            }
                            zzefi.zza(t, zzhc & 1048575, Integer.valueOf(zzbdi2));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 64:
                            zzefi.zza(t, zzhc & 1048575, Integer.valueOf(zzeeeVar.zzbdj()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 65:
                            zzefi.zza(t, zzhc & 1048575, Long.valueOf(zzeeeVar.zzbdk()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 66:
                            zzefi.zza(t, zzhc & 1048575, Integer.valueOf(zzeeeVar.zzbdl()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 67:
                            zzefi.zza(t, zzhc & 1048575, Long.valueOf(zzeeeVar.zzbdm()));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        case 68:
                            zzefi.zza(t, zzhc & 1048575, zzeeeVar.zzb(zzgz(zzhf), zzebqVar));
                            zzb((zzeds<T>) t, zzbdw, zzhf);
                            continue;
                        default:
                            if (obj == null) {
                                try {
                                    obj = zzefcVar.zzbhg();
                                } catch (zzecn unused) {
                                    zzefcVar.zza(zzeeeVar);
                                    if (obj == null) {
                                        obj = zzefcVar.zzaz(t);
                                    }
                                    if (!zzefcVar.zza((zzefc) obj, zzeeeVar)) {
                                        for (int i = this.zzian; i < this.zziao; i++) {
                                            obj = zza((Object) t, this.zziam[i], (int) obj, (zzefc<UT, int>) zzefcVar);
                                        }
                                        if (obj != null) {
                                            zzefcVar.zzi(t, obj);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!zzefcVar.zza((zzefc) obj, zzeeeVar)) {
                                for (int i2 = this.zzian; i2 < this.zziao; i2++) {
                                    obj = zza((Object) t, this.zziam[i2], (int) obj, (zzefc<UT, int>) zzefcVar);
                                }
                                if (obj != null) {
                                    zzefcVar.zzi(t, obj);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                } else if (zzbdw == Integer.MAX_VALUE) {
                    for (int i3 = this.zzian; i3 < this.zziao; i3++) {
                        obj = zza((Object) t, this.zziam[i3], (int) obj, (zzefc<UT, int>) zzefcVar);
                    }
                    if (obj != null) {
                        zzefcVar.zzi(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object zza3 = !this.zziai ? null : zzebsVar.zza(zzebqVar, this.zziah, zzbdw);
                    if (zza3 != null) {
                        if (zzebtVar == null) {
                            zzebtVar = zzebsVar.zzaj(t);
                        }
                        zzebt<?> zzebtVar2 = zzebtVar;
                        obj = zzebsVar.zza(zzeeeVar, zza3, zzebqVar, zzebtVar2, obj, zzefcVar);
                        zzebtVar = zzebtVar2;
                    } else {
                        zzefcVar.zza(zzeeeVar);
                        if (obj == null) {
                            obj = zzefcVar.zzaz(t);
                        }
                        if (!zzefcVar.zza((zzefc) obj, zzeeeVar)) {
                            for (int i4 = this.zzian; i4 < this.zziao; i4++) {
                                obj = zza((Object) t, this.zziam[i4], (int) obj, (zzefc<UT, int>) zzefcVar);
                            }
                            if (obj != null) {
                                zzefcVar.zzi(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzian; i5 < this.zziao; i5++) {
                    obj = zza((Object) t, this.zziam[i5], (int) obj, (zzefc<UT, int>) zzefcVar);
                }
                if (obj != null) {
                    zzefcVar.zzi(t, obj);
                }
                throw th;
            }
        }
    }

    private static zzefb zzav(Object obj) {
        zzecd zzecdVar = (zzecd) obj;
        zzefb zzefbVar = zzecdVar.zzhxv;
        if (zzefbVar == zzefb.zzbhd()) {
            zzefb zzbhe = zzefb.zzbhe();
            zzecdVar.zzhxv = zzbhe;
            return zzbhe;
        }
        return zzefbVar;
    }

    private static int zza(byte[] bArr, int i, int i2, zzefp zzefpVar, Class<?> cls, zzeap zzeapVar) throws IOException {
        switch (zzedr.zzhuk[zzefpVar.ordinal()]) {
            case 1:
                int zzb = zzeam.zzb(bArr, i, zzeapVar);
                zzeapVar.zzhtd = Boolean.valueOf(zzeapVar.zzhtc != 0);
                return zzb;
            case 2:
                return zzeam.zze(bArr, i, zzeapVar);
            case 3:
                zzeapVar.zzhtd = Double.valueOf(zzeam.zzh(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzeapVar.zzhtd = Integer.valueOf(zzeam.zzf(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzeapVar.zzhtd = Long.valueOf(zzeam.zzg(bArr, i));
                return i + 8;
            case 8:
                zzeapVar.zzhtd = Float.valueOf(zzeam.zzi(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zzeam.zza(bArr, i, zzeapVar);
                zzeapVar.zzhtd = Integer.valueOf(zzeapVar.zzhtb);
                return zza;
            case 12:
            case 13:
                int zzb2 = zzeam.zzb(bArr, i, zzeapVar);
                zzeapVar.zzhtd = Long.valueOf(zzeapVar.zzhtc);
                return zzb2;
            case 14:
                return zzeam.zza(zzedz.zzbgk().zzh(cls), bArr, i, i2, zzeapVar);
            case 15:
                int zza2 = zzeam.zza(bArr, i, zzeapVar);
                zzeapVar.zzhtd = Integer.valueOf(zzebf.zzfw(zzeapVar.zzhtb));
                return zza2;
            case 16:
                int zzb3 = zzeam.zzb(bArr, i, zzeapVar);
                zzeapVar.zzhtd = Long.valueOf(zzebf.zzfh(zzeapVar.zzhtc));
                return zzb3;
            case 17:
                return zzeam.zzd(bArr, i, zzeapVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0236 -> B:116:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x016e -> B:67:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01e8 -> B:96:0x01e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zza(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.zzeap r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.zza(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzeap):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zzeap zzeapVar) throws IOException {
        Unsafe unsafe = zzhgt;
        Object zzha = zzha(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zziat.zzap(object)) {
            Object zzar = this.zziat.zzar(zzha);
            this.zziat.zze(zzar, object);
            unsafe.putObject(t, j, zzar);
            object = zzar;
        }
        zzedf<?, ?> zzas = this.zziat.zzas(zzha);
        Map<?, ?> zzan = this.zziat.zzan(object);
        int zza = zzeam.zza(bArr, i, zzeapVar);
        int i4 = zzeapVar.zzhtb;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzeco.zzbfg();
        }
        int i5 = i4 + zza;
        Object obj = (K) zzas.zzhzx;
        Object obj2 = (V) zzas.zzcif;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = zzeam.zza(i7, bArr, i6, zzeapVar);
                i7 = zzeapVar.zzhtb;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzas.zzhzw.zzbho()) {
                    zza = zza(bArr, i8, i2, zzas.zzhzw, (Class<?>) null, zzeapVar);
                    obj = (K) zzeapVar.zzhtd;
                } else {
                    zza = zzeam.zza(i7, bArr, i8, i2, zzeapVar);
                }
            } else {
                if (i9 == 2 && i10 == zzas.zzhzy.zzbho()) {
                    zza = zza(bArr, i8, i2, zzas.zzhzy, zzas.zzcif.getClass(), zzeapVar);
                    obj2 = zzeapVar.zzhtd;
                }
                zza = zzeam.zza(i7, bArr, i8, i2, zzeapVar);
            }
        }
        if (zza != i5) {
            throw zzeco.zzbfn();
        }
        zzan.put(obj, obj2);
        return i5;
    }

    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzeap zzeapVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzhgt;
        long j2 = this.zziad[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zzeam.zzh(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zzeam.zzi(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 53:
            case 54:
                if (i5 == 0) {
                    zzb = zzeam.zzb(bArr, i, zzeapVar);
                    unsafe.putObject(t, j, Long.valueOf(zzeapVar.zzhtc));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    zzb = zzeam.zza(bArr, i, zzeapVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzeapVar.zzhtb));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zzeam.zzg(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zzeam.zzf(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zzeam.zzb(bArr, i, zzeapVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzeapVar.zzhtc != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zzeam.zza(bArr, i, zzeapVar);
                    int i9 = zzeapVar.zzhtb;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzefk.zzm(bArr, zza, zza + i9)) {
                        throw zzeco.zzbfo();
                    } else {
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzecg.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int zza2 = zzeam.zza(zzgz(i8), bArr, i, i2, zzeapVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzeapVar.zzhtd);
                    } else {
                        unsafe.putObject(t, j, zzecg.zzd(object, zzeapVar.zzhtd));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    zzb = zzeam.zze(bArr, i, zzeapVar);
                    unsafe.putObject(t, j, zzeapVar.zzhtd);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int zza3 = zzeam.zza(bArr, i, zzeapVar);
                    int i10 = zzeapVar.zzhtb;
                    zzech zzhb = zzhb(i8);
                    if (zzhb == null || zzhb.zzf(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzav(t).zzd(i3, Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case 66:
                if (i5 == 0) {
                    zzb = zzeam.zza(bArr, i, zzeapVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzebf.zzfw(zzeapVar.zzhtb)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 67:
                if (i5 == 0) {
                    zzb = zzeam.zzb(bArr, i, zzeapVar);
                    unsafe.putObject(t, j, Long.valueOf(zzebf.zzfh(zzeapVar.zzhtc)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zzeam.zza(zzgz(i8), bArr, i, i2, (i3 & (-8)) | 4, zzeapVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzeapVar.zzhtd);
                    } else {
                        unsafe.putObject(t, j, zzecg.zzd(object2, zzeapVar.zzhtd));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzeek zzgz(int i) {
        int i2 = (i / 3) << 1;
        zzeek zzeekVar = (zzeek) this.zziae[i2];
        if (zzeekVar != null) {
            return zzeekVar;
        }
        zzeek<T> zzh = zzedz.zzbgk().zzh((Class) this.zziae[i2 + 1]);
        this.zziae[i2] = zzh;
        return zzh;
    }

    private final Object zzha(int i) {
        return this.zziae[(i / 3) << 1];
    }

    private final zzech zzhb(int i) {
        return (zzech) this.zziae[((i / 3) << 1) + 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza(T t, byte[] bArr, int i, int i2, int i3, zzeap zzeapVar) throws IOException {
        Unsafe unsafe;
        int i4;
        T t2;
        zzeds<T> zzedsVar;
        int i5;
        byte b;
        int i6;
        int zzhf;
        int i7;
        int i8;
        int i9;
        int i10;
        T t3;
        zzeap zzeapVar2;
        int i11;
        int i12;
        int i13;
        zzeap zzeapVar3;
        int i14;
        zzeap zzeapVar4;
        int i15;
        int i16;
        zzeap zzeapVar5;
        int i17;
        int i18;
        int i19;
        zzeds<T> zzedsVar2 = this;
        T t4 = t;
        byte[] bArr2 = bArr;
        int i20 = i2;
        int i21 = i3;
        zzeap zzeapVar6 = zzeapVar;
        Unsafe unsafe2 = zzhgt;
        int i22 = i;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        while (true) {
            if (i22 < i20) {
                int i28 = i22 + 1;
                byte b2 = bArr2[i22];
                if (b2 < 0) {
                    i6 = zzeam.zza(b2, bArr2, i28, zzeapVar6);
                    b = zzeapVar6.zzhtb;
                } else {
                    b = b2;
                    i6 = i28;
                }
                int i29 = b >>> 3;
                int i30 = b & 7;
                if (i29 > i23) {
                    zzhf = zzedsVar2.zzan(i29, i24 / 3);
                } else {
                    zzhf = zzedsVar2.zzhf(i29);
                }
                int i31 = zzhf;
                if (i31 == -1) {
                    i7 = i29;
                    i8 = i6;
                    i9 = b;
                    unsafe = unsafe2;
                    i4 = i21;
                    i10 = 0;
                } else {
                    int[] iArr = zzedsVar2.zziad;
                    int i32 = iArr[i31 + 1];
                    int i33 = (i32 & 267386880) >>> 20;
                    int i34 = b;
                    long j = i32 & 1048575;
                    if (i33 <= 17) {
                        int i35 = iArr[i31 + 2];
                        int i36 = 1 << (i35 >>> 20);
                        int i37 = i35 & 1048575;
                        if (i37 != i27) {
                            if (i27 != -1) {
                                unsafe2.putInt(t4, i27, i26);
                            }
                            i26 = unsafe2.getInt(t4, i37);
                            i27 = i37;
                        }
                        switch (i33) {
                            case 0:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                i15 = i6;
                                if (i30 == 1) {
                                    zzefi.zza(t4, j, zzeam.zzh(bArr2, i15));
                                    i22 = i15 + 8;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 1:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                i15 = i6;
                                if (i30 == 5) {
                                    zzefi.zza((Object) t4, j, zzeam.zzi(bArr2, i15));
                                    i22 = i15 + 4;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 2:
                            case 3:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                i15 = i6;
                                if (i30 == 0) {
                                    int zzb = zzeam.zzb(bArr2, i15, zzeapVar);
                                    unsafe2.putLong(t, j, zzeapVar.zzhtc);
                                    i26 |= i36;
                                    i22 = zzb;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar;
                                    i27 = i14;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 4:
                            case 11:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                i15 = i6;
                                if (i30 == 0) {
                                    i22 = zzeam.zza(bArr2, i15, zzeapVar4);
                                    unsafe2.putInt(t4, j, zzeapVar4.zzhtb);
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 5:
                            case 14:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                if (i30 == 1) {
                                    i14 = i27;
                                    i15 = i6;
                                    unsafe2.putLong(t, j, zzeam.zzg(bArr2, i6));
                                    i22 = i15 + 8;
                                    i26 |= i36;
                                    i27 = i14;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar5 = zzeapVar;
                                if (i30 == 5) {
                                    unsafe2.putInt(t4, j, zzeam.zzf(bArr2, i6));
                                    i22 = i6 + 4;
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 7:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar5 = zzeapVar;
                                if (i30 == 0) {
                                    int zzb2 = zzeam.zzb(bArr2, i6, zzeapVar5);
                                    zzefi.zza(t4, j, zzeapVar5.zzhtc != 0);
                                    i26 |= i36;
                                    i22 = zzb2;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 8:
                                i16 = i2;
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar5 = zzeapVar;
                                if (i30 == 2) {
                                    if ((i32 & 536870912) == 0) {
                                        i22 = zzeam.zzc(bArr2, i6, zzeapVar5);
                                    } else {
                                        i22 = zzeam.zzd(bArr2, i6, zzeapVar5);
                                    }
                                    unsafe2.putObject(t4, j, zzeapVar5.zzhtd);
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 9:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar5 = zzeapVar;
                                if (i30 == 2) {
                                    i16 = i2;
                                    i22 = zzeam.zza(zzedsVar2.zzgz(i11), bArr2, i6, i16, zzeapVar5);
                                    if ((i26 & i36) == 0) {
                                        unsafe2.putObject(t4, j, zzeapVar5.zzhtd);
                                    } else {
                                        unsafe2.putObject(t4, j, zzecg.zzd(unsafe2.getObject(t4, j), zzeapVar5.zzhtd));
                                    }
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar5;
                                    i21 = i3;
                                    i20 = i16;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 10:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                if (i30 == 2) {
                                    i22 = zzeam.zze(bArr2, i6, zzeapVar4);
                                    unsafe2.putObject(t4, j, zzeapVar4.zzhtd);
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 12:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                if (i30 != 0) {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                } else {
                                    i22 = zzeam.zza(bArr2, i6, zzeapVar4);
                                    int i38 = zzeapVar4.zzhtb;
                                    zzech zzhb = zzedsVar2.zzhb(i11);
                                    if (zzhb == null || zzhb.zzf(i38)) {
                                        unsafe2.putInt(t4, j, i38);
                                        i26 |= i36;
                                        i25 = i13;
                                        i24 = i11;
                                        i23 = i12;
                                        zzeapVar6 = zzeapVar4;
                                        i20 = i2;
                                        i21 = i3;
                                        break;
                                    } else {
                                        zzav(t).zzd(i13, Long.valueOf(i38));
                                        i25 = i13;
                                        i24 = i11;
                                        i23 = i12;
                                        zzeapVar6 = zzeapVar4;
                                        i20 = i2;
                                        i21 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                bArr2 = bArr;
                                zzeapVar4 = zzeapVar;
                                if (i30 == 0) {
                                    i22 = zzeam.zza(bArr2, i6, zzeapVar4);
                                    unsafe2.putInt(t4, j, zzebf.zzfw(zzeapVar4.zzhtb));
                                    i26 |= i36;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 16:
                                i11 = i31;
                                i12 = i29;
                                i13 = i34;
                                if (i30 == 0) {
                                    bArr2 = bArr;
                                    int zzb3 = zzeam.zzb(bArr2, i6, zzeapVar);
                                    zzeapVar4 = zzeapVar;
                                    unsafe2.putLong(t, j, zzebf.zzfh(zzeapVar.zzhtc));
                                    i26 |= i36;
                                    i22 = zzb3;
                                    i25 = i13;
                                    i24 = i11;
                                    i23 = i12;
                                    zzeapVar6 = zzeapVar4;
                                    i20 = i2;
                                    i21 = i3;
                                    break;
                                } else {
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            case 17:
                                if (i30 == 3) {
                                    i22 = zzeam.zza(zzedsVar2.zzgz(i31), bArr, i6, i2, (i29 << 3) | 4, zzeapVar);
                                    if ((i26 & i36) == 0) {
                                        zzeapVar3 = zzeapVar;
                                        unsafe2.putObject(t4, j, zzeapVar3.zzhtd);
                                    } else {
                                        zzeapVar3 = zzeapVar;
                                        unsafe2.putObject(t4, j, zzecg.zzd(unsafe2.getObject(t4, j), zzeapVar3.zzhtd));
                                    }
                                    i26 |= i36;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i25 = i34;
                                    i24 = i31;
                                    i23 = i29;
                                    i21 = i3;
                                    zzeapVar6 = zzeapVar3;
                                    break;
                                } else {
                                    i11 = i31;
                                    i12 = i29;
                                    i13 = i34;
                                    i14 = i27;
                                    i15 = i6;
                                    i8 = i15;
                                    i10 = i11;
                                    unsafe = unsafe2;
                                    i7 = i12;
                                    i27 = i14;
                                    i9 = i13;
                                    i4 = i3;
                                    break;
                                }
                            default:
                                i11 = i31;
                                i12 = i29;
                                i14 = i27;
                                i13 = i34;
                                i15 = i6;
                                i8 = i15;
                                i10 = i11;
                                unsafe = unsafe2;
                                i7 = i12;
                                i27 = i14;
                                i9 = i13;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i39 = i27;
                        int i40 = i6;
                        bArr2 = bArr;
                        zzeap zzeapVar7 = zzeapVar6;
                        if (i33 != 27) {
                            i17 = i26;
                            if (i33 <= 49) {
                                i7 = i29;
                                i19 = i34;
                                i10 = i31;
                                unsafe = unsafe2;
                                i22 = zza((zzeds<T>) t, bArr, i40, i2, i34, i29, i30, i31, i32, i33, j, zzeapVar);
                                if (i22 == i40) {
                                    i4 = i3;
                                    i8 = i22;
                                } else {
                                    zzedsVar2 = this;
                                    t4 = t;
                                    bArr2 = bArr;
                                    i20 = i2;
                                    i21 = i3;
                                    zzeapVar6 = zzeapVar;
                                    i27 = i39;
                                    i24 = i10;
                                    i26 = i17;
                                    i23 = i7;
                                    i25 = i19;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i7 = i29;
                                i18 = i40;
                                i19 = i34;
                                i10 = i31;
                                unsafe = unsafe2;
                                if (i33 != 50) {
                                    i22 = zza((zzeds<T>) t, bArr, i18, i2, i19, i7, i30, i32, i33, j, i10, zzeapVar);
                                    if (i22 != i18) {
                                        zzedsVar2 = this;
                                        t4 = t;
                                        i20 = i2;
                                        i21 = i3;
                                        i25 = i19;
                                        i23 = i7;
                                        i27 = i39;
                                        i24 = i10;
                                        i26 = i17;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        zzeapVar6 = zzeapVar;
                                    }
                                } else if (i30 == 2) {
                                    i22 = zza((zzeds<T>) t, bArr, i18, i2, i10, j, zzeapVar);
                                    if (i22 != i18) {
                                        zzedsVar2 = this;
                                        t4 = t;
                                        bArr2 = bArr;
                                        i20 = i2;
                                        i21 = i3;
                                        zzeapVar6 = zzeapVar;
                                        i27 = i39;
                                        i24 = i10;
                                        i26 = i17;
                                        i23 = i7;
                                        i25 = i19;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i8 = i18;
                                }
                                i4 = i3;
                                i8 = i22;
                            }
                        } else if (i30 == 2) {
                            zzecl zzeclVar = (zzecl) unsafe2.getObject(t4, j);
                            if (!zzeclVar.zzbci()) {
                                int size = zzeclVar.size();
                                zzeclVar = zzeclVar.zzfn(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j, zzeclVar);
                            }
                            i22 = zzeam.zza(zzedsVar2.zzgz(i31), i34, bArr, i40, i2, zzeclVar, zzeapVar);
                            i21 = i3;
                            i23 = i29;
                            i25 = i34;
                            i24 = i31;
                            zzeapVar6 = zzeapVar7;
                            i27 = i39;
                            i26 = i26;
                            i20 = i2;
                        } else {
                            i17 = i26;
                            i7 = i29;
                            i18 = i40;
                            i19 = i34;
                            i10 = i31;
                            unsafe = unsafe2;
                            i4 = i3;
                            i8 = i18;
                        }
                        i27 = i39;
                        i26 = i17;
                        i9 = i19;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    if (this.zziai) {
                        zzeapVar2 = zzeapVar;
                        if (zzeapVar2.zzhte != zzebq.zzbec()) {
                            int i41 = i7;
                            if (zzeapVar2.zzhte.zza(this.zziah, i41) == null) {
                                i22 = zzeam.zza(i9, bArr, i8, i2, zzav(t), zzeapVar);
                                t4 = t;
                                i20 = i2;
                                i25 = i9;
                                zzedsVar2 = this;
                                zzeapVar6 = zzeapVar2;
                                i23 = i41;
                                i24 = i10;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i21 = i4;
                            } else {
                                zzecd.zzb zzbVar = (zzecd.zzb) t;
                                zzbVar.zzbfd();
                                zzebt<zzecd.zze> zzebtVar = zzbVar.zzhxy;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            t3 = t;
                        }
                    } else {
                        t3 = t;
                        zzeapVar2 = zzeapVar;
                    }
                    i22 = zzeam.zza(i9, bArr, i8, i2, zzav(t), zzeapVar);
                    i25 = i9;
                    zzedsVar2 = this;
                    zzeapVar6 = zzeapVar2;
                    i23 = i7;
                    t4 = t3;
                    i24 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i20 = i2;
                    i21 = i4;
                } else {
                    i5 = -1;
                    zzedsVar = this;
                    t2 = t;
                    i22 = i8;
                    i25 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i21;
                t2 = t4;
                zzedsVar = zzedsVar2;
                i5 = -1;
            }
        }
        if (i27 != i5) {
            unsafe.putInt(t2, i27, i26);
        }
        zzefb zzefbVar = null;
        for (int i42 = zzedsVar.zzian; i42 < zzedsVar.zziao; i42++) {
            zzefbVar = (zzefb) zzedsVar.zza((Object) t2, zzedsVar.zziam[i42], (int) zzefbVar, (zzefc<UT, int>) zzedsVar.zziar);
        }
        if (zzefbVar != null) {
            zzedsVar.zziar.zzi(t2, zzefbVar);
        }
        if (i4 == 0) {
            if (i22 != i2) {
                throw zzeco.zzbfn();
            }
        } else if (i22 > i2 || i25 != i4) {
            throw zzeco.zzbfn();
        }
        return i22;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022e, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0230, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e2, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
        if (r0 == r15) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzeek
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.zzeap r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeds.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzeap):void");
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zzak(T t) {
        int i;
        int i2 = this.zzian;
        while (true) {
            i = this.zziao;
            if (i2 >= i) {
                break;
            }
            long zzhc = zzhc(this.zziam[i2]) & 1048575;
            Object zzp = zzefi.zzp(t, zzhc);
            if (zzp != null) {
                zzefi.zza(t, zzhc, this.zziat.zzaq(zzp));
            }
            i2++;
        }
        int length = this.zziam.length;
        while (i < length) {
            this.zziaq.zzb(t, this.zziam[i]);
            i++;
        }
        this.zziar.zzak(t);
        if (this.zziai) {
            this.zzias.zzak(t);
        }
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzefc<UT, UB> zzefcVar) {
        zzech zzhb;
        int i2 = this.zziad[i];
        Object zzp = zzefi.zzp(obj, zzhc(i) & 1048575);
        return (zzp == null || (zzhb = zzhb(i)) == null) ? ub : (UB) zza(i, i2, this.zziat.zzan(zzp), zzhb, (zzech) ub, (zzefc<UT, zzech>) zzefcVar);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzech zzechVar, UB ub, zzefc<UT, UB> zzefcVar) {
        zzedf<?, ?> zzas = this.zziat.zzas(zzha(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzechVar.zzf(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzefcVar.zzbhg();
                }
                zzeay zzfq = zzeaq.zzfq(zzedg.zza(zzas, next.getKey(), next.getValue()));
                try {
                    zzedg.zza(zzfq.zzbcx(), zzas, next.getKey(), next.getValue());
                    zzefcVar.zza((zzefc<UT, UB>) ub, i2, zzfq.zzbcw());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.zzeek] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.zzeek] */
    @Override // com.google.android.gms.internal.ads.zzeek
    public final boolean zzaw(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.zzian) {
                return !this.zziai || this.zzias.zzai(t).isInitialized();
            }
            int i5 = this.zziam[i3];
            int i6 = this.zziad[i5];
            int zzhc = zzhc(i5);
            if (this.zziak) {
                i = 0;
            } else {
                int i7 = this.zziad[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = zzhgt.getInt(t, i8);
                    i2 = i8;
                }
            }
            if (((268435456 & zzhc) != 0) && !zza((zzeds<T>) t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & zzhc) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((zzeds<T>) t, i5, i4, i) && !zza(t, zzhc, zzgz(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzeds<T>) t, i6, i5) && !zza(t, zzhc, zzgz(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzao = this.zziat.zzao(zzefi.zzp(t, zzhc & 1048575));
                            if (!zzao.isEmpty()) {
                                if (this.zziat.zzas(zzha(i5)).zzhzy.zzbhn() == zzefw.MESSAGE) {
                                    zzeek<T> zzeekVar = 0;
                                    Iterator<?> it = zzao.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzeekVar == null) {
                                            zzeekVar = zzedz.zzbgk().zzh(next.getClass());
                                        }
                                        boolean zzaw = zzeekVar.zzaw(next);
                                        zzeekVar = zzeekVar;
                                        if (!zzaw) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzefi.zzp(t, zzhc & 1048575);
                if (!list.isEmpty()) {
                    ?? zzgz = zzgz(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!zzgz.zzaw(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzeek zzeekVar) {
        return zzeekVar.zzaw(zzefi.zzp(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzefv zzefvVar) throws IOException {
        if (obj instanceof String) {
            zzefvVar.zzk(i, (String) obj);
        } else {
            zzefvVar.zza(i, (zzeaq) obj);
        }
    }

    private final void zza(Object obj, int i, zzeee zzeeeVar) throws IOException {
        if (zzhe(i)) {
            zzefi.zza(obj, i & 1048575, zzeeeVar.zzbdf());
        } else if (this.zziaj) {
            zzefi.zza(obj, i & 1048575, zzeeeVar.readString());
        } else {
            zzefi.zza(obj, i & 1048575, zzeeeVar.zzbdg());
        }
    }

    private final int zzhc(int i) {
        return this.zziad[i + 1];
    }

    private final int zzhd(int i) {
        return this.zziad[i + 2];
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzefi.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzefi.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzefi.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzefi.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzefi.zzp(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zze((zzeds<T>) t, i) == zze((zzeds<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zziak) {
            return zze((zzeds<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zze(T t, int i) {
        if (this.zziak) {
            int zzhc = zzhc(i);
            long j = zzhc & 1048575;
            switch ((zzhc & 267386880) >>> 20) {
                case 0:
                    return zzefi.zzo(t, j) != 0.0d;
                case 1:
                    return zzefi.zzn(t, j) != 0.0f;
                case 2:
                    return zzefi.zzl(t, j) != 0;
                case 3:
                    return zzefi.zzl(t, j) != 0;
                case 4:
                    return zzefi.zzk(t, j) != 0;
                case 5:
                    return zzefi.zzl(t, j) != 0;
                case 6:
                    return zzefi.zzk(t, j) != 0;
                case 7:
                    return zzefi.zzm(t, j);
                case 8:
                    Object zzp = zzefi.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    } else if (zzp instanceof zzeaq) {
                        return !zzeaq.zzhtf.equals(zzp);
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return zzefi.zzp(t, j) != null;
                case 10:
                    return !zzeaq.zzhtf.equals(zzefi.zzp(t, j));
                case 11:
                    return zzefi.zzk(t, j) != 0;
                case 12:
                    return zzefi.zzk(t, j) != 0;
                case 13:
                    return zzefi.zzk(t, j) != 0;
                case 14:
                    return zzefi.zzl(t, j) != 0;
                case 15:
                    return zzefi.zzk(t, j) != 0;
                case 16:
                    return zzefi.zzl(t, j) != 0;
                case 17:
                    return zzefi.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzhd = zzhd(i);
        return (zzefi.zzk(t, (long) (zzhd & 1048575)) & (1 << (zzhd >>> 20))) != 0;
    }

    private final void zzf(T t, int i) {
        if (this.zziak) {
            return;
        }
        int zzhd = zzhd(i);
        long j = zzhd & 1048575;
        zzefi.zzb(t, j, zzefi.zzk(t, j) | (1 << (zzhd >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zzefi.zzk(t, (long) (zzhd(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zzefi.zzb(t, zzhd(i2) & 1048575, i);
    }

    private final int zzhf(int i) {
        if (i < this.zziaf || i > this.zziag) {
            return -1;
        }
        return zzao(i, 0);
    }

    private final int zzan(int i, int i2) {
        if (i < this.zziaf || i > this.zziag) {
            return -1;
        }
        return zzao(i, i2);
    }

    private final int zzao(int i, int i2) {
        int length = (this.zziad.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zziad[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
