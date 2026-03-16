package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaxd extends BroadcastReceiver {
    private zzaxd(zzaxa zzaxaVar) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzazq.zzyg();
        zzawp.zzan(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaxd(zzaxa zzaxaVar, zzaxc zzaxcVar) {
        this(zzaxaVar);
    }
}
