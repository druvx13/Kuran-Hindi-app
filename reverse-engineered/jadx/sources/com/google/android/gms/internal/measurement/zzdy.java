package com.google.android.gms.internal.measurement;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
final class zzdy implements zzea {
    private zzdy() {
    }

    @Override // com.google.android.gms.internal.measurement.zzea
    public final byte[] zza(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdy(zzdx zzdxVar) {
        this();
    }
}
