package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczc implements zzdak<zzcyz> {
    private final Bundle zzfmv;
    private final zzdrh zzfur;

    public zzczc(zzdrh zzdrhVar, Bundle bundle) {
        this.zzfur = zzdrhVar;
        this.zzfmv = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcyz> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzczb
            private final zzczc zzgnn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnn = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgnn.zzaqk();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcyz zzaqk() throws Exception {
        return new zzcyz(this.zzfmv);
    }
}
