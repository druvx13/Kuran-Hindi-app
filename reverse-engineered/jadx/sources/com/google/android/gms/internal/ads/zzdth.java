package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdth extends zzdsm<zzdvk> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdth() {
        super(zzdvk.class, new zzdtj(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdvk> zzaxb() {
        return new zzdti(this, zzdvl.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdvk zzdvkVar) throws GeneralSecurityException {
        zzdzy.zzy(zzdvkVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdvk zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdvk.zzd(zzeaqVar, zzebq.zzbec());
    }
}
