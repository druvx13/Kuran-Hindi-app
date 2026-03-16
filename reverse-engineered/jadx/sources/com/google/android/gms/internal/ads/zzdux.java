package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdux extends zzdsl<zzdxb, zzdxa> {
    private final /* synthetic */ zzduv zzhlf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdux(zzduv zzduvVar, Class cls) {
        super(cls);
        this.zzhlf = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdxa zzd(zzdxb zzdxbVar) throws GeneralSecurityException {
        zzdxb zzdxbVar2 = zzdxbVar;
        return (zzdxa) ((zzecd) zzdxa.zzazv().zzex(0).zzd(zzdxbVar2.zzazu()).zzad(zzeaq.zzu(zzdzt.zzfi(zzdxbVar2.getKeySize()))).zzbet());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ zzdxb zzq(zzeaq zzeaqVar) throws zzeco {
        return zzdxb.zzr(zzeaqVar, zzebq.zzbec());
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ void zzc(zzdxb zzdxbVar) throws GeneralSecurityException {
        zzdxb zzdxbVar2 = zzdxbVar;
        if (zzdxbVar2.getKeySize() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzduv.zza(zzdxbVar2.zzazu());
    }
}
