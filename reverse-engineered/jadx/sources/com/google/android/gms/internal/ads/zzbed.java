package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbed implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzeho;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbed(JsResult jsResult) {
        this.zzeho = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzeho.confirm();
    }
}
