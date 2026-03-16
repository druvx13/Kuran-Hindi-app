package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqi {
    private final Clock zzbnt;
    private final zzcqk zzggl;
    private final List<String> zzggm = Collections.synchronizedList(new ArrayList());
    private final boolean zzggn = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcuc)).booleanValue();

    public zzcqi(Clock clock, zzcqk zzcqkVar) {
        this.zzbnt = clock;
        this.zzggl = zzcqkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> zzdri<T> zza(zzdgq zzdgqVar, zzdgo zzdgoVar, zzdri<T> zzdriVar) {
        long elapsedRealtime = this.zzbnt.elapsedRealtime();
        String str = zzdgoVar.zzdfq;
        if (str != null) {
            zzdqw.zza(zzdriVar, new zzcql(this, str, elapsedRealtime, zzdgoVar, zzdgqVar), zzbab.zzdzw);
        }
        return zzdriVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        this.zzggm.add(sb2);
    }

    public final String zzape() {
        return TextUtils.join("_", this.zzggm);
    }
}
