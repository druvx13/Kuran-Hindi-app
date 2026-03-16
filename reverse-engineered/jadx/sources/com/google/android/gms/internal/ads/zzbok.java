package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbok implements zzegz<String> {
    private final zzboi zzflg;

    private zzbok(zzboi zzboiVar) {
        this.zzflg = zzboiVar;
    }

    public static zzbok zza(zzboi zzboiVar) {
        return new zzbok(zzboiVar);
    }

    public static String zzb(zzboi zzboiVar) {
        return (String) zzehf.zza(zzboiVar.zzaig(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzflg);
    }
}
