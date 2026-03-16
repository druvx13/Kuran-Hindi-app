package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdq implements Runnable {
    private final /* synthetic */ Context zzxa;
    private final /* synthetic */ View zzxc;
    private final /* synthetic */ Activity zzxd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdq(zzdl zzdlVar, Context context, View view, Activity activity) {
        this.zzxa = context;
        this.zzxc = view;
        this.zzxd = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdlk zzdlkVar;
        zzdf zzdfVar;
        try {
            zzdfVar = zzdl.zzvw;
            zzdfVar.zza(this.zzxa, this.zzxc, this.zzxd);
        } catch (Exception e) {
            zzdlkVar = zzdl.zzvy;
            zzdlkVar.zza(2020, -1L, e);
        }
    }
}
