package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafi implements zzaga<Object> {
    private final zzafl zzczw;

    public zzafi(zzafl zzaflVar) {
        this.zzczw = zzaflVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzawr.zzfc("App event with no name parameter.");
        } else {
            this.zzczw.onAppEvent(str, map.get("info"));
        }
    }
}
