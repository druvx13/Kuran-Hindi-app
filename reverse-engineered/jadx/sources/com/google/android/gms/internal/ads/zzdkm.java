package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdkm<O> {
    private final E zzgyz;
    private final String zzgza;
    private final List<zzdri<?>> zzgze;
    final /* synthetic */ zzdkg zzgzf;
    private final zzdri<?> zzgzi;
    private final zzdri<O> zzgzj;

    private zzdkm(zzdkg zzdkgVar, E e, String str, zzdri<?> zzdriVar, List<zzdri<?>> list, zzdri<O> zzdriVar2) {
        this.zzgzf = zzdkgVar;
        this.zzgyz = e;
        this.zzgza = str;
        this.zzgzi = zzdriVar;
        this.zzgze = list;
        this.zzgzj = zzdriVar2;
    }

    public final zzdkm<O> zzgv(String str) {
        return new zzdkm<>(this.zzgzf, this.zzgyz, str, this.zzgzi, this.zzgze, this.zzgzj);
    }

    public final <O2> zzdkm<O2> zzb(final zzdkb<O, O2> zzdkbVar) {
        return zza(new zzdqj(zzdkbVar) { // from class: com.google.android.gms.internal.ads.zzdkl
            private final zzdkb zzgzh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzh = zzdkbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return zzdqw.zzag(this.zzgzh.apply(obj));
            }
        });
    }

    public final <O2> zzdkm<O2> zza(zzdqj<O, O2> zzdqjVar) {
        return zza(zzdqjVar, zzdkg.zza(this.zzgzf));
    }

    private final <O2> zzdkm<O2> zza(zzdqj<O, O2> zzdqjVar, Executor executor) {
        return new zzdkm<>(this.zzgzf, this.zzgyz, this.zzgza, this.zzgzi, this.zzgze, zzdqw.zzb(this.zzgzj, zzdqjVar, executor));
    }

    public final <O2> zzdkm<O2> zze(final zzdri<O2> zzdriVar) {
        return zza(new zzdqj(zzdriVar) { // from class: com.google.android.gms.internal.ads.zzdko
            private final zzdri zzfvm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfvm = zzdriVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzfvm;
            }
        }, zzbab.zzdzw);
    }

    public final <T extends Throwable> zzdkm<O> zza(Class<T> cls, final zzdkb<T, O> zzdkbVar) {
        return zza(cls, new zzdqj(zzdkbVar) { // from class: com.google.android.gms.internal.ads.zzdkn
            private final zzdkb zzgzh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzh = zzdkbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return zzdqw.zzag(this.zzgzh.apply((Throwable) obj));
            }
        });
    }

    public final <T extends Throwable> zzdkm<O> zza(Class<T> cls, zzdqj<T, O> zzdqjVar) {
        zzdkg zzdkgVar = this.zzgzf;
        return new zzdkm<>(zzdkgVar, this.zzgyz, this.zzgza, this.zzgzi, this.zzgze, zzdqw.zzb(this.zzgzj, cls, zzdqjVar, zzdkg.zza(zzdkgVar)));
    }

    public final zzdkm<O> zza(long j, TimeUnit timeUnit) {
        zzdkg zzdkgVar = this.zzgzf;
        return new zzdkm<>(zzdkgVar, this.zzgyz, this.zzgza, this.zzgzi, this.zzgze, zzdqw.zza(this.zzgzj, j, timeUnit, zzdkg.zzb(zzdkgVar)));
    }

    public final zzdkd<E, O> zzaud() {
        E e = this.zzgyz;
        String str = this.zzgza;
        if (str == null) {
            str = this.zzgzf.zzv(e);
        }
        final zzdkd<E, O> zzdkdVar = new zzdkd<>(e, str, this.zzgzj);
        zzdkg.zzc(this.zzgzf).zza(zzdkdVar);
        this.zzgzi.addListener(new Runnable(this, zzdkdVar) { // from class: com.google.android.gms.internal.ads.zzdkq
            private final zzdkm zzgzm;
            private final zzdkd zzgzn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzm = this;
                this.zzgzn = zzdkdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdks zzdksVar;
                zzdkm zzdkmVar = this.zzgzm;
                zzdkd zzdkdVar2 = this.zzgzn;
                zzdksVar = zzdkmVar.zzgzf.zzgzd;
                zzdksVar.zzb(zzdkdVar2);
            }
        }, zzbab.zzdzw);
        zzdqw.zza(zzdkdVar, new zzdkp(this, zzdkdVar), zzbab.zzdzw);
        return zzdkdVar;
    }

    public final zzdkm<O> zzw(E e) {
        return this.zzgzf.zza((zzdkg) e, (zzdri) zzaud());
    }
}
