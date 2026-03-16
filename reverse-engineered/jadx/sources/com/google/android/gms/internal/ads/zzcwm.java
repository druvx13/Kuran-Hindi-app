package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwm implements zzdak<Object> {
    private static final Object lock = new Object();
    private final String zzcgc;
    private final String zzdma;
    private final zzdhe zzfll;
    private final zzbpc zzgmg;
    private final zzdhy zzgmh;

    public zzcwm(String str, String str2, zzbpc zzbpcVar, zzdhy zzdhyVar, zzdhe zzdheVar) {
        this.zzdma = str;
        this.zzcgc = str2;
        this.zzgmg = zzbpcVar;
        this.zzgmh = zzdhyVar;
        this.zzfll = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<Object> zzaqa() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcru)).booleanValue()) {
            this.zzgmg.zzf(this.zzfll.zzguw);
            bundle.putAll(this.zzgmh.zzash());
        }
        return zzdqw.zzag(new zzdah(this, bundle) { // from class: com.google.android.gms.internal.ads.zzcwl
            private final Bundle zzdtb;
            private final zzcwm zzgmf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmf = this;
                this.zzdtb = bundle;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj) {
                this.zzgmf.zzb(this.zzdtb, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, Bundle bundle2) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcru)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcrt)).booleanValue()) {
                synchronized (lock) {
                    this.zzgmg.zzf(this.zzfll.zzguw);
                    bundle2.putBundle("quality_signals", this.zzgmh.zzash());
                }
            } else {
                this.zzgmg.zzf(this.zzfll.zzguw);
                bundle2.putBundle("quality_signals", this.zzgmh.zzash());
            }
        }
        bundle2.putString("seq_num", this.zzdma);
        bundle2.putString("session_id", this.zzcgc);
    }
}
