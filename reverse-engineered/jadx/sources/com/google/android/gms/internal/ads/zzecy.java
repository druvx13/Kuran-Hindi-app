package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzecy {
    private static final zzecy zzhzo = new zzeda();
    private static final zzecy zzhzp = new zzecz();

    private zzecy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zza(Object obj, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzecy zzbfu() {
        return zzhzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzecy zzbfv() {
        return zzhzp;
    }
}
