package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzday implements zzdak<zzdav> {
    private final Executor executor;
    private final ScheduledExecutorService zzfky;
    private final zzavz zzgpa;
    private final Context zzvf;

    public zzday(zzavz zzavzVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzgpa = zzavzVar;
        this.zzvf = context;
        this.zzfky = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdav> zzaqa() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclq)).booleanValue()) {
            return zzdqr.zzg(this.zzgpa.zzak(this.zzvf)).zza(zzdax.zzdsc, this.executor).zza(((Long) zzvj.zzpv().zzd(zzzz.zzclr)).longValue(), TimeUnit.MILLISECONDS, this.zzfky).zza(Throwable.class, new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzdba
                private final zzday zzgpb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgpb = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdnx
                public final Object apply(Object obj) {
                    return this.zzgpb.zze((Throwable) obj);
                }
            }, this.executor);
        }
        return zzdqw.immediateFailedFuture(new Exception("Did not ad Ad ID into query param."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdav zze(Throwable th) {
        zzvj.zzpr();
        return new zzdav(null, zzazm.zzbl(this.zzvf));
    }
}
