package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfr implements zzbrs {
    private final zzbek zzdce;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfr(zzbek zzbekVar) {
        this.zzdce = ((Boolean) zzvj.zzpv().zzd(zzzz.zzcli)).booleanValue() ? zzbekVar : null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbx(Context context) {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            zzbekVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzby(Context context) {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            zzbekVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbz(Context context) {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            zzbekVar.destroy();
        }
    }
}
