package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcpd implements zzbxz {
    private zzbro zzfpi = null;
    private final zzdgo zzfpj;
    private final zzanv zzgfv;
    private final boolean zzgfw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpd(zzdgo zzdgoVar, zzanv zzanvVar, boolean z) {
        this.zzfpj = zzdgoVar;
        this.zzgfv = zzanvVar;
        this.zzgfw = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbxz
    public final void zza(boolean z, Context context) throws zzbxy {
        boolean zzz;
        try {
            if (this.zzgfw) {
                zzz = this.zzgfv.zzaa(ObjectWrapper.wrap(context));
            } else {
                zzz = this.zzgfv.zzz(ObjectWrapper.wrap(context));
            }
            if (!zzz) {
                throw new zzbxy("Adapter failed to show.");
            }
            if (this.zzfpi != null && this.zzfpj.zzgub == 2) {
                this.zzfpi.onAdImpression();
            }
        } catch (Throwable th) {
            throw new zzbxy(th);
        }
    }

    public final void zza(zzbro zzbroVar) {
        this.zzfpi = zzbroVar;
    }
}
