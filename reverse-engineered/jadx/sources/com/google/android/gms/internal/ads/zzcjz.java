package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcjz implements zzegz<List<String>> {
    public static zzcjz zzaon() {
        zzcjz zzcjzVar;
        zzcjzVar = zzcjy.zzgbb;
        return zzcjzVar;
    }

    public static List<String> zzaoo() {
        return (List) zzehf.zza(zzzz.zzra(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzaoo();
    }
}
