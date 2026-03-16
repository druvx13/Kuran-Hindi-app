package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchy {
    private final Map<String, String> zzcux = new ConcurrentHashMap();
    private final /* synthetic */ zzchz zzfza;

    public zzchy(zzchz zzchzVar) {
        this.zzfza = zzchzVar;
    }

    public final zzchy zzanx() {
        Map<? extends String, ? extends String> map;
        Map<String, String> map2 = this.zzcux;
        map = this.zzfza.zzfzb;
        map2.putAll(map);
        return this;
    }

    public final zzchy zza(zzdgq zzdgqVar) {
        this.zzcux.put("gqi", zzdgqVar.zzdoh);
        return this;
    }

    public final zzchy zzc(zzdgo zzdgoVar) {
        this.zzcux.put("aai", zzdgoVar.zzdfq);
        return this;
    }

    public final zzchy zzq(String str, String str2) {
        this.zzcux.put(str, str2);
        return this;
    }

    public final void zzany() {
        Executor executor;
        executor = this.zzfza.executor;
        executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcib
            private final zzchy zzfzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzc = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfzc.zzanz();
            }
        });
    }

    public final /* synthetic */ void zzanz() {
        zzcie zzcieVar;
        zzcieVar = this.zzfza.zzfyx;
        zzcieVar.zzn(this.zzcux);
    }
}
