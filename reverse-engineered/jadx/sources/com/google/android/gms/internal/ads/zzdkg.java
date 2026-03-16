package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdkg<E> {
    private static final zzdri<?> zzgzc = zzdqw.zzag(null);
    private final ScheduledExecutorService zzfif;
    private final zzdrh zzfur;
    private final zzdks<E> zzgzd;

    public zzdkg(zzdrh zzdrhVar, ScheduledExecutorService scheduledExecutorService, zzdks<E> zzdksVar) {
        this.zzfur = zzdrhVar;
        this.zzfif = scheduledExecutorService;
        this.zzgzd = zzdksVar;
    }

    public abstract String zzv(E e);

    public final zzdkk zzu(E e) {
        return new zzdkk(this, e);
    }

    public final <I> zzdkm<I> zza(E e, zzdri<I> zzdriVar) {
        return new zzdkm<>(this, e, zzdriVar, Collections.singletonList(zzdriVar), zzdriVar);
    }

    public final zzdki zza(E e, zzdri<?>... zzdriVarArr) {
        return new zzdki(this, e, Arrays.asList(zzdriVarArr));
    }

    public static /* synthetic */ zzdks zzc(zzdkg zzdkgVar) {
        return zzdkgVar.zzgzd;
    }
}
