package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdkk {
    private final E zzgyz;
    private final /* synthetic */ zzdkg zzgzf;

    private zzdkk(zzdkg zzdkgVar, E e) {
        this.zzgzf = zzdkgVar;
        this.zzgyz = e;
    }

    public final <O> zzdkm<O> zze(zzdri<O> zzdriVar) {
        zzdri zzdriVar2;
        zzdkg zzdkgVar = this.zzgzf;
        E e = this.zzgyz;
        zzdriVar2 = zzdkg.zzgzc;
        return new zzdkm<>(zzdkgVar, e, zzdriVar2, Collections.emptyList(), zzdriVar);
    }

    public final <O> zzdkm<O> zzc(Callable<O> callable) {
        zzdrh zzdrhVar;
        zzdrhVar = this.zzgzf.zzfur;
        return zza(callable, zzdrhVar);
    }

    private final <O> zzdkm<O> zza(Callable<O> callable, zzdrh zzdrhVar) {
        zzdri zzdriVar;
        zzdkg zzdkgVar = this.zzgzf;
        E e = this.zzgyz;
        zzdriVar = zzdkg.zzgzc;
        return new zzdkm<>(zzdkgVar, e, zzdriVar, Collections.emptyList(), zzdrhVar.zzd(callable));
    }

    public final zzdkm<?> zza(final zzdke zzdkeVar, zzdrh zzdrhVar) {
        return zza(new Callable(zzdkeVar) { // from class: com.google.android.gms.internal.ads.zzdkj
            private final zzdke zzgzg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzg = zzdkeVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.zzgzg.run();
                return null;
            }
        }, zzdrhVar);
    }
}
