package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdco implements zzegz<String> {
    private final zzdcl zzgpz;

    public zzdco(zzdcl zzdclVar) {
        this.zzgpz = zzdclVar;
    }

    public static String zzc(zzdcl zzdclVar) {
        return (String) zzehf.zza(zzdclVar.zzaqv(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzc(this.zzgpz);
    }
}
