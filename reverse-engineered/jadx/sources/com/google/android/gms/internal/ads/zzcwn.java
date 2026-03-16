package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwn implements zzdah<Bundle> {
    private final boolean zzgmi = false;
    private final boolean zzgmj = false;
    private final boolean zzgmk;

    public zzcwn(boolean z, boolean z2, boolean z3) {
        this.zzgmk = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("c_pcbg", this.zzgmi);
        bundle2.putBoolean("c_phbg", this.zzgmj);
        bundle2.putBoolean("ar_lr", this.zzgmk);
    }
}
