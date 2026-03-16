package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztf;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzcuu {
    private String zzgla;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private String zzgla;

        public final zza zzgq(String str) {
            this.zzgla = str;
            return this;
        }
    }

    private zzcuu(zza zzaVar) {
        this.zzgla = zzaVar.zzgla;
    }

    public final Set<String> zzapx() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zzgla.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzapy() {
        return this.zzgla.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zztf.zza.EnumC0025zza zzapz() {
        char c;
        String str = this.zzgla;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        return zztf.zza.EnumC0025zza.REWARD_BASED_VIDEO_AD;
                    }
                    return zztf.zza.EnumC0025zza.AD_INITIATER_UNSPECIFIED;
                }
                return zztf.zza.EnumC0025zza.AD_LOADER;
            }
            return zztf.zza.EnumC0025zza.INTERSTITIAL;
        }
        return zztf.zza.EnumC0025zza.BANNER;
    }
}
