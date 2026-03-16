package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zztf;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzddy<R extends zzbqh<AdT>, AdT extends zzbns> implements zzdeu<R, AdT> {
    private final Executor executor;
    private final zzdeu<R, AdT> zzgqe;
    private final zzdeu<R, zzdeh<AdT>> zzgro;
    private final zzdjd<AdT> zzgrp;
    private R zzgrq;

    public zzddy(zzdeu<R, AdT> zzdeuVar, zzdeu<R, zzdeh<AdT>> zzdeuVar2, zzdjd<AdT> zzdjdVar, Executor executor) {
        this.zzgqe = zzdeuVar;
        this.zzgro = zzdeuVar2;
        this.zzgrp = zzdjdVar;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdeu
    /* renamed from: zzark */
    public final synchronized R zzarj() {
        return this.zzgrq;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final synchronized zzdri<AdT> zza(final zzdev zzdevVar, final zzdew<R> zzdewVar) {
        final zzdeb zzdebVar;
        zzdhe zzafa = zzdewVar.zzc(zzdevVar.zzgsi).zzaeg().zzafa();
        zzdebVar = new zzdeb(zzdewVar, zzdevVar, zzafa.zzguw, zzafa.zzgux, this.executor, zzafa.zzgva, null);
        return zzdqr.zzg(this.zzgro.zza(zzdevVar, zzdewVar)).zzb(new zzdqj(this, zzdevVar, zzdebVar, zzdewVar) { // from class: com.google.android.gms.internal.ads.zzddx
            private final zzddy zzgrk;
            private final zzdev zzgrl;
            private final zzdeb zzgrm;
            private final zzdew zzgrn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrk = this;
                this.zzgrl = zzdevVar;
                this.zzgrm = zzdebVar;
                this.zzgrn = zzdewVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgrk.zza(this.zzgrl, this.zzgrm, this.zzgrn, (zzdeh) obj);
            }
        }, this.executor);
    }

    private final zzdri<AdT> zza(zzdiv<AdT> zzdivVar, zzdev zzdevVar, zzdew<R> zzdewVar) {
        final zzbqg<R> zzc = zzdewVar.zzc(zzdevVar.zzgsi);
        if (zzdivVar.zzgxu != null) {
            zzdivVar.zzgxu.zzaib().zzb(zzc.zzaeg().zzafb());
            return zzdqw.zzag(zzdivVar.zzgxu);
        }
        zzc.zza(zzdivVar.zzepv);
        zzdri<AdT> zza = this.zzgqe.zza(zzdevVar, new zzdew(zzc) { // from class: com.google.android.gms.internal.ads.zzdea
            private final zzbqg zzgrs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgrs = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzdew
            public final zzbqg zzc(zzdet zzdetVar) {
                return this.zzgrs;
            }
        });
        this.zzgrq = this.zzgqe.zzarj();
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdew zzdewVar, zzdjh zzdjhVar) throws Exception {
        if (zzdjhVar != null && zzdjhVar.zzgsc != null && zzdjhVar.zzgyj != null) {
            zzdjhVar.zzgsc.zzgxt.zzaij().zze((zztf.zzb) ((zzecd) zztf.zzb.zznf().zza(zztf.zzb.zza.zznh().zza(zztf.zzb.EnumC0027zzb.IN_MEMORY).zza(zztf.zzb.zzd.zznj())).zzbet()));
            return zza(zzdjhVar.zzgsc, ((zzdeb) zzdjhVar.zzgyj).zzgru, zzdewVar);
        }
        throw new zzclp("Empty prefetch");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdev zzdevVar, zzdeb zzdebVar, final zzdew zzdewVar, zzdeh zzdehVar) throws Exception {
        if (zzdehVar != null) {
            zzdeb zzdebVar2 = new zzdeb(zzdebVar.zzgrt, zzdebVar.zzgru, zzdebVar.zzdlx, zzdebVar.zzbsc, zzdebVar.executor, zzdebVar.zzgmd, zzdehVar.zzgrv);
            if (zzdehVar.zzgsc != null) {
                this.zzgrq = null;
                this.zzgrp.zzb(zzdebVar2);
                return zza(zzdehVar.zzgsc, zzdevVar, zzdewVar);
            }
            zzdri<zzdjh<AdT>> zzc = this.zzgrp.zzc(zzdebVar2);
            if (zzc != null) {
                this.zzgrq = (R) zzdewVar.zzc(zzdevVar.zzgsi).zzaeg();
                return zzdqw.zzb(zzc, new zzdqj(this, zzdewVar) { // from class: com.google.android.gms.internal.ads.zzddz
                    private final zzddy zzgrk;
                    private final zzdew zzgrr;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgrk = this;
                        this.zzgrr = zzdewVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzdqj
                    public final zzdri zzf(Object obj) {
                        return this.zzgrk.zza(this.zzgrr, (zzdjh) obj);
                    }
                }, this.executor);
            }
            this.zzgrp.zzb(zzdebVar2);
            zzdevVar = new zzdev(zzdevVar.zzgsi, zzdehVar.zzgbt);
        }
        zzdri<AdT> zza = this.zzgqe.zza(zzdevVar, zzdewVar);
        this.zzgrq = this.zzgqe.zzarj();
        return zza;
    }
}
