package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbiq implements zzdgf {
    private final /* synthetic */ zzbhw zzewb;
    private Context zzfbl;
    private String zzfbm;

    private zzbiq(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final zzdgg zzaft() {
        zzehf.zza(this.zzfbl, Context.class);
        return new zzbip(this.zzewb, this.zzfbl, this.zzfbm);
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final /* synthetic */ zzdgf zzfu(String str) {
        this.zzfbm = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final /* synthetic */ zzdgf zzbw(Context context) {
        this.zzfbl = (Context) zzehf.checkNotNull(context);
        return this;
    }
}
