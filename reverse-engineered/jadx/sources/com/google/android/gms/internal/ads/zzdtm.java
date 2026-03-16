package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdtm extends zzdsm<zzdvt> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtm() {
        super(zzdvt.class, new zzdtp(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdvt> zzaxb() {
        return new zzdto(this, zzdvw.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdvt zzdvtVar) throws GeneralSecurityException {
        zzdvt zzdvtVar2 = zzdvtVar;
        zzdzy.zzy(zzdvtVar2.getVersion(), 0);
        zzdzy.zzfj(zzdvtVar2.zzaxn().size());
        if (zzdvtVar2.zzayl().zzayi() != 12 && zzdvtVar2.zzayl().zzayi() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdvt zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdvt.zzh(zzeaqVar, zzebq.zzbec());
    }
}
