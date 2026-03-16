package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqh;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdem<RequestComponentT extends zzbqh<AdT>, AdT> implements zzdeu<RequestComponentT, AdT> {
    private RequestComponentT zzgrq;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdeu
    /* renamed from: zzark */
    public final synchronized RequestComponentT zzarj() {
        return this.zzgrq;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final synchronized zzdri<AdT> zza(zzdev zzdevVar, zzdew<RequestComponentT> zzdewVar) {
        RequestComponentT zzaeg;
        zzaeg = zzdewVar.zzc(zzdevVar.zzgsi).zzaeg();
        this.zzgrq = zzaeg;
        return zzaeg.zzaed().zzaii();
    }
}
