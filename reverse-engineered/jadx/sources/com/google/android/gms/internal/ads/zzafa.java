package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafa extends zzaeb {
    private final NativeCustomTemplateAd.OnCustomClickListener zzczm;

    public zzafa(NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzczm = onCustomClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final void zza(zzado zzadoVar, String str) {
        this.zzczm.onCustomClick(zzadt.zza(zzadoVar), str);
    }
}
