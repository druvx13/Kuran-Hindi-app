package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqc {
    private final String packageName;
    private final zzazz zzbml;
    private final PackageInfo zzdly;
    private final List<String> zzdmi;
    private final String zzdpg;
    private final zzawt zzduw;
    private final zzdku zzflm;
    private final ApplicationInfo zzfmj;
    private final zzegt<zzdri<String>> zzfmk;
    private final zzdaj<Bundle> zzfml;

    public zzbqc(zzdku zzdkuVar, zzazz zzazzVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, zzegt<zzdri<String>> zzegtVar, zzawt zzawtVar, String str2, zzdaj<Bundle> zzdajVar) {
        this.zzflm = zzdkuVar;
        this.zzbml = zzazzVar;
        this.zzfmj = applicationInfo;
        this.packageName = str;
        this.zzdmi = list;
        this.zzdly = packageInfo;
        this.zzfmk = zzegtVar;
        this.zzduw = zzawtVar;
        this.zzdpg = str2;
        this.zzfml = zzdajVar;
    }

    public final zzdri<Bundle> zzaik() {
        return this.zzflm.zzu(zzdkr.SIGNALS).zze(this.zzfml.zzt(new Bundle())).zzaud();
    }

    public final zzdri<zzarj> zzail() {
        final zzdri<Bundle> zzaik = zzaik();
        return this.zzflm.zza((zzdku) zzdkr.REQUEST_PARCEL, zzaik, this.zzfmk.get()).zzb(new Callable(this, zzaik) { // from class: com.google.android.gms.internal.ads.zzbqf
            private final zzbqc zzfmt;
            private final zzdri zzfmu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfmt = this;
                this.zzfmu = zzaik;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzfmt.zzc(this.zzfmu);
            }
        }).zzaud();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzarj zzc(zzdri zzdriVar) throws Exception {
        return new zzarj((Bundle) zzdriVar.get(), this.zzbml, this.zzfmj, this.packageName, this.zzdmi, this.zzdly, this.zzfmk.get().get(), this.zzduw.zzwu(), this.zzdpg, null, null);
    }
}
