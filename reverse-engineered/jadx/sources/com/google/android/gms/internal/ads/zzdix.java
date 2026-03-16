package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdix implements zzdiy {
    private final Object[] zzgxw;

    public zzdix(zzuj zzujVar, String str, int i, String str2, zzut zzutVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzujVar.zzceg));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zzr(zzujVar.extras));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzujVar.extras.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzujVar.zzceh));
        }
        if (hashSet.contains("keywords")) {
            if (zzujVar.zzcei != null) {
                arrayList.add(zzujVar.zzcei.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzujVar.zzcej));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzujVar.zzacq));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzujVar.zzbli));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzujVar.zzcek);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            if (zzujVar.zzmp != null) {
                arrayList.add(zzujVar.zzmp.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzujVar.zzcem);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zzr(zzujVar.zzcen));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zzr(zzujVar.zzceo));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzujVar.zzcep != null) {
                arrayList.add(zzujVar.zzcep.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzujVar.zzceq);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzujVar.zzcer);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzujVar.zzces));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzujVar.zzacr));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzujVar.zzacs);
        }
        if (hashSet.contains("orientation")) {
            if (zzutVar != null) {
                arrayList.add(Integer.valueOf(zzutVar.orientation));
            } else {
                arrayList.add(null);
            }
        }
        this.zzgxw = arrayList.toArray();
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final boolean equals(Object obj) {
        if (obj instanceof zzdix) {
            return Arrays.equals(this.zzgxw, ((zzdix) obj).zzgxw);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiy
    public final int hashCode() {
        return Arrays.hashCode(this.zzgxw);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.zzgxw);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    private static String zzr(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = zzr((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}
