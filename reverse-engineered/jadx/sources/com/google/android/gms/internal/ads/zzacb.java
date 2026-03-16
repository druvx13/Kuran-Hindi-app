package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzacb {
    private static final AtomicReference<zzaby> zzcyd = new AtomicReference<>();
    static final AtomicBoolean zzcye = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaby zzrq() {
        return zzcyd.get();
    }

    public static void zza(zzaby zzabyVar) {
        zzcyd.set(zzabyVar);
    }
}
