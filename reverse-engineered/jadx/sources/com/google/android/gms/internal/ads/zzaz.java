package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaz implements zzap {
    private final /* synthetic */ Context val$appContext;
    private File zzco = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaz(Context context) {
        this.val$appContext = context;
    }

    @Override // com.google.android.gms.internal.ads.zzap
    public final File zzo() {
        if (this.zzco == null) {
            this.zzco = new File(this.val$appContext.getCacheDir(), "volley");
        }
        return this.zzco;
    }
}
