package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzduj extends zzdsl<zzdwl, zzdwp> {
    private final /* synthetic */ zzduh zzhkt;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzduj(zzduh zzduhVar, Class cls) {
        super(cls);
        this.zzhkt = zzduhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdwp zzd(zzdwl zzdwlVar) throws GeneralSecurityException {
        zzdwl zzdwlVar2 = zzdwlVar;
        KeyPair zza = zzdzb.zza(zzdzb.zza(zzdup.zza(zzdwlVar2.zzaza().zzazc().zzazp())));
        ECPoint w = ((ECPublicKey) zza.getPublic()).getW();
        return (zzdwp) ((zzecd) zzdwp.zzazi().zzet(0).zzb((zzdws) ((zzecd) zzdws.zzazm().zzeu(0).zzc(zzdwlVar2.zzaza()).zzab(zzeaq.zzu(w.getAffineX().toByteArray())).zzac(zzeaq.zzu(w.getAffineY().toByteArray())).zzbet())).zzy(zzeaq.zzu(((ECPrivateKey) zza.getPrivate()).getS().toByteArray())).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdwl zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdwl.zzn(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdwl zzdwlVar) throws GeneralSecurityException {
        zzdup.zza(zzdwlVar.zzaza());
    }
}
