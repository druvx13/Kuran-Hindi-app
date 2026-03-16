package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzckb implements zzegz<PackageInfo> {
    private final zzehm<Context> zzenp;
    private final zzehm<ApplicationInfo> zzgbc;

    private zzckb(zzehm<Context> zzehmVar, zzehm<ApplicationInfo> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzgbc = zzehmVar2;
    }

    public static zzckb zzak(zzehm<Context> zzehmVar, zzehm<ApplicationInfo> zzehmVar2) {
        return new zzckb(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzcjr.zza(this.zzenp.get(), this.zzgbc.get());
    }
}
