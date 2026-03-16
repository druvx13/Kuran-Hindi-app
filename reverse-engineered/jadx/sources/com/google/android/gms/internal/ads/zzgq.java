package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzgq extends Exception {
    private final int type;
    private final int zzadk;

    public static zzgq zza(Exception exc, int i) {
        return new zzgq(1, null, exc, i);
    }

    public static zzgq zza(IOException iOException) {
        return new zzgq(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgq zza(RuntimeException runtimeException) {
        return new zzgq(2, null, runtimeException, -1);
    }

    private zzgq(int i, String str, Throwable th, int i2) {
        super(null, th);
        this.type = i;
        this.zzadk = i2;
    }
}
