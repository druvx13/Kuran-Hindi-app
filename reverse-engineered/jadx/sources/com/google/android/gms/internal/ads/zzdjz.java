package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdjz implements zzegz<ThreadFactory> {
    public static zzdjz zzaty() {
        zzdjz zzdjzVar;
        zzdjzVar = zzdkc.zzgyy;
        return zzdjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (ThreadFactory) zzehf.zza(new zzdjo(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
