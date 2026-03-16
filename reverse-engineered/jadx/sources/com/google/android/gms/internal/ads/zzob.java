package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzob {
    private final ExecutorService zzbgo;
    private zzod<? extends zzog> zzbgp;
    private IOException zzbgq;

    public zzob(String str) {
        this.zzbgo = zzov.zzbg(str);
    }

    public final <T extends zzog> long zza(T t, zzoe<T> zzoeVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzoh.checkState(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzod(this, myLooper, t, zzoeVar, i, elapsedRealtime).zzek(0L);
        return elapsedRealtime;
    }

    public final boolean isLoading() {
        return this.zzbgp != null;
    }

    public final void zzir() {
        this.zzbgp.zzl(false);
    }

    public final void zza(Runnable runnable) {
        zzod<? extends zzog> zzodVar = this.zzbgp;
        if (zzodVar != null) {
            zzodVar.zzl(true);
        }
        this.zzbgo.execute(runnable);
        this.zzbgo.shutdown();
    }

    public final void zzbd(int i) throws IOException {
        IOException iOException = this.zzbgq;
        if (iOException != null) {
            throw iOException;
        }
        zzod<? extends zzog> zzodVar = this.zzbgp;
        if (zzodVar != null) {
            zzodVar.zzbd(zzodVar.zzbgv);
        }
    }
}
