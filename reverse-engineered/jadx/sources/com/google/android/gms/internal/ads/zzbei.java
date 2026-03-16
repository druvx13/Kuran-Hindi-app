package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbei implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzehp;
    private final /* synthetic */ EditText zzehr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbei(JsPromptResult jsPromptResult, EditText editText) {
        this.zzehp = jsPromptResult;
        this.zzehr = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzehp.confirm(this.zzehr.getText().toString());
    }
}
