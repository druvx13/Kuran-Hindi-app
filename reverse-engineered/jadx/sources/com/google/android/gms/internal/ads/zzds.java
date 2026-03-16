package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzds implements Runnable {
    private final /* synthetic */ MotionEvent zzxh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzds(zzdl zzdlVar, MotionEvent motionEvent) {
        this.zzxh = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdlk zzdlkVar;
        zzdf zzdfVar;
        try {
            zzdfVar = zzdl.zzvw;
            zzdfVar.zza(this.zzxh);
        } catch (Exception e) {
            zzdlkVar = zzdl.zzvy;
            zzdlkVar.zza(2022, -1L, e);
        }
    }
}
