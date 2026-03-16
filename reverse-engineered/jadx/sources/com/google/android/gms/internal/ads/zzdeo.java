package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqh;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdeo<R extends zzbqh<? extends zzbns>> {
    private final Executor executor;
    private final zzdew<R> zzgrt;
    private final zzdio zzgrx;
    private final zzdet zzgse;
    private zzdes zzgsf;

    public zzdeo(zzdio zzdioVar, zzdet zzdetVar, zzdew<R> zzdewVar, Executor executor) {
        this.zzgrx = zzdioVar;
        this.zzgse = zzdetVar;
        this.zzgrt = zzdewVar;
        this.executor = executor;
    }

    public final zzdri<zzdes> zzaro() {
        zzdri zza;
        zzdes zzdesVar = this.zzgsf;
        if (zzdesVar != null) {
            return zzdqw.zzag(zzdesVar);
        }
        if (!zzabo.zzcxc.get().booleanValue()) {
            zzdes zzdesVar2 = new zzdes(null, zzarp(), null);
            this.zzgsf = zzdesVar2;
            zza = zzdqw.zzag(zzdesVar2);
        } else {
            zza = zzdqr.zzg(this.zzgrt.zzc(this.zzgse).zza(new zzdee(this.zzgrx.zzasr().zzgwy)).zzaeg().zzaed().zza(this.zzgrx.zzasr())).zza(new zzdep(this), this.executor).zza(zzclc.class, new zzdeq(this), this.executor);
        }
        return zzdqw.zzb(zza, zzden.zzdsc, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzdiy zzarp() {
        zzdhe zzafa = this.zzgrt.zzc(this.zzgse).zzaeg().zzafa();
        return this.zzgrx.zza(zzafa.zzguw, zzafa.zzgux, zzafa.zzgva);
    }
}
