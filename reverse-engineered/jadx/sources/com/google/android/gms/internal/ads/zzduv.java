package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxf;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzduv extends zzdsm<zzdxa> {
    public zzduv() {
        super(zzdxa.class, new zzduy(zzdss.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdxf.zzb zzawy() {
        return zzdxf.zzb.SYMMETRIC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzdxe zzdxeVar) throws GeneralSecurityException {
        if (zzdxeVar.zzaxs() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = zzdva.zzhlc[zzdxeVar.zzbaa().ordinal()];
        if (i == 1) {
            if (zzdxeVar.zzaxs() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (zzdxeVar.zzaxs() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 3) {
            if (zzdxeVar.zzaxs() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final zzdsl<?, zzdxa> zzaxb() {
        return new zzdux(this, zzdxb.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ void zze(zzdxa zzdxaVar) throws GeneralSecurityException {
        zzdxa zzdxaVar2 = zzdxaVar;
        zzdzy.zzy(zzdxaVar2.getVersion(), 0);
        if (zzdxaVar2.zzaxn().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzdxaVar2.zzazu());
    }

    @Override // com.google.android.gms.internal.ads.zzdsm
    public final /* synthetic */ zzdxa zzr(zzeaq zzeaqVar) throws zzeco {
        return zzdxa.zzq(zzeaqVar, zzebq.zzbec());
    }
}
