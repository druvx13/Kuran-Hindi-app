package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchp implements zzbrc, zzbsm, zzbtm {
    private final zzchx zzfyw;
    private final zzcie zzfyx;

    public zzchp(zzchx zzchxVar, zzcie zzcieVar) {
        this.zzfyw = zzchxVar;
        this.zzfyx = zzcieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        this.zzfyw.zzrm().put("action", "loaded");
        this.zzfyx.zzn(this.zzfyw.zzrm());
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(int i) {
        this.zzfyw.zzrm().put("action", "ftl");
        this.zzfyw.zzrm().put("ftl", String.valueOf(i));
        this.zzfyx.zzn(this.zzfyw.zzrm());
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzd(zzarj zzarjVar) {
        this.zzfyw.zzj(zzarjVar.zzdpe);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzb(zzdha zzdhaVar) {
        this.zzfyw.zzc(zzdhaVar);
    }
}
