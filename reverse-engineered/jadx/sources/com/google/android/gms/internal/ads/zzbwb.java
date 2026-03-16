package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbwb implements zzbvy {
    private final List<String> zzdnv;
    private final zzdld zzfgl;
    private boolean zzfoo;

    public zzbwb(zzdgo zzdgoVar, zzdld zzdldVar) {
        this.zzdnv = zzdgoVar.zzdnv;
        this.zzfgl = zzdldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzajr() {
        if (this.zzfoo) {
            return;
        }
        this.zzfgl.zzh(this.zzdnv);
        this.zzfoo = true;
    }
}
