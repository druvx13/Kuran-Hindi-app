package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzdt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    private final /* synthetic */ zzl zzbmn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzl zzlVar) {
        this.zzbmn = zzlVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzdt zzdtVar;
        zzdt zzdtVar2;
        zzdtVar = this.zzbmn.zzbmu;
        if (zzdtVar != null) {
            zzdtVar2 = this.zzbmn.zzbmu;
            zzdtVar2.zza(motionEvent);
            return false;
        }
        return false;
    }
}
