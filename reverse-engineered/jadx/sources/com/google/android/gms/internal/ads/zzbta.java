package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbta extends zzbui<zzbtb> implements zzbrp, zzbsr {
    private final zzdgo zzfgk;
    private AtomicBoolean zzfnm;

    public zzbta(Set<zzbvt<zzbtb>> set, zzdgo zzdgoVar) {
        super(set);
        this.zzfnm = new AtomicBoolean();
        this.zzfgk = zzdgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void onAdImpression() {
        if (this.zzfgk.zzgtl == 2 || this.zzfgk.zzgtl == 5 || this.zzfgk.zzgtl == 4) {
            zzaiu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzait() {
        if (this.zzfgk.zzgtl == 1) {
            zzaiu();
        }
    }

    private final void zzaiu() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcuh)).booleanValue() && this.zzfnm.compareAndSet(false, true) && this.zzfgk.zzgue != null && this.zzfgk.zzgue.type == 3) {
            zza(new zzbuk(this) { // from class: com.google.android.gms.internal.ads.zzbsz
                private final zzbta zzfnl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfnl = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbuk
                public final void zzp(Object obj) {
                    this.zzfnl.zza((zzbtb) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbtb zzbtbVar) throws Exception {
        zzbtbVar.zzb(this.zzfgk.zzgue);
    }
}
