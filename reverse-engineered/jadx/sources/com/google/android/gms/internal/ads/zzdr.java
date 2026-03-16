package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdr implements Runnable {
    private final /* synthetic */ int zzxe;
    private final /* synthetic */ int zzxf;
    private final /* synthetic */ int zzxg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdr(zzdl zzdlVar, int i, int i2, int i3) {
        this.zzxe = i;
        this.zzxf = i2;
        this.zzxg = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdlk zzdlkVar;
        zzdf zzdfVar;
        try {
            zzdfVar = zzdl.zzvw;
            zzdfVar.zza(MotionEvent.obtain(0L, this.zzxe, 0, this.zzxf, this.zzxg, 0));
        } catch (Exception e) {
            zzdlkVar = zzdl.zzvy;
            zzdlkVar.zza(2022, -1L, e);
        }
    }
}
