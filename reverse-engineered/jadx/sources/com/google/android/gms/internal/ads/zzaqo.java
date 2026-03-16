package com.google.android.gms.internal.ads;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaqo implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzaqm zzdlu;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdlv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqo(zzaqm zzaqmVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdlu = zzaqmVar;
        this.zzdlv = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzdlu.zza(thread, th);
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzdlv;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            zzazw.zzfa("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzdlv;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
