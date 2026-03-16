package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmw implements zzdla {
    private final zzcmv zzgdr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmw(zzcmv zzcmvVar) {
        this.zzgdr = zzcmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzb(zzdkr zzdkrVar, String str) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue() && zzdkr.RENDERER == zzdkrVar) {
            this.zzgdr.zzff(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str, Throwable th) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue() && zzdkr.RENDERER == zzdkrVar && this.zzgdr.zzaoz() != 0) {
            this.zzgdr.zzer(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.zzgdr.zzaoz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzc(zzdkr zzdkrVar, String str) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue() && zzdkr.RENDERER == zzdkrVar && this.zzgdr.zzaoz() != 0) {
            this.zzgdr.zzer(com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() - this.zzgdr.zzaoz());
        }
    }
}
