package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzqs implements Runnable {
    private final /* synthetic */ zzqp zzbrc;
    private final /* synthetic */ View zzbrd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqs(zzqp zzqpVar, View view) {
        this.zzbrc = zzqpVar;
        this.zzbrd = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbrc.zzj(this.zzbrd);
    }
}
