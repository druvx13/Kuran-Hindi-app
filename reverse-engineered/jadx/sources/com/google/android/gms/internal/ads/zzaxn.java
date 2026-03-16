package com.google.android.gms.internal.ads;

import android.content.Context;
import android.telephony.TelephonyManager;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzaxn extends zzaxo {
    @Override // com.google.android.gms.internal.ads.zzaxf
    public final zztp zza(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzq(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zztp.ENUM_TRUE : zztp.ENUM_FALSE;
        }
        return zztp.ENUM_FALSE;
    }
}
