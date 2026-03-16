package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafk implements zzaga<zzbek> {
    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        zzbek zzbekVar2 = zzbekVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzawr.zzfc("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzawr.zzfc("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime() + (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzbekVar2.zzzj().zza(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e) {
                    zzawr.zzd("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzawr.zzfc("No value given for CSI experiment.");
                return;
            }
            zzaam zzrn = zzbekVar2.zzzj().zzrn();
            if (zzrn == null) {
                zzawr.zzfc("No ticker for WebView, dropping experiment ID.");
            } else {
                zzrn.zzh("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzawr.zzfc("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzawr.zzfc("No name given for CSI extra.");
            } else {
                zzaam zzrn2 = zzbekVar2.zzzj().zzrn();
                if (zzrn2 == null) {
                    zzawr.zzfc("No ticker for WebView, dropping extra parameter.");
                } else {
                    zzrn2.zzh(str6, str7);
                }
            }
        }
    }
}
