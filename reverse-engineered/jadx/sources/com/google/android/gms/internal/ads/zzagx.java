package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagx implements zzdqj<zzags, ParcelFileDescriptor> {
    private final /* synthetic */ zzagm zzdbe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagx(zzagu zzaguVar, zzagm zzagmVar) {
        this.zzdbe = zzagmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ zzdri<ParcelFileDescriptor> zzf(zzags zzagsVar) throws Exception {
        zzbaj zzbajVar = new zzbaj();
        zzagsVar.zza(this.zzdbe, new zzagw(this, zzbajVar));
        return zzbajVar;
    }
}
