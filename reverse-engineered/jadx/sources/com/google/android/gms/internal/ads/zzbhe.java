package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhe implements zzegz<Context> {
    private final zzbhb zzeni;

    public zzbhe(zzbhb zzbhbVar) {
        this.zzeni = zzbhbVar;
    }

    public static Context zza(zzbhb zzbhbVar) {
        return (Context) zzehf.zza(zzbhbVar.zzadl(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzeni);
    }
}
