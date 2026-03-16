package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzej implements zzdnm {
    private final zzev zzwf;
    private final zzdlo zzxy;
    private final zzdma zzxz;
    private final zzem zzya;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzej(zzdlo zzdloVar, zzdma zzdmaVar, zzev zzevVar, zzem zzemVar) {
        this.zzxy = zzdloVar;
        this.zzxz = zzdmaVar;
        this.zzwf = zzevVar;
        this.zzya = zzemVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(View view) {
        this.zzwf.zze(view);
    }

    private final Map<String, Object> zzcc() {
        HashMap hashMap = new HashMap();
        hashMap.put("v", this.zzxy.zzauf());
        hashMap.put("gms", Boolean.valueOf(this.zzxy.zzcn()));
        hashMap.put("int", this.zzxz.zzag());
        hashMap.put("up", Boolean.valueOf(this.zzya.zzcg()));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final Map<String, Object> zzcd() {
        Map<String, Object> zzcc = zzcc();
        zzcc.put("gai", Boolean.valueOf(this.zzxy.zzaug()));
        zzcc.put("did", this.zzxz.zzam());
        zzcc.put("dst", Integer.valueOf(this.zzxz.zzaun()));
        zzcc.put("doo", Boolean.valueOf(this.zzxz.zzao()));
        return zzcc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final Map<String, Object> zzce() {
        return zzcc();
    }

    @Override // com.google.android.gms.internal.ads.zzdnm
    public final Map<String, Object> zzcf() {
        Map<String, Object> zzcc = zzcc();
        zzcc.put("lts", Long.valueOf(this.zzwf.zzcv()));
        return zzcc;
    }
}
