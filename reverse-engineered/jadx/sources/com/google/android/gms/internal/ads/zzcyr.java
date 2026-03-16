package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyr implements zzdah<Bundle> {
    private final String zzgnk;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    public zzcyr(String str) {
        this.zzgnk = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        zzdhj.zza(bundle, "omid_v", this.zzgnk);
    }
}
