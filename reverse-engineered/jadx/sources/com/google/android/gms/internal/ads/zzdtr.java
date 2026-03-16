package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdtr extends zzdsm<zzdwa> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtr() {
        super(zzdwa.class, new zzdtq(zzdsb.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdwa> zzaxb() {
        return new zzdtt(this, zzdwb.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdwa zzdwaVar) throws GeneralSecurityException {
        zzdwa zzdwaVar2 = zzdwaVar;
        zzdzy.zzy(zzdwaVar2.getVersion(), 0);
        zzdzy.zzfj(zzdwaVar2.zzaxn().size());
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdwa zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdwa.zzj(zzeaqVar, zzebq.zzbec());
    }
}
