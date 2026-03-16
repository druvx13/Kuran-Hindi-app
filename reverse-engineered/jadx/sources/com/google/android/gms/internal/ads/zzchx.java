package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchx {
    private ConcurrentHashMap<String, String> zzfyz;

    public zzchx(zzcie zzcieVar) {
        this.zzfyz = zzcieVar.zzaoc();
    }

    public final void zzc(zzdha zzdhaVar) {
        if (zzdhaVar.zzgus.zzguo.size() > 0) {
            int i = zzdhaVar.zzgus.zzguo.get(0).zzgtl;
            if (i == 1) {
                this.zzfyz.put("ad_format", "banner");
            } else if (i == 2) {
                this.zzfyz.put("ad_format", "interstitial");
            } else if (i == 3) {
                this.zzfyz.put("ad_format", "native_express");
            } else if (i == 4) {
                this.zzfyz.put("ad_format", "native_advanced");
            } else if (i == 5) {
                this.zzfyz.put("ad_format", "rewarded");
            } else {
                this.zzfyz.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
            }
        }
        if (TextUtils.isEmpty(zzdhaVar.zzgus.zzgup.zzdoh)) {
            return;
        }
        this.zzfyz.put("gqi", zzdhaVar.zzgus.zzgup.zzdoh);
    }

    public final void zzj(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zzfyz.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zzfyz.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzrm() {
        return this.zzfyz;
    }
}
