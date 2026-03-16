package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsf;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcry<AdT, AdapterT, ListenerT extends zzbsf> implements zzegz<zzcru<AdT, AdapterT, ListenerT>> {
    private final zzehm<zzcnk<AdapterT, ListenerT>> zzffw;
    private final zzehm<zzdrh> zzfjj;
    private final zzehm<zzdku> zzfju;
    private final zzehm<zzcnm<AdT, AdapterT, ListenerT>> zzght;

    private zzcry(zzehm<zzdku> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzcnk<AdapterT, ListenerT>> zzehmVar3, zzehm<zzcnm<AdT, AdapterT, ListenerT>> zzehmVar4) {
        this.zzfju = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzffw = zzehmVar3;
        this.zzght = zzehmVar4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbsf> zzcry<AdT, AdapterT, ListenerT> zzd(zzehm<zzdku> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzcnk<AdapterT, ListenerT>> zzehmVar3, zzehm<zzcnm<AdT, AdapterT, ListenerT>> zzehmVar4) {
        return new zzcry<>(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcru(this.zzfju.get(), this.zzfjj.get(), this.zzffw.get(), this.zzght.get());
    }
}
