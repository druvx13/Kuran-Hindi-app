package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdui extends zzdsm<zzdws> {
    public zzdui() {
        super(zzdws.class, new zzdul(zzdsi.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdws zzdwsVar) throws GeneralSecurityException {
        zzdws zzdwsVar2 = zzdwsVar;
        zzdzy.zzy(zzdwsVar2.getVersion(), 0);
        zzdup.zza(zzdwsVar2.zzaza());
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdws zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdws.zzp(zzeaqVar, zzebq.zzbec());
    }
}
