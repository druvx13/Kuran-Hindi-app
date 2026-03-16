package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbdy {
    private final ArrayList<zznx> zzehi = new ArrayList<>();
    private long zzehj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzaam() {
        Iterator<zznx> it = this.zzehi.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> responseHeaders = it.next().getResponseHeaders();
            if (responseHeaders != null) {
                for (Map.Entry<String, List<String>> entry : responseHeaders.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.zzehj = Math.max(this.zzehj, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.zzehj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zznx zznxVar) {
        this.zzehi.add(zznxVar);
    }
}
