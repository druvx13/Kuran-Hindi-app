package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbiz implements zzegz<zzalc> {
    private final zzbiv zzffn;

    public zzbiz(zzbiv zzbivVar) {
        this.zzffn = zzbivVar;
    }

    public static zzalc zzb(zzbiv zzbivVar) {
        return (zzalc) zzehf.zza(zzbivVar.zzadx(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzffn);
    }
}
