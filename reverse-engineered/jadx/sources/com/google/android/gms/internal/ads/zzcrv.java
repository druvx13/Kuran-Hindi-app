package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcrv extends zzcsb {
    private final zzbtp zzgho;

    public zzcrv(zzbqw zzbqwVar, zzbro zzbroVar, zzbrx zzbrxVar, zzbsh zzbshVar, zzbtw zzbtwVar, zzbsu zzbsuVar, zzbwi zzbwiVar, zzbtp zzbtpVar, zzbre zzbreVar) {
        super(zzbqwVar, zzbroVar, zzbrxVar, zzbshVar, zzbtwVar, zzbsuVar, zzbwiVar, zzbtpVar, zzbreVar);
        this.zzgho = zzbtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void onAdImpression() {
        this.zzgho.zzaiy();
    }
}
