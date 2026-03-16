package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzdns extends Handler {
    private static zzdnr zzhdp;

    public zzdns() {
    }

    public zzdns(Looper looper) {
        super(looper);
    }

    public zzdns(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        zzb(message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzb(Message message) {
        super.dispatchMessage(message);
    }
}
