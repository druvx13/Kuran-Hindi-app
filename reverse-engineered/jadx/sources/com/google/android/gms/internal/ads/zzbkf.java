package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkf implements zzbrc {
    private final zzdha zzfgj;
    private final zzdld zzfgl;
    private final zzdgq zzfgp;

    public zzbkf(zzdha zzdhaVar, zzdld zzdldVar) {
        this.zzfgj = zzdhaVar;
        this.zzfgl = zzdldVar;
        this.zzfgp = zzdhaVar.zzgus.zzgup;
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void onAdFailedToLoad(int i) {
        this.zzfgl.zza(this.zzfgj, null, this.zzfgp.zzdex);
    }
}
