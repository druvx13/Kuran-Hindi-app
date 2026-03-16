package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajk implements zzaga<zzakd> {
    private final /* synthetic */ zzajw zzdcw;
    private final /* synthetic */ zzais zzdcx;
    private final /* synthetic */ zzajf zzdcy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajk(zzajf zzajfVar, zzajw zzajwVar, zzais zzaisVar) {
        this.zzdcy = zzajfVar;
        this.zzdcw = zzajwVar;
        this.zzdcx = zzaisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzakd zzakdVar, Map map) {
        Object obj;
        zzayf zzayfVar;
        obj = this.zzdcy.lock;
        synchronized (obj) {
            if (this.zzdcw.getStatus() != -1 && this.zzdcw.getStatus() != 1) {
                this.zzdcy.status = 0;
                zzayfVar = this.zzdcy.zzdcq;
                zzayfVar.zzh(this.zzdcx);
                this.zzdcw.zzm(this.zzdcx);
                this.zzdcy.zzdcs = this.zzdcw;
                zzawr.zzeg("Successfully loaded JS Engine.");
            }
        }
    }
}
