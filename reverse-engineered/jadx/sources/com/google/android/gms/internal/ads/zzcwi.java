package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwi implements zzdak<zzdah<Bundle>> {
    private final Executor executor;
    private final zzawd zzbnp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwi(Executor executor, zzawd zzawdVar) {
        this.executor = executor;
        this.zzbnp = zzawdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdah<Bundle>> zzaqa() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcnw)).booleanValue()) {
            return zzdqw.zzag(null);
        }
        return zzdqw.zzb(this.zzbnp.zzwc(), zzcwh.zzdsc, this.executor);
    }
}
