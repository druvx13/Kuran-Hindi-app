package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdto extends zzdsl<zzdvw, zzdvt> {
    private final /* synthetic */ zzdtm zzhkk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdto(zzdtm zzdtmVar, Class cls) {
        super(cls);
        this.zzhkk = zzdtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvt zzd(zzdvw zzdvwVar) throws GeneralSecurityException {
        zzdvw zzdvwVar2 = zzdvwVar;
        return (zzdvt) ((zzecd) zzdvt.zzaym().zzv(zzeaq.zzu(zzdzt.zzfi(zzdvwVar2.getKeySize()))).zzb(zzdvwVar2.zzayl()).zzep(0).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdvw zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdvw.zzi(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdvw zzdvwVar) throws GeneralSecurityException {
        zzdvw zzdvwVar2 = zzdvwVar;
        zzdzy.zzfj(zzdvwVar2.getKeySize());
        if (zzdvwVar2.zzayl().zzayi() != 12 && zzdvwVar2.zzayl().zzayi() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
