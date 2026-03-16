package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdtt extends zzdsl<zzdwb, zzdwa> {
    private final /* synthetic */ zzdtr zzhkl;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdtt(zzdtr zzdtrVar, Class cls) {
        super(cls);
        this.zzhkl = zzdtrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdwa zzd(zzdwb zzdwbVar) throws GeneralSecurityException {
        return (zzdwa) ((zzecd) zzdwa.zzayr().zzw(zzeaq.zzu(zzdzt.zzfi(zzdwbVar.getKeySize()))).zzeq(0).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdwb zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdwb.zzk(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdwb zzdwbVar) throws GeneralSecurityException {
        zzdzy.zzfj(zzdwbVar.getKeySize());
    }
}
