package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbre extends zzbui<zzbrb> implements zzbrb {
    public zzbre(zzbri zzbriVar, Set<zzbvt<zzbrb>> set, Executor executor) {
        super(set);
        zza(zzbriVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(final int i, final String str) {
        zza(new zzbuk(i, str) { // from class: com.google.android.gms.internal.ads.zzbrd
            private final String zzdbv;
            private final int zzdzl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzl = i;
                this.zzdbv = str;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrb) obj).zzf(this.zzdzl, this.zzdbv);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zza(final zzbxy zzbxyVar) {
        zza(new zzbuk(zzbxyVar) { // from class: com.google.android.gms.internal.ads.zzbrg
            private final zzbxy zzfng;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfng = zzbxyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbrb) obj).zza(this.zzfng);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzais() {
        zza(zzbrf.zzfnf);
    }
}
