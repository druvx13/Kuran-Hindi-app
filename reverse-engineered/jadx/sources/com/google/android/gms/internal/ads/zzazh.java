package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzazh extends BroadcastReceiver {
    private final /* synthetic */ zzazi zzdyo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazh(zzazi zzaziVar) {
        this.zzdyo = zzaziVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzdyo.zzc(context, intent);
    }
}
