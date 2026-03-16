package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdz implements zzei {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzxu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(zzea zzeaVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzxu = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzei
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.val$activity, this.zzxu);
    }
}
