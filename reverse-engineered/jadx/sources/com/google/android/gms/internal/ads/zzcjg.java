package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcjg implements zzdqx<String> {
    final /* synthetic */ zzciz zzgal;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjg(zzciz zzcizVar) {
        this.zzgal = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        long j;
        zzbaj zzbajVar;
        synchronized (this) {
            zzciz.zza(this.zzgal, true);
            zzciz zzcizVar = this.zzgal;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
            j = this.zzgal.zzfzz;
            zzcizVar.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzbajVar = this.zzgal.zzgaa;
            zzbajVar.setException(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(@Nullable String str) {
        long j;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            zzciz.zza(this.zzgal, true);
            zzciz zzcizVar = this.zzgal;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
            j = this.zzgal.zzfzz;
            zzcizVar.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zzgal.executor;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzcjj
                private final String zzdbv;
                private final zzcjg zzgaq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgaq = this;
                    this.zzdbv = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcjg zzcjgVar = this.zzgaq;
                    zzcjgVar.zzgal.zzgj(this.zzdbv);
                }
            });
        }
    }
}
