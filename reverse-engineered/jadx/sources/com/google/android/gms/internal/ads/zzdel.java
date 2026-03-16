package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqh;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdel<RequestComponentT extends zzbqh<AdT>, AdT> implements zzdeu<RequestComponentT, AdT> {
    private RequestComponentT zzgrq;
    private final zzdeu<RequestComponentT, AdT> zzgsd;

    public zzdel(zzdeu<RequestComponentT, AdT> zzdeuVar) {
        this.zzgsd = zzdeuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdeu
    /* renamed from: zzark */
    public final synchronized RequestComponentT zzarj() {
        return this.zzgrq;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final synchronized zzdri<AdT> zza(zzdev zzdevVar, zzdew<RequestComponentT> zzdewVar) {
        if (zzdevVar.zzgsh != null) {
            RequestComponentT zzaeg = zzdewVar.zzc(zzdevVar.zzgsi).zzaeg();
            this.zzgrq = zzaeg;
            return zzaeg.zzaed().zzb(zzdevVar.zzgsh);
        }
        zzdri<AdT> zza = this.zzgsd.zza(zzdevVar, zzdewVar);
        this.zzgrq = this.zzgsd.zzarj();
        return zza;
    }
}
