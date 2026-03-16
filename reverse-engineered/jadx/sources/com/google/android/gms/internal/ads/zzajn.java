package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajn implements zzaga<zzakd> {
    private final /* synthetic */ zzais zzdcx;
    private final /* synthetic */ zzajf zzdcy;
    private final /* synthetic */ zzdt zzdda;
    private final /* synthetic */ zzazb zzddb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajn(zzajf zzajfVar, zzdt zzdtVar, zzais zzaisVar, zzazb zzazbVar) {
        this.zzdcy = zzajfVar;
        this.zzdda = zzdtVar;
        this.zzdcx = zzaisVar;
        this.zzddb = zzazbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzakd zzakdVar, Map map) {
        Object obj;
        int i;
        obj = this.zzdcy.lock;
        synchronized (obj) {
            zzawr.zzfb("JS Engine is requesting an update");
            i = this.zzdcy.status;
            if (i == 0) {
                zzawr.zzfb("Starting reload.");
                this.zzdcy.status = 2;
                this.zzdcy.zza(this.zzdda);
            }
            this.zzdcx.zzb("/requestReload", (zzaga) this.zzddb.get());
        }
    }
}
