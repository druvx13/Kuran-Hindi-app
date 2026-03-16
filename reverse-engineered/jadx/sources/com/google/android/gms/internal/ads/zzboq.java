package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzboq<T> {
    private final Executor executor;
    private final zzckg zzflj;
    private final zzckn zzflk;
    private final zzdhe zzfll;
    private final zzdku zzflm;
    private final zzbju zzfln;
    private final zzcqp<T> zzflo;
    private final zzbtx zzflp;
    private final zzdha zzflq;
    private final zzclf zzflr;
    private final zzbqc zzfls;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboq(zzckg zzckgVar, zzckn zzcknVar, zzdhe zzdheVar, zzdku zzdkuVar, zzbju zzbjuVar, zzcqp<T> zzcqpVar, zzbtx zzbtxVar, zzdha zzdhaVar, zzclf zzclfVar, zzbqc zzbqcVar, Executor executor) {
        this.zzflj = zzckgVar;
        this.zzflk = zzcknVar;
        this.zzfll = zzdheVar;
        this.zzflm = zzdkuVar;
        this.zzfln = zzbjuVar;
        this.zzflo = zzcqpVar;
        this.zzflp = zzbtxVar;
        this.zzflq = zzdhaVar;
        this.zzflr = zzclfVar;
        this.zzfls = zzbqcVar;
        this.executor = executor;
    }

    private final zzdri<zzdha> zza(zzdri<zzarj> zzdriVar) {
        if (this.zzflq != null) {
            return this.zzflm.zzu(zzdkr.SERVER_TRANSACTION).zze(zzdqw.zzag(this.zzflq)).zzaud();
        }
        com.google.android.gms.ads.internal.zzq.zzlc().zzmu();
        if (this.zzfll.zzguw.zzceu != null) {
            return this.zzflm.zzu(zzdkr.SERVER_TRANSACTION).zze(this.zzflk.zzaos()).zzaud();
        }
        return this.zzflm.zza((zzdku) zzdkr.SERVER_TRANSACTION, (zzdri) zzdriVar).zza(this.zzflj).zzaud();
    }

    public final zzdri<zzdha> zza(zzarj zzarjVar) {
        return zza(zzdqw.zzag(zzarjVar));
    }

    public final zzdri<zzdha> zzaih() {
        return zza(this.zzfls.zzail());
    }

    public final zzdri<T> zzb(zzdri<zzdha> zzdriVar) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcrq)).booleanValue()) {
            return this.zzflm.zza((zzdku) zzdkr.RENDERER, (zzdri) zzdriVar).zza(this.zzfln).zza(this.zzflo).zzaud();
        }
        return this.zzflm.zza((zzdku) zzdkr.RENDERER, (zzdri) zzdriVar).zza(this.zzfln).zza(this.zzflo).zza(((Integer) zzvj.zzpv().zzd(zzzz.zzcrr)).intValue(), TimeUnit.SECONDS).zzaud();
    }

    public final zzdri<T> zzb(zzarj zzarjVar) {
        return zzb(zza(zzarjVar));
    }

    public final zzdri<T> zzaii() {
        return zzb(zzaih());
    }

    public final zzbtx zzaij() {
        return this.zzflp;
    }

    public final zzdri<zzarj> zza(final zzdir zzdirVar) {
        zzdkd zzaud = this.zzflm.zza((zzdku) zzdkr.GET_CACHE_KEY, (zzdri) this.zzfls.zzail()).zza(new zzdqj(this, zzdirVar) { // from class: com.google.android.gms.internal.ads.zzbot
            private final zzboq zzflu;
            private final zzdir zzflv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzflu = this;
                this.zzflv = zzdirVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzflu.zza(this.zzflv, (zzarj) obj);
            }
        }).zzaud();
        zzdqw.zza(zzaud, new zzbos(this), this.executor);
        return zzaud;
    }

    public final zzdri<Void> zzc(zzarj zzarjVar) {
        zzdkd zzaud = this.zzflm.zza((zzdku) zzdkr.NOTIFY_CACHE_HIT, (zzdri) this.zzflr.zzk(zzarjVar)).zzaud();
        zzdqw.zza(zzaud, new zzbov(this), this.executor);
        return zzaud;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdir zzdirVar, zzarj zzarjVar) throws Exception {
        zzarjVar.zzdph = zzdirVar;
        return this.zzflr.zzj(zzarjVar);
    }
}
