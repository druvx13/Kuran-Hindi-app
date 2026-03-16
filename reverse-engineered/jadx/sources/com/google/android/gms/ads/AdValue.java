package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class AdValue {
    private final int zzacj;
    private final String zzack;
    private final long zzacl;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, String str, long j) {
        this.zzacj = i;
        this.zzack = str;
        this.zzacl = j;
    }

    public static AdValue zza(int i, String str, long j) {
        return new AdValue(i, str, j);
    }

    public final int getPrecisionType() {
        return this.zzacj;
    }

    public final String getCurrencyCode() {
        return this.zzack;
    }

    public final long getValueMicros() {
        return this.zzacl;
    }
}
