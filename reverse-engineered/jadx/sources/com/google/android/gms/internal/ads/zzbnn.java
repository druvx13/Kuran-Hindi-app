package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnn implements zzbsm, zzpz {
    private final zzdgo zzfgk;
    private final zzbro zzfki;
    private final zzbsq zzfkj;
    private final AtomicBoolean zzfkk = new AtomicBoolean();
    private final AtomicBoolean zzfkl = new AtomicBoolean();

    public zzbnn(zzdgo zzdgoVar, zzbro zzbroVar, zzbsq zzbsqVar) {
        this.zzfgk = zzdgoVar;
        this.zzfki = zzbroVar;
        this.zzfkj = zzbsqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final synchronized void onAdLoaded() {
        if (this.zzfgk.zzgtm != 1) {
            zzahx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza(zzqa zzqaVar) {
        if (this.zzfgk.zzgtm == 1 && zzqaVar.zzbot) {
            zzahx();
        }
        if (zzqaVar.zzbot && this.zzfkl.compareAndSet(false, true)) {
            this.zzfkj.zzait();
        }
    }

    private final void zzahx() {
        if (this.zzfkk.compareAndSet(false, true)) {
            this.zzfki.onAdImpression();
        }
    }
}
