package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzail {
    private final zzaio zzdbx;

    private zzail(zzaio zzaioVar) {
        this.zzdbx = zzaioVar;
    }

    @JavascriptInterface
    public final void notify(String str) {
        this.zzdbx.zzde(str);
    }
}
