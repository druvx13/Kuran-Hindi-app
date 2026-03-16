package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbth extends zzbui<zzbtm> implements zzbtm {
    public zzbth(Set<zzbvt<zzbtm>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzd(final zzarj zzarjVar) {
        zza(new zzbuk(zzarjVar) { // from class: com.google.android.gms.internal.ads.zzbtk
            private final zzarj zzfnq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnq = zzarjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbtm) obj).zzd(this.zzfnq);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzb(final zzdha zzdhaVar) {
        zza(new zzbuk(zzdhaVar) { // from class: com.google.android.gms.internal.ads.zzbtj
            private final zzdha zzfnp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfnp = zzdhaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbuk
            public final void zzp(Object obj) {
                ((zzbtm) obj).zzb(this.zzfnp);
            }
        });
    }
}
