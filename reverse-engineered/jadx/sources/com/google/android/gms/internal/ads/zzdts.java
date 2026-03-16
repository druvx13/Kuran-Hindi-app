package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdts extends zzdsm<zzdwe> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdts() {
        super(zzdwe.class, new zzdtv(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdwe> zzaxb() {
        return new zzdtu(this, zzdwf.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdwe zzdweVar) throws GeneralSecurityException {
        zzdwe zzdweVar2 = zzdweVar;
        zzdzy.zzy(zzdweVar2.getVersion(), 0);
        if (zzdweVar2.zzaxn().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdwe zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdwe.zzl(zzeaqVar, zzebq.zzbec());
    }
}
