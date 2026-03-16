package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzcke implements zzdqj<zzarj, zzdha> {
    private final zzbth zzgbd;

    public zzcke(zzbth zzbthVar) {
        this.zzgbd = zzbthVar;
    }

    protected abstract zzdri<zzdha> zzb(zzarj zzarjVar) throws zzcjk;

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ zzdri<zzdha> zzf(zzarj zzarjVar) throws Exception {
        zzarj zzarjVar2 = zzarjVar;
        this.zzgbd.zzd(zzarjVar2);
        zzdri<zzdha> zzb = zzb(zzarjVar2);
        zzdqw.zza(zzb, new zzckh(this), zzbab.zzdzw);
        return zzb;
    }
}
