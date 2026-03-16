package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzku implements zzfs {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzks zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzku(zzks zzksVar, String str) {
        this.zzb = zzksVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzb.zza(i, th, bArr, this.zza);
    }
}
