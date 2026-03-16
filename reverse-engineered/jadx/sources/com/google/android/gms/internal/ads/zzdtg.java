package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzdtg implements zzdsw<zzdsb> {
    private static final Logger logger = Logger.getLogger(zzdtg.class.getName());

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final Class<zzdsb> zzawu() {
        return zzdsb.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdsb {
        private final zzdsu<zzdsb> zzhkh;

        private zza(zzdsu<zzdsb> zzdsuVar) {
            this.zzhkh = zzdsuVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdsb
        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzdys.zza(this.zzhkh.zzaxh().zzaxg(), this.zzhkh.zzaxh().zzaxd().zzc(bArr, bArr2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final /* synthetic */ zzdsb zza(zzdsu<zzdsb> zzdsuVar) throws GeneralSecurityException {
        return new zza(zzdsuVar);
    }
}
