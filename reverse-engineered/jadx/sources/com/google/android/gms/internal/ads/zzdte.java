package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzdxp;
import com.google.android.gms.internal.ads.zzdxq;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdte {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static zzdxq zzb(zzdxp zzdxpVar) {
        zzdxq.zza zzfb = zzdxq.zzbay().zzfb(zzdxpVar.zzbaq());
        for (zzdxp.zza zzaVar : zzdxpVar.zzbar()) {
            zzfb.zzb((zzdxq.zzb) ((zzecd) zzdxq.zzb.zzbba().zzhn(zzaVar.zzbav().zzbad()).zza(zzaVar.zzaxe()).zza(zzaVar.zzaxf()).zzfc(zzaVar.zzbaw()).zzbet()));
        }
        return (zzdxq) ((zzecd) zzfb.zzbet());
    }

    public static void zzc(zzdxp zzdxpVar) throws GeneralSecurityException {
        int zzbaq = zzdxpVar.zzbaq();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzdxp.zza zzaVar : zzdxpVar.zzbar()) {
            if (zzaVar.zzaxe() == zzdxj.ENABLED) {
                if (!zzaVar.zzbau()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zzbaw())));
                }
                if (zzaVar.zzaxf() == zzdyb.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zzbaw())));
                }
                if (zzaVar.zzaxe() == zzdxj.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zzbaw())));
                }
                if (zzaVar.zzbaw() == zzbaq) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzaVar.zzbav().zzbaf() != zzdxf.zzb.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
