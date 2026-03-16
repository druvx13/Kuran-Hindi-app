package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdvk;
import com.google.android.gms.internal.ads.zzdvo;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdxa;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdur implements zzdyv {
    private final String zzhkx;
    private final int zzhky;
    private zzdwa zzhkz;
    private zzdvk zzhla;
    private int zzhlb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdur(zzdxl zzdxlVar) throws GeneralSecurityException {
        String zzbad = zzdxlVar.zzbad();
        this.zzhkx = zzbad;
        if (zzbad.equals(zzdtd.zzhjy)) {
            try {
                zzdwb zzk = zzdwb.zzk(zzdxlVar.zzbae(), zzebq.zzbec());
                this.zzhkz = (zzdwa) zzdsx.zzb(zzdxlVar);
                this.zzhky = zzk.getKeySize();
            } catch (zzeco e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zzhkx.equals(zzdtd.zzhjx)) {
            try {
                zzdvl zze = zzdvl.zze(zzdxlVar.zzbae(), zzebq.zzbec());
                this.zzhla = (zzdvk) zzdsx.zzb(zzdxlVar);
                this.zzhlb = zze.zzaxz().getKeySize();
                this.zzhky = this.zzhlb + zze.zzaya().getKeySize();
            } catch (zzeco e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.zzhkx);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final int zzaxm() {
        return this.zzhky;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final zzdsb zzn(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzhky) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.zzhkx.equals(zzdtd.zzhjy)) {
            return (zzdsb) zzdsx.zza(this.zzhkx, (zzdwa) ((zzecd) zzdwa.zzayr().zza((zzdwa.zza) this.zzhkz).zzw(zzeaq.zzh(bArr, 0, this.zzhky)).zzbet()), zzdsb.class);
        } else if (this.zzhkx.equals(zzdtd.zzhjx)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzhlb);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzhlb, this.zzhky);
            zzdvk.zza zzb = zzdvk.zzaxx().zzen(this.zzhla.getVersion()).zzb((zzdvo) ((zzecd) zzdvo.zzayd().zza((zzdvo.zza) this.zzhla.zzaxv()).zzu(zzeaq.zzu(copyOfRange)).zzbet()));
            return (zzdsb) zzdsx.zza(this.zzhkx, (zzdvk) ((zzecd) zzb.zzb((zzdxa) ((zzecd) zzdxa.zzazv().zza((zzdxa.zza) this.zzhla.zzaxw()).zzad(zzeaq.zzu(copyOfRange2)).zzbet())).zzbet()), zzdsb.class);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
