package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaoo implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaom zzdii;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoo(zzaom zzaomVar) {
        this.zzdii = zzaomVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdii.zzdv("Operation denied by user.");
    }
}
