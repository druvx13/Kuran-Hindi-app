package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzduh extends zzdsy<zzdwp, zzdws> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduh() {
        super(zzdwp.class, zzdws.class, new zzdug(zzdsf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<zzdwl, zzdwp> zzaxb() {
        return new zzduj(this, zzdwl.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzedo zzedoVar) throws GeneralSecurityException {
        zzdwp zzdwpVar = (zzdwp) zzedoVar;
        if (zzdwpVar.zzaxn().isEmpty()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzdzy.zzy(zzdwpVar.getVersion(), 0);
        zzdup.zza(zzdwpVar.zzazh().zzaza());
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzedo zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdwp.zzo(zzeaqVar, zzebq.zzbec());
    }
}
