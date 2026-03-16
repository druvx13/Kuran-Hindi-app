package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsr implements com.google.android.gms.ads.internal.zze {
    private com.google.android.gms.ads.internal.zze zzgin;

    public final synchronized void zza(com.google.android.gms.ads.internal.zze zzeVar) {
        this.zzgin = zzeVar;
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final synchronized void zzh(View view) {
        if (this.zzgin != null) {
            this.zzgin.zzh(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final synchronized void zzjy() {
        if (this.zzgin != null) {
            this.zzgin.zzjy();
        }
    }

    @Override // com.google.android.gms.ads.internal.zze
    public final synchronized void zzjz() {
        if (this.zzgin != null) {
            this.zzgin.zzjz();
        }
    }
}
