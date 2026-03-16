package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzaxm extends zzaxj {
    @Override // com.google.android.gms.internal.ads.zzaxj, com.google.android.gms.internal.ads.zzaxf
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.zzaxf
    public final ViewGroup.LayoutParams zzxl() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
