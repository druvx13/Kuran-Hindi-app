package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbs implements zzdak<zzdbp> {
    private zzdrh zzfur;
    zzsh zzgpo;
    Context zzvf;

    public zzdbs(zzsh zzshVar, zzdrh zzdrhVar, Context context) {
        this.zzgpo = zzshVar;
        this.zzfur = zzdrhVar;
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdbp> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbr
            private final zzdbs zzgpn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpn = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdbs zzdbsVar = this.zzgpn;
                return new zzdbp(zzdbsVar.zzgpo.zzf(zzdbsVar.zzvf));
            }
        });
    }
}
