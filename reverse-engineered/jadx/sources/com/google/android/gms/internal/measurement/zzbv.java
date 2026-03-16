package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
public final class zzbv extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbv(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = zzbw.zze;
        atomicBoolean.set(true);
    }
}
