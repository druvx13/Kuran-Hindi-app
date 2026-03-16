package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdup {
    public static void zza(zzdwo zzdwoVar) throws GeneralSecurityException {
        zzdzb.zza(zza(zzdwoVar.zzazc().zzazp()));
        zza(zzdwoVar.zzazc().zzazq());
        if (zzdwoVar.zzaze() == zzdwi.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzdsx.zza(zzdwoVar.zzazd().zzayx());
    }

    public static String zza(zzdwy zzdwyVar) throws NoSuchAlgorithmException {
        int i = zzdus.zzhlc[zzdwyVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                String valueOf = String.valueOf(zzdwyVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static zzdzd zza(zzdww zzdwwVar) throws GeneralSecurityException {
        int i = zzdus.zzhld[zzdwwVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzdzd.NIST_P521;
                }
                String valueOf = String.valueOf(zzdwwVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzdzd.NIST_P384;
        }
        return zzdzd.NIST_P256;
    }

    public static zzdzg zza(zzdwi zzdwiVar) throws GeneralSecurityException {
        int i = zzdus.zzhle[zzdwiVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzdzg.COMPRESSED;
                }
                String valueOf = String.valueOf(zzdwiVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzdzg.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        return zzdzg.UNCOMPRESSED;
    }
}
