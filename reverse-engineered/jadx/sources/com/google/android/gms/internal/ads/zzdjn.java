package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdjn implements zzegz<Executor> {
    public static zzdjn zzatm() {
        zzdjn zzdjnVar;
        zzdjnVar = zzdjq.zzgys;
        return zzdjnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Executor) zzehf.zza(zzbab.zzdzv, "Cannot return null from a non-@Nullable @Provides method");
    }
}
