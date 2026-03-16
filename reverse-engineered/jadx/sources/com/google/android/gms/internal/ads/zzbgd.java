package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbgd implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzaun zzeij;
    private final /* synthetic */ zzbgc zzelm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgd(zzbgc zzbgcVar, zzaun zzaunVar) {
        this.zzelm = zzbgcVar;
        this.zzeij = zzaunVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzelm.zza(view, this.zzeij, 10);
    }
}
