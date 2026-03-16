package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdul extends zzdso<zzdsi, zzdws> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdul(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdsi zzah(zzdws zzdwsVar) throws GeneralSecurityException {
        zzdws zzdwsVar2 = zzdwsVar;
        zzdwo zzaza = zzdwsVar2.zzaza();
        zzdwt zzazc = zzaza.zzazc();
        return new zzdyx(zzdzb.zza(zzdup.zza(zzazc.zzazp()), zzdwsVar2.zzazk().toByteArray(), zzdwsVar2.zzazl().toByteArray()), zzazc.zzazr().toByteArray(), zzdup.zza(zzazc.zzazq()), zzdup.zza(zzaza.zzaze()), new zzdur(zzaza.zzazd().zzayx()));
    }
}
