package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdub extends zzdsm<zzdxx> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdub() {
        super(zzdxx.class, new zzdua(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdxx> zzaxb() {
        return new zzdud(this, zzdxy.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdxx zzdxxVar) throws GeneralSecurityException {
        zzdzy.zzy(zzdxxVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdxx zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdxx.zzu(zzeaqVar, zzebq.zzbec());
    }
}
