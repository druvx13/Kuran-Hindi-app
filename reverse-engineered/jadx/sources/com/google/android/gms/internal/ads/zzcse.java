package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcse implements com.google.android.gms.ads.internal.zze {
    private final zzbvx zzfjc;
    private final zzbro zzfqc;
    private final zzbqw zzfqd;
    private final zzbkp zzfqe;
    private final zzbvs zzfqg;
    private AtomicBoolean zzgic = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcse(zzbqw zzbqwVar, zzbro zzbroVar, zzbvx zzbvxVar, zzbvs zzbvsVar, zzbkp zzbkpVar) {
        this.zzfqd = zzbqwVar;
        this.zzfqc = zzbroVar;
        this.zzfjc = zzbvxVar;
        this.zzfqg = zzbvsVar;
        this.zzfqe = zzbkpVar;
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final synchronized void zzh(View view) {
        if (this.zzgic.compareAndSet(false, true)) {
            this.zzfqe.onAdImpression();
            this.zzfqg.zzu(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjy() {
        if (this.zzgic.get()) {
            this.zzfqd.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final void zzjz() {
        if (this.zzgic.get()) {
            this.zzfqc.onAdImpression();
            this.zzfjc.zzajr();
        }
    }
}
