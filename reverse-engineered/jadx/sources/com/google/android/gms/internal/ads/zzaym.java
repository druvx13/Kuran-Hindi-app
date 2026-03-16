package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaym {
    private static zzu zzdxr;
    private static final Object zzdxs = new Object();
    @Deprecated
    private static final zzayq<Void> zzdxt = new zzayl();

    public zzaym(Context context) {
        zzbj(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static zzdri<zzo> zzet(String str) {
        zzbaj zzbajVar = new zzbaj();
        zzdxr.zze(new zzays(str, zzbajVar));
        return zzbajVar;
    }

    public final zzdri<String> zza(int i, String str, Map<String, String> map, byte[] bArr) {
        zzayp zzaypVar = new zzayp(null);
        zzayo zzayoVar = new zzayo(this, str, zzaypVar);
        zzazq zzazqVar = new zzazq(null);
        zzayn zzaynVar = new zzayn(this, i, str, zzaypVar, zzayoVar, bArr, map, zzazqVar);
        if (zzazq.isEnabled()) {
            try {
                zzazqVar.zza(str, "GET", zzaynVar.getHeaders(), zzaynVar.zzg());
            } catch (zzb e) {
                zzawr.zzfc(e.getMessage());
            }
        }
        zzdxr.zze(zzaynVar);
        return zzaypVar;
    }

    public final zzdri<String> zzc(String str, Map<String, String> map) {
        return zza(0, str, map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:13:0x0027, B:15:0x0030, B:14:0x002c, B:16:0x0032, B:17:0x0034), top: B:22:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0010, B:13:0x0027, B:15:0x0030, B:14:0x002c, B:16:0x0032, B:17:0x0034), top: B:22:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzu zzbj(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaym.zzdxs
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzu r1 = com.google.android.gms.internal.ads.zzaym.zzdxr     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L32
            com.google.android.gms.internal.ads.zzzz.initialize(r3)     // Catch: java.lang.Throwable -> L36
            boolean r1 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L24
            com.google.android.gms.internal.ads.zzzk<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzzz.zzcqa     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzzv r2 = com.google.android.gms.internal.ads.zzvj.zzpv()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.zzu r3 = com.google.android.gms.internal.ads.zzayb.zzbi(r3)     // Catch: java.lang.Throwable -> L36
            goto L30
        L2c:
            com.google.android.gms.internal.ads.zzu r3 = com.google.android.gms.internal.ads.zzba.zza(r3)     // Catch: java.lang.Throwable -> L36
        L30:
            com.google.android.gms.internal.ads.zzaym.zzdxr = r3     // Catch: java.lang.Throwable -> L36
        L32:
            com.google.android.gms.internal.ads.zzu r3 = com.google.android.gms.internal.ads.zzaym.zzdxr     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r3
        L36:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaym.zzbj(android.content.Context):com.google.android.gms.internal.ads.zzu");
    }
}
