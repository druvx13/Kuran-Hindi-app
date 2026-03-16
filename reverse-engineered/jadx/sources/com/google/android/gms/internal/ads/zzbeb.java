package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbeb implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzeho;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeb(JsResult jsResult) {
        this.zzeho = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzeho.cancel();
    }
}
