package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzep implements Runnable {
    private final /* synthetic */ int zzyx;
    private final /* synthetic */ boolean zzyy;
    private final /* synthetic */ zzeo zzyz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzeo zzeoVar, int i, boolean z) {
        this.zzyz = zzeoVar;
        this.zzyx = i;
        this.zzyy = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza;
        zzbv.zza zzb = this.zzyz.zzb(this.zzyx, this.zzyy);
        this.zzyz.zzyq = zzb;
        zza = zzeo.zza(this.zzyx, zzb);
        if (zza) {
            this.zzyz.zza(this.zzyx + 1, this.zzyy);
        }
    }
}
