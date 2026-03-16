package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcla implements zzbtm {
    private final zzauu zzboj;
    private final Context zzvf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcla(Context context, zzauu zzauuVar) {
        this.zzvf = context;
        this.zzboj = zzauuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzd(zzarj zzarjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzb(zzdha zzdhaVar) {
        if (TextUtils.isEmpty(zzdhaVar.zzgus.zzgup.zzdou)) {
            return;
        }
        this.zzboj.zza(this.zzvf, zzdhaVar.zzgur.zzfll.zzguw);
        this.zzboj.zzj(this.zzvf, zzdhaVar.zzgus.zzgup.zzdou);
    }
}
