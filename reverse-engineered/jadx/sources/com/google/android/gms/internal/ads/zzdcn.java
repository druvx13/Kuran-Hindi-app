package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcn implements zzegz<ApplicationInfo> {
    private final zzdcl zzgpz;

    public zzdcn(zzdcl zzdclVar) {
        this.zzgpz = zzdclVar;
    }

    public static ApplicationInfo zzb(zzdcl zzdclVar) {
        return (ApplicationInfo) zzehf.zza(zzdclVar.zzara(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzgpz);
    }
}
