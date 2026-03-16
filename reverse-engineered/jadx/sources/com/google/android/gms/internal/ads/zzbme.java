package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbme implements zzegz<View> {
    private final zzbma zzfjo;

    public zzbme(zzbma zzbmaVar) {
        this.zzfjo = zzbmaVar;
    }

    public static View zza(zzbma zzbmaVar) {
        return (View) zzehf.zza(zzbmaVar.zzahe(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfjo);
    }
}
