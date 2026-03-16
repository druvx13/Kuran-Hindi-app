package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
class zzdvc implements zzdsw<zzdss> {
    private static final Logger logger = Logger.getLogger(zzdvc.class.getName());

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final Class<zzdss> zzawu() {
        return zzdss.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdss {
        private final zzdsu<zzdss> zzhkw;
        private final byte[] zzhll;

        private zza(zzdsu<zzdss> zzdsuVar) {
            this.zzhll = new byte[]{0};
            this.zzhkw = zzdsuVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdss
        public final byte[] zzm(byte[] bArr) throws GeneralSecurityException {
            if (this.zzhkw.zzaxh().zzaxf().equals(zzdyb.LEGACY)) {
                return zzdys.zza(this.zzhkw.zzaxh().zzaxg(), this.zzhkw.zzaxh().zzaxd().zzm(zzdys.zza(bArr, this.zzhll)));
            }
            return zzdys.zza(this.zzhkw.zzaxh().zzaxg(), this.zzhkw.zzaxh().zzaxd().zzm(bArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final /* synthetic */ zzdss zza(zzdsu<zzdss> zzdsuVar) throws GeneralSecurityException {
        return new zza(zzdsuVar);
    }
}
