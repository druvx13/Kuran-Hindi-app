package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmt implements zzbrc, zzbsm {
    private static final Object zzgdh = new Object();
    private static int zzgdi = 0;
    private final zzcmy zzgdj;

    public zzcmt(zzcmy zzcmyVar) {
        this.zzgdj = zzcmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue() && zzaow()) {
            this.zzgdj.zzbl(true);
            zzaov();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(int i) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsz)).booleanValue() && zzaow()) {
            this.zzgdj.zzbl(false);
            zzaov();
        }
    }

    private static void zzaov() {
        synchronized (zzgdh) {
            zzgdi++;
        }
    }

    private static boolean zzaow() {
        boolean z;
        synchronized (zzgdh) {
            z = zzgdi < ((Integer) zzvj.zzpv().zzd(zzzz.zzcta)).intValue();
        }
        return z;
    }
}
