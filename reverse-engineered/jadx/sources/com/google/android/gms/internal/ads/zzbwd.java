package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbwd extends zzbui<zzagk> implements zzagk {
    public zzbwd(Set<zzbvt<zzagk>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final synchronized void zzsm() {
        zza(zzbwc.zzfnf);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zza(final zzatc zzatcVar) {
        zza(new zzbuk(zzatcVar) { // from class: com.google.android.gms.internal.ads.zzbwf
            private final zzatc zzfop;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfop = zzatcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzagk) obj).zza(this.zzfop);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzsn() {
        zza(zzbwe.zzfnf);
    }
}
