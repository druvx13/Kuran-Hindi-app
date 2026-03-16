package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaxg extends BroadcastReceiver {
    private final /* synthetic */ zzaxa zzdwj;

    private zzaxg(zzaxa zzaxaVar) {
        this.zzdwj = zzaxaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzaxa.zza(this.zzdwj, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzaxa.zza(this.zzdwj, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaxg(zzaxa zzaxaVar, zzaxc zzaxcVar) {
        this(zzaxaVar);
    }
}
