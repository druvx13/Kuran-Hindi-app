package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdus {
    static final /* synthetic */ int[] zzhlc;
    static final /* synthetic */ int[] zzhld;
    static final /* synthetic */ int[] zzhle;

    static {
        int[] iArr = new int[zzdwi.values().length];
        zzhle = iArr;
        try {
            iArr[zzdwi.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzhle[zzdwi.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzhle[zzdwi.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzdww.values().length];
        zzhld = iArr2;
        try {
            iArr2[zzdww.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzhld[zzdww.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzhld[zzdww.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzdwy.values().length];
        zzhlc = iArr3;
        try {
            iArr3[zzdwy.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzhlc[zzdwy.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zzhlc[zzdwy.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
