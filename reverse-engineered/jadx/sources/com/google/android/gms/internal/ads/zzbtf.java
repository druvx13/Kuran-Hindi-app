package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbtf implements Runnable {
    private final WeakReference<zzbte> zzfno;

    private zzbtf(zzbte zzbteVar) {
        this.zzfno = new WeakReference<>(zzbteVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbte zzbteVar = this.zzfno.get();
        if (zzbteVar != null) {
            zzbte.zza(zzbteVar);
        }
    }
}
