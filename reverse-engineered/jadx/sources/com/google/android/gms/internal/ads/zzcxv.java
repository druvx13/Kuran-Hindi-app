package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxv implements zzdak<zzcxw> {
    private final zzdrh zzfur;
    private final Context zzvf;

    public zzcxv(Context context, zzdrh zzdrhVar) {
        this.zzvf = context;
        this.zzfur = zzdrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcxw> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcxy
            private final zzcxv zzgne;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgne = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzwr;
                String zzwt;
                String str;
                com.google.android.gms.ads.internal.zzq.zzkw();
                zzqp zzwp = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzwp();
                Bundle bundle = null;
                if (zzwp != null && zzwp != null && (!com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzwq() || !com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzws())) {
                    if (zzwp.zzml()) {
                        zzwp.wakeup();
                    }
                    zzqj zzmj = zzwp.zzmj();
                    if (zzmj != null) {
                        zzwr = zzmj.zzly();
                        str = zzmj.zzlz();
                        zzwt = zzmj.zzma();
                        if (zzwr != null) {
                            com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzeh(zzwr);
                        }
                        if (zzwt != null) {
                            com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzei(zzwt);
                        }
                    } else {
                        zzwr = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzwr();
                        zzwt = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzwt();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzws()) {
                        if (zzwt != null && !TextUtils.isEmpty(zzwt)) {
                            bundle2.putString("v_fp_vertical", zzwt);
                        } else {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        }
                    }
                    if (zzwr != null && !com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzwq()) {
                        bundle2.putString("fingerprint", zzwr);
                        if (!zzwr.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzcxw(bundle);
            }
        });
    }
}
