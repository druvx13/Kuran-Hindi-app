package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.zzaxr;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzj extends RelativeLayout {
    private zzaxr zzdkn;
    boolean zzdko;

    public zzj(Context context, String str, String str2) {
        super(context);
        zzaxr zzaxrVar = new zzaxr(context, str);
        this.zzdkn = zzaxrVar;
        zzaxrVar.zzac(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdko) {
            return false;
        }
        this.zzdkn.zzd(motionEvent);
        return false;
    }
}
