package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzgz extends zzdns {
    private final /* synthetic */ zzgw zzafk;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgz(zzgw zzgwVar, Looper looper) {
        super(looper);
        this.zzafk = zzgwVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zzafk.zza(message);
    }
}
