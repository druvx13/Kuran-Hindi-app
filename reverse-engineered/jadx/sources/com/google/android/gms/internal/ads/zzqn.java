package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzqn implements Runnable {
    private final /* synthetic */ zzqo zzbqg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqn(zzqo zzqoVar) {
        this.zzbqg = zzqoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzqq> list;
        obj = this.zzbqg.lock;
        synchronized (obj) {
            z = this.zzbqg.foreground;
            if (z) {
                z2 = this.zzbqg.zzbqh;
                if (z2) {
                    zzqo.zza(this.zzbqg, false);
                    zzawr.zzed("App went background");
                    list = this.zzbqg.zzbqi;
                    for (zzqq zzqqVar : list) {
                        try {
                            zzqqVar.zzp(false);
                        } catch (Exception e) {
                            zzazw.zzc("", e);
                        }
                    }
                }
            }
            zzawr.zzed("App is still foreground");
        }
    }
}
