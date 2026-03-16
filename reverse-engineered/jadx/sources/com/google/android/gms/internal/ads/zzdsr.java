package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzdxp;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdsr {
    @Deprecated
    public static final zzdsn zzl(byte[] bArr) throws GeneralSecurityException {
        try {
            zzdxp zzc = zzdxp.zzc(bArr, zzebq.zzbec());
            for (zzdxp.zza zzaVar : zzc.zzbar()) {
                if (zzaVar.zzbav().zzbaf() == zzdxf.zzb.UNKNOWN_KEYMATERIAL || zzaVar.zzbav().zzbaf() == zzdxf.zzb.SYMMETRIC || zzaVar.zzbav().zzbaf() == zzdxf.zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzdsn.zza(zzc);
        } catch (zzeco unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
