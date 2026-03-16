package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqe implements zzegz<zzbqc> {
    private final zzehm<zzawt> zzeqm;
    private final zzehm<zzdaj<Bundle>> zzeti;
    private final zzehm<zzazz> zzfib;
    private final zzehm<zzdku> zzfju;
    private final zzehm<ApplicationInfo> zzfmn;
    private final zzehm<String> zzfmo;
    private final zzehm<List<String>> zzfmp;
    private final zzehm<PackageInfo> zzfmq;
    private final zzehm<zzdri<String>> zzfmr;
    private final zzehm<String> zzfms;

    private zzbqe(zzehm<zzdku> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<ApplicationInfo> zzehmVar3, zzehm<String> zzehmVar4, zzehm<List<String>> zzehmVar5, zzehm<PackageInfo> zzehmVar6, zzehm<zzdri<String>> zzehmVar7, zzehm<zzawt> zzehmVar8, zzehm<String> zzehmVar9, zzehm<zzdaj<Bundle>> zzehmVar10) {
        this.zzfju = zzehmVar;
        this.zzfib = zzehmVar2;
        this.zzfmn = zzehmVar3;
        this.zzfmo = zzehmVar4;
        this.zzfmp = zzehmVar5;
        this.zzfmq = zzehmVar6;
        this.zzfmr = zzehmVar7;
        this.zzeqm = zzehmVar8;
        this.zzfms = zzehmVar9;
        this.zzeti = zzehmVar10;
    }

    public static zzbqe zza(zzehm<zzdku> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<ApplicationInfo> zzehmVar3, zzehm<String> zzehmVar4, zzehm<List<String>> zzehmVar5, zzehm<PackageInfo> zzehmVar6, zzehm<zzdri<String>> zzehmVar7, zzehm<zzawt> zzehmVar8, zzehm<String> zzehmVar9, zzehm<zzdaj<Bundle>> zzehmVar10) {
        return new zzbqe(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6, zzehmVar7, zzehmVar8, zzehmVar9, zzehmVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbqc(this.zzfju.get(), this.zzfib.get(), this.zzfmn.get(), this.zzfmo.get(), this.zzfmp.get(), this.zzfmq.get(), zzeha.zzas(this.zzfmr), this.zzeqm.get(), this.zzfms.get(), this.zzeti.get());
    }
}
