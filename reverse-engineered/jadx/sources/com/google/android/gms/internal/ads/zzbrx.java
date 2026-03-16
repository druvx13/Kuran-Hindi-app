package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbrx extends zzbui<zzbqx> {
    public zzbrx(Set<zzbvt<zzbqx>> set) {
        super(set);
    }

    public final void onAdClosed() {
        zza(zzbsa.zzfnf);
    }

    public final void onAdLeftApplication() {
        zza(zzbrz.zzfnf);
    }

    public final void onAdOpened() {
        zza(zzbsc.zzfnf);
    }

    public final void onRewardedVideoStarted() {
        zza(zzbsb.zzfnf);
    }

    public final void zzb(final zzasd zzasdVar, final String str, final String str2) {
        zza(new zzbuk(zzasdVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbse
            private final String zzdbv;
            private final String zzdep;
            private final zzasd zzfnj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnj = zzasdVar;
                this.zzdbv = str;
                this.zzdep = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbqx) obj).zzb(this.zzfnj, this.zzdbv, this.zzdep);
            }
        });
    }

    public final void onRewardedVideoCompleted() {
        zza(zzbsd.zzfnf);
    }
}
