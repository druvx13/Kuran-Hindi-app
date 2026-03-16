package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaqi {
    @Nonnull
    private View zzaae;
    private final Map<String, WeakReference<View>> zzdli = new HashMap();

    public final zzaqi zzk(View view) {
        this.zzaae = view;
        return this;
    }

    public final zzaqi zzh(Map<String, View> map) {
        this.zzdli.clear();
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.zzdli.put(entry.getKey(), new WeakReference<>(value));
            }
        }
        return this;
    }
}
