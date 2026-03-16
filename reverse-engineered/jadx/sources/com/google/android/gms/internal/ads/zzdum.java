package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzdum implements zzdsw<zzdsf> {
    private static final Logger logger = Logger.getLogger(zzdum.class.getName());

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdsf {
        private final zzdsu<zzdsf> zzhkw;

        public zza(zzdsu<zzdsf> zzdsuVar) {
            this.zzhkw = zzdsuVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final Class<zzdsf> zzawu() {
        return zzdsf.class;
    }

    @Override // com.google.android.gms.internal.ads.zzdsw
    public final /* synthetic */ zzdsf zza(zzdsu<zzdsf> zzdsuVar) throws GeneralSecurityException {
        return new zza(zzdsuVar);
    }
}
