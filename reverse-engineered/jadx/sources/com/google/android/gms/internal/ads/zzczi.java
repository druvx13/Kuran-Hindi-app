package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczi implements zzdak<zzdah<Bundle>> {
    private final String zzfmw;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczi(Context context, String str) {
        this.zzvf = context;
        this.zzfmw = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdah<Bundle>> zzaqa() {
        return zzdqw.zzag(this.zzfmw == null ? null : new zzdah(this) { // from class: com.google.android.gms.internal.ads.zzczh
            private final zzczi zzgnp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgnp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj) {
                this.zzgnp.zzq((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.zzvf.getPackageName());
    }
}
