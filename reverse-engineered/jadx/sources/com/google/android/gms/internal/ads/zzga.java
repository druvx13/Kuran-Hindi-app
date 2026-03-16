package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzga implements Runnable {
    private final /* synthetic */ zzfx zzabb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzga(zzfx zzfxVar) {
        this.zzabb = zzfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzabb.zzdb();
    }
}
