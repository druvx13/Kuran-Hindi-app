package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqo implements zzegz<String> {
    private final zzehm<zzbpc> zzeqe;
    private final zzbqj zzfmy;

    private zzbqo(zzbqj zzbqjVar, zzehm<zzbpc> zzehmVar) {
        this.zzfmy = zzbqjVar;
        this.zzeqe = zzehmVar;
    }

    public static zzbqo zzb(zzbqj zzbqjVar, zzehm<zzbpc> zzehmVar) {
        return new zzbqo(zzbqjVar, zzehmVar);
    }

    public static String zza(zzbqj zzbqjVar, zzbpc zzbpcVar) {
        return (String) zzehf.zza(zzbpcVar.zzvu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfmy, this.zzeqe.get());
    }
}
