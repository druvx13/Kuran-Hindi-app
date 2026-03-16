package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdtk extends zzdso<zzdzs, zzdvo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtk(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdzs zzah(zzdvo zzdvoVar) throws GeneralSecurityException {
        zzdvo zzdvoVar2 = zzdvoVar;
        return new zzdyk(zzdvoVar2.zzaxn().toByteArray(), zzdvoVar2.zzayc().zzayi());
    }
}
