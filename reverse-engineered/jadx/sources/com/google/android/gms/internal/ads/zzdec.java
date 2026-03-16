package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbqh;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdec<R extends zzbqh<AdT>, AdT extends zzbns> implements zzdjk<AdT> {
    private final zzdeu<R, zzdiv<AdT>> zzgrw;

    public zzdec(zzdeu<R, zzdiv<AdT>> zzdeuVar) {
        this.zzgrw = zzdeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdjk
    public final void zzb(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdjk
    public final zzdri<zzdiv<AdT>> zza(zzdjj zzdjjVar) {
        zzdeb zzdebVar = (zzdeb) zzdjjVar;
        return this.zzgrw.zza(zzdebVar.zzgru, zzdebVar.zzgrt);
    }

    @Override // com.google.android.gms.internal.ads.zzdjk
    public final void zza(zzdiv<AdT> zzdivVar) {
        zzdivVar.zzgxt = this.zzgrw.zzarj().zzaed();
    }
}
