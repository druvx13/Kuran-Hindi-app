package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyu implements zzdak<zzcyr> {
    private final zzdrh zzglk;
    private final Set<String> zzgly;
    private final Context zzvf;

    public zzcyu(zzdrh zzdrhVar, Context context, Set<String> set) {
        this.zzglk = zzdrhVar;
        this.zzvf = context;
        this.zzgly = set;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcyr> zzaqa() {
        return this.zzglk.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcyt
            private final zzcyu zzgnl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnl = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgnl.zzaqj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcyr zzaqj() throws Exception {
        boolean zze;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqw)).booleanValue()) {
            zze = zzcyr.zze(this.zzgly);
            if (zze) {
                return new zzcyr(com.google.android.gms.ads.internal.zzq.zzll().getVersion(this.zzvf));
            }
        }
        return new zzcyr(null);
    }
}
