package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkc implements zzbrs {
    private final zzdhq zzfgi;

    public zzbkc(zzdhq zzdhqVar) {
        this.zzfgi = zzdhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbx(Context context) {
        try {
            this.zzfgi.pause();
        } catch (zzdhk e) {
            zzawr.zzd("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzby(Context context) {
        try {
            this.zzfgi.resume();
            if (context != null) {
                this.zzfgi.onContextChanged(context);
            }
        } catch (zzdhk e) {
            zzawr.zzd("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzbz(Context context) {
        try {
            this.zzfgi.destroy();
        } catch (zzdhk e) {
            zzawr.zzd("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
