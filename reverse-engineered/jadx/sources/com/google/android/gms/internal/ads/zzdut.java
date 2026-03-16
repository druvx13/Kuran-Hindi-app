package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdut extends zzdso<zzdss, zzdvd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdut(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdss zzah(zzdvd zzdvdVar) throws GeneralSecurityException {
        zzdvd zzdvdVar2 = zzdvdVar;
        return new zzdyi(zzdvdVar2.zzaxn().toByteArray(), zzdvdVar2.zzaxo().zzaxs());
    }
}
