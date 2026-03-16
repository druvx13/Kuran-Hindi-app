package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyn implements zzegz<zzbyl> {
    private final zzbyl zzfpr;

    private zzbyn(zzbyl zzbylVar) {
        this.zzfpr = zzbylVar;
    }

    public static zzbyn zze(zzbyl zzbylVar) {
        return new zzbyn(zzbylVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        zzbyl zzbylVar = this.zzfpr;
        if (zzbylVar != null) {
            return (zzbyl) zzehf.zza(zzbylVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
