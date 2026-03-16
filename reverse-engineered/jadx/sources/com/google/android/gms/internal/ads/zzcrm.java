package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcrm implements zzbwg {
    private final /* synthetic */ zzdgo zzggq;
    private final /* synthetic */ zzdha zzghe;
    private final /* synthetic */ zzcnl zzghf;
    final /* synthetic */ zzcrk zzghg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrm(zzcrk zzcrkVar, zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl zzcnlVar) {
        this.zzghg = zzcrkVar;
        this.zzghe = zzdhaVar;
        this.zzggq = zzdgoVar;
        this.zzghf = zzcnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void onInitializationSucceeded() {
        Executor executor;
        executor = this.zzghg.zzfhi;
        final zzdha zzdhaVar = this.zzghe;
        final zzdgo zzdgoVar = this.zzggq;
        final zzcnl zzcnlVar = this.zzghf;
        executor.execute(new Runnable(this, zzdhaVar, zzdgoVar, zzcnlVar) { // from class: com.google.android.gms.internal.ads.zzcrp
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcrm zzghl;
            private final zzcnl zzghm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghl = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
                this.zzghm = zzcnlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzcrm zzcrmVar = this.zzghl;
                zzdha zzdhaVar2 = this.zzfvc;
                zzdgo zzdgoVar2 = this.zzfjm;
                zzcnl zzcnlVar2 = this.zzghm;
                zzcrk zzcrkVar = zzcrmVar.zzghg;
                zzcrk.zzc(zzdhaVar2, zzdgoVar2, zzcnlVar2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwg
    public final void zzdq(int i) {
        String valueOf = String.valueOf(this.zzghf.zzflf);
        zzawr.zzfc(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}
