package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcpb implements zzbxz {
    private final zzazz zzbml;
    private final zzdgo zzfso;
    private final zzdri<zzbwu> zzgft;
    private final zzbek zzgfu;
    private final Context zzvf;

    private zzcpb(Context context, zzazz zzazzVar, zzdri<zzbwu> zzdriVar, zzdgo zzdgoVar, zzbek zzbekVar) {
        this.zzvf = context;
        this.zzbml = zzazzVar;
        this.zzgft = zzdriVar;
        this.zzfso = zzdgoVar;
        this.zzgfu = zzbekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxz
    public final void zza(boolean z, Context context) {
        this.zzgfu.zzba(true);
        com.google.android.gms.ads.internal.zzq.zzkw();
        com.google.android.gms.ads.internal.zzg zzgVar = new com.google.android.gms.ads.internal.zzg(false, zzaxa.zzbb(this.zzvf), false, 0.0f, -1, z, this.zzfso.zzfin, false);
        com.google.android.gms.ads.internal.zzq.zzkv();
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zzub) null, ((zzbwu) zzdqw.zzb(this.zzgft)).zzafq(), (com.google.android.gms.ads.internal.overlay.zzt) null, this.zzgfu, this.zzfso.zzgty, this.zzbml, this.zzfso.zzdny, zzgVar, this.zzfso.zzgtr.zzdku, this.zzfso.zzgtr.zzdkw), true);
    }
}
