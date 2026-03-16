package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczr implements zzdak<zzczs> {
    private final zzauu zzboj;
    private final zzdrh zzfur;
    private final Context zzvf;

    public zzczr(zzauu zzauuVar, zzdrh zzdrhVar, Context context) {
        this.zzboj = zzauuVar;
        this.zzfur = zzdrhVar;
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzczs> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzczu
            private final zzczr zzgoa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgoa = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgoa.zzaqn();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzczs zzaqn() throws Exception {
        if (!this.zzboj.zzab(this.zzvf)) {
            return new zzczs(null, null, null, null, null);
        }
        String zzae = this.zzboj.zzae(this.zzvf);
        String str = zzae == null ? "" : zzae;
        String zzaf = this.zzboj.zzaf(this.zzvf);
        String str2 = zzaf == null ? "" : zzaf;
        String zzag = this.zzboj.zzag(this.zzvf);
        String str3 = zzag == null ? "" : zzag;
        String zzah = this.zzboj.zzah(this.zzvf);
        return new zzczs(str, str2, str3, zzah == null ? "" : zzah, "TIME_OUT".equals(str2) ? (Long) zzvj.zzpv().zzd(zzzz.zzckr) : null);
    }
}
