package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzduw extends zzdsl<zzdvg, zzdvd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduw(zzduu zzduuVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvd zzd(zzdvg zzdvgVar) throws GeneralSecurityException {
        zzdvg zzdvgVar2 = zzdvgVar;
        return (zzdvd) ((zzecd) zzdvd.zzaxp().zzem(0).zzt(zzeaq.zzu(zzdzt.zzfi(zzdvgVar2.getKeySize()))).zzd(zzdvgVar2.zzaxo()).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvg zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdvg.zzc(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdvg zzdvgVar) throws GeneralSecurityException {
        zzdvg zzdvgVar2 = zzdvgVar;
        zzduu.zza(zzdvgVar2.zzaxo());
        zzduu.zzek(zzdvgVar2.getKeySize());
    }
}
