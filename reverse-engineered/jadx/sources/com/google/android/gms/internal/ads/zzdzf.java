package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdzf implements zzdsb {
    private final zzdzs zzhrk;
    private final zzdss zzhrl;
    private final int zzhrm;

    public zzdzf(zzdzs zzdzsVar, zzdss zzdssVar, int i) {
        this.zzhrk = zzdzsVar;
        this.zzhrl = zzdssVar;
        this.zzhrm = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdsb
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzo = this.zzhrk.zzo(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzdys.zza(zzo, this.zzhrl.zzm(zzdys.zza(bArr2, zzo, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
