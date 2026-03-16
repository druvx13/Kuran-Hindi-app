package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzane {
    public static int zza(AdRequest.ErrorCode errorCode) {
        int i = zzanh.zzdhm[errorCode.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return i != 4 ? 0 : 3;
            }
            return 2;
        }
        return 1;
    }

    public static MediationAdRequest zza(zzuj zzujVar, boolean z) {
        AdRequest.Gender gender;
        HashSet hashSet = zzujVar.zzcei != null ? new HashSet(zzujVar.zzcei) : null;
        Date date = new Date(zzujVar.zzceg);
        int i = zzujVar.zzceh;
        if (i == 1) {
            gender = AdRequest.Gender.MALE;
        } else if (i == 2) {
            gender = AdRequest.Gender.FEMALE;
        } else {
            gender = AdRequest.Gender.UNKNOWN;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzujVar.zzmp);
    }
}
