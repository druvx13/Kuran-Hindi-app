package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzawn;
import com.google.android.gms.internal.ads.zzaxa;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzl extends zzawn {
    final /* synthetic */ zzc zzdkr;

    private zzl(zzc zzcVar) {
        this.zzdkr = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawn
    public final void zzup() {
        Bitmap zza = com.google.android.gms.ads.internal.zzq.zzlp().zza(Integer.valueOf(this.zzdkr.zzdjq.zzdla.zzbme));
        if (zza != null) {
            final Drawable zza2 = com.google.android.gms.ads.internal.zzq.zzky().zza(this.zzdkr.zzaad, zza, this.zzdkr.zzdjq.zzdla.zzbmc, this.zzdkr.zzdjq.zzdla.zzbmd);
            zzaxa.zzdwf.post(new Runnable(this, zza2) { // from class: com.google.android.gms.ads.internal.overlay.zzk
                private final zzl zzdkp;
                private final Drawable zzdkq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdkp = this;
                    this.zzdkq = zza2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzl zzlVar = this.zzdkp;
                    zzlVar.zzdkr.zzaad.getWindow().setBackgroundDrawable(this.zzdkq);
                }
            });
        }
    }
}
