package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbx implements zzdak<zzdby> {
    private String packageName;
    private zzdrh zzfur;
    private zzavv zzgpr;

    public zzdbx(zzavv zzavvVar, zzdrh zzdrhVar, String str) {
        this.zzgpr = zzavvVar;
        this.zzfur = zzdrhVar;
        this.packageName = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdby> zzaqa() {
        new zzbaj();
        final zzdri<String> zzag = zzdqw.zzag(null);
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcsf)).booleanValue()) {
            zzag = this.zzgpr.zzee(this.packageName);
        }
        final zzdri<String> zzef = this.zzgpr.zzef(this.packageName);
        return zzdqw.zzb(zzag, zzef).zza(new Callable(zzag, zzef) { // from class: com.google.android.gms.internal.ads.zzdca
            private final zzdri zzfmu;
            private final zzdri zzfvm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvm = zzag;
                this.zzfmu = zzef;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzdby((String) this.zzfvm.get(), (String) this.zzfmu.get());
            }
        }, zzbab.zzdzr);
    }
}
