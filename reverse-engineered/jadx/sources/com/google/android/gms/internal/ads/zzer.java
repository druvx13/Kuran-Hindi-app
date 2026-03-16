package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzer {
    static zzdsi zzza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzb(zzeo zzeoVar) throws IllegalAccessException, InvocationTargetException {
        Method zza;
        zzdsi zza2;
        if (zzza != null) {
            return true;
        }
        String str = (String) zzvj.zzpv().zzd(zzzz.zzcnz);
        if (str == null || str.length() == 0) {
            str = (zzeoVar == null || (zza = zzeoVar.zza("M2qSAa8M0FWknYOLhqt+/Fg7hndA+iGyFQHluQ13JM7VYcVOxfDpnSG4HdwfsR6f", "z17NkROhoKeGkbS2tgYHIJsoqSFhSwk9HYPzNbT9RcI=")) == null) ? null : (String) zza.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            zzdsn zzl = zzdsr.zzl(zzcl.zza(str, true));
            for (zzdxm zzdxmVar : zzduk.zzhke.zzbbp()) {
                if (zzdxmVar.zzbad().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzdxmVar.zzbal().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzdxmVar.zzbao().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!zzdxmVar.zzbao().equals("TinkAead") && !zzdxmVar.zzbao().equals("TinkMac") && !zzdxmVar.zzbao().equals("TinkHybridDecrypt") && !zzdxmVar.zzbao().equals("TinkHybridEncrypt") && !zzdxmVar.zzbao().equals("TinkPublicKeySign") && !zzdxmVar.zzbao().equals("TinkPublicKeyVerify") && !zzdxmVar.zzbao().equals("TinkStreamingAead") && !zzdxmVar.zzbao().equals("TinkDeterministicAead")) {
                    zzdse<?> zzhj = zzdsx.zzhj(zzdxmVar.zzbao());
                    zzdsx.zza(zzhj.zzawt());
                    zzdsx.zza(zzhj.zzb(zzdxmVar.zzbad(), zzdxmVar.zzbal(), zzdxmVar.zzbam()), zzdxmVar.zzban());
                }
            }
            zza2 = zzduo.zza(zzl, null);
            zzza = zza2;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza2 != null;
    }
}
