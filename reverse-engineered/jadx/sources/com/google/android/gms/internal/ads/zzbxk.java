package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxk implements zzegz<View> {
    private final zzbwx zzfpa;

    private zzbxk(zzbwx zzbwxVar) {
        this.zzfpa = zzbwxVar;
    }

    public static zzbxk zzc(zzbwx zzbwxVar) {
        return new zzbxk(zzbwxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return this.zzfpa.zzajw();
    }
}
