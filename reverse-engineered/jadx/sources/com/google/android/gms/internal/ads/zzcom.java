package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcom implements zzcnj<zzblx> {
    private final ScheduledExecutorService zzfky;
    private final zzbra zzfoe;
    private final zzdrh zzfur;
    private final zzbmt zzgfe;
    private final zzcns zzgff;

    public zzcom(zzbmt zzbmtVar, zzcns zzcnsVar, zzbra zzbraVar, ScheduledExecutorService scheduledExecutorService, zzdrh zzdrhVar) {
        this.zzgfe = zzbmtVar;
        this.zzgff = zzcnsVar;
        this.zzfoe = zzbraVar;
        this.zzfky = scheduledExecutorService;
        this.zzfur = zzdrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return zzdhaVar.zzgur.zzfll.zzarx() != null && this.zzgff.zza(zzdhaVar, zzdgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<zzblx> zzb(final zzdha zzdhaVar, final zzdgo zzdgoVar) {
        return this.zzfur.zzd(new Callable(this, zzdhaVar, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcop
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcom zzgfh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfh = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgfh.zzc(this.zzfvc, this.zzfjm);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzblx zzc(final zzdha zzdhaVar, final zzdgo zzdgoVar) throws Exception {
        return this.zzgfe.zza(new zzboi(zzdhaVar, zzdgoVar, null), new zzbnh(zzdhaVar.zzgur.zzfll.zzarx(), new Runnable(this, zzdhaVar, zzdgoVar) { // from class: com.google.android.gms.internal.ads.zzcoo
            private final zzdgo zzfjm;
            private final zzdha zzfvc;
            private final zzcom zzgfh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfh = this;
                this.zzfvc = zzdhaVar;
                this.zzfjm = zzdgoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgfh.zzd(this.zzfvc, this.zzfjm);
            }
        })).zzafh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdha zzdhaVar, zzdgo zzdgoVar) {
        zzdqw.zza(zzdqw.zza(this.zzgff.zzb(zzdhaVar, zzdgoVar), zzdgoVar.zzgtz, TimeUnit.SECONDS, this.zzfky), new zzcor(this), this.zzfur);
    }
}
