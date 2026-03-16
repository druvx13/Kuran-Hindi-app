package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcb implements zzdak<zzdcc> {
    List<String> zzdmi;
    private zzdrh zzfur;
    zzzl zzgpu;

    public zzdcb(zzzl zzzlVar, zzdrh zzdrhVar, List<String> list) {
        this.zzgpu = zzzlVar;
        this.zzfur = zzdrhVar;
        this.zzdmi = list;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdcc> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdce
            private final zzdcb zzgpv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpv = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdcb zzdcbVar = this.zzgpv;
                return new zzdcc(zzdcbVar.zzgpu.zze(zzdcbVar.zzdmi));
            }
        });
    }
}
