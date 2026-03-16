package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcni<DelegateT, AdapterT> implements zzcnj<AdapterT> {
    private final zzcnj<DelegateT> zzgej;
    private final zzdnx<DelegateT, AdapterT> zzgek;

    public zzcni(zzcnj<DelegateT> zzcnjVar, zzdnx<DelegateT, AdapterT> zzdnxVar) {
        this.zzgej = zzcnjVar;
        this.zzgek = zzdnxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final boolean zza(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return this.zzgej.zza(zzdhaVar, zzdgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcnj
    public final zzdri<AdapterT> zzb(zzdha zzdhaVar, zzdgo zzdgoVar) {
        return zzdqw.zzb(this.zzgej.zzb(zzdhaVar, zzdgoVar), this.zzgek, zzbab.zzdzr);
    }
}
