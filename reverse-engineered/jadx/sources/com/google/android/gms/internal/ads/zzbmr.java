package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmr implements zzegz<zzbvt<zzbtq>> {
    private final zzbma zzfjo;
    private final zzehm<zzbte> zzfjr;

    public zzbmr(zzbma zzbmaVar, zzehm<zzbte> zzehmVar) {
        this.zzfjo = zzbmaVar;
        this.zzfjr = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        final zzbte zzbteVar = this.zzfjr.get();
        return (zzbvt) zzehf.zza(new zzbvt(new zzbtq(zzbteVar) { // from class: com.google.android.gms.internal.ads.zzbmc
            private final zzbte zzfjk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfjk = zzbteVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbtq
            public final void zzaho() {
                this.zzfjk.zzaiv();
            }
        }, zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
