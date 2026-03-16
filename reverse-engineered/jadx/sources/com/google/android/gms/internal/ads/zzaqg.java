package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzaqg extends zzaqa {
    private final /* synthetic */ UpdateImpressionUrlsCallback zzdlm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqg(zzaqd zzaqdVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzdlm = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void onSuccess(List<Uri> list) {
        this.zzdlm.onSuccess(list);
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void onError(String str) {
        this.zzdlm.onFailure(str);
    }
}
