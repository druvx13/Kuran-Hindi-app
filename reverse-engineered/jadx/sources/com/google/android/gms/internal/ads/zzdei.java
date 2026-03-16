package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdei implements zzdqx<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdei(zzded zzdedVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzawr.zzeg("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(@NullableDecl Void r1) {
        zzawr.zzeg("Notification of cache hit successful.");
    }
}
