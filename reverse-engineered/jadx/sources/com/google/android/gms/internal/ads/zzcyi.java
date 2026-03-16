package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyi implements zzdah<Bundle> {
    private final zzdgm zzfgh;

    public zzcyi(zzdgm zzdgmVar) {
        this.zzfgh = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdgm zzdgmVar = this.zzfgh;
        if (zzdgmVar != null) {
            bundle2.putBoolean("render_in_browser", zzdgmVar.zzars());
            bundle2.putBoolean("disable_ml", this.zzfgh.zzart());
        }
    }
}
