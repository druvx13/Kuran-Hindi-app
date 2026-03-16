package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbro extends zzbui<zzbrp> {
    private boolean zzfnh;

    public zzbro(Set<zzbvt<zzbrp>> set) {
        super(set);
        this.zzfnh = false;
    }

    public final synchronized void onAdImpression() {
        if (!this.zzfnh) {
            zza(zzbrn.zzfnf);
            this.zzfnh = true;
        }
    }
}
