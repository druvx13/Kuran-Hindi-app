package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdtp extends zzdso<zzdsb, zzdvt> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtp(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdsb zzah(zzdvt zzdvtVar) throws GeneralSecurityException {
        zzdvt zzdvtVar2 = zzdvtVar;
        return new zzdym(zzdvtVar2.zzaxn().toByteArray(), zzdvtVar2.zzayl().zzayi());
    }
}
