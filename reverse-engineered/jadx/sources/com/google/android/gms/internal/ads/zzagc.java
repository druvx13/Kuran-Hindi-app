package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagc implements zzaga<Object> {
    private final Context zzvf;

    public zzagc(Context context) {
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        if (com.google.android.gms.ads.internal.zzq.zzlu().zzab(this.zzvf)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c = 1;
                    }
                } else if (str.equals("_ac")) {
                    c = 0;
                }
            } else if (str.equals("_aa")) {
                c = 2;
            }
            if (c == 0) {
                com.google.android.gms.ads.internal.zzq.zzlu().zzh(this.zzvf, str2);
            } else if (c == 1) {
                com.google.android.gms.ads.internal.zzq.zzlu().zzi(this.zzvf, str2);
            } else if (c == 2) {
                com.google.android.gms.ads.internal.zzq.zzlu().zzk(this.zzvf, str2);
            } else {
                zzawr.zzfa("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}
