package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdtn extends zzdsl<zzdvp, zzdvo> {
    private final /* synthetic */ zzdtl zzhkj;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdtn(zzdtl zzdtlVar, Class cls) {
        super(cls);
        this.zzhkj = zzdtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvo zzd(zzdvp zzdvpVar) throws GeneralSecurityException {
        zzdvp zzdvpVar2 = zzdvpVar;
        return (zzdvo) ((zzecd) zzdvo.zzayd().zzc(zzdvpVar2.zzayc()).zzu(zzeaq.zzu(zzdzt.zzfi(zzdvpVar2.getKeySize()))).zzeo(0).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvp zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdvp.zzg(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdvp zzdvpVar) throws GeneralSecurityException {
        zzdvp zzdvpVar2 = zzdvpVar;
        zzdzy.zzfj(zzdvpVar2.getKeySize());
        zzdtl zzdtlVar = this.zzhkj;
        zzdtl.zza(zzdvpVar2.zzayc());
    }
}
