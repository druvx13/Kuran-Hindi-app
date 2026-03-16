package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcrz implements zzbsi {
    private boolean zzghu = false;
    private final /* synthetic */ zzbaj zzghv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcrz(zzcru zzcruVar, zzbaj zzbajVar) {
        this.zzghv = zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void onAdFailedToLoad(int i) {
        if (this.zzghu) {
            return;
        }
        zzh(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final synchronized void zzg(int i, String str) {
        this.zzghu = true;
        zzh(i, str);
    }

    private final void zzh(int i, String str) {
        this.zzghv.setException(new zzcnn(((Boolean) zzvj.zzpv().zzd(zzzz.zzcrn)).booleanValue() ? 3 : i, i, str));
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final synchronized void onAdLoaded() {
        this.zzghv.set(null);
    }
}
