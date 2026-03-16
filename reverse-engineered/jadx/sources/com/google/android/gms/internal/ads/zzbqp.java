package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqp implements zzegz<zzbqj.zza> {
    private final zzbqj zzfmy;

    private zzbqp(zzbqj zzbqjVar) {
        this.zzfmy = zzbqjVar;
    }

    public static zzbqp zzl(zzbqj zzbqjVar) {
        return new zzbqp(zzbqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbqj.zza) zzehf.zza(this.zzfmy.zzaim(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
