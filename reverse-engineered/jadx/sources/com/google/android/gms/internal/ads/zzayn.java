package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzayn extends zzax {
    private final /* synthetic */ byte[] zzdxu;
    private final /* synthetic */ Map zzdxv;
    private final /* synthetic */ zzazq zzdxw;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzayn(zzaym zzaymVar, int i, String str, zzab zzabVar, zzy zzyVar, byte[] bArr, Map map, zzazq zzazqVar) {
        super(i, str, zzabVar, zzyVar);
        this.zzdxu = bArr;
        this.zzdxv = map;
        this.zzdxw = zzazqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzq
    public final byte[] zzg() throws zzb {
        byte[] bArr = this.zzdxu;
        return bArr == null ? super.zzg() : bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzq
    public final Map<String, String> getHeaders() throws zzb {
        Map<String, String> map = this.zzdxv;
        return map == null ? super.getHeaders() : map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzax
    public final void zzh(String str) {
        this.zzdxw.zzex(str);
        super.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzax, com.google.android.gms.internal.ads.zzq
    public final /* synthetic */ void zza(String str) {
        zza(str);
    }
}
