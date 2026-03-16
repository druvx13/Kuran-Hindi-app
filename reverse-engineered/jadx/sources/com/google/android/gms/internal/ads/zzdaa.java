package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdaa implements zzdak<zzdah<Bundle>> {
    private final boolean zzgog;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdaa(zzdfa zzdfaVar) {
        if (zzdfaVar != null) {
            this.zzgog = true;
        } else {
            this.zzgog = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdah<Bundle>> zzaqa() {
        return zzdqw.zzag(this.zzgog ? zzczz.zzgof : null);
    }
}
