package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzaqf extends zzaqa {
    private final /* synthetic */ UpdateClickUrlCallback zzdll;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqf(zzaqd zzaqdVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzdll = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void onSuccess(List<Uri> list) {
        this.zzdll.onSuccess(list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.zzapx
    public final void onError(String str) {
        this.zzdll.onFailure(str);
    }
}
