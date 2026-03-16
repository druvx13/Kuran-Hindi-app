package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdtl extends zzdsm<zzdvo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtl() {
        super(zzdvo.class, new zzdtk(zzdzs.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdvo> zzaxb() {
        return new zzdtn(this, zzdvp.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzdvs zzdvsVar) throws GeneralSecurityException {
        if (zzdvsVar.zzayi() < 12 || zzdvsVar.zzayi() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdvo zzdvoVar) throws GeneralSecurityException {
        zzdvo zzdvoVar2 = zzdvoVar;
        zzdzy.zzy(zzdvoVar2.getVersion(), 0);
        zzdzy.zzfj(zzdvoVar2.zzaxn().size());
        zza(zzdvoVar2.zzayc());
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdvo zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdvo.zzf(zzeaqVar, zzebq.zzbec());
    }
}
