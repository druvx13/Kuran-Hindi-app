package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkj implements zzaga<Object> {
    final /* synthetic */ zzbkg zzfgz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkj(zzbkg zzbkgVar) {
        this.zzfgz = zzbkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        boolean zzm;
        Executor executor;
        zzm = this.zzfgz.zzm(map);
        if (zzm) {
            executor = this.zzfgz.executor;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbki
                private final zzbkj zzfgy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfgy = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbkp zzbkpVar;
                    zzbkpVar = this.zzfgy.zzfgz.zzfgr;
                    zzbkpVar.zzagm();
                }
            });
        }
    }
}
