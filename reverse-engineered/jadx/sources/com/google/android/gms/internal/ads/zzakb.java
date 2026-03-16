package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzakb implements zzban<zzais> {
    final /* synthetic */ zzajw zzddn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakb(zzajw zzajwVar) {
        this.zzddn = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final /* synthetic */ void zzh(zzais zzaisVar) {
        final zzais zzaisVar2 = zzaisVar;
        zzbab.zzdzv.execute(new Runnable(this, zzaisVar2) { // from class: com.google.android.gms.internal.ads.zzaka
            private final zzakb zzddl;
            private final zzais zzddm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzddl = this;
                this.zzddm = zzaisVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzayf zzayfVar;
                zzakb zzakbVar = this.zzddl;
                zzais zzaisVar3 = this.zzddm;
                zzayfVar = zzakbVar.zzddn.zzdcr;
                zzayfVar.zzh(zzaisVar3);
                zzaisVar3.destroy();
            }
        });
    }
}
