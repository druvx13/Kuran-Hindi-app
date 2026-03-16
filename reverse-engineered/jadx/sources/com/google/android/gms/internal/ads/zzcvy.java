package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvy implements zzegz<zzcvw> {
    private final zzehm<Set<String>> zzgma;

    private zzcvy(zzehm<Set<String>> zzehmVar) {
        this.zzgma = zzehmVar;
    }

    public static zzcvy zzak(zzehm<Set<String>> zzehmVar) {
        return new zzcvy(zzehmVar);
    }

    public static zzcvw zzd(Set<String> set) {
        return new zzcvw(set);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzd(this.zzgma.get());
    }
}
