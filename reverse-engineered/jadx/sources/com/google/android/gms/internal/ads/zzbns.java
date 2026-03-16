package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbns {
    protected final zzdha zzfgj;
    protected final zzdgo zzfkd;
    private final zzbrr zzfkq;
    private final zzbsh zzfkr;
    private final zzder zzfks;
    private final zzbqs zzfkt;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbns(zzbnv zzbnvVar) {
        this.zzfgj = zzbnv.zza(zzbnvVar);
        this.zzfkd = zzbnv.zzb(zzbnvVar);
        this.zzfkq = zzbnv.zzc(zzbnvVar);
        this.zzfkr = zzbnv.zzd(zzbnvVar);
        this.zzfks = zzbnv.zze(zzbnvVar);
        this.zzfkt = zzbnv.zzf(zzbnvVar);
    }

    public final zzbrr zzahz() {
        return this.zzfkq;
    }

    public void zzahk() {
        this.zzfkr.onAdLoaded();
    }

    public final zzbqs zzaia() {
        return this.zzfkt;
    }

    public void destroy() {
        this.zzfkq.zzbz(null);
    }

    public final zzder zzaib() {
        return this.zzfks;
    }
}
