package com.google.android.gms.internal.ads;

import java.math.BigInteger;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawm {
    private BigInteger zzduz = BigInteger.ONE;
    private String zzdma = "0";

    public final synchronized String zzwl() {
        String bigInteger;
        bigInteger = this.zzduz.toString();
        this.zzduz = this.zzduz.add(BigInteger.ONE);
        this.zzdma = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzwm() {
        return this.zzdma;
    }
}
