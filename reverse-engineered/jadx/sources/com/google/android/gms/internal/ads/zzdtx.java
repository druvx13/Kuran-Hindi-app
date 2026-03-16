package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdtx extends zzdsm<zzdxt> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtx() {
        super(zzdxt.class, new zzdtw(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdxt> zzaxb() {
        return new zzdtz(this, zzdxu.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdxt zzdxtVar) throws GeneralSecurityException {
        zzdzy.zzy(zzdxtVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdxt zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdxt.zzs(zzeaqVar, zzebq.zzbec());
    }
}
