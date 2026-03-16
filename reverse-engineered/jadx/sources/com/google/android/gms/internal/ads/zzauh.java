package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzauh implements zzdqx<Void> {
    private final /* synthetic */ zzdri zzdsb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauh(zzaue zzaueVar, zzdri zzdriVar) {
        this.zzdsb = zzdriVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        List list;
        list = zzaue.zzdro;
        list.remove(this.zzdsb);
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(Void r2) {
        List list;
        list = zzaue.zzdro;
        list.remove(this.zzdsb);
    }
}
