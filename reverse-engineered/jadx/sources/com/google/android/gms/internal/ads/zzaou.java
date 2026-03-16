package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaou implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaos zzdiz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaou(zzaos zzaosVar) {
        this.zzdiz = zzaosVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdiz.zzdv("User canceled the download.");
    }
}
