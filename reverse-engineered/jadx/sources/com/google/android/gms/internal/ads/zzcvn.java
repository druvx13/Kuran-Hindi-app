package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcvn implements zzdqj {
    static final zzdqj zzbly = new zzcvn();

    private zzcvn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final zzdri zzf(Object obj) {
        final String str = (String) obj;
        return zzdqw.zzag(new zzdah(str) { // from class: com.google.android.gms.internal.ads.zzcvq
            private final String zzdcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = str;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj2) {
                ((Bundle) obj2).putString("ms", this.zzdcd);
            }
        });
    }
}
