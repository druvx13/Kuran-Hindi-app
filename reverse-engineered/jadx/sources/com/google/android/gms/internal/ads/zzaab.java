package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaab {
    public static boolean zzcr(String str) {
        return zzf((String) zzvj.zzpv().zzd(zzzz.zzcrh), str);
    }

    private static boolean zzf(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzq.zzla().zza(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
