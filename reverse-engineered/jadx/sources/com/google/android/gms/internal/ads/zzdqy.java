package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqy<V> implements Runnable {
    private final Future<V> zzhhx;
    private final zzdqx<? super V> zzhhy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqy(Future<V> future, zzdqx<? super V> zzdqxVar) {
        this.zzhhx = future;
        this.zzhhy = zzdqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future<V> future = this.zzhhx;
        if ((future instanceof zzdrz) && (zza = zzdsc.zza((zzdrz) future)) != null) {
            this.zzhhy.zzb(zza);
            return;
        }
        try {
            this.zzhhy.onSuccess(zzdqw.zza(this.zzhhx));
        } catch (Error e) {
            e = e;
            this.zzhhy.zzb(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzhhy.zzb(e);
        } catch (ExecutionException e3) {
            this.zzhhy.zzb(e3.getCause());
        }
    }

    public final String toString() {
        return zzdoa.zzx(this).zzy(this.zzhhy).toString();
    }
}
