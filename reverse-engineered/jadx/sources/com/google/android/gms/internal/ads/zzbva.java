package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbva implements zzegz<zzbuj> {
    private final zzbuj zzfoh;

    private zzbva(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbva zzv(zzbuj zzbujVar) {
        return new zzbva(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        zzbuj zzbujVar = this.zzfoh;
        if (zzbujVar != null) {
            return (zzbuj) zzehf.zza(zzbujVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
