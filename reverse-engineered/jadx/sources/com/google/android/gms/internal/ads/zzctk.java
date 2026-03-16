package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzctk implements zzbtb {
    private final AtomicReference<zzxf> zzgjn = new AtomicReference<>();

    public final void zzb(zzxf zzxfVar) {
        this.zzgjn.set(zzxfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtb
    public final void zzb(final zzuo zzuoVar) {
        zzdek.zza(this.zzgjn, new zzdej(zzuoVar) { // from class: com.google.android.gms.internal.ads.zzctn
            private final zzuo zzgjr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgjr = zzuoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdej
            public final void zzr(Object obj) {
                ((zzxf) obj).zza(this.zzgjr);
            }
        });
    }
}
