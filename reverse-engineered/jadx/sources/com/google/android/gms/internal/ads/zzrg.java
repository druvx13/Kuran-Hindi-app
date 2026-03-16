package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzrg extends zzqv {
    private MessageDigest zzbrp;
    private final int zzbrw;
    private final int zzbrx;

    public zzrg(int i) {
        int i2 = i / 8;
        this.zzbrw = i % 8 > 0 ? i2 + 1 : i2;
        this.zzbrx = i;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final byte[] zzbr(String str) {
        synchronized (this.mLock) {
            MessageDigest zzmm = zzmm();
            this.zzbrp = zzmm;
            if (zzmm == null) {
                return new byte[0];
            }
            zzmm.reset();
            this.zzbrp.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzbrp.digest();
            int length = digest.length > this.zzbrw ? this.zzbrw : digest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if (this.zzbrx % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += bArr[i] & 255;
                }
                long j2 = j >>> (8 - (this.zzbrx % 8));
                for (int i2 = this.zzbrw - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
