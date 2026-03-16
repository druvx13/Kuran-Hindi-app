package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzduy extends zzdso<zzdss, zzdxa> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduy(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdss zzah(zzdxa zzdxaVar) throws GeneralSecurityException {
        zzdxa zzdxaVar2 = zzdxaVar;
        zzdwy zzbaa = zzdxaVar2.zzazu().zzbaa();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdxaVar2.zzaxn().toByteArray(), "HMAC");
        int zzaxs = zzdxaVar2.zzazu().zzaxs();
        int i = zzdva.zzhlc[zzbaa.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new zzdzr("HMACSHA512", secretKeySpec, zzaxs);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            return new zzdzr("HMACSHA256", secretKeySpec, zzaxs);
        }
        return new zzdzr("HMACSHA1", secretKeySpec, zzaxs);
    }
}
