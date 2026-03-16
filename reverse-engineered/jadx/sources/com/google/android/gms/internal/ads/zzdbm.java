package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbm implements zzdak<zzdbj> {
    private final Executor executor;
    private final zzawd zzbnp;
    private final ScheduledExecutorService zzfky;
    private final zzavz zzgpa;
    private final int zzgpk;
    private final Context zzvf;

    public zzdbm(zzavz zzavzVar, int i, Context context, zzawd zzawdVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzgpa = zzavzVar;
        this.zzgpk = i;
        this.zzvf = context;
        this.zzbnp = zzawdVar;
        this.zzfky = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdbj> zzaqa() {
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcsl)).booleanValue()) {
            return zzdqw.zzag(null);
        }
        return zzdqr.zzg(zzdqw.zza(new zzdqh(this) { // from class: com.google.android.gms.internal.ads.zzdbl
            private final zzdbm zzgpj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpj = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdqh
            public final zzdri zzaql() {
                return this.zzgpj.zzaqu();
            }
        }, this.executor)).zza(zzdbo.zzdsc, this.executor).zza(((Long) zzvj.zzpv().zzd(zzzz.zzclr)).longValue(), TimeUnit.MILLISECONDS, this.zzfky).zza(Exception.class, new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzdbn
            private final zzdbm zzgpj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpj = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return this.zzgpj.zzb((Exception) obj);
            }
        }, zzdrk.zzawr());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdbj zzb(Exception exc) {
        this.zzbnp.zza(exc, "ATTESTATION_TOKEN_FETCH");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zzaqu() throws Exception {
        return this.zzgpa.zza(this.zzvf, this.zzgpk);
    }
}
