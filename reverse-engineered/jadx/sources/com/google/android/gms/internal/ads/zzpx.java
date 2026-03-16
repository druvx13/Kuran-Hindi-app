package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpx extends BroadcastReceiver {
    private final /* synthetic */ zzpv zzboz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpx(zzpv zzpvVar) {
        this.zzboz = zzpvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzboz.zzbo(3);
    }
}
