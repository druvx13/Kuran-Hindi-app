package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkl implements zzaga<Object> {
    final /* synthetic */ zzbkg zzfgz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkl(zzbkg zzbkgVar) {
        this.zzfgz = zzbkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        boolean zzm;
        Executor executor;
        zzm = this.zzfgz.zzm(map);
        if (zzm) {
            executor = this.zzfgz.executor;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbkk
                private final zzbkl zzfha;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfha = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbkp zzbkpVar;
                    zzbkpVar = this.zzfha.zzfgz.zzfgr;
                    zzbkpVar.zzago();
                }
            });
        }
    }
}
