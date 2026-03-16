package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdsn {
    private zzdxp zzhjb;

    private zzdsn(zzdxp zzdxpVar) {
        this.zzhjb = zzdxpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzdsn zza(zzdxp zzdxpVar) throws GeneralSecurityException {
        if (zzdxpVar == null || zzdxpVar.zzbas() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzdsn(zzdxpVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdxp zzaxc() {
        return this.zzhjb;
    }

    public final String toString() {
        return zzdte.zzb(this.zzhjb).toString();
    }
}
