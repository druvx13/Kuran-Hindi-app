package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmg implements zzegz<zzbnt> {
    private final zzbma zzfjo;

    public zzbmg(zzbma zzbmaVar) {
        this.zzfjo = zzbmaVar;
    }

    public static zzbnt zzb(zzbma zzbmaVar) {
        return (zzbnt) zzehf.zza(zzbmaVar.zzahm(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzfjo);
    }
}
