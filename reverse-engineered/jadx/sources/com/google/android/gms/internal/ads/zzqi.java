package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzqi implements zzqk {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzxu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqi(zzqc zzqcVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzxu = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzxu);
    }
}
