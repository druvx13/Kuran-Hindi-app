package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzajm implements Runnable {
    private final /* synthetic */ zzajw zzdcw;
    private final /* synthetic */ zzais zzdcx;
    private final /* synthetic */ zzajf zzdcy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajm(zzajf zzajfVar, zzajw zzajwVar, zzais zzaisVar) {
        this.zzdcy = zzajfVar;
        this.zzdcw = zzajwVar;
        this.zzdcx = zzaisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzdcy.lock;
        synchronized (obj) {
            if (this.zzdcw.getStatus() != -1 && this.zzdcw.getStatus() != 1) {
                this.zzdcw.reject();
                zzdrh zzdrhVar = zzbab.zzdzv;
                zzais zzaisVar = this.zzdcx;
                zzaisVar.getClass();
                zzdrhVar.execute(zzajp.zzb(zzaisVar));
                zzawr.zzeg("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
