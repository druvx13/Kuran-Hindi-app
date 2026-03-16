package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzduc extends zzdsm<zzdye> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduc() {
        super(zzdye.class, new zzduf(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdye> zzaxb() {
        return new zzdue(this, zzdyh.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdye zzdyeVar) throws GeneralSecurityException {
        zzdye zzdyeVar2 = zzdyeVar;
        zzdzy.zzy(zzdyeVar2.getVersion(), 0);
        if (zzdyeVar2.zzaxn().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdye zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdye.zzw(zzeaqVar, zzebq.zzbec());
    }
}
