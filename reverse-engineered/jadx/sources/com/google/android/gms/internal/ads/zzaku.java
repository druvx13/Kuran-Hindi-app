package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaku {
    private zzajf zzdeg;
    private zzdri<zzakd> zzdeh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaku(zzajf zzajfVar) {
        this.zzdeg = zzajfVar;
    }

    private final void zztd() {
        if (this.zzdeh == null) {
            final zzbaj zzbajVar = new zzbaj();
            this.zzdeh = zzbajVar;
            this.zzdeg.zzb((zzdt) null).zza(new zzban(zzbajVar) { // from class: com.google.android.gms.internal.ads.zzakx
                private final zzbaj zzbsx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbsx = zzbajVar;
                }

                @Override // com.google.android.gms.internal.ads.zzban
                public final void zzh(Object obj) {
                    this.zzbsx.set((zzakd) obj);
                }
            }, new zzbal(zzbajVar) { // from class: com.google.android.gms.internal.ads.zzakw
                private final zzbaj zzbsx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbsx = zzbajVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbal
                public final void run() {
                    this.zzbsx.setException(new zzake("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> zzalb<I, O> zzb(String str, zzaki<I> zzakiVar, zzakj<O> zzakjVar) {
        zztd();
        return new zzalb<>(this.zzdeh, str, zzakiVar, zzakjVar);
    }

    public final void zzc(final String str, final zzaga<? super zzakd> zzagaVar) {
        zztd();
        this.zzdeh = zzdqw.zzb(this.zzdeh, new zzdqj(str, zzagaVar) { // from class: com.google.android.gms.internal.ads.zzakz
            private final zzaga zzdbz;
            private final String zzdcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = str;
                this.zzdbz = zzagaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                zzakd zzakdVar = (zzakd) obj;
                zzakdVar.zza(this.zzdcd, this.zzdbz);
                return zzdqw.zzag(zzakdVar);
            }
        }, zzbab.zzdzw);
    }

    public final void zzd(final String str, final zzaga<? super zzakd> zzagaVar) {
        this.zzdeh = zzdqw.zzb(this.zzdeh, new zzdnx(str, zzagaVar) { // from class: com.google.android.gms.internal.ads.zzaky
            private final zzaga zzdbz;
            private final String zzdcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = str;
                this.zzdbz = zzagaVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                zzakd zzakdVar = (zzakd) obj;
                zzakdVar.zzb(this.zzdcd, this.zzdbz);
                return zzakdVar;
            }
        }, zzbab.zzdzw);
    }
}
