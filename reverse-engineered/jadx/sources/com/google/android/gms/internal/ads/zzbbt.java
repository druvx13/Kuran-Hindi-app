package com.google.android.gms.internal.ads;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbbt implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbt(zzbbu zzbbuVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
