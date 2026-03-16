package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpw;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdrq extends zzdpw.zzj<Void> implements Runnable {
    private final Runnable zzhim;

    public zzdrq(Runnable runnable) {
        this.zzhim = (Runnable) zzdoj.checkNotNull(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzhim.run();
        } catch (Throwable th) {
            setException(th);
            throw zzdom.zzh(th);
        }
    }
}
