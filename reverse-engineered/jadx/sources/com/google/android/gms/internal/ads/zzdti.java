package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdti extends zzdsl<zzdvl, zzdvk> {
    private final /* synthetic */ zzdth zzhki;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdti(zzdth zzdthVar, Class cls) {
        super(cls);
        this.zzhki = zzdthVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvk zzd(zzdvl zzdvlVar) throws GeneralSecurityException {
        zzdvl zzdvlVar2 = zzdvlVar;
        return (zzdvk) ((zzecd) zzdvk.zzaxx().zzb(new zzdtl().zzaxb().zzd(zzdvlVar2.zzaxz())).zzb(new zzduv().zzaxb().zzd(zzdvlVar2.zzaya())).zzen(0).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvl zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdvl.zze(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdvl zzdvlVar) throws GeneralSecurityException {
        zzdvl zzdvlVar2 = zzdvlVar;
        new zzdtl().zzaxb().zzc(zzdvlVar2.zzaxz());
        new zzduv().zzaxb().zzc(zzdvlVar2.zzaya());
        zzdzy.zzfj(zzdvlVar2.zzaxz().getKeySize());
    }
}
