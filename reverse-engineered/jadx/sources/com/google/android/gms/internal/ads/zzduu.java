package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzduu extends zzdsm<zzdvd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduu() {
        super(zzdvd.class, new zzdut(zzdss.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzdvh zzdvhVar) throws GeneralSecurityException {
        if (zzdvhVar.zzaxs() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzdvhVar.zzaxs() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzek(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdvd> zzaxb() {
        return new zzduw(this, zzdvg.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdvd zzdvdVar) throws GeneralSecurityException {
        zzdvd zzdvdVar2 = zzdvdVar;
        zzdzy.zzy(zzdvdVar2.getVersion(), 0);
        zzek(zzdvdVar2.zzaxn().size());
        zza(zzdvdVar2.zzaxo());
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdvd zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdvd.zzb(zzeaqVar, zzebq.zzbec());
    }
}
