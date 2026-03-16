package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzben implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzaun zzeij;
    private final /* synthetic */ zzbej zzeik;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzben(zzbej zzbejVar, zzaun zzaunVar) {
        this.zzeik = zzbejVar;
        this.zzeij = zzaunVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzeik.zza(view, this.zzeij, 10);
    }
}
