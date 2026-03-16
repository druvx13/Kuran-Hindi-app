package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbqa implements zzbrs, zzbsm {
    private final zzapn zzblt;
    private final zzdgo zzfkd;
    private final Context zzvf;

    public zzbqa(Context context, zzdgo zzdgoVar, zzapn zzapnVar) {
        this.zzvf = context;
        this.zzfkd = zzdgoVar;
        this.zzblt = zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbx(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzby(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        if (this.zzfkd.zzgud == null || !this.zzfkd.zzgud.zzdlf) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.zzfkd.zzgud.zzdlg.isEmpty()) {
            arrayList.add(this.zzfkd.zzgud.zzdlg);
        }
        this.zzblt.zza(this.zzvf, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbz(Context context) {
        this.zzblt.detach();
    }
}
