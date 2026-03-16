package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbeg implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzehp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeg(JsPromptResult jsPromptResult) {
        this.zzehp = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzehp.cancel();
    }
}
