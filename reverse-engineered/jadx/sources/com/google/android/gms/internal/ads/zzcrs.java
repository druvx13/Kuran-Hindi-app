package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcrs extends zzcqz {
    private final zzbtp zzgho;

    public zzcrs(zzbqw zzbqwVar, zzbro zzbroVar, zzbrx zzbrxVar, zzbsh zzbshVar, zzbre zzbreVar, zzbtw zzbtwVar, zzbwi zzbwiVar, zzbsu zzbsuVar, zzbwd zzbwdVar, zzbtp zzbtpVar) {
        super(zzbqwVar, zzbroVar, zzbrxVar, zzbshVar, zzbreVar, zzbtwVar, zzbwiVar, zzbsuVar, zzbwdVar, zzbtpVar);
        this.zzgho = zzbtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsb, com.google.android.gms.internal.ads.zzalv
    public final void onAdImpression() {
        this.zzgho.zzaiy();
    }
}
