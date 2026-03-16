package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbig implements zzddo {
    private final /* synthetic */ zzbhw zzewb;
    private Context zzfbl;
    private String zzfbm;

    private zzbig(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final zzddl zzafd() {
        zzehf.zza(this.zzfbl, Context.class);
        zzehf.zza(this.zzfbm, String.class);
        return new zzbif(this.zzewb, this.zzfbl, this.zzfbm);
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final /* synthetic */ zzddo zzft(String str) {
        this.zzfbm = (String) zzehf.checkNotNull(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final /* synthetic */ zzddo zzbv(Context context) {
        this.zzfbl = (Context) zzehf.checkNotNull(context);
        return this;
    }
}
