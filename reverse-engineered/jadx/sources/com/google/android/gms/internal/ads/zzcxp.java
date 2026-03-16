package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxp implements zzdak<zzcxu> {
    private final zzdrh zzfur;
    private final Context zzzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxp(Context context, zzdrh zzdrhVar) {
        this.zzzo = context;
        this.zzfur = zzdrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzcxu> zzaqa() {
        return this.zzfur.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcxs
            private final zzcxp zzgna;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgna = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgna.zzaqg();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcxu zzaqg() throws Exception {
        com.google.android.gms.ads.internal.zzq.zzkw();
        String zzaz = zzaxa.zzaz(this.zzzo);
        String string = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcsu)).booleanValue() ? this.zzzo.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzq.zzkw();
        return new zzcxu(zzaz, string, zzaxa.zzba(this.zzzo));
    }
}
