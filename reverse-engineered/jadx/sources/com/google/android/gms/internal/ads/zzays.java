package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzays extends zzq<zzo> {
    private final Map<String, String> zzab;
    private final zzbaj<zzo> zzdya;
    private final zzazq zzdyb;

    public zzays(String str, zzbaj<zzo> zzbajVar) {
        this(str, null, zzbajVar);
    }

    private zzays(String str, Map<String, String> map, zzbaj<zzo> zzbajVar) {
        super(0, str, new zzayr(zzbajVar));
        this.zzab = null;
        this.zzdya = zzbajVar;
        zzazq zzazqVar = new zzazq();
        this.zzdyb = zzazqVar;
        zzazqVar.zza(str, "GET", null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzq
    public final zzz<zzo> zza(zzo zzoVar) {
        return zzz.zza(zzoVar, zzas.zzb(zzoVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzq
    public final /* synthetic */ void zza(zzo zzoVar) {
        zzo zzoVar2 = zzoVar;
        this.zzdyb.zza(zzoVar2.zzab, zzoVar2.statusCode);
        zzazq zzazqVar = this.zzdyb;
        byte[] bArr = zzoVar2.data;
        if (zzazq.isEnabled() && bArr != null) {
            zzazqVar.zzi(bArr);
        }
        this.zzdya.set(zzoVar2);
    }
}
