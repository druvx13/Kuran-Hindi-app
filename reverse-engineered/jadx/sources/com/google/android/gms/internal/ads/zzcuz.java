package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcuz implements zzegz<zzdri<zzcvd>> {
    private final zzehm<zzdku> zzfju;
    private final zzehm<zzcvc> zzgld;
    private final zzehm<zzbqc> zzgle;

    public zzcuz(zzehm<zzdku> zzehmVar, zzehm<zzcvc> zzehmVar2, zzehm<zzbqc> zzehmVar3) {
        this.zzfju = zzehmVar;
        this.zzgld = zzehmVar2;
        this.zzgle = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzdri) zzehf.zza(this.zzfju.get().zza((zzdku) zzdkr.GENERATE_SIGNALS, (zzdri) this.zzgle.get().zzail()).zza(this.zzgld.get()).zza(((Integer) zzvj.zzpv().zzd(zzzz.zzcrr)).intValue(), TimeUnit.SECONDS).zzaud(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
