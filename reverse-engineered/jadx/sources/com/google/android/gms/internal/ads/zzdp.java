package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdp implements Runnable {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Context zzxa;
    private final /* synthetic */ String zzxb;
    private final /* synthetic */ View zzxc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdp(zzdl zzdlVar, Context context, String str, View view, Activity activity) {
        this.zzxa = context;
        this.zzxb = str;
        this.zzxc = view;
        this.val$activity = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdlk zzdlkVar;
        zzdf zzdfVar;
        try {
            zzdfVar = zzdl.zzvw;
            zzdfVar.zza(this.zzxa, this.zzxb, this.zzxc, this.val$activity);
        } catch (Exception e) {
            zzdlkVar = zzdl.zzvy;
            zzdlkVar.zza(2021, -1L, e);
        }
    }
}
