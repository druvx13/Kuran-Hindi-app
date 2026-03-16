package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaah {
    public static boolean zza(zzaam zzaamVar, zzaak zzaakVar, String... strArr) {
        if (zzaamVar == null || zzaakVar == null || !zzaamVar.zzcuv || zzaakVar == null) {
            return false;
        }
        return zzaamVar.zza(zzaakVar, com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime(), strArr);
    }

    public static zzaak zzb(zzaam zzaamVar) {
        if (zzaamVar == null) {
            return null;
        }
        return zzaamVar.zzex(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime());
    }
}
