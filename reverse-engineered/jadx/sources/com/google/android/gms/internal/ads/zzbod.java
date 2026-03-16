package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbod {
    private final Executor executor;
    private volatile boolean zzaef = true;
    private final ScheduledExecutorService zzfky;
    private final zzdri<zzbny> zzfkz;

    public zzbod(Executor executor, ScheduledExecutorService scheduledExecutorService, zzdri<zzbny> zzdriVar) {
        this.executor = executor;
        this.zzfky = scheduledExecutorService;
        this.zzfkz = zzdriVar;
    }

    public final void zza(zzdqx<zzbns> zzdqxVar) {
        zzdqw.zza(this.zzfkz, new zzbog(this, zzdqxVar), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(List<? extends zzdri<? extends zzbns>> list, final zzdqx<zzbns> zzdqxVar) {
        if (list == null || list.isEmpty()) {
            this.executor.execute(new Runnable(zzdqxVar) { // from class: com.google.android.gms.internal.ads.zzboc
                private final zzdqx zzfkx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfkx = zzdqxVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfkx.zzb(new zzcjk(3));
                }
            });
            return;
        }
        zzdri zzag = zzdqw.zzag(null);
        for (final zzdri<? extends zzbns> zzdriVar : list) {
            zzag = zzdqw.zzb(zzdqw.zzb(zzag, Throwable.class, new zzdqj(zzdqxVar) { // from class: com.google.android.gms.internal.ads.zzbof
                private final zzdqx zzfkx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfkx = zzdqxVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    this.zzfkx.zzb((Throwable) obj);
                    return zzdqw.zzag(null);
                }
            }, this.executor), new zzdqj(this, zzdqxVar, zzdriVar) { // from class: com.google.android.gms.internal.ads.zzboe
                private final zzbod zzfla;
                private final zzdqx zzflb;
                private final zzdri zzflc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfla = this;
                    this.zzflb = zzdqxVar;
                    this.zzflc = zzdriVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdqj
                public final zzdri zzf(Object obj) {
                    return this.zzfla.zza(this.zzflb, this.zzflc, (zzbns) obj);
                }
            }, this.executor);
        }
        zzdqw.zza(zzag, new zzboj(this, zzdqxVar), this.executor);
    }

    public final boolean isLoading() {
        return this.zzaef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaic() {
        zzbab.zzdzv.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzboh
            private final zzbod zzfla;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfla = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfla.zzaid();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaid() {
        this.zzaef = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdqx zzdqxVar, zzdri zzdriVar, zzbns zzbnsVar) throws Exception {
        if (zzbnsVar != null) {
            zzdqxVar.onSuccess(zzbnsVar);
        }
        return zzdqw.zza(zzdriVar, zzabx.zzcxy.get().longValue(), TimeUnit.MILLISECONDS, this.zzfky);
    }
}
