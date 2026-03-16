package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwq implements zzdak<zzcwn> {
    private final Executor executor;
    private final ScheduledExecutorService zzfky;
    private final Context zzvf;

    public zzcwq(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzvf = context;
        this.zzfky = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcwn> zzaqa() {
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcte)).booleanValue()) {
            return zzdqw.zzag(null);
        }
        final zzbaj zzbajVar = new zzbaj();
        try {
            new zzdnu(zzbajVar) { // from class: com.google.android.gms.internal.ads.zzcwp
                private final zzbaj zzbsx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbsx = zzbajVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdnu
                public final void zzbm(boolean z) {
                    this.zzbsx.set(false);
                }
            }.zzbm(false);
        } catch (Throwable unused) {
            zzawr.zzfa("ArCoreApk is not ready.");
            zzbajVar.set(false);
        }
        return zzdqw.zzb(zzdqw.zzb(zzdqw.zza(zzbajVar, 200L, TimeUnit.MILLISECONDS, this.zzfky), new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzcws
            private final zzcwq zzgmm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmm = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return new zzcwn(false, false, ((Boolean) obj).booleanValue());
            }
        }, this.executor), Throwable.class, zzcwr.zzbly, this.executor);
    }
}
