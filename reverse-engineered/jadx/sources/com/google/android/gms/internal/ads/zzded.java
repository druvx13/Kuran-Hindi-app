package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbqh;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzded<R extends zzbqh<AdT>, AdT extends zzbns> implements zzdeu<R, zzdeh<AdT>> {
    private final Executor executor;
    private final zzdio zzgrx;
    private zzdqx<Void> zzgry = new zzdei(this);

    public zzded(zzdio zzdioVar, Executor executor) {
        this.zzgrx = zzdioVar;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final /* bridge */ /* synthetic */ Object zzarj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdri<zzdeh<AdT>> zza(final zzdev zzdevVar, final zzdew<R> zzdewVar) {
        return zzdqr.zzg(new zzdeo(this.zzgrx, zzdevVar.zzgsi, zzdewVar, this.executor).zzaro()).zzb(new zzdqj(this, zzdevVar, zzdewVar) { // from class: com.google.android.gms.internal.ads.zzdeg
            private final zzdev zzgrl;
            private final zzded zzgsa;
            private final zzdew zzgsb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsa = this;
                this.zzgrl = zzdevVar;
                this.zzgsb = zzdewVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgsa.zza(this.zzgrl, this.zzgsb, (zzdes) obj);
            }
        }, this.executor).zza(Exception.class, new zzdef(this), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzdev zzdevVar, zzdew zzdewVar, zzdes zzdesVar) throws Exception {
        zzdiy zzdiyVar = zzdesVar.zzgrv;
        zzarj zzarjVar = zzdesVar.zzgbt;
        zzdiv<?> zza = zzdiyVar != null ? this.zzgrx.zza(zzdiyVar) : null;
        if (zzdiyVar == null) {
            return zzdqw.zzag(null);
        }
        if (zza != null && zzarjVar != null) {
            zzdqw.zza(((zzbqh) zzdewVar.zzc(zzdevVar.zzgsi).zzaeg()).zzaed().zzc(zzarjVar), this.zzgry, this.executor);
        }
        return zzdqw.zzag(new zzdeh(zzdiyVar, zzarjVar, zza));
    }
}
