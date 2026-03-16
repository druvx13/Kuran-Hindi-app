package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbe implements zzdak<zzdbb> {
    private final Executor executor;
    private final PackageInfo zzdly;
    private final zzavz zzgpa;
    private final String zzgpd;

    public zzdbe(zzavz zzavzVar, Executor executor, String str, PackageInfo packageInfo) {
        this.zzgpa = zzavzVar;
        this.executor = executor;
        this.zzgpd = str;
        this.zzdly = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdbb> zzaqa() {
        return zzdqw.zzb(zzdqw.zzb(this.zzgpa.zza(this.zzgpd, this.zzdly), zzdbd.zzdsc, this.executor), Throwable.class, new zzdqj(this) { // from class: com.google.android.gms.internal.ads.zzdbg
            private final zzdbe zzgpf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpf = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgpf.zzf((Throwable) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzf(Throwable th) throws Exception {
        return zzdqw.zzag(new zzdbb(this.zzgpd));
    }
}
