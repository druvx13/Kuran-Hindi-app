package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdug extends zzdso<zzdsf, zzdwp> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdug(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ zzdsf zzah(zzdwp zzdwpVar) throws GeneralSecurityException {
        zzdwp zzdwpVar2 = zzdwpVar;
        zzdwo zzaza = zzdwpVar2.zzazh().zzaza();
        zzdwt zzazc = zzaza.zzazc();
        zzdzd zza = zzdup.zza(zzazc.zzazp());
        byte[] byteArray = zzdwpVar2.zzaxn().toByteArray();
        return new zzdyy((ECPrivateKey) zzdzi.zzhry.zzho("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzdzb.zza(zza))), zzazc.zzazr().toByteArray(), zzdup.zza(zzazc.zzazq()), zzdup.zza(zzaza.zzaze()), new zzdur(zzaza.zzazd().zzayx()));
    }
}
