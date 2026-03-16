package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcvw implements zzdak<zzdah<Bundle>> {
    private final Set<String> zzgly;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvw(Set<String> set) {
        this.zzgly = set;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdah<Bundle>> zzaqa() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zzgly) {
            arrayList.add(str);
        }
        return zzdqw.zzag(new zzdah(arrayList) { // from class: com.google.android.gms.internal.ads.zzcvv
            private final ArrayList zzglx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglx = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zzglx);
            }
        });
    }
}
