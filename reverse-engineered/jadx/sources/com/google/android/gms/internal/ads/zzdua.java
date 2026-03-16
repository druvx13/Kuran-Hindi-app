package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdua extends zzdso<zzdsb, zzdxx> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdua(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdsb zzah(zzdxx zzdxxVar) throws GeneralSecurityException {
        zzdxx zzdxxVar2 = zzdxxVar;
        String zzbbl = zzdxxVar2.zzbbi().zzbbl();
        return new zzdty(zzdxxVar2.zzbbi().zzbbm(), zzdsp.zzhf(zzbbl).zzhh(zzbbl));
    }
}
