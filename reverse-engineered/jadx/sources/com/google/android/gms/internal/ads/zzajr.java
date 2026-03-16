package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajr implements zzbal {
    private final /* synthetic */ zzajf zzdcy;
    private final /* synthetic */ zzajw zzddc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajr(zzajf zzajfVar, zzajw zzajwVar) {
        this.zzdcy = zzajfVar;
        this.zzddc = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final void run() {
        Object obj;
        obj = this.zzdcy.lock;
        synchronized (obj) {
            this.zzdcy.status = 1;
            zzawr.zzeg("Failed loading new engine. Marking new engine destroyable.");
            this.zzddc.zzsz();
        }
    }
}
