package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhd implements zzegz<WeakReference<Context>> {
    private final zzbhb zzeni;

    public zzbhd(zzbhb zzbhbVar) {
        this.zzeni = zzbhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (WeakReference) zzehf.zza(this.zzeni.zzadm(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
