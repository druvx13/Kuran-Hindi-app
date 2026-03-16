package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwe implements zzdah<Bundle> {
    private final zzut zzgmd;

    public zzcwe(zzut zzutVar) {
        this.zzgmd = zzutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzut zzutVar = this.zzgmd;
        if (zzutVar != null) {
            if (zzutVar.orientation == 1) {
                bundle2.putString("avo", "p");
            } else if (this.zzgmd.orientation == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
