package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqp<AdT> implements zzdqj<zzdha, AdT> {
    private final Executor executor;
    private final zzdld zzfgl;
    private final ScheduledExecutorService zzfif;
    private final zzdku zzflm;
    private final zzbra zzfoe;
    private final zzbnx<AdT> zzggv;
    private final zzcqi zzggw;

    public zzcqp(zzdku zzdkuVar, zzcqi zzcqiVar, zzbra zzbraVar, zzdld zzdldVar, zzbnx<AdT> zzbnxVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zzflm = zzdkuVar;
        this.zzggw = zzcqiVar;
        this.zzfoe = zzbraVar;
        this.zzfgl = zzdldVar;
        this.zzggv = zzbnxVar;
        this.executor = executor;
        this.zzfif = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ zzdri zzf(zzdha zzdhaVar) throws Exception {
        final zzdha zzdhaVar2 = zzdhaVar;
        zzdkd zzaud = this.zzflm.zzu(zzdkr.RENDER_CONFIG_INIT).zze(zzdqw.immediateFailedFuture(new zzcqm("No ad configs", 3))).zzaud();
        this.zzfoe.zza(new zzbkf(zzdhaVar2, this.zzfgl), this.executor);
        int i = 0;
        for (final zzdgo zzdgoVar : zzdhaVar2.zzgus.zzguo) {
            Iterator<String> it = zzdgoVar.zzgtk.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                final zzcnj<AdT> zze = this.zzggv.zze(zzdgoVar.zzgtl, next);
                if (zze != null && zze.zza(zzdhaVar2, zzdgoVar)) {
                    zzdkm<I> zza = this.zzflm.zza((zzdku) zzdkr.RENDER_CONFIG_WATERFALL, (zzdri) zzaud);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i);
                    sb.append("-");
                    sb.append(next);
                    zzaud = zza.zzgv(sb.toString()).zza(Throwable.class, new zzdqj(this, zzdhaVar2, zzdgoVar, zze) { // from class: com.google.android.gms.internal.ads.zzcqo
                        private final zzdgo zzfjm;
                        private final zzdha zzfvc;
                        private final zzcqp zzggt;
                        private final zzcnj zzggu;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzggt = this;
                            this.zzfvc = zzdhaVar2;
                            this.zzfjm = zzdgoVar;
                            this.zzggu = zze;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdqj
                        public final zzdri zzf(Object obj) {
                            return this.zzggt.zza(this.zzfvc, this.zzfjm, this.zzggu, (Throwable) obj);
                        }
                    }).zzaud();
                    break;
                }
            }
            i++;
        }
        return zzaud;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnj zzcnjVar, Throwable th) throws Exception {
        return this.zzggw.zza(zzdhaVar.zzgus.zzgup, zzdgoVar, zzdqw.zza(zzcnjVar.zzb(zzdhaVar, zzdgoVar), zzdgoVar.zzgtz, TimeUnit.MILLISECONDS, this.zzfif));
    }
}
