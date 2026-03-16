package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaap extends zzaaq {
    private final com.google.android.gms.ads.internal.zze zzcvc;
    private final String zzcvd;
    private final String zzcve;

    public zzaap(com.google.android.gms.ads.internal.zze zzeVar, String str, String str2) {
        this.zzcvc = zzeVar;
        this.zzcvd = str;
        this.zzcve = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final String zzro() {
        return this.zzcvd;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final String getContent() {
        return this.zzcve;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void zzn(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zzcvc.zzh((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void recordClick() {
        this.zzcvc.zzjy();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final void recordImpression() {
        this.zzcvc.zzjz();
    }
}
