package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdyt extends zzdyw {
    public zzdyt(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzdyw
    final zzdyu zzc(byte[] bArr, int i) throws InvalidKeyException {
        return new zzdyr(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdyw, com.google.android.gms.internal.ads.zzdsb
    public final /* bridge */ /* synthetic */ byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.zzc(bArr, bArr2);
    }
}
