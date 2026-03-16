package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaot {
    private final zzbek zzdce;
    private final boolean zzdix;
    private final String zzdiy;

    public zzaot(zzbek zzbekVar, Map<String, String> map) {
        this.zzdce = zzbekVar;
        this.zzdiy = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdix = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdix = true;
        }
    }

    public final void execute() {
        int zzxk;
        if (this.zzdce == null) {
            zzawr.zzfc("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdiy)) {
            com.google.android.gms.ads.internal.zzq.zzky();
            zzxk = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdiy)) {
            com.google.android.gms.ads.internal.zzq.zzky();
            zzxk = 6;
        } else {
            zzxk = this.zzdix ? -1 : com.google.android.gms.ads.internal.zzq.zzky().zzxk();
        }
        this.zzdce.setRequestedOrientation(zzxk);
    }
}
