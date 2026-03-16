package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcwh implements zzdnx {
    static final zzdnx zzdsc = new zzcwh();

    private zzcwh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnx
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzdah(arrayList) { // from class: com.google.android.gms.internal.ads.zzcwk
            private final ArrayList zzglx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglx = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.zzglx);
            }
        };
    }
}
