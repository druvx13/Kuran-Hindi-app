package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcp implements Runnable {
    private zzcp() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzcn.zza(MessageDigest.getInstance("MD5"));
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            zzcn.zznj.countDown();
        }
    }
}
