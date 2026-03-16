package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaop implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaom zzdii;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaop(zzaom zzaomVar) {
        this.zzdii = zzaomVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent createIntent = this.zzdii.createIntent();
        com.google.android.gms.ads.internal.zzq.zzkw();
        context = this.zzdii.zzvf;
        zzaxa.zza(context, createIntent);
    }
}
