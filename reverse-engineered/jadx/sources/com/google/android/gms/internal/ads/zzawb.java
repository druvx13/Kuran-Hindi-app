package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzawb {
    private long zzdti = -1;
    private long zzdtj = -1;
    private final /* synthetic */ zzawc zzdtk;

    public zzawb(zzawc zzawcVar) {
        this.zzdtk = zzawcVar;
    }

    public final long zzvo() {
        return this.zzdtj;
    }

    public final void zzvp() {
        Clock clock;
        clock = this.zzdtk.zzbnt;
        this.zzdtj = clock.elapsedRealtime();
    }

    public final void zzvq() {
        Clock clock;
        clock = this.zzdtk.zzbnt;
        this.zzdti = clock.elapsedRealtime();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzdti);
        bundle.putLong("tclose", this.zzdtj);
        return bundle;
    }
}
