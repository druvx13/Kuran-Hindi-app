package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbi implements zzbrp {
    private final zzbzx zzfqb;
    private final zzcab zzfrc;

    public zzcbi(zzbzx zzbzxVar, zzcab zzcabVar) {
        this.zzfqb = zzbzxVar;
        this.zzfrc = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void onAdImpression() {
        if (this.zzfqb.zzald() == null) {
            return;
        }
        zzbek zzalc = this.zzfqb.zzalc();
        zzbek zzalb = this.zzfqb.zzalb();
        if (zzalc == null) {
            zzalc = zzalb != null ? zzalb : null;
        }
        if (!this.zzfrc.zzaks() || zzalc == null) {
            return;
        }
        zzalc.zza("onSdkImpression", new ArrayMap());
    }
}
