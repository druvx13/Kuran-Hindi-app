package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdki {
    private final E zzgyz;
    private final List<zzdri<?>> zzgze;
    private final /* synthetic */ zzdkg zzgzf;

    private zzdki(zzdkg zzdkgVar, E e, List<zzdri<?>> list) {
        this.zzgzf = zzdkgVar;
        this.zzgyz = e;
        this.zzgze = list;
    }

    public final <O> zzdkm<O> zzb(Callable<O> callable) {
        zzdrh zzdrhVar;
        zzdrb zzk = zzdqw.zzk(this.zzgze);
        zzdri zza = zzk.zza(zzdkh.zzgnf, zzbab.zzdzw);
        zzdkg zzdkgVar = this.zzgzf;
        E e = this.zzgyz;
        List<zzdri<?>> list = this.zzgze;
        zzdrhVar = zzdkgVar.zzfur;
        return new zzdkm<>(zzdkgVar, e, zza, list, zzk.zza(callable, zzdrhVar));
    }
}
