package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajo implements zzban<zzais> {
    private final /* synthetic */ zzajf zzdcy;
    private final /* synthetic */ zzajw zzddc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajo(zzajf zzajfVar, zzajw zzajwVar) {
        this.zzdcy = zzajfVar;
        this.zzddc = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void zzh(zzais zzaisVar) {
        Object obj;
        zzajw zzajwVar;
        zzajw zzajwVar2;
        zzajw zzajwVar3;
        obj = this.zzdcy.lock;
        synchronized (obj) {
            this.zzdcy.status = 0;
            zzajwVar = this.zzdcy.zzdcs;
            if (zzajwVar != null) {
                zzajw zzajwVar4 = this.zzddc;
                zzajwVar2 = this.zzdcy.zzdcs;
                if (zzajwVar4 != zzajwVar2) {
                    zzawr.zzeg("New JS engine is loaded, marking previous one as destroyable.");
                    zzajwVar3 = this.zzdcy.zzdcs;
                    zzajwVar3.zzsz();
                }
            }
            this.zzdcy.zzdcs = this.zzddc;
        }
    }
}
