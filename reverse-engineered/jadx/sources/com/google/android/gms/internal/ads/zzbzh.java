package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzh implements zzegz<zzcdt> {
    private final zzbza zzfqw;

    public zzbzh(zzbza zzbzaVar) {
        this.zzfqw = zzbzaVar;
    }

    public static zzcdt zza(zzbza zzbzaVar) {
        return (zzcdt) zzehf.zza(zzbzaVar.zzakp(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfqw);
    }
}
