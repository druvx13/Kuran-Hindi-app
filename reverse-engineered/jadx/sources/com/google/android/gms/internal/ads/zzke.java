package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzke implements zzjz {
    private final /* synthetic */ zzkc zzaru;

    private zzke(zzkc zzkcVar) {
        this.zzaru = zzkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final int zzaj(int i) {
        return zzkc.zzaj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final boolean zzak(int i) {
        return zzkc.zzak(i);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzd(int i, long j, long j2) throws zzhi {
        this.zzaru.zzd(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzal(int i) throws zzhi {
        this.zzaru.zzal(i);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zzc(int i, long j) throws zzhi {
        this.zzaru.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zza(int i, double d) throws zzhi {
        this.zzaru.zza(i, d);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zza(int i, String str) throws zzhi {
        this.zzaru.zza(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final void zza(int i, int i2, zzjl zzjlVar) throws IOException, InterruptedException {
        this.zzaru.zza(i, i2, zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzke(zzkc zzkcVar, zzkb zzkbVar) {
        this(zzkcVar);
    }
}
