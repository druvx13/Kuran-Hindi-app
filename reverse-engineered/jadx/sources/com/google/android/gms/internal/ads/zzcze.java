package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcze implements zzegz<zzczc> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Bundle> zzgno;

    private zzcze(zzehm<zzdrh> zzehmVar, zzehm<Bundle> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzgno = zzehmVar2;
    }

    public static zzcze zzay(zzehm<zzdrh> zzehmVar, zzehm<Bundle> zzehmVar2) {
        return new zzcze(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzczc(this.zzenm.get(), this.zzgno.get());
    }
}
