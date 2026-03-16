package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaoq implements View.OnClickListener {
    private final /* synthetic */ zzaor zzdij;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoq(zzaor zzaorVar) {
        this.zzdij = zzaorVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzdij.zzac(true);
    }
}
