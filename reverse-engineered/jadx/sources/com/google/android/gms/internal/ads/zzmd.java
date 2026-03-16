package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzmd implements zzmt {
    private final int track;
    private final /* synthetic */ zzly zzbau;

    public zzmd(zzly zzlyVar, int i) {
        this.zzbau = zzlyVar;
        this.track = i;
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final boolean isReady() {
        return this.zzbau.zzav(this.track);
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final void zzhr() throws IOException {
        this.zzbau.zzhr();
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final int zzb(zzhh zzhhVar, zzjb zzjbVar, boolean z) {
        return this.zzbau.zza(this.track, zzhhVar, zzjbVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final void zzeh(long j) {
        this.zzbau.zzd(this.track, j);
    }
}
