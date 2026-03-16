package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzoy implements ThreadFactory {
    private final /* synthetic */ String zzbia;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzoy(String str) {
        this.zzbia = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.zzbia);
    }
}
