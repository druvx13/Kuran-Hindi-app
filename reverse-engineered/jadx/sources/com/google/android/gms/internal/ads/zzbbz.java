package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbbz implements Runnable {
    private boolean zzbqh = false;
    private zzbbk zzecf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbz(zzbbk zzbbkVar) {
        this.zzecf = zzbbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbqh) {
            return;
        }
        this.zzecf.zzyx();
        zzzo();
    }

    public final void pause() {
        this.zzbqh = true;
        this.zzecf.zzyx();
    }

    public final void resume() {
        this.zzbqh = false;
        zzzo();
    }

    private final void zzzo() {
        zzaxa.zzdwf.removeCallbacks(this);
        zzaxa.zzdwf.postDelayed(this, 250L);
    }
}
