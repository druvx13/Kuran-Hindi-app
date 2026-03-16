package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzayc implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaxz zzdxe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayc(zzaxz zzaxzVar) {
        this.zzdxe = zzaxzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzq.zzkw();
        zzaxa.zza(this.zzdxe.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
