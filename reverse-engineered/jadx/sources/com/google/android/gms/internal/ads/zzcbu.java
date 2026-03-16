package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbu implements zzdnx<zzo, Bitmap> {
    private final /* synthetic */ double zzfun;
    private final /* synthetic */ boolean zzfuo;
    private final /* synthetic */ zzcbv zzfup;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbu(zzcbv zzcbvVar, double d, boolean z) {
        this.zzfup = zzcbvVar;
        this.zzfun = d;
        this.zzfuo = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdnx
    public final /* synthetic */ Bitmap apply(zzo zzoVar) {
        Bitmap zza;
        zza = this.zzfup.zza(zzoVar.data, this.zzfun, this.zzfuo);
        return zza;
    }
}
