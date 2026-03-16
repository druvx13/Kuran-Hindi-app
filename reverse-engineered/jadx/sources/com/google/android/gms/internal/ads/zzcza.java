package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcza implements zzegz<zzcyx> {
    private final zzehm<PackageInfo> zzfmq;
    private final zzehm<ApplicationInfo> zzgbc;

    private zzcza(zzehm<ApplicationInfo> zzehmVar, zzehm<PackageInfo> zzehmVar2) {
        this.zzgbc = zzehmVar;
        this.zzfmq = zzehmVar2;
    }

    public static zzcza zzax(zzehm<ApplicationInfo> zzehmVar, zzehm<PackageInfo> zzehmVar2) {
        return new zzcza(zzehmVar, zzehmVar2);
    }

    public static zzcyx zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzcyx(applicationInfo, packageInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzgbc.get(), this.zzfmq.get());
    }
}
